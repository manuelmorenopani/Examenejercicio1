package com.example.examenejercicio1.modelo;

import org.springframework.stereotype.Component;

@Component("IvaSuperreducido")
public class IvaSuperreducido implements IImpuesto{

    @Override
    public String pagar(Producto c) {

        return "La factura se esta pagando";
    }
}
