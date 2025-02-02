
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author steph
 */
public class AhorroMovil extends javax.swing.JFrame {
    private Principal principal;
    private Cuenta cuenta;
    /**
     * Creates new form AhorroMovil
     */
    public AhorroMovil() {
        initComponents();
        principal = Principal.getInstance();
        cuenta = principal.getCuenta();
        double saldoActual = cuenta.getSaldo();
        txtSaldo.setText("$" + String.format("%.2f", saldoActual));
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
        txtSaldo = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        btnConfiAhorro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSaldo.setEditable(false);
        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSaldo.setBorder(null);
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, 30));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMonto.setBorder(null);
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 30));

        btnConfiAhorro.setBackground(new java.awt.Color(0, 148, 86));
        btnConfiAhorro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfiAhorro.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiAhorro.setText("Confirmar");
        btnConfiAhorro.setBorder(null);
        btnConfiAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiAhorroActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 276, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/AhorroMovil.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiAhorroActionPerformed
        // TODO add your handling code here:
        String montoTexto = txtMonto.getText();
    
        if (montoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Monto no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                double monto = Double.parseDouble(montoTexto);
                if (monto > 0) {
                    if (cuenta.getSaldo() >= monto) {
                        int response = JOptionPane.showConfirmDialog(this, "Vas a transferir: $" + monto + " a la cuenta de ahorro.\n¿Deseas continuar?",
                                "Confirmar Transferencia", JOptionPane.OK_CANCEL_OPTION);
                        if (response == JOptionPane.OK_OPTION) {
                            principal.executeInBanca(() -> {
                                cuenta.retirar("Banca", monto);
                                cuenta.agregarAhorro("Banca",monto);
                                System.out.println("Ahorro realizado en: " + Thread.currentThread().getName());
                                SwingUtilities.invokeLater(() -> {
                                    JOptionPane.showMessageDialog(this, "Se ha transferido $" + monto + " a la cuenta de ahorro.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                    new MenuMovil().setVisible(true); // Cambiar a la ventana del menú
                                    dispose();
                                });
                            });
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El monto debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnConfiAhorroActionPerformed

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
            java.util.logging.Logger.getLogger(AhorroMovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AhorroMovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AhorroMovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AhorroMovil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AhorroMovil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiAhorro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
