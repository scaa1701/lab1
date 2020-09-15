package com.company;

public class Usuario extends DirectorioTelefonico {
    private int codigoPucp;
    private String nombres;
    private String apellido;
    private int telefono;
    private int anexo;
    private String departamento;

    public int getCodigoPucp() {
        return codigoPucp;
    }

    public void setCodigoPucp(int codigoPucp) {
        this.codigoPucp = codigoPucp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnexo() {
        return anexo;
    }

    public void setAnexo(int anexo) {
        this.anexo = anexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
