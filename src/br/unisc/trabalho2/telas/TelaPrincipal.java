
package br.unisc.trabalho2.telas;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        populaOpcoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pCrc = new javax.swing.JPanel();
        pInput = new javax.swing.JPanel();
        cbOpcoes = new javax.swing.JComboBox<>();
        pOutput = new javax.swing.JPanel();
        pHamming = new javax.swing.JPanel();
        pRed_Solomon = new javax.swing.JPanel();
        pCheckSum = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCrc.setBackground(new java.awt.Color(126, 167, 176));

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOpcoes, 0, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pOutputLayout = new javax.swing.GroupLayout(pOutput);
        pOutput.setLayout(pOutputLayout);
        pOutputLayout.setHorizontalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        pOutputLayout.setVerticalGroup(
            pOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pCrcLayout = new javax.swing.GroupLayout(pCrc);
        pCrc.setLayout(pCrcLayout);
        pCrcLayout.setHorizontalGroup(
            pCrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addGap(0, 250, Short.MAX_VALUE)
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
            .addGap(0, 250, Short.MAX_VALUE)
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
            .addGap(0, 250, Short.MAX_VALUE)
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    void populaOpcoes(){
        cbOpcoes.addItem("Checagem");
        cbOpcoes.addItem("Deteccao de erro");
        cbOpcoes.addItem("Reconstrucao da mensagem");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOpcoes;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pCheckSum;
    private javax.swing.JPanel pCrc;
    private javax.swing.JPanel pHamming;
    private javax.swing.JPanel pInput;
    private javax.swing.JPanel pOutput;
    private javax.swing.JPanel pRed_Solomon;
    // End of variables declaration//GEN-END:variables
}
