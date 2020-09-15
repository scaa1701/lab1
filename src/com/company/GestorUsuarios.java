package com.company;

import java.util.ArrayList;

public class GestorUsuarios extends Usuario{

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
