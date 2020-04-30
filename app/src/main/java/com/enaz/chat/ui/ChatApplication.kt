package com.enaz.chat.ui

import com.enaz.chat.database.di.DatabaseModule
import com.enaz.chat.ui.di.component.DaggerChatComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by eduardo.delito on 4/30/20.
 */
class ChatApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerChatComponent
            .builder()
            .application(this)
            .database(DatabaseModule(this))
            .build()
    }
}