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

        String dividendo = "111100101";
        String divisor = "101101";

        System.out.println("!!: " + fazerCRC(dividendo, divisor));

    }

    String fazerCRC(String msg, String dividendo) {
        //Adiciona 0s no dividendo, de acordo com o grau do polinomio
        for (int i = 1; i < dividendo.length(); i++) {
            msg += "0";
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
        if (fromMsg.startsWith("0")) {
            for (int i = 0; i < fromMsg.length(); i++) {
                retornaResult += Character.getNumericValue(fromMsg.charAt(i)) ^ 0;
                System.out.println("Com:" + Character.getNumericValue(fromMsg.charAt(i)) + " e 0 = " + retornaResult);
            }
        } else {
            for (int i = 0; i < fromMsg.length(); i++) {
                retornaResult += Character.getNumericValue(fromMsg.charAt(i)) ^ Character.getNumericValue(polinomio.charAt(i));
                System.out.println("Com:" + Character.getNumericValue(fromMsg.charAt(i)) + " e " + Character.getNumericValue(polinomio.charAt(i)) + " = " + retornaResult);
            }
        }

        return retornaResult;
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
        pOutput = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRestoXor = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtBitsEnviados = new javax.swing.JTextArea();
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
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfGrauPolinomio))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtRestoXor.setColumns(20);
        txtRestoXor.setRows(5);
        jScrollPane2.setViewportView(txtRestoXor);

        jLabel5.setText("Resto da operacao XOR");

        jButton1.setText("Executar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Simular Erro");

        jLabel6.setText("Bits enviados:");

        txtBitsEnviados.setColumns(20);
        txtBitsEnviados.setRows(5);
        jScrollPane4.setViewportView(txtBitsEnviados);

        javax.swing.GroupLayout pOutputLayout = new javax.swing.GroupLayout(pOutput);
        pOutput.setLayout(pOutputLayout);
        pOutputLayout.setHorizontalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pOutputLayout.createSequentialGroup()
                        .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(pOutputLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))
                            .addComponent(jLabel6))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        pOutputLayout.setVerticalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCheckBox1))
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCrcLayout = new javax.swing.GroupLayout(pCrc);
        pCrc.setLayout(pCrcLayout);
        pCrcLayout.setHorizontalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCrcLayout.setVerticalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CRC", pCrc);

        javax.swing.GroupLayout pHammingLayout = new javax.swing.GroupLayout(pHamming);
        pHamming.setLayout(pHammingLayout);
        pHammingLayout.setHorizontalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pHammingLayout.setVerticalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hamming", pHamming);

        javax.swing.GroupLayout pRed_SolomonLayout = new javax.swing.GroupLayout(pRed_Solomon);
        pRed_Solomon.setLayout(pRed_SolomonLayout);
        pRed_SolomonLayout.setHorizontalGroup(
            pRed_SolomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pRed_SolomonLayout.setVerticalGroup(
            pRed_SolomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Red_Solomon", pRed_Solomon);

        javax.swing.GroupLayout pCheckSumLayout = new javax.swing.GroupLayout(pCheckSum);
        pCheckSum.setLayout(pCheckSumLayout);
        pCheckSumLayout.setHorizontalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pCheckSumLayout.setVerticalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Checksum", pCheckSum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
                    
                    String resultCrc = crc.fazerCRC(msgEmBits.getText(), tfPolinomio.getText(), tfGrauPolinomio.getText());
                    txtRestoXor.setText(resultCrc);
                    
                    
                    String msgEnviada = crc.enviarBits(msgEmBits.getText(), resultCrc);
                    txtBitsEnviados.setText(msgEnviada);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JTextArea txtBitsEnviados;
    private javax.swing.JTextArea txtRestoXor;
    // End of variables declaration//GEN-END:variables
}
