package com.enaz.chat.mapper

import com.enaz.chat.database.entity.MessageEntity
import com.enaz.chat.model.MessageItem

/**
 * Created by eduardo.delito on 4/30/20.
 */
fun List<MessageEntity>.entityModelToMessageItem() : List<MessageItem> {
    return this.map {
        MessageItem(
            message = it.message
        )
    }
}
