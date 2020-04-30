package com.enaz.chat.database.di

import android.app.Application
import androidx.room.Room
import com.enaz.chat.database.ChatDatabase
import com.enaz.chat.database.dao.MessageDao
import com.enaz.chat.database.repository.MessageRepository
import com.enaz.chat.database.repository.MessageRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by eduardo.delito on 4/30/20.
 */
@Module
class DatabaseModule(private val mApplication: Application)  {

    private var chatDatabase: ChatDatabase

    init {
        synchronized(this) {
            val instance = Room.databaseBuilder(mApplication, ChatDatabase::class.java, ChatDatabase.DB_NAME)
                .fallbackToDestructiveMigration()
                .build()
            chatDatabase = instance
            instance
        }
    }

    @Singleton
    @Provides
    fun providesChatDatabase(): ChatDatabase {
        return chatDatabase
    }

    @Singleton
    @Provides
    fun providesMessageDao(chatDatabase: ChatDatabase): MessageDao {
        return chatDatabase.messageDao()
    }

    @Provides
    @Singleton
    fun provideMessageRepository(messageDao: MessageDao): MessageRepository = MessageRepositoryImpl(messageDao)

}
