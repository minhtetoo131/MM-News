package com.minhtetoo.PADCMMNEWS.data.persistance;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by min on 12/16/2017.
 */

public class MMNewsDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "mmNews.db";


    private static final String SQL_CREATE_NEWS_TABLE = "CREATE TABLE " + mmNewsContract.NewsEntry.TABLE_NAME +" (" +
                 mmNewsContract.NewsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 mmNewsContract.NewsEntry.COLUMN_NEWS_ID + " VARCHAR(256), "+
                 mmNewsContract.NewsEntry.COLUMN_BRIEF + " TEXT, "+
                 mmNewsContract.NewsEntry.COLUMN_DETAILS + " TEXT, " +
                 mmNewsContract.NewsEntry.COLUMN_POSTED_DATE + " TEXT, " +
                 mmNewsContract.NewsEntry.COLUMNS_PUBLICATION_ID + " TEXT, " +

                " UNIQUE (" + mmNewsContract.NewsEntry.COLUMN_NEWS_ID + ") ON CONFLICT REPLACE" +
                " );";

    private static final String SQL_CREATE_IMAGES_TABLE = "CREATE TABLE " + mmNewsContract.ImagesEntry.TABLE_NAME +" (" +
            mmNewsContract.ImagesEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.ImagesEntry.COLUMN_IMAGE_URL + " TEXT, "+
            mmNewsContract.ImagesEntry.COLUMN_NEWS_ID + " VARCHAR(256), "+


            " UNIQUE (" + mmNewsContract.ImagesEntry.COLUMN_IMAGE_URL + ") ON CONFLICT REPLACE" +
            " );";

    private static final String SQL_CREATE_PUBLICATION_TABLE = "CREATE TABLE " + mmNewsContract.PublicationEntry.TABLE_NAME +" (" +
            mmNewsContract.PublicationEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.PublicationEntry.COLUMN_PUBLICATION_ID + " VARCHAR(256), "+
            mmNewsContract.PublicationEntry.COLUMN_TITLE + " TEXT, "+
            mmNewsContract.PublicationEntry.COLUMN_LOGO + " TEXT, " +

            " UNIQUE (" + mmNewsContract.PublicationEntry.COLUMN_PUBLICATION_ID +
            ") ON CONFLICT REPLACE" +
            " );";

    private static final String SQL_CREATE_FAVORITE_ACTION_TABLE = "CREATE TABLE " + mmNewsContract.FavoriteActionEntry.TABLE_NAME +" (" +
            mmNewsContract.FavoriteActionEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.FavoriteActionEntry.COLUMN_FAVORITE_ID + " VARCHAR(256), "+
            mmNewsContract.FavoriteActionEntry.COLUMN_FAVORITE_DATE + " TEXT, "+
            mmNewsContract.FavoriteActionEntry.COLUMN_NEWS_ID + " VARCHAR(256), " +
            mmNewsContract.FavoriteActionEntry.COLUMN_USER_ID + " TEXT, " +

            " UNIQUE (" + mmNewsContract.FavoriteActionEntry.COLUMN_NEWS_ID + ") ON CONFLICT REPLACE" +
            " );";

    private static final String SQL_CREATE_COMMENT_ACTION_TABLE = "CREATE TABLE " + mmNewsContract.CommentActionEntry.TABLE_NAME +" (" +
            mmNewsContract.CommentActionEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.CommentActionEntry.COLUMN_COMMENT_ID + " VARCHAR(256), "+
            mmNewsContract.CommentActionEntry.COLUMN_COMMENT + " TEXT, "+
            mmNewsContract.CommentActionEntry.COLUMN_COMMENT_DATE + " TEXT, " +
            mmNewsContract.CommentActionEntry.COLUMN_USER_ID + " TEXT, " +

            " UNIQUE (" + mmNewsContract.CommentActionEntry.COLUMN_COMMENT_ID + ") ON CONFLICT REPLACE" +
            " );";

    private static final String SQL_CREATE_SEND_TO_TABLE = "CREATE TABLE " + mmNewsContract.SendToEntry.TABLE_NAME +" (" +
            mmNewsContract.SendToEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.SendToEntry.COLUMN_COMMENT_ID + " VARCHAR(256), "+
            mmNewsContract.SendToEntry.COLUMN_COMMENT + " TEXT, "+
            mmNewsContract.SendToEntry.COLUMN_COMMENT_DATE + " TEXT, " +
            mmNewsContract.SendToEntry.COLUMN_SENDER_ID + " TEXT, " +
            mmNewsContract.SendToEntry.COLUMN_RECIEVER_ID + " TEXT, " +

            " UNIQUE (" + mmNewsContract.SendToEntry.COLUMN_COMMENT_ID + ") ON CONFLICT REPLACE" +
            " );";

    private static final String SQL_CREATE_ACTED_USER_TABLE = "CREATE TABLE " + mmNewsContract.ActedUserEntry.TABLE_NAME +" (" +
            mmNewsContract.ActedUserEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            mmNewsContract.ActedUserEntry.COLUMN_PUBLICATION_ID + " VARCHAR(256), "+
            mmNewsContract.ActedUserEntry.COLUMN_TITLE + " TEXT, "+
            mmNewsContract.ActedUserEntry.COLUMN_LOGO + " TEXT, " +

            " UNIQUE (" + mmNewsContract.ActedUserEntry.COLUMN_PUBLICATION_ID + ") ON CONFLICT REPLACE" +
            " );";


    public MMNewsDBHelper(Context context) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_ACTED_USER_TABLE);
        db.execSQL(SQL_CREATE_PUBLICATION_TABLE);
        db.execSQL(SQL_CREATE_NEWS_TABLE);
        db.execSQL(SQL_CREATE_IMAGES_TABLE);
        db.execSQL(SQL_CREATE_FAVORITE_ACTION_TABLE);
        db.execSQL(SQL_CREATE_COMMENT_ACTION_TABLE);
        db.execSQL(SQL_CREATE_SEND_TO_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.SendToEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.CommentActionEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.FavoriteActionEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.ImagesEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.NewsEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.PublicationEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + mmNewsContract.ActedUserEntry.TABLE_NAME);


        onCreate(db);
    }
}
