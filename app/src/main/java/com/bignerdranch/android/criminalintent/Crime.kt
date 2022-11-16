package com.bignerdranch.android.criminalintent


import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
/*
дата класс с расширением ентити является структурой БД
 */
@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)