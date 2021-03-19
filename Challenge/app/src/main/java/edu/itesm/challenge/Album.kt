package edu.itesm.challenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Album (
    val portada:Int,
    val nombre:String,
    val lanzamiento:String,
    val canciones: String,
    val secreto: String): Parcelable