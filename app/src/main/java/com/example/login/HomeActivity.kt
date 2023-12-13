package com.example.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import  android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_home)

        val nome: String? = intent.getStringExtra("nomeUsuario")
        var textViewPrincipal: textView = this.findViewById(R.id.textView)
        textViewPrincipal.text = "Bem vindo, " + nome + "!"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId)
        {
            0 -> {
                startActivity(Intent(this, activity2::class.java))
            }
            1 -> {
                var textViewPrincipal: textView = this.findViewById(R.id.textView)
                textViewPrincipal.text = "item2"
            }
        }
        return super.onOptionsItemSelected(item)
    }
}