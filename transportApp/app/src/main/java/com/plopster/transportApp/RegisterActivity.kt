package com.plopster.transportApp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.plopster.transportApp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        binding.loginBtn.setOnClickListener{ registerUser() }
        binding.registerButton.setOnClickListener{ registerUser() }
    }

    private fun registerUser(){
        val name = binding.nameTextField.text.toString();
        val lastName = binding.lastNameTextField.text.toString();
        val phoneNumber = binding.phoneNumberTextField.text.toString();
        val regEmail = binding.regEmailTextField.text.toString();
        val regPassword = binding.regPasswordTextField.text.toString();
        val regConfirmPassword = binding.confirmPasswordTextField.text.toString();
        if(regPassword == regConfirmPassword){
            val mapData = mapOf(
                "Nombre" to name,
                "Apellido" to lastName,
                "Telefono" to phoneNumber,
                "Correo Electronico" to regEmail,
                "Contraseña" to regPassword,
                "Confirmacion" to regConfirmPassword
            );

            if(formValidate(mapData)){
                Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "Los campos contraseña y confirmacion de " +
                    "contraseña deben ser iguales", Toast.LENGTH_LONG).show();
        }
    }

    private fun formValidate(mapData: Map<String, String>): Boolean{
        var status = false;

        for ((k, v) in mapData){
            if(v == ""){
                status = false
                Toast.makeText(this, "El campo de $k no debe estar vacio", Toast.LENGTH_LONG).show();
                break
            }else{
                status = true
            }
        }
        return status
    }


    private fun loginRedirect(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

}