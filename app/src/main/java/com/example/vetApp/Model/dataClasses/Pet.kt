package com.example.vetApp.Model.dataClasses

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*
@Entity(tableName = "pet")
data class Pet(@ColumnInfo(name = "name") var name: String = "",
               @ColumnInfo(name = "birthDate") var birthDate: Date? = null,
               @ColumnInfo(name = "sex") var sex: String = "",
               @ColumnInfo(name = "kind") var kind: String = ""/*,
               @ColumnInfo(name = "img") var img: Image? = null*/): Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Long? = null
    /*
    init {
        println("Start UserData")
        this.name = name
        println("name: $name")
        this.birthDate = birthDate
        println("birthDate: $birthDate")
        this.sex = sex
        println("sex: $sex")
        this.kind = kind
        println("kind: $kind")
    }*/

}
