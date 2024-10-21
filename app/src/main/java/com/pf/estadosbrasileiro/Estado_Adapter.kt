package com.pf.estadosbrasileiro

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.wikiestados.model.Estados

class Estado_Adapter (private val context: Context,
                      private  val estados: List<Estados>?,
                      private val onClickListener: EstadoOnClickListener): RecyclerView.Adapter<Estado_Adapter.EstadosViewHolder>(){
                          interface EstadoOnClickListener{
                              fun onClickEstado(holder: EstadosViewHolder?, idx: Int)}

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int
    ): EstadosViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_estado_adapter,viewGroup,false)
        return EstadosViewHolder(view)
    }

    override fun onBindViewHolder(holder:EstadosViewHolder, position: Int) {
        val estado = estados!![position]
        holder.tNome.text = estado.nome
        holder.img.setImageResource(estado.bandeira)
        holder.itemView.setOnClickListener{
            onClickListener.onClickEstado(holder,position)
        }
    }

    override fun getItemCount(): Int = estados!!.size

    class EstadosViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        // Cria as views para salvar no ViewHolder
        var tNome: TextView = view.findViewById(R.id.tNome)
        var img: ImageView = view.findViewById(R.id.img)
    }
}