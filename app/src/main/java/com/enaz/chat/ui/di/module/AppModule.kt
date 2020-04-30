package com.enaz.chat.ui.di.module

import com.enaz.chat.database.di.DatabaseModule
import dagger.Module

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module(
    includes = [
        DatabaseModule::class
    ]
)
class AppModule