package com.OrgSolutionNet.Proyecto.Entities;

public class MovimientoDinero {
    private int monto;
    private int montosPositivo;
    private int montosNegativo;
    private String conceptoMovimiento;
    private String usuario_encargado;

   /* public MovimientoDinero() {
        this.monto = 10000;
        this.montosPositivo = 7000;
        this.montosNegativo = 4000;
        this.conceptoMovimiento = "compra arepas";
        this.usuario_encargado = "Erika";
    }*/



    public MovimientoDinero(int monto, int montosPositivo, int montosNegativo, String conceptoMovimiento, String usuario_encargado) {
        this.monto = monto;
        this.montosPositivo = montosPositivo;
        this.montosNegativo = montosNegativo;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario_encargado = usuario_encargado;
    }

    public MovimientoDinero() {

    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMontosPositivo() {
        return montosPositivo;
    }

    public void setMontosPositivo(int montosPositivo) {
        this.montosPositivo = montosPositivo;
    }

    public int getMontosNegativo() {
        return montosNegativo;
    }

    public void setMontosNegativo(int montosNegativo) {
        this.montosNegativo = montosNegativo;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuario_encargado() {
        return usuario_encargado;
    }

    public void setUsuario_encargado(String usuario_encargado) {
        this.usuario_encargado = usuario_encargado;
    }


}