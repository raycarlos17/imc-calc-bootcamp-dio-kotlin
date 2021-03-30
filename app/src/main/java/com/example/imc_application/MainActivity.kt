package com.example.imc_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LifeCycle", "CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "START - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LifeCycle", "RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifeCycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifeCycle", "STOP - a tela não está mais visivel mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifeCycle", "RESTART - a tela esta retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifeCycle", "DESTROY - oh não a tela foi desturida")
    }
}