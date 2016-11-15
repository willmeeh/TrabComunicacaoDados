
package br.unisc.trabalho2.tecnicas;

/**
 *
 * @author will
 */
public class TecnicaCrc {

    public TecnicaCrc() {
    }
    
    public String fazerCRC(String msg, String dividendo, String grauPolinomio){
        //Adiciona 0s no dividendo, de acordo com o grau do polinomio
        
        for (int i = 1; i <= Integer.parseInt(grauPolinomio); i++) {
            msg+="0";
        }       
        System.out.println(msg);

        //A string fromMsg recebe a mensagem a partir do primeiro bit, 
        //ate a quantidade de bits que possui o dividendo  
        String fromMsg = msg.substring(0, dividendo.length());
        String result = null;

        for (int i = 6; i < msg.length(); i++) {
            result = fazerXor(fromMsg, dividendo);
            fromMsg = result.substring(1, result.length()) + msg.charAt(i);
        }
        result = fazerXor(fromMsg, dividendo);
        return result.substring(1, result.length());
    }


    //OPERAÇÃO DO XOR 
    private String fazerXor(String fromMsg, String polinomio) {
        String retornaResult = new String();
        if(fromMsg.startsWith("0")) {
            for (int i = 0; i < fromMsg.length(); i++) {
                retornaResult += Character.getNumericValue(fromMsg.charAt(i))^ 0;
                System.out.println("Com:" + Character.getNumericValue(fromMsg.charAt(i)) + " e 0 = " + retornaResult);
            }
        }else{
            for (int i = 0; i < fromMsg.length(); i++) {
                retornaResult += Character.getNumericValue(fromMsg.charAt(i)) ^ Character.getNumericValue(polinomio.charAt(i));
                System.out.println("Com:" + Character.getNumericValue(fromMsg.charAt(i)) + " e " + Character.getNumericValue(polinomio.charAt(i)) + " = "  + retornaResult);
            }  
        }

        return retornaResult;
    }
    
    public String enviarBits(String msg, String restoXor){
    
        String msgEnviada = msg+restoXor;
        
        return msgEnviada;
    }
    
    
}
