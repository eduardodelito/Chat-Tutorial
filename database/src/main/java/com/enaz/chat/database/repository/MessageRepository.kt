package com.enaz.chat.database.repository

import androidx.lifecycle.LiveData
import com.enaz.chat.database.dao.MessageDao
import com.enaz.chat.database.entity.MessageEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

/**
 * Created by eduardo.delito on 4/30/20.
 */

interface MessageRepository {
    fun getMessages(): LiveData<List<MessageEntity>>

    fun setMessage(message: MessageEntity)
}

class MessageRepositoryImpl(private var messageDao: MessageDao) : MessageRepository, CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    override fun getMessages() = messageDao.getMessages()

    override fun setMessage(message: MessageEntity) {
        launch  { setMessageBG(message) }
    }

    private suspend fun setMessageBG(message: MessageEntity) {
        withContext(Dispatchers.IO) {
            messageDao.setMessage(message)
        }
    }
}
