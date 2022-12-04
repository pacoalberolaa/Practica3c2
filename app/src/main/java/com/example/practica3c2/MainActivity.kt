package com.example.practica3c2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.acercaDe -> {
                lanzarAcercaDe()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun lanzarAcercaDe() {
        TODO("Not yet implemented")
    }
}