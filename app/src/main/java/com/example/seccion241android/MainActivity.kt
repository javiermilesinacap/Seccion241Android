package com.example.seccion241android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.seccion241android.datos.Base
import com.example.seccion241android.models.Producto
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val producto = Producto("Raid",79)
        val conexion = Base(this,null,null, null)
        conexion.insertProducto(producto)
        var mensaje: TextView = findViewById(R.id.main_Mensaje)

        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")

        // Read from the database
        myRef.addValueEventListener(object: ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.getValue()
                Log.d("EL VALOR", "Value is: " + value)
                mensaje.text = value.toString()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("EL VALOR", "Failed to read value.", error.toException())
            }

        })

    }
}