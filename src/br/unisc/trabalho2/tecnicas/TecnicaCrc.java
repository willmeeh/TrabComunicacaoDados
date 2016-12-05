package br.unisc.trabalho2.tecnicas;

import java.util.Random;

/**
 *
 * @author will
 */
public class TecnicaCrc {

    public TecnicaCrc() {
    }

    public String getRestoXor(String msg, String dividendo, int grauPolinomio) {
        //Adiciona 0s no dividendo, de acordo com o grau do polinomio

        for (int i = 1; i <= grauPolinomio; i++) {
            msg += "0";
        }
        System.out.println(msg);

        //A string fromMsg recebe a mensagem a partir do primeiro bit, 
        //ate a quantidade de bits que possui o dividendo  
        String fromMsg = msg.substring(0, dividendo.length());
        String result = null;

        for (int i = dividendo.length(); i < msg.length(); i++) {
            result = fazerXor(fromMsg, dividendo);
            //a mensagem recebe o resultado, pulando o primeiro bit, ate o tamanho do resultado, e acrescenta
            //o proximo bit, no final da mensagem, de acordo com o percorrer do for
            //o primeiro bit e pulado por nao ser mais necessario para o proximo calculo
            fromMsg = result.substring(1, result.length()) + msg.charAt(i);
        }
        //o xor e calculado novamente aqui por conta do for ter terminado 
        //antes de se calcular a utima vez o xor
        result = fazerXor(fromMsg, dividendo);
        
        //
        return result.substring(1, result.length());
    }

    //OPERAÇÃO DO XOR 
    private String fazerXor(String fromMsg, String polinomio) {
        String retornaResult = new String();
        
        //se a operacao inicia com 0
        if (fromMsg.startsWith("0")) {
            for (int i = 0; i < fromMsg.length(); i++) {
                //
                retornaResult += Character.getNumericValue(fromMsg.charAt(i)) ^ 0;
            }
        } else {
            for (int i = 0; i < fromMsg.length(); i++) {
                retornaResult += Character.getNumericValue(fromMsg.charAt(i)) ^ Character.getNumericValue(polinomio.charAt(i));
            }
        }

        return retornaResult;
    }

    public String enviarBits(String msg, String restoXor) {

        String msgEnviada = msg + restoXor;

        return msgEnviada;
    }

    //Percorre todo o resto do xor e verifica se todo o resultado possui 
    //algum bit com o valor 1, retornando uma mensagem de erro
    public String verivicaErro(String msg) {

        String result = "";
        for (int i = 0; i < msg.length(); i++) {

            char c = msg.charAt(i);
            if (c == '0') {
                result = "A mensagem foi transmitida sem erro";
            } else if (c == '1') {
                return "Mensagem transmitida com erro";
            }
        }
        return result;
    }

    //Troca um bit da mensagem para simular o erro
    public String gerarErroFromXorRest(String msg) {
        char[] msgCharArray = msg.toCharArray();

        Random numRandomico = new Random();

        int num = numRandomico.nextInt(msg.length());
        
        if (msgCharArray[num] == '1') {
            msgCharArray[num] = '0';
        } else {
            msgCharArray[num] = '1';
        }
        String result = "";
        
        for (int i = 0; i < msgCharArray.length; i++) {
            result += msgCharArray[i];
        }
        System.out.println("result" + result);
        return result;
    }

}
