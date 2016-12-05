package br.unisc.trabalho2.telas;

import br.unisc.trabalho2.tecnicas.Hamming;
import br.unisc.trabalho2.tecnicas.TecnicaChecksum;
import br.unisc.trabalho2.tecnicas.TecnicaCrc;
import br.unisc.trabalho2.telas.acoes.TelaPrincipalAction;
import java.awt.List;
import java.util.ArrayList;
import br.unisc.trabalho2.util.MetodosUteis;
import java.awt.GraphicsEnvironment;
import static java.awt.TextArea.SCROLLBARS_HORIZONTAL_ONLY;
import static java.awt.TextArea.SCROLLBARS_VERTICAL_ONLY;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {

    TelaPrincipalAction action = new TelaPrincipalAction();

    MetodosUteis util = new MetodosUteis();

    TecnicaCrc crc = new TecnicaCrc();
    TecnicaChecksum checksum = new TecnicaChecksum();
    Hamming hamming = new Hamming();

    public TelaPrincipal() {
        initComponents();

        //faz uma quebra de linha ao chegar na borda direita da area de texto
        msgEmBits.setLineWrap(true);
        txtPalavra1Checksum.setLineWrap(true);
        txtPalavra2Checksum.setLineWrap(true);

        this.setTitle("Detecção e correção de erros na camada de enlace do MR-OSI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pCrc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pCrc1 = new javax.swing.JPanel();
        pInput = new javax.swing.JPanel();
        tfMensagem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgEmBits = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tfPolinomio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        executarCrc = new javax.swing.JButton();
        isSimularErro = new javax.swing.JCheckBox();
        pOutput = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRestoXorTransmitido = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
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
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAsciiEnviado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pCheckSum = new javax.swing.JPanel();
        pInput3 = new javax.swing.JPanel();
        tfPalavra1CH = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtPalavra1Checksum = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        executarChecksum = new javax.swing.JButton();
        isSimularErroChecksum = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfPalavra2CH = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtPalavra2Checksum = new javax.swing.JTextArea();
        pOutput1 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtResultadoSomaChecksum = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtBitsInvertidos = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtMsgEnviadaCheckSum = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        txtMe1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtComparacaoChecksumEnviado = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtResultTransmissaoChecksum = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtMensagemRecebidaCheckSum = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtAsciiEnviadoChecksum = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        pHamming = new javax.swing.JPanel();
        pCrc2 = new javax.swing.JPanel();
        pInput4 = new javax.swing.JPanel();
        tfMensagem3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        msgEmBits3 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        executarHamming = new javax.swing.JButton();
        isSimularErro4 = new javax.swing.JCheckBox();
        pOutput2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtBitsEnvioHamming = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        txtMe2 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtRestoXorRecebido2 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtResultTransmissao2 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txtMensagemRecebidaHamming = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtMensagemDecodificadaASCII = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();

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
        pCrc.setAutoscrolls(true);
        pCrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirFormCrc(evt);
            }
        });

        pCrc1.setBackground(new java.awt.Color(126, 167, 176));

        tfMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMensagemAtualizaInputBinario(evt);
            }
        });

        jLabel1.setText("Mensagem em ASCII");

        msgEmBits.setColumns(20);
        msgEmBits.setRows(5);
        msgEmBits.setText("111100101");
        jScrollPane2.setViewportView(msgEmBits);
        msgEmBits.setAutoscrolls(false);

        jLabel2.setText("Mensagem em bits");

        tfPolinomio.setText("101101");
        tfPolinomio.setToolTipText("Informe o polinomio em bits");
        tfPolinomio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPolinomiovalidaPolinomio(evt);
            }
        });

        jLabel3.setText("Polinomio em Bits");

        executarCrc.setText("Executar");
        executarCrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarCrcActionPerformed(evt);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(tfPolinomio)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addComponent(executarCrc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executarCrc)
                    .addComponent(isSimularErro))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtRestoXorTransmitido.setColumns(20);
        txtRestoXorTransmitido.setRows(5);
        jScrollPane4.setViewportView(txtRestoXorTransmitido);

        jLabel5.setText("Resto da operacao XOR");

        jLabel6.setText("Bits enviados:");

        txtBitsEnviados.setColumns(20);
        txtBitsEnviados.setRows(5);
        jScrollPane5.setViewportView(txtBitsEnviados);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Transmissor");

        javax.swing.GroupLayout pOutputLayout = new javax.swing.GroupLayout(pOutput);
        pOutput.setLayout(pOutputLayout);
        pOutputLayout.setHorizontalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jScrollPane8.setViewportView(txtAsciiEnviado);

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
                    .addComponent(jScrollPane8)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pCrc1Layout = new javax.swing.GroupLayout(pCrc1);
        pCrc1.setLayout(pCrc1Layout);
        pCrc1Layout.setHorizontalGroup(
            pCrc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCrc1Layout.setVerticalGroup(
            pCrc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCrc1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCrc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(pCrc1);

        javax.swing.GroupLayout pCrcLayout = new javax.swing.GroupLayout(pCrc);
        pCrc.setLayout(pCrcLayout);
        pCrcLayout.setHorizontalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        pCrcLayout.setVerticalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CRC", pCrc);

        pCheckSum.setBackground(new java.awt.Color(240, 157, 39));

        tfPalavra1CH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPalavra1CHAtualizaInputBinario(evt);
            }
        });

        jLabel21.setText("Palavra 1");

        txtPalavra1Checksum.setColumns(20);
        txtPalavra1Checksum.setRows(5);
        txtPalavra1Checksum.setText("10010");
        jScrollPane12.setViewportView(txtPalavra1Checksum);
        msgEmBits.setAutoscrolls(false);

        jLabel22.setText("Mensagem em bits");

        executarChecksum.setText("Executar");
        executarChecksum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarChecksumActionPerformed(evt);
            }
        });

        isSimularErroChecksum.setText("Simular Erro");

        jLabel23.setText("Palavra 2");

        jLabel24.setText("Mensagem em bits");

        tfPalavra2CH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPalavra2CHAtualizaInputBinario(evt);
            }
        });

        txtPalavra2Checksum.setColumns(20);
        txtPalavra2Checksum.setRows(5);
        txtPalavra2Checksum.setText("10001");
        jScrollPane19.setViewportView(txtPalavra2Checksum);
        msgEmBits.setAutoscrolls(false);

        javax.swing.GroupLayout pInput3Layout = new javax.swing.GroupLayout(pInput3);
        pInput3.setLayout(pInput3Layout);
        pInput3Layout.setHorizontalGroup(
            pInput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPalavra1CH)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(tfPalavra2CH)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(pInput3Layout.createSequentialGroup()
                        .addGroup(pInput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addGroup(pInput3Layout.createSequentialGroup()
                                .addComponent(executarChecksum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isSimularErroChecksum))
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInput3Layout.setVerticalGroup(
            pInput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInput3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPalavra1CH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPalavra2CH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pInput3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executarChecksum)
                    .addComponent(isSimularErroChecksum))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtResultadoSomaChecksum.setColumns(20);
        txtResultadoSomaChecksum.setRows(5);
        jScrollPane13.setViewportView(txtResultadoSomaChecksum);

        jLabel25.setText("Resultado da soma da palavra 1 com a palavra 2");

        jLabel26.setText("Bits Invertidos:");

        txtBitsInvertidos.setColumns(20);
        txtBitsInvertidos.setRows(5);
        jScrollPane14.setViewportView(txtBitsInvertidos);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Transmissor");

        txtMsgEnviadaCheckSum.setColumns(20);
        txtMsgEnviadaCheckSum.setRows(5);
        jScrollPane20.setViewportView(txtMsgEnviadaCheckSum);

        jLabel33.setText("Mensagem Enviada");

        javax.swing.GroupLayout pOutput1Layout = new javax.swing.GroupLayout(pOutput1);
        pOutput1.setLayout(pOutput1Layout);
        pOutput1Layout.setHorizontalGroup(
            pOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutput1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane20)
                    .addGroup(pOutput1Layout.createSequentialGroup()
                        .addGroup(pOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel33))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pOutput1Layout.setVerticalGroup(
            pOutput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutput1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setText("Comparacao com checksum enviado");

        txtComparacaoChecksumEnviado.setColumns(20);
        txtComparacaoChecksumEnviado.setRows(5);
        jScrollPane15.setViewportView(txtComparacaoChecksumEnviado);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("Receptor");

        txtResultTransmissaoChecksum.setColumns(20);
        txtResultTransmissaoChecksum.setRows(5);
        jScrollPane16.setViewportView(txtResultTransmissaoChecksum);

        jLabel30.setText("Resultado da verificacao de erros");

        jLabel31.setText("Mensagem Recebida");

        txtMensagemRecebidaCheckSum.setColumns(20);
        txtMensagemRecebidaCheckSum.setRows(5);
        jScrollPane17.setViewportView(txtMensagemRecebidaCheckSum);

        txtAsciiEnviadoChecksum.setColumns(20);
        txtAsciiEnviadoChecksum.setRows(5);
        jScrollPane18.setViewportView(txtAsciiEnviadoChecksum);

        jLabel32.setText("Mensagem decodificado para ASCII");

        javax.swing.GroupLayout txtMe1Layout = new javax.swing.GroupLayout(txtMe1);
        txtMe1.setLayout(txtMe1Layout);
        txtMe1Layout.setHorizontalGroup(
            txtMe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMe1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtMe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane17)
                    .addComponent(jScrollPane18)
                    .addGroup(txtMe1Layout.createSequentialGroup()
                        .addGroup(txtMe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtMe1Layout.setVerticalGroup(
            txtMe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMe1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pCheckSumLayout = new javax.swing.GroupLayout(pCheckSum);
        pCheckSum.setLayout(pCheckSumLayout);
        pCheckSumLayout.setHorizontalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCheckSumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOutput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCheckSumLayout.setVerticalGroup(
            pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCheckSumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCheckSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOutput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Checksum", pCheckSum);

        pCrc2.setBackground(new java.awt.Color(78, 200, 78));

        tfMensagem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMensagem3ActionPerformed(evt);
            }
        });
        tfMensagem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMensagem3AtualizaInputBinario(evt);
            }
        });

        jLabel34.setText("Mensagem em ASCII");

        msgEmBits3.setColumns(20);
        msgEmBits3.setRows(5);
        jScrollPane21.setViewportView(msgEmBits3);
        msgEmBits.setAutoscrolls(false);

        jLabel35.setText("Mensagem em bits");

        executarHamming.setText("Executar");
        executarHamming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarHammingActionPerformed(evt);
            }
        });

        isSimularErro4.setText("Simular Erro");

        javax.swing.GroupLayout pInput4Layout = new javax.swing.GroupLayout(pInput4);
        pInput4.setLayout(pInput4Layout);
        pInput4Layout.setHorizontalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMensagem3)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(pInput4Layout.createSequentialGroup()
                        .addGroup(pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addGroup(pInput4Layout.createSequentialGroup()
                                .addComponent(executarHamming, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isSimularErro4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInput4Layout.setVerticalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInput4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMensagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executarHamming)
                    .addComponent(isSimularErro4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel39.setText("Bits enviados:");

        txtBitsEnvioHamming.setColumns(20);
        txtBitsEnvioHamming.setRows(5);
        jScrollPane23.setViewportView(txtBitsEnvioHamming);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Transmissor");

        javax.swing.GroupLayout pOutput2Layout = new javax.swing.GroupLayout(pOutput2);
        pOutput2.setLayout(pOutput2Layout);
        pOutput2Layout.setHorizontalGroup(
            pOutput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutput2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOutput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(pOutput2Layout.createSequentialGroup()
                        .addGroup(pOutput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pOutput2Layout.setVerticalGroup(
            pOutput2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOutput2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel41.setText("Bit error");

        txtRestoXorRecebido2.setColumns(20);
        txtRestoXorRecebido2.setRows(5);
        jScrollPane24.setViewportView(txtRestoXorRecebido2);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Receptor");

        txtResultTransmissao2.setColumns(20);
        txtResultTransmissao2.setRows(5);
        jScrollPane25.setViewportView(txtResultTransmissao2);

        jLabel43.setText("Resultado da verificacao de erros");

        jLabel44.setText("Mensagem Recebida");

        txtMensagemRecebidaHamming.setColumns(20);
        txtMensagemRecebidaHamming.setRows(5);
        jScrollPane26.setViewportView(txtMensagemRecebidaHamming);

        txtMensagemDecodificadaASCII.setColumns(20);
        txtMensagemDecodificadaASCII.setRows(5);
        jScrollPane27.setViewportView(txtMensagemDecodificadaASCII);

        jLabel45.setText("Mensagem decodificado para ASCII");

        javax.swing.GroupLayout txtMe2Layout = new javax.swing.GroupLayout(txtMe2);
        txtMe2.setLayout(txtMe2Layout);
        txtMe2Layout.setHorizontalGroup(
            txtMe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMe2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtMe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jScrollPane24)
                    .addComponent(jScrollPane26)
                    .addComponent(jScrollPane27)
                    .addGroup(txtMe2Layout.createSequentialGroup()
                        .addGroup(txtMe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtMe2Layout.setVerticalGroup(
            txtMe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMe2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pCrc2Layout = new javax.swing.GroupLayout(pCrc2);
        pCrc2.setLayout(pCrc2Layout);
        pCrc2Layout.setHorizontalGroup(
            pCrc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOutput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCrc2Layout.setVerticalGroup(
            pCrc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCrc2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCrc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOutput2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInput4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pHammingLayout = new javax.swing.GroupLayout(pHamming);
        pHamming.setLayout(pHammingLayout);
        pHammingLayout.setHorizontalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pHammingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pCrc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pHammingLayout.setVerticalGroup(
            pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(pHammingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pHammingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pCrc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Hamming", pHamming);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void executarHammingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarHammingActionPerformed
        String aux = msgEmBits3.getText();
        String array[] = new String[aux.length()];
        for (int i = 0; i < aux.length(); i++) {
            array[i] = String.valueOf(aux.charAt(i));
        }

        StringBuilder hammin = hamming.codificar(array);
        txtBitsEnvioHamming.setText(hammin.toString());
        txtMensagemRecebidaHamming.setText(hammin.toString());
        hammin.deleteCharAt(5);
        hammin.insert(5, "0");
        String mensagemDecodificada = hamming.decodificar(hammin);
        txtMensagemDecodificadaASCII.setText(mensagemDecodificada);

        StringBuilder erro = hamming.detectaCorrigeErro(hammin);
        int contador = 0;
        
        boolean auxiliar = true;
        while(auxiliar && contador<erro.length() ){
            if(erro.charAt(contador)=='1'){
                auxiliar = false;
            }
            contador++;
        }
        
        if(auxiliar == true){
            txtResultTransmissao2.setText("Mensagem Transmitida sem erros!");
        }else{
            int binarioDecimal = Integer.parseInt(erro.toString(), 2);
            binarioDecimal = binarioDecimal-1;
            String numeroBinario = Integer.toBinaryString(binarioDecimal);
            txtRestoXorRecebido2.setText(numeroBinario+"="+binarioDecimal);
            txtResultTransmissao2.setText("Mensagem Transmitida com erros!");
        }
        
        
        
        
    }//GEN-LAST:event_executarHammingActionPerformed

    private void tfMensagem3AtualizaInputBinario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMensagem3AtualizaInputBinario
        msgEmBits3.setText(util.AsciiToBinary(tfMensagem3.getText()));

        String aux = msgEmBits3.getText();
        String array[] = new String[aux.length()];
        for (int i = 0; i < aux.length(); i++) {
            array[i] = String.valueOf(aux.charAt(i));
        }

        StringBuilder hammin = hamming.codificar(array);
        txtBitsEnvioHamming.setText(hammin.toString());
    }//GEN-LAST:event_tfMensagem3AtualizaInputBinario

    private void tfMensagem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMensagem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMensagem3ActionPerformed

    private void tfPalavra2CHAtualizaInputBinario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPalavra2CHAtualizaInputBinario
        txtPalavra2Checksum.setText(util.AsciiToBinary(tfPalavra2CH.getText()));
    }//GEN-LAST:event_tfPalavra2CHAtualizaInputBinario

    private void executarChecksumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarChecksumActionPerformed
        if (!txtPalavra1Checksum.getText().equals("") && txtPalavra1Checksum.getText() != null) {
            if (!txtPalavra2Checksum.getText().equals("") && txtPalavra2Checksum.getText() != null) {

                String palavra1Checksum = txtPalavra1Checksum.getText();
                String palavra2Checksum = txtPalavra2Checksum.getText();

                //faz soma das palavras
                String resultSomaChecksum = checksum.fazSoma(palavra1Checksum, palavra2Checksum);
                txtResultadoSomaChecksum.setText(resultSomaChecksum);
                //inverte os bits do resultado da soma
                String bitsInvertidosCheckSum = checksum.inverteResultSoma(resultSomaChecksum);
                txtBitsInvertidos.setText(bitsInvertidosCheckSum);

                //Concatena a palavra 1 com a palavra 2 e com o resultado da soma
                //da p1 com p2, o qual esta com seus bits invertidos
                String msgEnviadaChecksum = palavra1Checksum + " " + palavra2Checksum + " " + bitsInvertidosCheckSum;
                txtMsgEnviadaCheckSum.setText(msgEnviadaChecksum);

                String checkSumVerificado = "";

                if (!isSimularErroChecksum.isSelected()) {
                    txtMensagemRecebidaCheckSum.setText(msgEnviadaChecksum);

                    checkSumVerificado = checksum.calculoVerificacaoMensagem(msgEnviadaChecksum);

                    txtComparacaoChecksumEnviado.setText(checkSumVerificado);
                } else {
                    //troca um bit da mensagem enviada para simular erro
                    msgEnviadaChecksum = checksum.gerarErroFromChecksum(msgEnviadaChecksum);

                    txtMensagemRecebidaCheckSum.setText(msgEnviadaChecksum);

                    checkSumVerificado = checksum.calculoVerificacaoMensagem(msgEnviadaChecksum);
                    txtComparacaoChecksumEnviado.setText(checkSumVerificado);
                }

                //Verifica o resultado do checksum ,
                //e Popula o status da transmissao de acordo com o resultado.
                String resultTransmissaoChecksum = checksum.verivicaErro(checkSumVerificado);
                txtResultTransmissaoChecksum.setText(resultTransmissaoChecksum);

                //Converte a mensagem binaria enviada para ASCII
                StringBuilder str = new StringBuilder();
                str.append(msgEnviadaChecksum.replace(" ", ""));
                txtAsciiEnviadoChecksum.setText(MetodosUteis.converteBinarioParaAscii(str));

            } else {
                JOptionPane.showMessageDialog(null, "Mensagem 2 nao informada!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mensagem 1 nao informada!");
        }
    }//GEN-LAST:event_executarChecksumActionPerformed

    private void tfPalavra1CHAtualizaInputBinario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPalavra1CHAtualizaInputBinario
        txtPalavra1Checksum.setText(util.AsciiToBinary(tfPalavra1CH.getText()));
    }//GEN-LAST:event_tfPalavra1CHAtualizaInputBinario

    private void abrirFormCrc(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirFormCrc

    }//GEN-LAST:event_abrirFormCrc

    private void executarCrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarCrcActionPerformed
        if (msgEmBits.getText().trim() != null && !msgEmBits.getText().equals("")) {
            if (tfPolinomio.getText() != null && !tfPolinomio.getText().equals("")) {

                int grauPolinomio = tfPolinomio.getText().length() - 1;

                //Popula na tela o resto do xor obtido pela mensangem transmitida, de acordo com o polinomio e seu grau
                String resultCrcTransmissor = crc.getRestoXor(msgEmBits.getText(), tfPolinomio.getText(), grauPolinomio);
                txtRestoXorTransmitido.setText(resultCrcTransmissor);

                //Popula a mensagem enviado(concatena o resto da divisao com a ,mensagem)
                String msgEnviada = crc.enviarBits(msgEmBits.getText(), resultCrcTransmissor);
                txtBitsEnviados.setText(msgEnviada);

                String resultRestoXorCrcReceptor = "";
                String auxParsAsciiSeSimulaErro = "";

                //zera o grau do polinomio para nao acrescentar mais 0s na hora da verificacao
                grauPolinomio = 0;

                if (!isSimularErro.isSelected()) {
                    //popula text com a mensagem recebida
                    txtMensagemRecebida.setText(msgEnviada);

                    auxParsAsciiSeSimulaErro = msgEnviada;
                    grauPolinomio = 0;
                    //Popula o resto da divisao da mensagem recebida
                    resultRestoXorCrcReceptor = crc.getRestoXor(msgEnviada, tfPolinomio.getText(), grauPolinomio);
                    txtRestoXorRecebido.setText(resultRestoXorCrcReceptor);
                } else {
                    String auxMsg = crc.gerarErroFromXorRest(msgEnviada);
                    auxParsAsciiSeSimulaErro = auxMsg;
                    //popula text com a mensagem recebida simulando erro
                    txtMensagemRecebida.setText(msgEnviada);
                    //
                    resultRestoXorCrcReceptor = crc.getRestoXor(auxMsg, tfPolinomio.getText(), grauPolinomio);

                    //popula resultado do xor
                    txtRestoXorRecebido.setText(resultRestoXorCrcReceptor);

                }
                //Verifica se o resultado do xor e tudo 0s, ou e tudo 1s,
                //e Popula o status da transmissao de acordo com o resultado
                String resultTransmissaoCrc = crc.verivicaErro(resultRestoXorCrcReceptor);
                txtResultTransmissao.setText(resultTransmissaoCrc);

                //Converte a mensagem binaria enviada para ASCII
                StringBuilder str = new StringBuilder();
                str.append(auxParsAsciiSeSimulaErro);
                txtAsciiEnviado.setText(MetodosUteis.converteBinarioParaAscii(str));

            } else {
                JOptionPane.showMessageDialog(null, "Polinomio nao informado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mensagem nao infomada!");
        }
    }//GEN-LAST:event_executarCrcActionPerformed

    //Este metodo serve para validar o polinomio, impedindo de colocar outros caracteres
    //alem de numeros binarios
    private void tfPolinomiovalidaPolinomio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPolinomiovalidaPolinomio
        boolean isBin = util.isNumeroBinario(tfPolinomio);
        if (isBin) {
        } else {
            tfPolinomio.setText("");
        }
    }//GEN-LAST:event_tfPolinomiovalidaPolinomio

    private void tfMensagemAtualizaInputBinario(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMensagemAtualizaInputBinario
        msgEmBits.setText(util.AsciiToBinary(tfMensagem.getText()));
    }//GEN-LAST:event_tfMensagemAtualizaInputBinario

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton executarChecksum;
    private javax.swing.JButton executarCrc;
    private javax.swing.JButton executarHamming;
    private javax.swing.JCheckBox isSimularErro;
    private javax.swing.JCheckBox isSimularErro4;
    private javax.swing.JCheckBox isSimularErroChecksum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea msgEmBits;
    private javax.swing.JTextArea msgEmBits3;
    private javax.swing.JPanel pCheckSum;
    private javax.swing.JPanel pCrc;
    private javax.swing.JPanel pCrc1;
    private javax.swing.JPanel pCrc2;
    private javax.swing.JPanel pHamming;
    private javax.swing.JPanel pInput;
    private javax.swing.JPanel pInput3;
    private javax.swing.JPanel pInput4;
    private javax.swing.JPanel pOutput;
    private javax.swing.JPanel pOutput1;
    private javax.swing.JPanel pOutput2;
    private javax.swing.JTextField tfMensagem;
    private javax.swing.JTextField tfMensagem3;
    private javax.swing.JTextField tfPalavra1CH;
    private javax.swing.JTextField tfPalavra2CH;
    private javax.swing.JTextField tfPolinomio;
    private javax.swing.JTextArea txtAsciiEnviado;
    private javax.swing.JTextArea txtAsciiEnviadoChecksum;
    private javax.swing.JTextArea txtBitsEnviados;
    private javax.swing.JTextArea txtBitsEnvioHamming;
    private javax.swing.JTextArea txtBitsInvertidos;
    private javax.swing.JTextArea txtComparacaoChecksumEnviado;
    private javax.swing.JPanel txtMe;
    private javax.swing.JPanel txtMe1;
    private javax.swing.JPanel txtMe2;
    private javax.swing.JTextArea txtMensagemDecodificadaASCII;
    private javax.swing.JTextArea txtMensagemRecebida;
    private javax.swing.JTextArea txtMensagemRecebidaCheckSum;
    private javax.swing.JTextArea txtMensagemRecebidaHamming;
    private javax.swing.JTextArea txtMsgEnviadaCheckSum;
    private javax.swing.JTextArea txtPalavra1Checksum;
    private javax.swing.JTextArea txtPalavra2Checksum;
    private javax.swing.JTextArea txtRestoXorRecebido;
    private javax.swing.JTextArea txtRestoXorRecebido2;
    private javax.swing.JTextArea txtRestoXorTransmitido;
    private javax.swing.JTextArea txtResultTransmissao;
    private javax.swing.JTextArea txtResultTransmissao2;
    private javax.swing.JTextArea txtResultTransmissaoChecksum;
    private javax.swing.JTextArea txtResultadoSomaChecksum;
    // End of variables declaration//GEN-END:variables
}
