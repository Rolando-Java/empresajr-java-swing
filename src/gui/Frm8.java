/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Rolando Andre
 */
public class Frm8 extends javax.swing.JFrame {

    /**
     * Creates new form Frm8
     */
    public Frm8() {
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
        btn_mantenimiento = new javax.swing.JButton();
        btn_ficha = new javax.swing.JButton();
        btn_avances = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(334, 450));
        setPreferredSize(new java.awt.Dimension(334, 490));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(334, 490));
        jPanel1.setLayout(null);

        btn_mantenimiento.setBackground(new java.awt.Color(102, 102, 102));
        btn_mantenimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_mantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btn_mantenimiento.setText("MANTENIMIENTO DE EMPLEADOS");
        btn_mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mantenimiento);
        btn_mantenimiento.setBounds(20, 120, 290, 100);

        btn_ficha.setBackground(new java.awt.Color(102, 102, 102));
        btn_ficha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ficha.setForeground(new java.awt.Color(255, 255, 255));
        btn_ficha.setText("MANTENIMIENTO DE FICHA TÉCNICA");
        btn_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fichaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ficha);
        btn_ficha.setBounds(20, 220, 290, 100);

        btn_avances.setBackground(new java.awt.Color(102, 102, 102));
        btn_avances.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_avances.setForeground(new java.awt.Color(255, 255, 255));
        btn_avances.setText("GESTIÓN DE PROGRESO");
        btn_avances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avancesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_avances);
        btn_avances.setBounds(20, 320, 290, 100);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("J&R");
        jPanel1.add(lbl_titulo);
        lbl_titulo.setBounds(130, 30, 82, 58);

        jMenu1.setText("Sesion");

        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_avancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avancesActionPerformed
        Frm3 obj=new Frm3();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_avancesActionPerformed

    private void btn_mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantenimientoActionPerformed
        Frm7 obj=new Frm7();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_mantenimientoActionPerformed

    private void btn_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fichaActionPerformed
        Frm5 obj=new Frm5();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btn_fichaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Frm obj=new Frm();
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_avances;
    private javax.swing.JButton btn_ficha;
    private javax.swing.JButton btn_mantenimiento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
