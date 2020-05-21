package com.politecnicomalaga.modelo;

import java.util.List;

public class Concatenacion {

    public String concatenar(List<String> palabras){
        String cadenaResultado="";
        for(String palabra:palabras){
            cadenaResultado+=palabra;
        }
        return cadenaResultado;
    }
}
