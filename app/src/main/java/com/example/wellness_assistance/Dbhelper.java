//package com.example.wellness_assistance;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteException;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
//public class Dbhelper extends SQLiteOpenHelper {
//    public static final String USER_TABLE_NAME = "user";
//    public static final String KEY_USER_ID = "user_id";
//    public static final String KEY_USER_NAME = "user_name";
//    public static final String KEY_USER_EMAIL = "user_email";
//    public static final String KEY_USER_PASSWORD = "user_password";
//    public static final String KEY_USER_ROLE = "user_role";
//    private static final int DATABASE_VERSION = 1;
//    private static final String DATABASE_NAME = "WellnessAssistance";
//
//    public Dbhelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        // Create the user table
//        String createUserTable = "CREATE TABLE IF NOT EXISTS " + USER_TABLE_NAME + " (" + KEY_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_USER_NAME + " TEXT," + KEY_USER_EMAIL + " TEXT UNIQUE," + KEY_USER_PASSWORD + " TEXT," + KEY_USER_ROLE + " TEXT DEFAULT 'user')";
//        db.execSQL(createUserTable);
//    }
//
//    public String login(String email, String password) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        try {
//            String query = "SELECT * FROM " + USER_TABLE_NAME + " WHERE " + KEY_USER_EMAIL + "=? AND " + KEY_USER_PASSWORD + "=?";
//            Cursor cursor = db.rawQuery(query, new String[]{email, password});
//            if (cursor.getCount() == 0) {
//                cursor.close();
//                return "Invalid credentials"; // Return a message indicating invalid credentials
//            } else {
//                cursor.moveToFirst();
//                String dbPassword = cursor.getString(cursor.getColumnIndex(KEY_USER_PASSWORD));
//                if (password.equals(dbPassword)) {
//                    String role = cursor.getString(cursor.getColumnIndex(KEY_USER_ROLE));
//                    cursor.close();
//                    return role; // Return the user's role
//                } else {
//                    cursor.close();
//                    return "Invalid credentials"; // Return a message indicating invalid credentials
//                }
//            }
//        } catch (SQLiteException e) {
//            Log.e("DBHELPER", "Error inserting user data: " + e.getMessage());
//            return "Database error"; // Return a message indicating a database error
//        } finally {
//            db.close();
//        }
//    }
//
//    public boolean isEmailRegistered(String email) {
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery("SELECT * FROM tblregistration WHERE email_id=?", new String[]{email});
//        boolean isRegistered = cursor.getCount() > 0;
//        cursor.close();
//        return isRegistered;
//    }
//
//    public Cursor getallEvents() {
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor resultset = db.rawQuery("SELECT * FROM events", null);
//        return resultset;
//    }
//
//    public boolean addUser(String name, String email, String password) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        try {
//            // Check if the email already exists in the user table
//            String query = "SELECT * FROM " + USER_TABLE_NAME + " WHERE " + KEY_USER_EMAIL + "=?";
//            Cursor cursor = db.rawQuery(query, new String[]{email});
//            if (cursor.getCount() > 0) {
//                // User already exists, return false
//                Log.e("DBHELPER", "User with this email already signed up: " + email);
//                return false;
//            }
//
//            // User does not exist, proceed with insertion
//            ContentValues values = new ContentValues();
//            values.put(KEY_USER_NAME, name);
//            values.put(KEY_USER_EMAIL, email);
//            values.put(KEY_USER_PASSWORD, password);
////            values.put(KEY_USER_ROLE, role);
//
//            // Inserting Row
//            long newRowId = db.insert(USER_TABLE_NAME, null, values);
//            return newRowId != -1; // Return true if insertion was successful
//        } catch (SQLiteException e) {
//            Log.e("DBHELPER", "Error inserting user data: " + e.getMessage());
//            return false;
//        } finally {
//            db.close();
//        }
//    }
//}
//
