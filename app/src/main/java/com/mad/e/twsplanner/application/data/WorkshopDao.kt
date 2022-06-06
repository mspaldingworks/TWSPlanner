package com.mad.e.twsplanner.application.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkshopDao {

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): Flow<List<Workshop>>

    @Insert
    suspend fun insertWorkshopDetails(workshop: Workshop)

    @Update
    suspend fun updateWorkshopDetails(workshop: Workshop)

    @Delete
    suspend fun deleteWorkshopDetails(workshop: Workshop)

    @Query("SELECT * FROM user_table WHERE type = :filterType")
    fun getFilteredWorkshopsList(filterType: String): Flow<List<Workshop>>

    @Query("SELECT * FROM user_table ORDER BY ID")
    fun getWorkshopsList(): Flow<List<Workshop>>

}