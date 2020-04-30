package com.enaz.chat.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.enaz.chat.database.entity.MessageEntity

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Dao
interface MessageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setMessage(message: MessageEntity)

    @Query("SELECT * from MessageEntity ORDER BY id ASC")
    fun getMessages() : LiveData<List<MessageEntity>>

    @Query("DELETE FROM MessageEntity")
    fun deleteAll()
}
