package com.OrgSolutionNet.Proyecto;

public class MovimientoDinero {
    private int monto;
    private int montosPositivo;
    private int montosNegativo;
    private String conceptoMovimiento;
    private String usuario;

    public MovimientoDinero() {
    }

    public MovimientoDinero(int monto, int montosPositivo, int montosNegativo, String conceptoMovimiento, String usuario) {
        this.monto = monto;
        this.montosPositivo = montosPositivo;
        this.montosNegativo = montosNegativo;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", montosPositivo=" + montosPositivo +
                ", montosNegativo=" + montosNegativo +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
