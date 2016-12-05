/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabalho2.tecnicas;

import br.unisc.trabalho2.util.MetodosUteis;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Guilherme
 */
public class Hamming {

    MetodosUteis metodo = new MetodosUteis();

    public StringBuilder codificar(String array[]) {

        StringBuilder palavraBinario = new StringBuilder();
        // for para adicionar os bits na string builder
        for (int i = 0; i < array.length; i++) {
            palavraBinario.append(array[i]);
        }
        // tamanho da string de bits
        int tamanhoDaPalavra = palavraBinario.toString().length();

        StringBuilder mensagem = new StringBuilder();
        int index = 0;
        while (index < tamanhoDaPalavra) {
            // retorna true ou false se false index soma +1
            while (metodo.potenciaDeDois(mensagem.toString().length() + 1)) {
                //coloca 9 na posica de bit de paridade
                mensagem.append("9");
                //System.err.println("bit :" + mensagemCodificada.charAt(index));
            }

            mensagem.append(palavraBinario.charAt(index));
            //System.out.println("bit: " + palavraBinario.charAt(index));
            index++;
        }

        LinkedList<StringBuilder> listaDeParidades = new LinkedList<StringBuilder>();
        StringBuilder paridade;

        //conta a quantidade de bits de paridade
        int numeroDeParidades = 0;
        for (int i = 0; i < mensagem.length(); i++) {
            if (mensagem.charAt(i) == '9') {
                numeroDeParidades++;
            }
        }
        // pega todas as posicoes que o bit é 1 e converte p/ binario
        for (int i = 0; i < mensagem.length(); i++) {
            if (mensagem.charAt(i) == '1') {
                int aux = i + 1;
                String numeroBinario = Integer.toBinaryString(aux);
                paridade = new StringBuilder();
                paridade.append(numeroBinario);

                while (paridade.length() < numeroDeParidades) {
                    paridade.reverse();
                    paridade.append("0");
                    paridade.reverse();
                }
                listaDeParidades.add(paridade);
                System.out.println("posicao: " + aux + "=" + paridade.toString());
            }
        }

        StringBuilder numerosParaVerificarParidade;
        StringBuilder bits = new StringBuilder();
        StringBuilder bitsDeControle = new StringBuilder();

        int x = 0;
        // while que pega os bits de controle
        while (x < listaDeParidades.get(0).length()) {
            // monta a coluna dos bits
            for (int i = 0; i < listaDeParidades.size(); i++) {
                numerosParaVerificarParidade = new StringBuilder();
                numerosParaVerificarParidade.append(listaDeParidades.get(i));
                bits.append(numerosParaVerificarParidade.charAt(x));
            }

            //for para contar o numero de 1s
            int num = 0;
            for (int j = 0; j < bits.length(); j++) {
                if (bits.charAt(j) == '1') {
                    num++;
                }
            }
            // verifica se o numero de 1s é par
            if (num % 2 == 0) {
                bitsDeControle.append("0");
            } else {
                bitsDeControle.append("1");
            }
            //zera a string
            int tamanho = bits.length();
            bits.delete(0, tamanho);
            x++;
        }

        // while para adicionar os bits de controle a mensagem
        int posicaoBitControle = 0;
        mensagem.reverse();
        while (posicaoBitControle < bitsDeControle.length()) {
            for (int i = 0; i < mensagem.length(); i++) {
                if (mensagem.charAt(i) == '9') {
                    mensagem.deleteCharAt(i);
                    mensagem.insert(i, bitsDeControle.charAt(posicaoBitControle));
                    i = mensagem.length();
                }
                System.out.println("");
            }
            posicaoBitControle++;
        }
        mensagem.reverse();

        return mensagem;

    }

}
