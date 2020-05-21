package com.politecnicomalaga.factory;

public class PizzaProsciutto extends Pizza{
    @Override
    public String preparar() {
        return "Extender masa\n" +
                "Agregar salsa de tomate\n" +
                "Agregar mozzarella\n" +
                "Agregar jamón york";
    }
}
