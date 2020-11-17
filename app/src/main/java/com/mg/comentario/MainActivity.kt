package com.mg.comentario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buscar(view: View?) {

        val mensaje: String

        if (codigo.text.isNotEmpty()) {
            val msj = mostrar(codigo.text.toString())
            mensaje = msj()
            showMensaje(mensaje)
        } else {
            showAlert()
        }

    }
    private fun showAlert(){
        val men = AlertDialog.Builder(this)
        men.setTitle("Error")
        men.setMessage("Llene todos los campos")
        men.setPositiveButton("Aceptar", null)
        val dial: AlertDialog = men.create()
        dial.show()
    }

    private fun showMensaje(mensaje: String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Comentarios encontrados:")
        builder.setMessage(mensaje)
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}