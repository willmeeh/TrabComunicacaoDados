/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabalho2.util;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author will
 */
public class MetodosUteis {
    
    public boolean isNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0){
            try {
                valor = Long.parseLong(Numero.getText());
                return true; 
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
                 return false;
            }
        }
        return false;
    }
    
    public boolean isNumeroBinario(JTextField numero) {
        if (numero.getText().length() != 0){
            try {
                char[] charTextField = numero.getText().toCharArray();
                for (int i = 0; i < charTextField.length; i++) {
                    if (charTextField[i] ==  '0' || charTextField[i] ==  '1') {
                    
                    }else{
                        JOptionPane.showMessageDialog(null, "Esse Campo só aceita números binarios" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                        return false; 
                    }
                }
                return true; 
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números binarios" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                numero.grabFocus();
                return false;
            }
        }
        return false;
    }
    
    
    public final String AsciiToBinary(String asciiString){  

        byte[] bytes = asciiString.getBytes();  
        StringBuilder binary = new StringBuilder();  
        for (byte b : bytes)  
        {  
           int val = b;  
           for (int i = 0; i < 8; i++)  
           {  
              binary.append((val & 128) == 0 ? 0 : 1);  
              val <<= 1;  
           }  
          // binary.append(' ');  
        }  
        return binary.toString();  
    }
}
