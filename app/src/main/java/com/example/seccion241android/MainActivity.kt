package com.example.seccion241android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seccion241android.datos.Base
import com.example.seccion241android.models.Producto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val producto = Producto("Raid", 79)
        val conexion = Base(this,null,null, null)
    }
}