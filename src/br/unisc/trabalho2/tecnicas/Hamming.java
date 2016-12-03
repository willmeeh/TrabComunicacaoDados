/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabalho2.tecnicas;

import java.util.Vector;

/**
 *
 * @author Guilherme
 */
public class Hamming {

    int bit;
    String indice;

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    Vector arrayPotencais;
    int valor = 0;
    int x = 0;

    //calcula as potencais de 2 // recursivo
    public int potenciadeDois(int numero) {
        System.out.println("numero:" + numero);
        arrayPotencais.add(numero);
        if (numero == 1) {
            return 1;
        }
        x++;
        int aux = numero / 2;
        return potenciadeDois(aux);
    }

    public void calcularHamming(String array[]) {
        int numeroBits = array.length;
        arrayPotencais = new Vector();
        // encontra as potencias e armazena na arrayPotencais
        potenciadeDois(numeroBits);
        
        int aux = numeroBits+arrayPotencais.size();
        
        for (int i = 0; 1 < aux; i++) {
            
        }

    }

}
