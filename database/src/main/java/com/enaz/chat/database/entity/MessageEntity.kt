package com.enaz.chat.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Entity(tableName = "MessageEntity")
data class MessageEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id:Int,

    @ColumnInfo(name = "message")
    var message:String

)
