package com.lz.www.ambrm.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Administrator on 2016-05-26.
 */
public class MySqliteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "test.db";//数据库名称
    private static final int DATABASE_VERSION = 1;//数据库版本

    private String createT1="create table T1";
    private String createT2="create table T2";
    private Context _context;

    /**
     * name 数据库名称
     *
     * */
    public MySqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this._context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createT1);
        Toast.makeText(_context,"创建成功",Toast.LENGTH_SHORT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion){
            case 1:
                db.execSQL(createT2);//添加表
            case 2:
                db.execSQL("alter table T1 add colum c1 integer");//添加列
            default:

        }
    }
}
