package com.example.primerospasos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Cositas layout, cargar en la interfaz gráfica
        setContentView(R.layout.activity_main)//R.id es para elementos View, no para layour que es un contenedor

        //Usi del elemento que hemos añadido en strngs.xml
        val nombre = getString(R.string.allez)
        Toast.makeText(this, "Minombre es $nombre", Toast.LENGTH_LONG).show()//Para mostrar por pantalla
    }
}