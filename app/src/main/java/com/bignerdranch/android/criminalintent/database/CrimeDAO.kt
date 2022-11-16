package com.bignerdranch.android.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.bignerdranch.android.criminalintent.Crime
import java.util.*
/*
файл, отвечающий за обращения к бд
 */
@Dao
interface CrimeDAo{
    @Query("SELECT * FROM crime")// запись информации в бд
    fun getCrimes():LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}