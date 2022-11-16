package com.bignerdranch.android.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.bignerdranch.android.criminalintent.Crime

@Database(entities = [Crime::class], version = 1)//список классов в бд
@TypeConverters(CrimeTypeConverter::class)
abstract class CrimeDatabase:RoomDatabase() {
    abstract fun crimeDao():CrimeDAo
}