package com.minhtetoo.PADCMMNEWS.data.persistance;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import com.minhtetoo.PADCMMNEWS.SFCNewsApp;

/**
 * Created by min on 12/10/2017.
 */

public class mmNewsContract {

    public static final String CONTENT_AUTHORITY = SFCNewsApp.class.getPackage().getName();
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);


    public static final String PATH_NEWS = "news";
    public static final String PATH_IMAGES = "images";
    public static final String PATH_PUBLICATION = "publications";
    public static final String PATH_FAVORITE_ACTION = "favorite_action";
    public static final String PATH_COMMENT_ACTION = "comment_action";
    public static final String PATH_USERS = "acted_users";
    public static final String PATH_SEND_TO = "send_tos";


    public static class NewsEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_NEWS).build();

        public static final String TABLE_NAME =PATH_NEWS;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_NEWS;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_NEWS;

        public static final String COLUMN_NEWS_ID ="news_id";
        public static final String COLUMN_BRIEF ="brief";
        public static final String COLUMN_DETAILS ="details";
        public static final String COLUMN_POSTED_DATE ="posted_date";
        public static final String COLUMNS_PUBLICATION_ID ="publication_id";

        public static Uri buildNewsUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

    }
    public static class ImagesEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_IMAGES).build();

        public static final String TABLE_NAME =PATH_IMAGES;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_IMAGES;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_IMAGES;

        public static final String COLUMN_IMAGE_URL = "image_url";
        public static final String COLUMN_NEWS_ID ="news_id";

        public static Uri buildImageUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }




    }

    public static class PublicationEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PUBLICATION).build();

        public static final String TABLE_NAME =PATH_PUBLICATION;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PUBLICATION;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PUBLICATION;

        public static final String COLUMN_PUBLICATION_ID = "publicationId";
        public static final String COLUMN_TITLE ="title";
        public static final String COLUMN_LOGO ="logo";

        public static Uri buildPopularMovieGenreIdUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }




    }

    public static class FavoriteActionEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_FAVORITE_ACTION).build();

        public static final String TABLE_NAME =PATH_FAVORITE_ACTION;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FAVORITE_ACTION;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FAVORITE_ACTION;

        public static final String COLUMN_FAVORITE_ID= "favorite_id";
        public static final String COLUMN_FAVORITE_DATE ="favorite_date";
        public static final String COLUMN_NEWS_ID ="news_id";
        public static final String COLUMN_USER_ID ="user_id";

        public static Uri buildPopularMovieGenreIdUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }


    }



    public static class CommentActionEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_COMMENT_ACTION).build();

        public static final String TABLE_NAME =PATH_COMMENT_ACTION;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_COMMENT_ACTION;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_COMMENT_ACTION;

        public static final String COLUMN_COMMENT_ID= "commentId";
        public static final String COLUMN_COMMENT ="comment";
        public static final String COLUMN_COMMENT_DATE ="commentDate";
        public static final String COLUMN_USER_ID ="user_id";

        public static Uri buildPopularMovieGenreIdUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }


    }

    public static class SendToEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_SEND_TO).build();

        public static final String TABLE_NAME =PATH_SEND_TO;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_SEND_TO;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_SEND_TO;

        public static final String COLUMN_COMMENT_ID= "sendToId";
        public static final String COLUMN_COMMENT ="comment";
        public static final String COLUMN_COMMENT_DATE ="sendDate";
        public static final String COLUMN_SENDER_ID ="sender_id";
        public static final String COLUMN_RECIEVER_ID ="reciever_id";

        public static Uri buildPopularMovieGenreIdUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }


    }

    public static class ActedUserEntry implements BaseColumns{

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_USERS).build();

        public static final String TABLE_NAME =PATH_USERS;

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_USERS;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_USERS;

        public static final String COLUMN_PUBLICATION_ID = "user_id";
        public static final String COLUMN_TITLE ="user_name";
        public static final String COLUMN_LOGO ="profile_image";


        public static Uri buildPopularMovieGenreIdUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }



    }


}
