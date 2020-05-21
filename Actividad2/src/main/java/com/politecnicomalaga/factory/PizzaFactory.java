package com.politecnicomalaga.factory;

public class PizzaFactory {

    public Pizza elegirPizza(int tipoPizza){
        Pizza pizza=null;
        switch (tipoPizza){
            case Pizza.ESTACIONES: pizza=new Pizza4Estaciones();
                break;
            case Pizza.MARGARITA: pizza=new PizzaMargarita();
                break;
            case Pizza.PROSCIUTTO: pizza=new PizzaProsciutto();
                break;
            case Pizza.VEGANA: pizza=new PizzaVegana();
                break;
        }
        return pizza;
    }
}
