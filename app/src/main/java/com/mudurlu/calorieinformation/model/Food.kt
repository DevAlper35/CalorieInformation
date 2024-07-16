package com.mudurlu.calorieinformation.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Food(

    @ColumnInfo(name = "isim")
    @SerializedName("isim")
    val foodName: String?,

    @ColumnInfo(name = "kalori")
    @SerializedName("kalori")
    val foodCalorie: String?,

    @ColumnInfo("karbonhidrat")
    @SerializedName("karbonhidrat")
    val foodCarbonHydrate: String?,

    @ColumnInfo("protein")
    @SerializedName("protein")
    val foodProtein: String?,

    @ColumnInfo("yag")
    @SerializedName("yag")
    val foodOil : String?,

    @SerializedName("gorsel")
    val foodImage : String?

){
    @PrimaryKey(autoGenerate = true)
    var uuid : Int = 0

}