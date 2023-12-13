package com.example.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {
    lateinit var nomeUsuario: String

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.main_activity)
    }

    override fun onRestart() {
        super.onRestart()
        proximaTela(nomeUsuario)
    }

    fun loginActivity(value: View) {
        val campoUsuario: EditText = findViewById(R.id.editTextUser)
        val campoSenha: EditText = findViewById(R.id.editTextSenha)
        nomeUsuario = campoUsuario.text.toString()
        val senha = campoSenha.text.toString()
        val textoErros: TextView = findViewById(R.id.textViewErros)
        if (nomeUsuario == "admin")
            if (senha == "123")
                proximaTela(nomeUsuario)
            }
            else
            {
                textoErros.text = "Senha errada"
            }
    else{
        textoErros.text = "Usuario errado"
    }

    fun proximaTela(nomeUsuario: String)
    {
        val proximaActivity: Intent = Intent(this, HomeActivity::class.java)
        startActivity(proximaActivity)
    }
}