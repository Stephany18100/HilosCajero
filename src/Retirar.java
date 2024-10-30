
import java.awt.event.*;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Retirar extends javax.swing.JFrame {
    private Principal principal;
    private Cuenta cuenta;

    public Retirar() {
        principal = Principal.getInstance();
        cuenta = principal.getCuenta();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn100 = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn1500 = new javax.swing.JButton();
        txtOtroImporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        txtImporte = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Retiro");

        jLabel2.setText("Importe");

        btn100.setText("$100");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

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
        btn300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn300ActionPerformed(evt);
            }
        });

        btn1000.setText("$1,000");
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1000ActionPerformed(evt);
            }
        });

        btn1500.setText("$1,500");
        btn1500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1500ActionPerformed(evt);
            }
        });

        txtOtroImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroImporteActionPerformed(evt);
            }
        });

        jLabel3.setText("Otro importe:");

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        txtImporte.setEditable(false);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1000, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1500, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn300, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtOtroImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnRetirar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn300, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1000, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1500, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtOtroImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetirar)
                    .addComponent(btnVolver))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("100");
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("500");
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("200");
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn300ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("300");
    }//GEN-LAST:event_btn300ActionPerformed

    private void btn1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1000ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("1000");
    }//GEN-LAST:event_btn1000ActionPerformed

    private void btn1500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1500ActionPerformed
        // TODO add your handling code here:
        txtImporte.setText("");
        txtOtroImporte.setText("");
        txtImporte.setText("1500");
    }//GEN-LAST:event_btn1500ActionPerformed

    private void txtOtroImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroImporteActionPerformed
        // TODO add your handling code here:
        String otroImporte = txtOtroImporte.getText();
        txtImporte.setText(""); 
        // Asignar el valor de txtOtroImporte a txtImporte
        txtImporte.setText(otroImporte);
    }//GEN-LAST:event_txtOtroImporteActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // Obtener el importe del campo de texto
    String importeTexto = txtImporte.getText();
    
    try {
        double importe = Double.parseDouble(importeTexto); // Convertir a double
        
        if (importe > cuenta.getSaldo()) {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Confirmar retiro
            int response = JOptionPane.showConfirmDialog(this, "Vas a retirar: $" + importe + "\n¿Deseas continuar?", 
                                                         "Confirmar Retiro", JOptionPane.OK_CANCEL_OPTION);
            // Si el usuario presiona Aceptar
            if (response == JOptionPane.OK_OPTION) {
                principal.executeInPracticaja(() -> {
                    cuenta.retirar("PractiCaja",importe);
                    System.out.println("Retiro realizado en: " + Thread.currentThread().getName());
                    SwingUtilities.invokeLater(() -> {
                        // Crear un JPanel personalizado para el mensaje
                        JPanel panel = new JPanel();
                        JLabel label = new JLabel("Retirando...");
                        panel.add(label);

                        // Crear el diálogo sin botones
                        final JDialog dialog = new JDialog(this, "Retiro en Proceso", true);
                        dialog.setContentPane(panel);
                        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                        dialog.setSize(200, 100);
                        dialog.setLocationRelativeTo(this);

                        // Crear un temporizador para cerrar el diálogo después de 3 segundos
                        Timer timer = new Timer(1000, new ActionListener() {
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
                        timer.start();
                        dialog.setVisible(true);
                    });
                });
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true); // Abrir ventana del menú principal
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn1500;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtOtroImporte;
    // End of variables declaration//GEN-END:variables
}
