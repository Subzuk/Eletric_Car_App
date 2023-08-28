package com.gustavo.eletrci_car_app.presetation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.gustavo.eletrci_car_app.R

class MainActivity : AppCompatActivity() {
    lateinit var btn_novaTela : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_novaTela = findViewById(R.id.btn_NovaTela)
        setupListeners()
    }

    fun setupListeners(){
        btn_novaTela.setOnClickListener{
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}