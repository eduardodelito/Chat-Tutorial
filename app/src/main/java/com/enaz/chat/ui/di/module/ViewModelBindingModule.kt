package com.enaz.chat.ui.di.module

import androidx.lifecycle.ViewModelProvider
import com.enaz.chat.common.viewmodel.ViewModelFactory
import com.enaz.chat.di.MessageViewModelModule
import dagger.Binds
import dagger.Module

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module(
    includes = [
        MessageViewModelModule::class
    ]
)
abstract class ViewModelBindingModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
