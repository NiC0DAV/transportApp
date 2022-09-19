package com.plopster.transportApp

//Main activity pantalla principal del proyecto que se muestra una vez se corre la aplicacion

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import com.plopster.transportApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {//OnCreate pertenece al ciclo de vida de las aplicaciones android
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)// Instancia el contenido que instanciara la pantalla
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        binding.registerBtn.setOnClickListener{ registerRedir() }
    }

    private fun registerRedir(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
}