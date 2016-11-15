package br.unisc.trabalho2.telas;

import br.unisc.trabalho2.tecnicas.TecnicaCrc;
import br.unisc.trabalho2.telas.acoes.TelaPrincipalAction;
import java.awt.List;
import java.util.ArrayList;
import br.unisc.trabalho2.util.MetodosUteis;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    TelaPrincipalAction action = new TelaPrincipalAction();

    MetodosUteis util = new MetodosUteis();

    TecnicaCrc crc = new TecnicaCrc();

    public TelaPrincipal() {
        initComponents();

        //Quebra linha quando alcanca a borda direita do txt
        msgEmBits.setLineWrap(true);

        this.setTitle("Detecção e correção de erros na camada de enlace do MR-OSI");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pCrc = new javax.swing.JPanel();
        pInput = new javax.swing.JPanel();
        tfMensagem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgEmBits = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tfPolinomio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfGrauPolinomio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        isSimularErro = new javax.swing.JCheckBox();
        pOutput = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRestoXorTransmitido = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtBitsEnviados = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtMe = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtRestoXorRecebido = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtResultTransmissao = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtMensagemRecebida = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAsciiEnviado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pHamming = new javax.swing.JPanel();
        pRed_Solomon = new javax.swing.JPanel();
        pCheckSum = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCrc.setBackground(new java.awt.Color(126, 167, 176));

        tfMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AtualizaInputBinario(evt);
            }
        });

        jLabel1.setText("Mensagem em ASCII");

        msgEmBits.setColumns(20);
        msgEmBits.setRows(5);
        msgEmBits.setText("111100101");
        jScrollPane1.setViewportView(msgEmBits);

        jLabel2.setText("Mensagem em bits");

        tfPolinomio.setText("101101");
        tfPolinomio.setToolTipText("Informe o polinomio em bits");
        tfPolinomio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validaPolinomio(evt);
            }
        });

        jLabel3.setText("Polinomio em Bits");

        jLabel4.setText("Grau do polinomio");

        tfGrauPolinomio.setText("5");
        tfGrauPolinomio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validaGrauPolinomio(evt);
            }
        });

        jButton1.setText("Executar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        isSimularErro.setText("Simular Erro");

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMensagem)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(tfPolinomio)
                    .addComponent(tfGrauPolinomio)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isSimularErro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGrauPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(isSimularErro))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtRestoXorTransmitido.setColumns(20);
        txtRestoXorTransmitido.setRows(5);
        jScrollPane2.setViewportView(txtRestoXorTransmitido);

        jLabel5.setText("Resto da operacao XOR");

        jLabel6.setText("Bits enviados:");

        txtBitsEnviados.setColumns(20);
        txtBitsEnviados.setRows(5);
        jScrollPane4.setViewportView(txtBitsEnviados);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Transmissor");

        javax.swing.GroupLayout pOutputLayout = new javax.swing.GroupLayout(pOutput);
        pOutput.setLayout(pOutputLayout);
        pOutputLayout.setHorizontalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(pOutputLayout.createSequentialGroup()
                        .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pOutputLayout.setVerticalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Resto da operacao XOR");

        txtRestoXorRecebido.setColumns(20);
        txtRestoXorRecebido.setRows(5);
        jScrollPane6.setViewportView(txtRestoXorRecebido);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Receptor");

        txtResultTransmissao.setColumns(20);
        txtResultTransmissao.setRows(5);
        jScrollPane7.setViewportView(txtResultTransmissao);

        jLabel12.setText("Resultado da verificacao de erros");

        jLabel14.setText("Mensagem Recebida");

        txtMensagemRecebida.setColumns(20);
        txtMensagemRecebida.setRows(5);
        jScrollPane9.setViewportView(txtMensagemRecebida);

        txtAsciiEnviado.setColumns(20);
        txtAsciiEnviado.setRows(5);
        jScrollPane5.setViewportView(txtAsciiEnviado);

        jLabel7.setText("Mensagem decodificado para ASCII");

        javax.swing.GroupLayout txtMeLayout = new javax.swing.GroupLayout(txtMe);
        txtMe.setLayout(txtMeLayout);
        txtMeLayout.setHorizontalGroup(
            txtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane5)
                    .addGroup(txtMeLayout.createSequentialGroup()
                        .addGroup(txtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtMeLayout.setVerticalGroup(
            txtMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pCrcLayout = new javax.swing.GroupLayout(pCrc);
        pCrc.setLayout(pCrcLayout);
        pCrcLayout.setHorizontalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCrcLayout.setVerticalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CRC", pCrc);

        javax.swing.GroupLayout pHammingLayout = new javax.swing.GroupLayout(pHamming);
        pHamming.setLayout(pHammingLayout);
        pHammingLayout.setHorizontalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        pHammingLayout.setVerticalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hamming", pHamming);

        javax.swing.GroupLayout pRed_SolomonLayout = new javax.swing.GroupLayout(pRed_Solomon);
        pRed_Solomon.setLayout(pRed_SolomonLayout);
        pRed_SolomonLayout.setHorizontalGroup(
            pRed_SolomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        pRed_SolomonLayout.setVerticalGroup(
            pRed_SolomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Red_Solomon", pRed_Solomon);

        javax.swing.GroupLayout pCheckSumLayout = new javax.swing.GroupLayout(pCheckSum);
        pCheckSum.setLayout(pCheckSumLayout);
        pCheckSumLayout.setHorizontalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        pCheckSumLayout.setVerticalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Checksum", pCheckSum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Abas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizaInputBinario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AtualizaInputBinario
        msgEmBits.setText(util.AsciiToBinary(tfMensagem.getText()));
    }//GEN-LAST:event_AtualizaInputBinario

    private void validaPolinomio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validaPolinomio
        boolean isBin = util.isNumeroBinario(tfPolinomio);
        if (isBin) {
        } else {
            tfPolinomio.setText("");
        }
    }//GEN-LAST:event_validaPolinomio

    private void validaGrauPolinomio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validaGrauPolinomio
        boolean isNumero = util.isNumero(tfGrauPolinomio);
        if (isNumero) {
        } else {
            tfGrauPolinomio.setText("");
        }
    }//GEN-LAST:event_validaGrauPolinomio

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (msgEmBits.getText().trim() != null && !msgEmBits.getText().equals("")) {
            if (tfPolinomio.getText() != null && !tfPolinomio.getText().equals("")) {
                if (tfGrauPolinomio.getText() != null && !tfGrauPolinomio.getText().equals("")) {

                    //Popula na tela o resto do xor obtido pela mensangem transmitida, de acordo com o polinomio e seu grau
                    String resultCrcTransmissor = crc.getRestoXor(msgEmBits.getText(), tfPolinomio.getText(), tfGrauPolinomio.getText());
                    txtRestoXorTransmitido.setText(resultCrcTransmissor);

                    //Popula a mensagem enviado(concatena o resto da divisao com a ,mensagem)
                    String msgEnviada = crc.enviarBits(msgEmBits.getText(), resultCrcTransmissor);
                    txtBitsEnviados.setText(msgEnviada);

                    String resultRestoXorCrcReceptor = "";
                    String auxParsAsciiSeSimulaErro = "";
                    if (!isSimularErro.isSelected()) {
                        //popula text com a mensagem recebida
                        txtMensagemRecebida.setText(msgEnviada);

                        auxParsAsciiSeSimulaErro = msgEnviada;

                        //Popula o resto da divisao da mensagem recebida
                        resultRestoXorCrcReceptor = crc.getRestoXor(msgEnviada, tfPolinomio.getText(), tfGrauPolinomio.getText());
                        txtRestoXorRecebido.setText(resultRestoXorCrcReceptor);
                    } else {
                        String auxMsg = crc.gerarErroFromXorRest(msgEnviada);
                        auxParsAsciiSeSimulaErro = auxMsg;
                        //popula text com a mensagem recebida simulando erro
                        txtMensagemRecebida.setText(msgEnviada);

                        //
                        resultRestoXorCrcReceptor = crc.getRestoXor(auxMsg, tfPolinomio.getText(), tfGrauPolinomio.getText());
                        
                        
                        //popula resultado do xor
                        txtRestoXorRecebido.setText(resultRestoXorCrcReceptor);

                    }

                    //Verifica se o resultado do xor e tudo 0s, ou e tudo 1s, 
                    //e Popula o status da transmissao de acordo com o resultado
                    String resultTransmissao = crc.verivicaErro(resultRestoXorCrcReceptor);
                    txtResultTransmissao.setText(resultTransmissao);

                    //Converte a mensagem binaria enviada para ASCII
                    StringBuilder str = new StringBuilder();
                    str.append(auxParsAsciiSeSimulaErro);
                    txtAsciiEnviado.setText(MetodosUteis.converteBinarioParaAscii(str));

                } else {
                    JOptionPane.showMessageDialog(null, "Grau do polinomio nao informado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Polinomio nao informado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mensagem nao infomada!");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox isSimularErro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea msgEmBits;
    private javax.swing.JPanel pCheckSum;
    private javax.swing.JPanel pCrc;
    private javax.swing.JPanel pHamming;
    private javax.swing.JPanel pInput;
    private javax.swing.JPanel pOutput;
    private javax.swing.JPanel pRed_Solomon;
    private javax.swing.JTextField tfGrauPolinomio;
    private javax.swing.JTextField tfMensagem;
    private javax.swing.JTextField tfPolinomio;
    private javax.swing.JTextArea txtAsciiEnviado;
    private javax.swing.JTextArea txtBitsEnviados;
    private javax.swing.JPanel txtMe;
    private javax.swing.JTextArea txtMensagemRecebida;
    private javax.swing.JTextArea txtRestoXorRecebido;
    private javax.swing.JTextArea txtRestoXorTransmitido;
    private javax.swing.JTextArea txtResultTransmissao;
    // End of variables declaration//GEN-END:variables
}
