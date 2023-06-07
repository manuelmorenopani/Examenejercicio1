package com.example.examenejercicio11.modelo;

import org.springframework.stereotype.Component;

@Component("IvaSuperreducido")
public class IvaSuperreducido implements IImpuesto{

    @Override
    public String pagar(Producto c) {

        return "La factura se esta pagando " + (c.precio * 4);
    }
}
