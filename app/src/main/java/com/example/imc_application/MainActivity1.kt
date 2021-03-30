package com.example.imc_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main1.*

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        setListeners()
    }

    private fun setListeners() {
        editTextKg?.doOnTextChanged{ text, _, _, _ -> textViewTitleImc?.text = text}

        editTextAltura?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        butoonCalcular.setOnClickListener {
            calcularIMC(peso = editTextKg.text.toString(), altura = editTextAltura.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null && altura != null) {
            val imc = peso / (altura * altura)
            textResult.text = "Seu IMC é: \n%.2f".format(imc)
        }
    }
}