package com.enaz.chat.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.enaz.chat.database.dao.MessageDao
import com.enaz.chat.database.entity.MessageEntity

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Database(entities = [MessageEntity::class], version = 1, exportSchema = false)
abstract class ChatDatabase : RoomDatabase() {
    abstract fun messageDao(): MessageDao

    companion object {
        const val DB_NAME = "DBChat"
    }
}

