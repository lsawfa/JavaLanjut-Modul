///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.example.tb;
//import java.util.ArrayList;
//
//public class FormKonverter extends javax.swing.JFrame {
//
//    public FormKonverter() {
//        initComponents();
//    }
//
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        desimalLabel = new javax.swing.JLabel();
//        desimalTextArea = new javax.swing.JTextField();
//        binerLabel = new javax.swing.JLabel();
//        oktalLabel = new javax.swing.JLabel();
//        hexaLabel = new javax.swing.JLabel();
//        pesanScrollPane = new javax.swing.JScrollPane();
//        pesanTextArea = new javax.swing.JTextArea();
//        binerTextArea = new javax.swing.JTextField();
//        oktalTextArea = new javax.swing.JTextField();
//        hexaTextArea = new javax.swing.JTextField();
//        judulProgramLabel = new javax.swing.JLabel();
//        informasiLabel = new javax.swing.JLabel();
//        desimalButton = new javax.swing.JButton();
//        binerButton = new javax.swing.JButton();
//        oktalButton = new javax.swing.JButton();
//        hexaButton = new javax.swing.JButton();
//        MainMenuBar = new javax.swing.JMenuBar();
//        FileMenu = new javax.swing.JMenu();
//        closeMenuItem = new javax.swing.JMenuItem();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        desimalLabel.setText("Desimal");
//        desimalLabel.setName("desimalLabel"); // NOI18N
//
//        desimalTextArea.setName("desimalTextField"); // NOI18N
//
//        binerLabel.setText("Biner");
//        binerLabel.setName("binerLabel"); // NOI18N
//
//        oktalLabel.setText("Oktal");
//        oktalLabel.setName("oktalLabel"); // NOI18N
//
//        hexaLabel.setText("Hexa Desimal");
//        hexaLabel.setName("hexaLabel"); // NOI18N
//
//        pesanScrollPane.setName("pesanTextArea"); // NOI18N
//
//        pesanTextArea.setColumns(20);
//        pesanTextArea.setRows(5);
//        pesanScrollPane.setViewportView(pesanTextArea);
//
//        binerTextArea.setName("binerTextBox"); // NOI18N
//
//        oktalTextArea.setName("oktalTextArea"); // NOI18N
//
//        hexaTextArea.setName("hexaTextArea"); // NOI18N
//        hexaTextArea.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                hexaTextAreaActionPerformed(evt);
//            }
//        });
//
//        judulProgramLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
//        judulProgramLabel.setForeground(new java.awt.Color(12, 5, 5));
//        judulProgramLabel.setText("Konverter Bilangan (Bulat Positif)");
//        judulProgramLabel.setName("judulProgramLabel"); // NOI18N
//
//        informasiLabel.setName("infoLabel"); // NOI18N
//
//        desimalButton.setLabel("Konversi");
//        desimalButton.setName("desimalButton"); // NOI18N
//        desimalButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                desimalButtonActionPerformed(evt);
//            }
//        });
//
//        binerButton.setText("Konversi");
//        binerButton.setName("binerButton"); // NOI18N
//        binerButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                binerButtonActionPerformed(evt);
//            }
//        });
//
//        oktalButton.setLabel("Konversi");
//        oktalButton.setName("oktalButton"); // NOI18N
//        oktalButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                oktalButtonActionPerformed(evt);
//            }
//        });
//
//        hexaButton.setText("Konversi");
//        hexaButton.setName("hexaButton"); // NOI18N
//        hexaButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                hexaButtonActionPerformed(evt);
//            }
//        });
//
//        FileMenu.setText("File");
//
//        closeMenuItem.setText("Close");
//        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                closeMenuItemActionPerformed(evt);
//            }
//        });
//        FileMenu.add(closeMenuItem);
//
//        MainMenuBar.add(FileMenu);
//
//        setJMenuBar(MainMenuBar);
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(informasiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addGroup(layout.createSequentialGroup()
//                        .addGap(12, 12, 12)
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(layout.createSequentialGroup()
//                                .addComponent(pesanScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 17, Short.MAX_VALUE))
//                            .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addComponent(desimalLabel)
//                                    .addComponent(binerLabel)
//                                    .addComponent(oktalLabel)
//                                    .addComponent(hexaLabel))
//                                .addGap(18, 18, 18)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addComponent(desimalTextArea)
//                                    .addComponent(binerTextArea)
//                                    .addComponent(oktalTextArea)
//                                    .addComponent(hexaTextArea, javax.swing.GroupLayout.Alignment.TRAILING))
//                                .addGap(12, 12, 12)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addComponent(desimalButton)
//                                    .addComponent(binerButton)
//                                    .addComponent(oktalButton)
//                                    .addComponent(hexaButton))
//                                .addGap(10, 10, 10)))))
//                .addContainerGap())
//            .addGroup(layout.createSequentialGroup()
//                .addGap(52, 52, 52)
//                .addComponent(judulProgramLabel)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(judulProgramLabel)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(desimalLabel)
//                    .addComponent(desimalTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(desimalButton))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(binerLabel)
//                    .addComponent(binerTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(binerButton))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(oktalLabel)
//                    .addComponent(oktalTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(oktalButton))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(hexaLabel)
//                    .addComponent(hexaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(hexaButton))
//                .addGap(18, 18, 18)
//                .addComponent(informasiLabel)
//                .addGap(12, 12, 12)
//                .addComponent(pesanScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap())
//        );
//
//        judulProgramLabel.getAccessibleContext().setAccessibleName("Konverter Bilangan (Bulat Positif)");
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    private void desimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desimalButtonActionPerformed
//        // TODO add your handling code here:
//        // menampung data pesan proses konversi
//        ArrayList<String> daftarPesan;
//        String strPesan = "";
//
//        // buat objek bilangan desimal
//        BilanganDesimal bilDesimal = new BilanganDesimal( desimalTextArea.getText() );
//
//        /*
//         * Konversi ke bilangan biner
//         */
//        BilanganBiner bilBiner = bilDesimal.konversiKeBiner();
//        binerTextArea.setText( bilBiner.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilDesimal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan oktal
//         */
//        BilanganOktal bilOktal = bilDesimal.konversiKeOktal();
//        oktalTextArea.setText( bilOktal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilDesimal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan hexa
//         */
//        BilanganHexa bilHexa = bilDesimal.konversiKeHexa();
//        hexaTextArea.setText( bilHexa.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilDesimal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        // tampilkan pesan konversi ke text area
//        pesanTextArea.setText(strPesan);
//    }//GEN-LAST:event_desimalButtonActionPerformed
//
//    private void hexaTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexaTextAreaActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_hexaTextAreaActionPerformed
//
//    private void binerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binerButtonActionPerformed
//        // TODO add your handling code here:
//        // menampung data pesan proses konversi
//        ArrayList<String> daftarPesan;
//        String strPesan = "";
//
//        // buat objek bilangan biner
//        BilanganBiner bilBiner = new BilanganBiner( binerTextArea.getText() );
//
//        /*
//         * Konversi ke bilangan desimal
//         */
//        BilanganDesimal bilDesimal = bilBiner.konversiKeDesimal();
//        desimalTextArea.setText( bilDesimal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilBiner.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan oktal
//         */
//        BilanganOktal bilOktal = bilBiner.konversiKeOktal();
//        oktalTextArea.setText( bilOktal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilBiner.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan hexa
//         */
//        BilanganHexa bilHexa = bilBiner.konversiKeHexa();
//        hexaTextArea.setText( bilHexa.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilBiner.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        // tampilkan pesan konversi ke text area
//        pesanTextArea.setText(strPesan);
//    }//GEN-LAST:event_binerButtonActionPerformed
//
//    private void oktalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oktalButtonActionPerformed
//        // TODO add your handling code here:
//        // menampung data pesan proses konversi
//        ArrayList<String> daftarPesan;
//        String strPesan = "";
//
//        // buat objek bilangan oktal
//        BilanganOktal bilOktal = new BilanganOktal( oktalTextArea.getText() );
//
//        /*
//         * Konversi ke bilangan desimal
//         */
//        BilanganDesimal bilDesimal = bilOktal.konversiKeDesimal();
//        desimalTextArea.setText( bilDesimal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilOktal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan biner
//         */
//        BilanganBiner bilBiner = bilOktal.konversiKeBiner();
//        binerTextArea.setText( bilBiner.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilOktal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan hexa
//         */
//        BilanganHexa bilHexa = bilOktal.konversiKeHexa();
//        hexaTextArea.setText( bilHexa.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilOktal.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        // tampilkan pesan konversi ke text area
//        pesanTextArea.setText(strPesan);
//    }//GEN-LAST:event_oktalButtonActionPerformed
//
//    private void hexaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexaButtonActionPerformed
//        // TODO add your handling code here:
//        // menampung data pesan proses konversi
//        ArrayList<String> daftarPesan;
//        String strPesan = "";
//
//        // buat objek bilangan hexa
//        BilanganHexa bilHexa = new BilanganHexa( hexaTextArea.getText() );
//
//        /*
//         * Konversi ke bilangan desimal
//         */
//        BilanganDesimal bilDesimal = bilHexa.konversiKeDesimal();
//        desimalTextArea.setText( bilDesimal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilHexa.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan oktal
//         */
//        BilanganOktal bilOktal = bilHexa.konversiKeOktal();
//        oktalTextArea.setText( bilOktal.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilHexa.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        /*
//         * Konversi ke bilangan biner
//         */
//        BilanganBiner bilBiner = bilHexa.konversiKeBiner();
//        binerTextArea.setText( bilBiner.getAngka() );
//
//        // menampung pesan konversi saat ini
//        daftarPesan = bilHexa.getPesan();
//        for (String pesan : daftarPesan) {
//            strPesan += pesan;
//            strPesan += "\n";
//        }
//
//        // tampilkan pesan konversi ke text area
//        pesanTextArea.setText(strPesan);
//    }//GEN-LAST:event_hexaButtonActionPerformed
//
//    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
//        // TODO add your handling code here:
//        System.exit(1);
//    }//GEN-LAST:event_closeMenuItemActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormKonverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormKonverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormKonverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormKonverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormKonverter().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JMenu FileMenu;
//    private javax.swing.JMenuBar MainMenuBar;
//    private javax.swing.JButton binerButton;
//    private javax.swing.JLabel binerLabel;
//    private javax.swing.JTextField binerTextArea;
//    private javax.swing.JMenuItem closeMenuItem;
//    private javax.swing.JButton desimalButton;
//    private javax.swing.JLabel desimalLabel;
//    private javax.swing.JTextField desimalTextArea;
//    private javax.swing.JButton hexaButton;
//    private javax.swing.JLabel hexaLabel;
//    private javax.swing.JTextField hexaTextArea;
//    private javax.swing.JLabel informasiLabel;
//    private javax.swing.JLabel judulProgramLabel;
//    private javax.swing.JButton oktalButton;
//    private javax.swing.JLabel oktalLabel;
//    private javax.swing.JTextField oktalTextArea;
//    private javax.swing.JScrollPane pesanScrollPane;
//    private javax.swing.JTextArea pesanTextArea;
//    // End of variables declaration//GEN-END:variables
//}
