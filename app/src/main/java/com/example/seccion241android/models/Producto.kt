package com.example.seccion241android.models

class Producto{
    lateinit var nombre: String
    var codigo : Int = 0
    var cantidad: Int = 0
    constructor(nombre: String,cantidad: Int){
        this.nombre = nombre
        this.cantidad = cantidad
    }
    constructor(nombre: String,codigo:Int, cantidad: Int){
        this.nombre = nombre
        this.codigo = codigo
        this.cantidad = cantidad
    }


}