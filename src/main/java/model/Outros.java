/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 004820350
 */
public class Outros extends Pessoa{
    private String rga;

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    private int tipo = 3;

    public int getTipo() {
        return tipo;
    }
}
