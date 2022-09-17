package com.plopster.transportApp

//Main activity pantalla principal del proyecto que se muestra una vez se corre la aplicacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//OnCreate pertenece al ciclo de vida de las aplicaciones android
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)// Instancia el contenido que instanciara la pantalla
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}