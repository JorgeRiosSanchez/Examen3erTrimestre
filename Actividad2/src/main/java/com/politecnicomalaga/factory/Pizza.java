package com.politecnicomalaga.factory;

public abstract class Pizza {
    public final static int ESTACIONES = 1;
    public final static int MARGARITA = 2;
    public final static int PROSCIUTTO = 3;
    public final static int VEGANA = 4;

    public abstract String preparar();
    public String hornear(){
        return "Introducir en el horno durante 20 minutos";
    }

    public String cortar(){
        return "Cortar en 8 trozos iguales";
    }

    public String empaquetar(){
        return "Introducir en una caja";
    }
}
