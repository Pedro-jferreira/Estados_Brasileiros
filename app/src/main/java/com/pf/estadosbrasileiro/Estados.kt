package com.example.wikiestados.model

import android.os.Parcelable
import com.pf.estadosbrasileiro.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Estados (val nome: String, val capital: String, val população: String,
    val regiao: String, val bandeira: Int) : Parcelable;

object EstadoData{
    fun getEstados(): List<Estados>{
        return listOf(
            Estados("Acre", "Rio Branco", "830.018", "Norte", R.drawable.acre),
            //Estados("Alagoas", "Maceió", "3.128.000", "Nordeste", R.drawable.alagoas),
            Estados("Amapá", "Macapá", "733.759", "Norte", R.drawable.amap_),
            Estados("Amazonas", "Manaus", "3.942.000", "Norte", R.drawable.amazonas),
            //Estados("Ceará", "Fortaleza", "8.794.957", "Nordeste", R.drawable.cear_),
            Estados("Distrito Federal", "Brasília", "2.817.000", "Centro Oeste", R.drawable.distrito_federal),
            Estados("Espírito Santo", "Vitória", "3.834.000", "Sudeste", R.drawable.esp_rito_santo),
            Estados("Goiás", "Goiânia", "7.056.000", "Centro Oeste", R.drawable.goi_s),
            Estados("Maranhão", "São Luís", "6.777.000", "Nordeste", R.drawable.maranh_o),
            Estados("Mato Grosso", "Cuiabá", "3.659.000", "Centro Oeste", R.drawable.mato_grosso),
            Estados("Mato Grosso do Sul", "Campo Grande", "2.757.000", "Centro Oeste", R.drawable.mato_grosso_do_sul),
            Estados("Minas Gerais", "Belo Horizonte", "20.540.000", "Sudeste", R.drawable.minas_gerais),
            Estados("Pará", "Belém", "8.120.000", "Norte", R.drawable.par_),
            Estados("Paraíba", "João Pessoa", "3.975.000", "Nordeste",  R.drawable.para_ba),
           // Estados("Paraná", "Curitiba", "11.440.000", "Sul", R.drawable.paran_),
            Estados("Pernambuco", "Recife", "9.059.000", "Nordeste", R.drawable.pernambuco),
            Estados("Piauí", "Teresina", "3.271.000", "Norte", R.drawable.piau_),
           // Estados("Rio de Janeiro", "Rio de Janeiro", "16.060.000", "Sudeste", R.drawable.rio_de_janeiro),
           // Estados("Rio Grande do Norte", "Natal", "3.303.000", "Nordeste", R.drawable.rio_grande_do_norte),
           // Estados("Rio Grande do Sul", "Porto Alegre", "10.880.000", "Sul", R.drawable.rio_grande_do_sul),
            Estados("Rondônia", "Porto Velho", "1.581.000", "Norte",  R.drawable.rond_nia),
            Estados("Roraima", "Boa Vista", "636.707", "Norte", R.drawable.roraima),
           // Estados("Santa Catarina", "Florianópolis", "7.610.000", "Sul", R.drawable.santa_catarina),
           // Estados("São Paulo", "São Paulo", "44.410.000", "Sudeste", R.drawable.s_o_paulo),
            Estados("Sergipe", "Aracaju", "2.210.000", "Nordeste", R.drawable.sergipe),
            Estados("Tocantins", "Palmas", "1.511.000", "Centro Oeste", R.drawable.tocantins)
        )
    }
}
