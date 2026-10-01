package com.example.compteurandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)
        val buttonIncrementer = findViewById<Button>(R.id.buttonIncrementer)
        val buttonDecrementer = findViewById<Button>(R.id.buttonDecrementer)
        val buttonReinitialiser = findViewById<Button>(R.id.buttonReinitialiser)

        // Clic sur le bouton +
        buttonIncrementer.setOnClickListener {
            compteur++
            textViewCompteur.text = compteur.toString()
        }

        // Clic sur le bouton -
        buttonDecrementer.setOnClickListener {
            compteur--
            textViewCompteur.text = compteur.toString()
        }

        // Clic sur le bouton Réinitialiser
        buttonReinitialiser.setOnClickListener {
            compteur = 0
            textViewCompteur.text = compteur.toString()
        }
    }
}