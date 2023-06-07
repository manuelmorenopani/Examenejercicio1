package com.example.examenejercicio1.modelo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Factura {
    @Autowired
    @Qualifier("IvaGeneral")
    private IImpuesto t;
    private String impuesto;
    public Factura(IImpuesto t, String impuesto) {
        this.t = t;
        this.impuesto = impuesto;
    }

    public IImpuesto getT() {
        return t;
    }

    public void setT(IImpuesto t) {
        this.t = t;
    }

    public String getAseguradora() {
        return impuesto;
    }

    public void setAseguradora(String aseguradora) {
        this.impuesto = aseguradora;
    }

    public Factura() {

    }



    public String pagar (Producto c) {
        return t.pagar(c);
    }
}
