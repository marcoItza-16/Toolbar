package com.example.ejemplotoolbar

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class PantallaDos : AppCompatActivity() {

    //segunda pantalla

    var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_dos)

        toolbar = findViewById(R.id.toolbar)
        toolbar?.setTitle(R.string.app_name)
        setSupportActionBar(toolbar)

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)


    }
//ActionBar
    //toolbar personalizada
    // Añadiendo elementos
    //eventos a elementos
    //Configurar botón hacia atrás
    //SearchView
    //Compartir contenido
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_pantalla_dos, menu)

        return super.onCreateOptionsMenu(menu)
    }
}

