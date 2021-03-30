package com.example.imc_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.main_relative.*

class MainRelative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_relative)
        setListeners()
    }

    private fun setListeners() {
        editTextAltura?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        editTextKg?.doOnTextChanged{ text, _, _, _ ->
            textViewTitleImc.text = text
        }

    }
}
