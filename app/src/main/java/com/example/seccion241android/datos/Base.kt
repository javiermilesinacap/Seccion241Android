package com.example.seccion241android.datos

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.seccion241android.models.Producto

class Base(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int?) :
    SQLiteOpenHelper(context, NOMBRE_BASE, null, VERSION) {

    companion object{
        val NOMBRE_BASE = "sistemaventas.db"
        val VERSION = 2
    }
    override fun onCreate(p0: SQLiteDatabase?) {
        var sql = "CREATE TABLE productos(_id INTEGER PRIMARY KEY  AUTOINCREMENT, nombre varchar(100), cantidad INTEGER)"
        if (p0 != null) {
            p0.execSQL(sql)
        }
    }
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        var sql1 = "DROP TABLE productos"
        if (p0 != null) {
            p0.execSQL(sql1)
        }
        var sql = "CREATE TABLE productos(_id INTEGER PRIMARY KEY  AUTOINCREMENT, nombre varchar(100), cantidad INTEGER)"
        if (p0 != null) {
            p0.execSQL(sql)
        }
    }
    fun insertProducto(p: Producto){
        val valores = ContentValues()
        valores.put("nombre", p.nombre )
        valores.put("cantidad", p.cantidad)
        val mibase = this.writableDatabase
        mibase.insert("productos", null, valores)
    }
}
