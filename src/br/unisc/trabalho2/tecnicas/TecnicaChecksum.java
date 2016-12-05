package br.unisc.trabalho2.tecnicas;

import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author will
 */
public class TecnicaChecksum {

    public String fazSoma(String palavra1, String palavra2) {
        palavra1.trim();
        palavra2.trim();

        System.out.println("palavra1: " + palavra1);
        System.out.println("palavra2: " + palavra2);

        //Se palavra 1 for maior que palavra 2, preenche de 0s na palavra 2
        //para poder fazer a soma em binario
        if (palavra1.length() > palavra2.length()) {

            String aux = StrZeroEsquerda(palavra1.length(), palavra2.length());
            palavra2 = aux + palavra2;

            System.out.println("p2" + palavra2);
            System.out.println("p1" + palavra1);
            //Se palavra 2 for maior que palavra 1, preenche de 0s na palavra 1
            //para poder fazer a soma em binario
        } else if (palavra2.length() > palavra1.length()) {

            String aux = StrZeroEsquerda(palavra2.length(), palavra1.length());
            palavra1 = aux + palavra1;

            System.out.println("p1" + palavra1);
            System.out.println("p2" + palavra2);

        }
        //converte as palavras para um arrau de char
        char[] p1 = palavra1.toCharArray();
        char[] p2 = palavra2.toCharArray();

        StringBuilder result = new StringBuilder();

        // o aux e uma variavel para guardar o valor do bit extra quando se faz a soma
        //por exemplo, quando for 1 + 1 em binario, sobra 1, esta sobra e guardada na variavel aux
        String aux = "";
        for (int i = p1.length - 1; i >= 0; i--) {

            if (p1[i] == '1' && p2[i] == '1' && aux.equals("")) {
                aux = "1";
                result.append("0");
            } else if (p1[i] == '0' && p2[i] == '0' && aux.equals("")) {
                result.append("0");
            } else if (p1[i] == '0' && p2[i] == '1' && aux.equals("")) {
                result.append("1");
            } else if (p1[i] == '1' && p2[i] == '0' && aux.equals("")) {
                result.append("1");
            } else if (p1[i] == '0' && p2[i] == '0' && aux.equals("1")) {
                result.append("1");
                aux = "";
            } else if (p1[i] == '0' && p2[i] == '1' && aux.equals("1")) {
                result.append("0");
            } else if (p1[i] == '1' && p2[i] == '0' && aux.equals("1")) {
                result.append("0");
            } else if (p1[i] == '1' && p2[i] == '1' && aux.equals("1")) {
                result.append("1");
                //aux = "";
            } else {
                result.append("1");
            }
        }
        //se no final da soma, houver o bit 1 no aux, ele coloca no resultado
        if (aux == "1") {
            result.append("1");
        }

        System.out.println(result.reverse().toString());
        return result.toString();
    }

    public String inverteResultSoma(String resultadoSoma) {

        //Trasforma a strinh que recebe o resultado da soma em um vetor de char
        char[] somaCharArray = resultadoSoma.toCharArray();

        StringBuilder bitsInvertidos = new StringBuilder();

        //Percorre cada valor do vetor de char, invertendo seus bits
        for (int i = 0; i < somaCharArray.length; i++) {
            if (somaCharArray[i] == '1') {
                bitsInvertidos.append("0");
            } else {
                bitsInvertidos.append("1");
            }
        }

        return bitsInvertidos.toString();
    }

    public static String StrZeroEsquerda(int palavraMaior, int palavraMenor) {
        //Obtema  diferenca entre as duas palavras
        int diferenca = palavraMaior - palavraMenor;
        String aux = "";
        //Realiza um for de acordo com a diferenca das palavras, 
        //adicionando 0s
        for (int i = 0; i < diferenca; i++) {
            aux += "0";
        }

        return aux;
    }

    //Percorre o checksum e verifica todos os bits sao 1s,
    //retornando uma mensagem erro ou de sucesso
    public String verivicaErro(String msg) {

        String result = "";

        StringBuilder posicoes = new StringBuilder();

        boolean flag = false;

        for (int i = 0; i < msg.length(); i++) {
            //obtem o valor do indice da string de acordo com o for
            char c = msg.charAt(i);
            if (c == '1') {
                result = "A mensagem foi transmitida sem erro";
            } else if (c == '0') {
                flag = true;
                //adiciona as posicoes em que ocorreram 0
                posicoes.append(" " + i);
            }
        }

        if (flag) {
            result = "Mensagem transmitida com erro na(s) possiveis posicoes: " + posicoes.toString();
        }

        return result;
    }

    public String calculoVerificacaoMensagem(String msgEnviadaChecksum) {
        //chama o metodo que separa a mensagem de acordo com os espacos em brancos,
        //sendo que no indice 0, contem a prmeira palabra, no indice 1 a segunda palavra, 
        //e no indice 2 o checksum da mensagem enviada
        String msgSeparada[] = separaMensagem(msgEnviadaChecksum);

        //Calcula novamente o checksum da mensagem recebida
        String checksumAntigo = fazSoma(msgSeparada[0], msgSeparada[1]);

        //faz a soma da do checksum antigo com o checksum gerado da mensagem recebida
        String checksumNovo = fazSoma(msgSeparada[2], checksumAntigo);

        return checksumNovo;
    }

    public String[] separaMensagem(String msgEnviadaChecksum) {
        char[] msg = msgEnviadaChecksum.toCharArray();

        //Separa a mensagem de acordo com o espaco em branco, sendo que sempre ira ter 
        //3 indices no array
        String msgSeparada[] = msgEnviadaChecksum.split(Pattern.quote(" "));

        return msgSeparada;
    }

    //Troca um bit da mensagem para simular o erro
    public String gerarErroFromChecksum(String msg) {
        char[] msgCharArray = msg.toCharArray();

        Random numRandomico = new Random();

        int num = numRandomico.nextInt(msg.length());

        if (msgCharArray[num] == '1') {
            msgCharArray[num] = '0';
        } else if (msgCharArray[num] == '0') {
            msgCharArray[num] = '1';
        }
        String result = "";
        for (int i = 0; i < msgCharArray.length; i++) {
            result += msgCharArray[i];
        }
        System.out.println("msgCharArray" + msgCharArray.toString());
        System.out.println("result" + result);
        return result;
    }

}
