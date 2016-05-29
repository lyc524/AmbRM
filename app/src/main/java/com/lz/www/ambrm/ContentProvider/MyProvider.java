package com.lz.www.ambrm.ContentProvider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import com.lz.www.ambrm.data.MySqliteHelper;
import com.lz.www.ambrm.model.Contacts;

/**
 * Created by Administrator on 2016/5/26.
 */
public class MyProvider extends ContentProvider {
    private static UriMatcher matcher=new UriMatcher(UriMatcher.NO_MATCH);
    private MySqliteHelper dbHelper;

    static {
        matcher.addURI("","test",1);
    }

    @Override
    public boolean onCreate() {
        dbHelper=new MySqliteHelper(this.getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        switch (matcher.match(uri)){
            case 1:
                SQLiteDatabase db=dbHelper.getReadableDatabase();
                long rowID=db.insert("test",null,values);
                if(rowID>0){
                    Uri nameUri= ContentUris.withAppendedId(uri,rowID);
                    getContext().getContentResolver().notifyChange(nameUri,null);
                    return nameUri;
                }
        }
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }
}
