
package br.unisc.trabalho2.tecnicas;

/**
 *
 * @author will
 */
public class TecnicaChecksum {
 
    
    public String fazSoma(String palavra1, String palavra2){
    
        long p1Decimal;
        long p2Decimal;
        
        long resultadoSomaDecimal;
        
        String resultadoSomaString;
        
        //converte a palavra 1 de decimal para binario
        p1Decimal = Integer.parseInt(palavra1, 2);
        //converte a palavra 2 de decimal para binario
        p2Decimal = Integer.parseInt(palavra2, 2);
        
        //soma a palavra 1 com a palavra 2
        resultadoSomaDecimal = p1Decimal + p2Decimal;

        //converte o resultado da soma para binario
        resultadoSomaString = Long.toBinaryString((int) resultadoSomaDecimal);
        return resultadoSomaString;
    }
    
    public String fazSoma2(String palavra1, String palavra2){
        palavra1.trim();
        palavra2.trim();
        
        char[] p1 = palavra1.toCharArray();
        char[] p2 = palavra2.toCharArray();
        
        StringBuilder result = new StringBuilder();
        
        System.out.println("asd");
        String aux = "";
        for (int i = p1.length-1; i >= 0; i--) {
            
            if (p1[i] == '1' && p2[i] == '1' && aux.equals("")) {
                aux = "1";
                result.append("0");
            }else if (p1[i] == '0' && p2[i] == '0' && aux.equals("")) {
                result.append("0");
            }else if (p1[i] == '0' && p2[i] == '1' && aux.equals("")) {
                result.append("1");
            }else if (p1[i] == '1' && p2[i] == '0' && aux.equals("")) {
                result.append("1");
            }else if (p1[i] == '0' && p2[i] == '0' && aux.equals("1")) {
                result.append("1");
                aux = "";
            }else if (p1[i] == '0' && p2[i] == '1' && aux.equals("1")) {
                result.append("0");
            }else if (p1[i] == '1' && p2[i] == '0' && aux.equals("1")) {
                result.append("0");
            }else if (p1[i] == '1' && p2[i] == '1' && aux.equals("1")) {
                result.append("1");
                //aux = "";
            }else {
                result.append("1");
            }
            
//            if (aux == "1") {
//                result.append("1");
//            }
            
            //100011
            
        }
        
        if (aux == "1") {
                result.append("1");
            }
        
        System.out.println(result.reverse().toString());
        return "";
    }
    
    public String inverteResultSoma(String resultadoSoma){
    
        
        char[] somaCharArray = resultadoSoma.toCharArray();
        
        StringBuilder bitsInvertidos = new StringBuilder();
        
        //Percorre toda a string invertendo seus bits
        for (int i = 0; i < somaCharArray.length; i++) {
            if (somaCharArray[i] == '1') {
                bitsInvertidos.append("0");
            }else{
                bitsInvertidos.append("1");
            }
        }
        
        return bitsInvertidos.toString();
    } 
}
