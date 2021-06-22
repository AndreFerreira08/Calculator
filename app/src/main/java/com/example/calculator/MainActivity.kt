package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zero = findViewById<Button>(R.id.numero_zero)
        val um = findViewById<Button>(R.id.numero_um)
        val dois = findViewById<Button>(R.id.numero_dois)
        val tres = findViewById<Button>(R.id.numero_tres)
        val quatro = findViewById<Button>(R.id.numero_quatro)
        val cinco = findViewById<Button>(R.id.numero_cinco)
        val seis = findViewById<Button>(R.id.numero_seis)
        val sete = findViewById<Button>(R.id.numero_sete)
        val oito = findViewById<Button>(R.id.numero_oito)
        val nove = findViewById<Button>(R.id.numero_nove)
        val ponto = findViewById<Button>(R.id.ponto)
        val limpar = findViewById<Button>(R.id.limpar)
        val add = findViewById<Button>(R.id.adicao)
        val back = findViewById<Button>(R.id.backspace)
        val sub = findViewById<Button>(R.id.subtracao)
        val divisao = findViewById<Button>(R.id.divisao)
        val mult = findViewById<Button>(R.id.multiplicacao)
        val expressao = findViewById<TextView>(R.id.expressao)
        val resul = findViewById<TextView>(R.id.resultado)

        var n1 = 0
        var n2 = 0


        add.SetOnClickListener {
            n1 = textview.text.toInt()



        }
        resul.SetOnClickListener {
            n1 = textview.text.toInt()
            n2 = textview.text.toInt()
            val resultado = n1

        }


        fun adicao(add: int){


        }

        fun subtracao(sub: int){


        }
        fun adicao(add: int){


        }

        fun adicao(add: int){


        }

        limpar.setOnClickListener {
            expressao.text = ""
            resul.text = ""
        }

        back.setOnClickListener {

            val string = expressao.text.toString()

            if (string.isNotBlank()) {
                expressao.text = string.substring(0, string.length - 1)
                resul.text = ""
            }
        }
    }
}
