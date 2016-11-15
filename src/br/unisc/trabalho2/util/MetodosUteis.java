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
    
    public static String convertBinaryStringToString(String string){
        char[] chars = string.toCharArray();
        char[] transcoded = new char[(chars.length / 9)+1];

        //for each character (plus one for spacing)
        for (int j = 0; j < chars.length; j+=9) {
            int idx = 0;
            int sum = 0;

            //for each bit in reverse
            for (int i = 7; i>= 0; i--) {
                if (chars[i+j] == '1') {
                    sum += 1 << idx;
                }
                idx++;
            }
            transcoded[j/9] = (char) sum;
        }
        return new String(transcoded);
    }
    
    public static String converteBinarioParaAscii(StringBuilder arrayBinary) {
        String[] ss;
        if (arrayBinary.toString().length() < 8) {
                ss = fazSplitEmString(arrayBinary.toString(), arrayBinary.toString().length());
        } else {
                ss = fazSplitEmString(arrayBinary.toString(), 8);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
                sb.append((char) Integer.parseInt(ss[i], 2));
        }
        return sb.toString();
    }
    
    private static String[] fazSplitEmString(String s, int interval) {
        int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
        String[] result = new String[arrayLength];

        int j = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < lastIndex; i++) {
                result[i] = s.substring(j, j + interval);
                j += interval;
        } // Add the last bit
        result[lastIndex] = s.substring(j);

        return result;
    }
    
    
}
