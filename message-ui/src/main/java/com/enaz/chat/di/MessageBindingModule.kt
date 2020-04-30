package com.enaz.chat.di

import androidx.lifecycle.ViewModelProvider
import com.enaz.chat.message.MessageFragment
import com.enaz.chat.message.MessageViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module
abstract class MessageBindingModule {

    @ContributesAndroidInjector(modules = [InjectMessageViewModelModule::class])
    abstract fun bindMessageFragment(): MessageFragment

    @Module
    class InjectMessageViewModelModule {
        @Provides
        internal fun provideMessageViewModel(
            factory: ViewModelProvider.Factory,
            target: MessageFragment
        ) = ViewModelProvider(target, factory).get(MessageViewModel::class.java)
    }
}
