package com.enaz.chat.message

import com.enaz.chat.common.viewmodel.BaseViewModel
import com.enaz.chat.database.entity.MessageEntity
import com.enaz.chat.database.repository.MessageRepository

class MessageViewModel (private val messageRepository: MessageRepository) : BaseViewModel() {

    fun getMessages() = messageRepository.getMessages()

    fun setMessage(message: MessageEntity) { messageRepository.setMessage(message)}
}
