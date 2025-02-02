
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luivs
 */
public class Recarga extends javax.swing.JFrame {
    private Principal principal;
    private Cuenta cuenta;

    /**
     * Creates new form Recarga
     */
    public Recarga() {
        principal = Principal.getInstance();
        cuenta = principal.getCuenta();
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

        btn500 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRecargar = new javax.swing.JButton();
        txtOtroMonto = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPaquete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn500.setText("$500");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        btn200.setText("$200");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btn300.setText("$300");
        btn300.setMaximumSize(new java.awt.Dimension(61, 20));
        btn300.setMinimumSize(new java.awt.Dimension(61, 20));
        btn300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn300ActionPerformed(evt);
            }
        });

        btn100.setText("$100");
        btn100.setMaximumSize(new java.awt.Dimension(61, 20));
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        jLabel3.setText("Paquete:");

        jLabel4.setText("Otro monto:");

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        txtOtroMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroMontoActionPerformed(evt);
            }
        });

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Recarga");

        txtPaquete.setEditable(false);
        txtPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaqueteActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el número:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn300, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtOtroMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnRecargar)
                            .addGap(30, 30, 30)
                            .addComponent(btnVolver))))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaquete)
                    .addComponent(txtNumero))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn300, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(txtOtroMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecargar)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        // TODO add your handling code here:
        txtPaquete.setText("");
        txtOtroMonto.setText("");
        txtPaquete.setText("500");
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
        txtPaquete.setText("");
        txtOtroMonto.setText("");
        txtPaquete.setText("200");
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn300ActionPerformed
        // TODO add your handling code here:
        txtPaquete.setText("");
        txtOtroMonto.setText("");
        txtPaquete.setText("300");
    }//GEN-LAST:event_btn300ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
        txtPaquete.setText("");
        txtOtroMonto.setText("");
        txtPaquete.setText("100");
    }//GEN-LAST:event_btn100ActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // Obtener el importe del campo de texto
        String importeTexto = txtPaquete.getText();
        String cuentatxt = txtNumero.getText();
        double importe = Double.parseDouble(importeTexto); // Convertir a double
        if(cuentatxt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un número", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(importeTexto.isEmpty() || importeTexto == ""){
            JOptionPane.showMessageDialog(this, "Ingrese un paquete", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (importe > cuenta.getSaldo()) {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Confirmar retiro
            int response = JOptionPane.showConfirmDialog(this, "Vas a Recargar: $" + importe +" al número: "+ cuentatxt+ "\n¿Deseas continuar?",
                "Confirmar Recarga", JOptionPane.OK_CANCEL_OPTION);
            // Si el usuario presiona Aceptar
            if (response == JOptionPane.OK_OPTION) {
                principal.executeInPracticaja(() -> {
            cuenta.retirar("Practicaja", importe);
            System.out.println("Recarga realizada en: " + Thread.currentThread().getName());
             SwingUtilities.invokeLater(() -> {
                // Crear un JPanel personalizado para el mensaje
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Recarga exitosa");
                panel.add(label);

                // Crear el diálogo sin botones
                final JDialog dialog = new JDialog(this, "Recarga en Proceso", true);
                dialog.setContentPane(panel);
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialog.setSize(200, 100);
                dialog.setLocationRelativeTo(this);

                // Crear un temporizador para cerrar el diálogo después de 5 segundos
                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                        dialog.dispose();

                        // Abrir la ventana del menú principal y cerrar la ventana actual
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                new Menu().setVisible(true);
                                dispose(); // Cierra la ventana actual
                            }
                        });
                    }
                });
                timer.setRepeats(false); // El temporizador solo se ejecutará una vez

                // Mostrar el diálogo y comenzar el temporizador
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        timer.start();
                        dialog.setVisible(true);
                    }
                });
                });
             });

            }//Aqui acaba el if de ok option
        }
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void txtOtroMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroMontoActionPerformed
        // TODO add your handling code here:
        String otroImporte = txtOtroMonto.getText();
        txtPaquete.setText("");
        // Asignar el valor de txtOtroImporte a txtImporte
        txtPaquete.setText(otroImporte);
    }//GEN-LAST:event_txtOtroMontoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        new Compañia().setVisible(true); // Abrir ventana del menú principal
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaqueteActionPerformed

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
            java.util.logging.Logger.getLogger(Recarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOtroMonto;
    private javax.swing.JTextField txtPaquete;
    // End of variables declaration//GEN-END:variables
}
