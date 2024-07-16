package com.mudurlu.calorieinformation.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mudurlu.calorieinformation.model.Food

@Database(entities = [Food::class], version = 1)
abstract class FoodDatabase : RoomDatabase() {
    abstract fun foodDAO() : foodDAO
}