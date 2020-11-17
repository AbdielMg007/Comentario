package com.mg.comentario

class mostrar(var codigo: String) {

    operator fun invoke(): String {
        var codigo= codigo
        var mensaje: String


        mensaje = buscar(codigo)
        return mensaje
    }

    fun buscar(mensaje: String):String{
        var mensaje = mensaje
        var tamano = mensaje.length
        var finalmensaje = ""
        var auxwhile1 = 0
        var auxwhile2:Int
        var aux: String
        var guion = "/"
        var separada = arrayOfNulls<String>(tamano)

        for (i in 0 until tamano) {
            separada[i] = mensaje.substring(i,i+1)
        }

        while (auxwhile1 < tamano) {
            if(separada[auxwhile1] == "/"){
                if(separada[auxwhile1+1] == "*"){
                    auxwhile2 = auxwhile1
                    while (auxwhile2 < tamano){
                        aux = separada[auxwhile1].toString()
                        finalmensaje= "$finalmensaje$aux"
                        if(separada[auxwhile1] == "*"){
                            if(separada[auxwhile1+1] == "/"){
                                auxwhile2=tamano
                                finalmensaje= "$finalmensaje$guion\n"
                            }
                        }
                        auxwhile1+=1
                        auxwhile2+=1
                    }
                }
            }
            auxwhile1+=1
        }

        return finalmensaje
    }
}


/* Ejemplo - aprenderaprogr
amar.com */