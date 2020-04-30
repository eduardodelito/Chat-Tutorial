package com.enaz.chat.di

import androidx.lifecycle.ViewModel
import com.enaz.chat.common.viewmodel.ViewModelKey
import com.enaz.chat.database.repository.MessageRepository
import com.enaz.chat.message.MessageViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module
class MessageViewModelModule {
    @Provides
    @IntoMap
    @ViewModelKey(MessageViewModel::class)
    fun provideMessageViewModel(messageRepository: MessageRepository): ViewModel = MessageViewModel(messageRepository)
}
