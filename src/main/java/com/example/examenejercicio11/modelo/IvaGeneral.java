package com.example.examenejercicio1.modelo;

import org.springframework.stereotype.Component;

@Component("IvaGeneral")
public class IvaGeneral implements IImpuesto{

    @Override
    public String pagar(Producto c) {

        return "La factura se esta pagando";
    }
}
