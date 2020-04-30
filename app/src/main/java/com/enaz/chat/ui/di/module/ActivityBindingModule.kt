package com.enaz.chat.ui.di.module

import com.enaz.chat.di.MessageBindingModule
import com.enaz.chat.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector(
        modules = [
            MessageBindingModule::class
        ]
    )
    abstract fun bindMainActivity(): MainActivity
}
