package com.politecnicomalaga.factory;

public class PizzaVegana extends Pizza{
    @Override
    public String preparar() {
        return "Extender masa\n" +
                "Agregar salsa de tomate\n" +
                "Agregar mozzarella\n" +
                "Agregar tomate en rodajas\n" +
                "Agregar tiras de pimiento verde\n" +
                "Agregar maíz";
    }
}
