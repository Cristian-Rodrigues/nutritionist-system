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
public class GastoCalorico extends javax.swing.JFrame {

          //Variáveis
        Double Altura;
        Double Peso;
        Double Idade;
        Double calcBasal = null ;
        Double calcTotal;
        String atividade;
        
    public GastoCalorico() {
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

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RadioMulher = new javax.swing.JRadioButton();
        RadioHomem = new javax.swing.JRadioButton();
        jLabelPeso = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelNivelAtividade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jTextAltura = new javax.swing.JTextField();
        jTextPeso = new javax.swing.JTextField();
        jComboBoxNivelAtividade = new javax.swing.JComboBox<>();
        jBtnCalcularGastoCalorico = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelGastoBasal = new javax.swing.JLabel();
        jLabelGastoTotal = new javax.swing.JLabel();
        jTextGastoBasal = new javax.swing.JTextField();
        jTextGastoTotal = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NutriSoft");

        buttonGroup1.add(RadioMulher);
        RadioMulher.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RadioMulher.setText("Mulher");
        RadioMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMulherActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioHomem);
        RadioHomem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RadioHomem.setSelected(true);
        RadioHomem.setText("Homem");
        RadioHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioHomemActionPerformed(evt);
            }
        });

        jLabelPeso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPeso.setText("Peso (kg):");

        jLabelAltura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelAltura.setText("Altura (cm):");

        jLabelIdade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelIdade.setText("Idade:");

        jLabelNivelAtividade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelNivelAtividade.setText("Nível de Atividade:");

        jComboBoxNivelAtividade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBoxNivelAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Leve (exercício leve 1 a 3 dias/semana)", "Moderado (exercício moderado 3 a 5 dias/semana)", "Ativo (exercício pesado 5 a 6 dias/semana)", "Extremamente ativo (exercício pesado diário)" }));
        jComboBoxNivelAtividade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxNivelAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNivelAtividadeActionPerformed(evt);
            }
        });

        jBtnCalcularGastoCalorico.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnCalcularGastoCalorico.setText("Calcular");
        jBtnCalcularGastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularGastoCaloricoActionPerformed(evt);
            }
        });

        jBtnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnVoltar.setText("Voltar");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdade)
                            .addComponent(jLabelAltura)
                            .addComponent(jLabelPeso)
                            .addComponent(jLabelNivelAtividade))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxNivelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(jTextAltura)
                                .addComponent(jTextPeso))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RadioHomem)
                        .addGap(71, 71, 71)
                        .addComponent(RadioMulher)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jBtnCalcularGastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioHomem)
                    .addComponent(RadioMulher))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextAltura))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextIdade))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNivelAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNivelAtividade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcularGastoCalorico)
                    .addComponent(jBtnVoltar))
                .addContainerGap())
        );

        jLabelGastoBasal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGastoBasal.setText("Gasto Basal:");

        jLabelGastoTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGastoTotal.setText("Gasto Total:");

        jTextGastoBasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGastoBasalActionPerformed(evt);
            }
        });

        jTextGastoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGastoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGastoBasal)
                    .addComponent(jLabelGastoTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextGastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGastoBasal)
                    .addComponent(jTextGastoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGastoTotal)
                    .addComponent(jTextGastoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setText("Cálculo Gasto Calórico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNivelAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNivelAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNivelAtividadeActionPerformed

    private void jBtnCalcularGastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularGastoCaloricoActionPerformed
        calcBasal();
    }//GEN-LAST:event_jBtnCalcularGastoCaloricoActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void RadioMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMulherActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_RadioMulherActionPerformed

    private void RadioHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioHomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioHomemActionPerformed

    private void jTextGastoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGastoTotalActionPerformed
       //calcTotal();
    }//GEN-LAST:event_jTextGastoTotalActionPerformed

    private void jTextGastoBasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGastoBasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGastoBasalActionPerformed
    
    public void  calcBasal(){
 
        if(jTextIdade.getText().isEmpty()||jTextPeso.getText().isEmpty()||jTextAltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo Idade/Altura/Peso precisam ser preenchidos: ");        
        }
        else if(Double.parseDouble(jTextAltura.getText())<=0 ){
            JOptionPane.showMessageDialog(null, "O campo altura precisa ser preenchido e precisa ter um valor maior do que 0 ");
        }
        else if(Double.parseDouble(jTextPeso.getText())<=0){
            JOptionPane.showMessageDialog(null, "O campo peso precisa ser preenchido e precisa ter um valor maior do que 0 ");
        }
        else if(Double.parseDouble(jTextIdade.getText())<=0){
            JOptionPane.showMessageDialog(null, "O campo idade precisa ser preenchido e precisa ter um valor maior do que 0 ");
        }
        else{
        

            //Capturando o que o usuário digitou
            Altura = Double.parseDouble(jTextAltura.getText());
            Peso   = Double.parseDouble(jTextPeso.getText());
            Idade   = Double.parseDouble(jTextIdade.getText());

            // Cálculo

            if(RadioHomem.isSelected()){  
                calcBasal = 66 + (13.8 * Peso) + (5 * Altura) - (6.8 * Idade); 
                jTextGastoBasal.setText(Double.toString(Math.round(calcBasal)));
            }
            else if(RadioMulher.isSelected()){
                calcBasal = 655 + (9.6 * Peso)+(1.9 * Altura)-(4.7 * Idade); 
                jTextGastoBasal.setText(Double.toString(Math.round(calcBasal)));
            }

            atividade = jComboBoxNivelAtividade.getSelectedItem().toString();



            switch (atividade) {
                case "Sedentario":
                    calcTotal = calcBasal * 1.2;
                    break;
                case "Leve (exercício leve 1 a 3 dias/semana)":
                    calcTotal = calcBasal * 1.375;
                    break;
                case "Moderado (exercício moderado 3 a 5 dias/semana)":
                    calcTotal = calcBasal * 1.55;
                    break;
                case "Ativo (exercício pesado 5 a 6 dias/semana)":
                    calcTotal = calcBasal * 1.725;
                    break;
                case "Extremamente ativo (exercício pesado diário)":
                    calcTotal = calcBasal * 1.9;
                    break;
                default:
                    break;
            }

            jTextGastoTotal.setText(Double.toString(Math.round(calcTotal)));
        }    
    }

    
    /**
     * 
     * 
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
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioHomem;
    private javax.swing.JRadioButton RadioMulher;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCalcularGastoCalorico;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JComboBox<String> jComboBoxNivelAtividade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelGastoBasal;
    private javax.swing.JLabel jLabelGastoTotal;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNivelAtividade;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextGastoBasal;
    private javax.swing.JTextField jTextGastoTotal;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextPeso;
    // End of variables declaration//GEN-END:variables
}

