package com.minhtetoo.PADCMMNEWS.data.persistance;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by min on 12/16/2017.
 */

public class MMNewsProvider extends ContentProvider {

    public static final int ACTED_USERS = 100;
    public static final int PUBLICATIONS = 200;
    public static final int NEWS = 300;
    public static final int IMAGES_IN_NEWS = 400;
    public static final int FAVORITE_ACTIONS = 500;
    public static final int COMMENT_ACTIONS = 600;
    public static final int SEND_TO_ACTIONS = 700;

    private MMNewsDBHelper mDBHelper ;

    private static final UriMatcher sUriMatcher = BuildUriMatcher();

    private static UriMatcher BuildUriMatcher() {

        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_USERS, ACTED_USERS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_PUBLICATION, PUBLICATIONS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_NEWS, NEWS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_IMAGES, IMAGES_IN_NEWS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_FAVORITE_ACTION, FAVORITE_ACTIONS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_COMMENT_ACTION, COMMENT_ACTIONS);
        uriMatcher.addURI(mmNewsContract.CONTENT_AUTHORITY,mmNewsContract.PATH_SEND_TO, SEND_TO_ACTIONS);


        return  null;
    }

    private String getTableName(Uri uri){

        switch(sUriMatcher.match(uri)){
            case ACTED_USERS:
                return mmNewsContract.ActedUserEntry.TABLE_NAME ;
            case PUBLICATIONS:
                return mmNewsContract.PublicationEntry.TABLE_NAME ;
            case NEWS:
                return mmNewsContract.NewsEntry.TABLE_NAME ;
            case IMAGES_IN_NEWS:
                return mmNewsContract.ImagesEntry.TABLE_NAME ;
            case FAVORITE_ACTIONS:
                return mmNewsContract.FavoriteActionEntry.TABLE_NAME ;
            case COMMENT_ACTIONS:
                return mmNewsContract.CommentActionEntry.TABLE_NAME ;
            case SEND_TO_ACTIONS:
                return mmNewsContract.SendToEntry.TABLE_NAME ;

        }

        return  null;

    }

    @Override
    public boolean onCreate() {
        mDBHelper = new MMNewsDBHelper(getContext());

        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
