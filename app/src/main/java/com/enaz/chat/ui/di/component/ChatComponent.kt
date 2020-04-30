package com.enaz.chat.ui.di.component

import android.app.Application
import com.enaz.chat.database.di.DatabaseModule
import com.enaz.chat.ui.ChatApplication
import com.enaz.chat.ui.di.module.ActivityBindingModule
import com.enaz.chat.ui.di.module.AppModule
import com.enaz.chat.ui.di.module.ViewModelBindingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBindingModule::class,
    ViewModelBindingModule::class,
    AppModule::class
])
interface ChatComponent : AndroidInjector<ChatApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun database(databaseModule: DatabaseModule): Builder
        fun build(): ChatComponent
    }
}
