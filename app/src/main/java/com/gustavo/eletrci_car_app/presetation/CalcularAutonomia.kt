package com.gustavo.eletrci_car_app.presetation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gustavo.eletrci_car_app.R

class CalcularAutonomiaActivity : AppCompatActivity() {
    lateinit var preco : EditText
    lateinit var kmPercorrido : EditText
    lateinit var btn_calcular : Button
    lateinit var resultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        preco = findViewById(R.id.precokwh)
        kmPercorrido = findViewById(R.id.kmpercorrido)
        btn_calcular = findViewById(R.id.btn_calcular)
        resultado = findViewById(R.id.resultado)
        setupListeners()
    }
    fun setupListeners() {
        btn_calcular.setOnClickListener {
            calcular()
        }
    }
        fun calcular(){
            val preco = preco.text.toString().toFloat()
            val km = kmPercorrido.text.toString().toFloat()
            val result = km / preco
            resultado.text = "Autonomia: " + result.toString()
        }
}