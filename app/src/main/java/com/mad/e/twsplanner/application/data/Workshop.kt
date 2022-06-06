package com.mad.e.twsplanner.application.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class Workshop(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val presenter: String,
    val time: Int,
    val bitmap: String,
)