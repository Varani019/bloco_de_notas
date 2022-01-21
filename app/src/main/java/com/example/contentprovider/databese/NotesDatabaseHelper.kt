package com.example.contentprovider.databese

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID
import java.util.concurrent.ThreadPoolExecutor

class NotesDatabaseHelper(context: Context):SQLiteOpenHelper(
    context,"databeseNotes",null,1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NOTES ("+
                "$_ID INTEGER NOT NULL PRIMARY KEY," +
                "$TITLE_NOTES TEXT NOT NULL" +
                "$DESCRIPTION_NOTE TEXT NOT NULL) ")
    }

    override  fun onUpgrade(db: SQLiteDatabase?, oldVarargs: Int, newVarargs: Int){
    }

    companion object{
        const val TABLE_NOTES: String = "Notes"
        const val TITLE_NOTES: String = "title"
        const val DESCRIPTION_NOTE: String = "description"
    }

}