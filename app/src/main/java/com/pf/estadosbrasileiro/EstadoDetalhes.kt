package com.pf.estadosbrasileiro

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.wikiestados.model.Estados

class EstadoDetalhes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estado)
        val imagemEstado = findViewById<ImageView>(R.id.imagemEstado)
        val nomeEstado = findViewById<TextView>(R.id.nomeEstado)
        val capitalEstado = findViewById<TextView>(R.id.capitalEstado)
        val populacaoEstado = findViewById<TextView>(R.id.populacaoEstado)
        val regiaoEstado = findViewById<TextView>(R.id.regiaoEstado)
        // Recebendo o objeto 'Estados' da Intent
        val estado = intent.getParcelableExtra<Estados>("object")

        // Verifica se o estado não é nulo e preenche os dados
        estado?.let {
            imagemEstado.setImageResource(it.bandeira)
            nomeEstado.text = it.nome
            capitalEstado.text = "Capital: ${it.capital}"
            populacaoEstado.text = "População: ${it.população}"
            regiaoEstado.text = "Região: ${it.regiao}"
        }
    }
}