/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class Imc extends javax.swing.JFrame {

    /**
     * Creates new form Imc
     */
    public Imc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbAltura = new javax.swing.JLabel();
        LbPeso = new javax.swing.JLabel();
        jBtnCalcularImc = new javax.swing.JButton();
        TextAltura = new javax.swing.JTextField();
        TextPeso = new javax.swing.JTextField();
        jBtnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LbResultado = new javax.swing.JLabel();
        LbInterpretacao = new javax.swing.JLabel();
        TextResultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextInterpretacao = new javax.swing.JTextArea();
        LbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NutriSoft");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LbAltura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbAltura.setText("Altura (m):");

        LbPeso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbPeso.setText("Peso (kg):");

        jBtnCalcularImc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnCalcularImc.setText("Calcular");
        jBtnCalcularImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularImcActionPerformed(evt);
            }
        });

        jBtnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnVoltar.setText("Voltar");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbAltura)
                    .addComponent(LbPeso))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jBtnCalcularImc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextAltura)
                            .addComponent(TextPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbAltura)
                    .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbPeso)
                    .addComponent(TextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcularImc)
                    .addComponent(jBtnVoltar))
                .addGap(45, 45, 45))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LbResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbResultado.setText("Resultado:");

        LbInterpretacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbInterpretacao.setText("Interpretação:");

        TextResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextResultadoActionPerformed(evt);
            }
        });

        jTextInterpretacao.setColumns(20);
        jTextInterpretacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextInterpretacao.setRows(5);
        jScrollPane1.setViewportView(jTextInterpretacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbResultado)
                    .addComponent(LbInterpretacao))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbResultado)
                    .addComponent(TextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbInterpretacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        LbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LbTitulo.setText("Cálculo de IMC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalcularImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularImcActionPerformed

        calc();
    }//GEN-LAST:event_jBtnCalcularImcActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        
        dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void TextResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextResultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbAltura;
    private javax.swing.JLabel LbInterpretacao;
    private javax.swing.JLabel LbPeso;
    private javax.swing.JLabel LbResultado;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTextField TextAltura;
    private javax.swing.JTextField TextPeso;
    private javax.swing.JTextField TextResultado;
    private javax.swing.JButton jBtnCalcularImc;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextInterpretacao;
    // End of variables declaration//GEN-END:variables

    public void  calc(){
        //Variáveis
        Double Altura;
        Double Peso;
        Double Imc;
        String mensagem;
        //Capturando o que o usuário digitou
        if(TextAltura.getText().isEmpty()||TextPeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo altura e peso precisam ser preenchidos: ");        
        }
        else if(Double.parseDouble(TextAltura.getText())<=0 ){
            JOptionPane.showMessageDialog(null, "O campo idade precisa ser preenchido e precisa ter um valor maior do que 0 ");
        }
        else if(Double.parseDouble(TextPeso.getText())<=0){
            JOptionPane.showMessageDialog(null, "O campo idade precisa ser preenchido e precisa ter um valor maior do que 0 ");
        }
        else {
            Altura = Double.parseDouble(TextAltura.getText());
            Peso   = Double.parseDouble(TextPeso.getText());


            jTextInterpretacao.setLineWrap(true); 
            // Cálculo
            Imc = Peso/(Altura/100 * Altura/100);
            // Gravando a Mensagem
            if(Imc < 18.5){
                mensagem = "Magreza. \nPrecisa de uma dieta para engordar.";
            }else if(Imc < 24.9){
                mensagem = "Normal. \nNão precisa de dieta.";
            }else if(Imc < 29.9){
                mensagem = "Sobrepeso. \nPrecisa de uma dieta para emagrecer.";
            }else if(Imc < 30){
                mensagem = "Obesidade. \nPrecisa de dieta,exercícios e uma mudança de vida.";
            }else {
                mensagem = "Obesidade grave. \nPrecisa procurar um médico.";
            }
            // Mostrando a mensagem para o usuário
            jTextInterpretacao.setText(mensagem);
            TextResultado.setText(Double.toString(Math.round(Imc)));
        }    
    }                      
}