package com.example.seccion241android.models

class Producto{
    lateinit var nombre: String
    lateinit var codigo : String
    var cantidad: Int = 0
    constructor(nombre: String,cantidad: Int){
        this.nombre = nombre
        this.cantidad = cantidad
    }
    constructor(nombre: String,codigo:String, cantidad: Int){
        this.nombre = nombre
        this.codigo = codigo
        this.cantidad = cantidad
    }


}