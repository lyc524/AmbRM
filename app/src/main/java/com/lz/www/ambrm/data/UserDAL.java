package com.lz.www.ambrm.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.lz.www.ambrm.model.User;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * User数据操作类
 * Created by kavilee on 2016-05-26.
 */
public class UserDAL {

    private MySqliteHelper mySqliteHelper;
    private SQLiteDatabase db;

    public UserDAL(Context context) {
        mySqliteHelper = new MySqliteHelper(context);
        db = mySqliteHelper.getWritableDatabase();
    }

    public void add(List<User> users) {
        db.beginTransaction();
        try {
            for (User u : users) {
                db.execSQL("insert into [USER] values(null,?,?)", new Object[]{u.getUserName(), u.getUserName()});
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    public void update(User user) {
        ContentValues cv = new ContentValues();
        cv.put("name", user.getUserName());
        db.update("User", cv, "name = ?", new String[]{user.getUserName()});
    }

    public void delete(User user) {
        db.delete("User", "name = ?", new String[]{String.valueOf(user.getUserName())});
    }


    public List<User> query() {
            ArrayList<User> users = new ArrayList<User>();
            Cursor c = db.rawQuery("select * from User",null);
            while (c.moveToNext()) {
                User user = new User();
                user.setUserID(c.getInt(c.getColumnIndex("_id")));
                user.setUserName(c.getString(c.getColumnIndex("name")));
                user.setPassword(c.getString(c.getColumnIndex("info")));
                users.add(user);
            }
           c.close();
           return users;
       }



    public void closeDB() {
        db.close();
    }


}
