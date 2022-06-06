package com.mad.e.twsplanner.application.data

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideWorkshopDatabase(@ApplicationContext context: Context):WorkshopDatabase{
        return WorkshopDatabase.getInstance(context)

    }
    @Provides
    fun provideWorkshopDao(db:WorkshopDatabase): WorkshopDao {
        return db.workshopDatabase
    }
}
