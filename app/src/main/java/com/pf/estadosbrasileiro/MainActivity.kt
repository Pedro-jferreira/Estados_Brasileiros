package com.pf.estadosbrasileiro

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wikiestados.model.EstadoData
import com.example.wikiestados.model.Estados

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var estados: List<Estados>? = emptyList()
    private lateinit var adapter: Estado_Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        estados = EstadoData.getEstados()

        adapter = Estado_Adapter(this, estados, onClickEstado())
        recyclerView.adapter = adapter


    }
    private fun onClickEstado(): Estado_Adapter.EstadoOnClickListener {
        return object : Estado_Adapter.EstadoOnClickListener {
            override fun onClickEstado(holder: Estado_Adapter.EstadosViewHolder?, idx: Int) {
                val estado = estados?.get(idx)
                estado?.let {

                    val intent = Intent(this@MainActivity, EstadoDetalhes::class.java)
                    intent.putExtra("object", estado)
                    startActivity(intent)
                }

            }
        }
    }
}