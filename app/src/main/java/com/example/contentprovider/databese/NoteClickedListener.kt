package com.example.contentprovider.databese

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}