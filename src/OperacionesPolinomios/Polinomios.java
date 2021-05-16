/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OperacionesPolinomios;

/**
 * 
 * @author Tristán Segura
 */
public abstract class Polinomios {
    protected int coeficientes[];
    protected char literales[], signo[];

    public int[] getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(int[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public char[] getLiterales() {
        return literales;
    }

    public void setLiterales(char[] literales) {
        this.literales = literales;
    }

    public char[] getSigno() {
        return signo;
    }

    public void setSigno(char[] signo) {
        this.signo = signo;
    }
    
    
}
