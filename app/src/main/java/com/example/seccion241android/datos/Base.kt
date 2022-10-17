package com.example.seccion241android.datos

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Base(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int?) :
    SQLiteOpenHelper(context, NOMBRE_BASE, null, VERSION) {

    companion object{
        val NOMBRE_BASE = "sistemaventas.db"
        val VERSION = 1
    }
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("CREAR UNA INSTRUCCION SQL QUE CREE LA TABLA CONSUS RESPECTIVOS ATRIBUTOS")
        var sql = "CREATE TABLE productos(_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre varchar(100), cantidad INTEGER)"
        if (p0 != null) {
            p0.execSQL(sql)
        }
    }
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
