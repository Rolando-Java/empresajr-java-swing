/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conn.Conection;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolando Andre
 */
public class Frm7 extends javax.swing.JFrame {

    /**
     * Creates new form Frm7
     */
    public Frm7() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_codigoEstilo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        txt_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnGrabar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        cbo_funcion = new javax.swing.JComboBox();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mantenimiento de Empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 24, -1, -1));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 20));

        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 164, -1, -1));

        jLabel6.setText("Cargo/Función:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 194, -1, -1));

        jLabel7.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 224, -1, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 173, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 173, -1));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 173, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 164, 173, -1));
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 173, -1));

        jLabel8.setText("Correo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 173, -1));

        jLabel9.setText("Dni:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));
        getContentPane().add(txt_codigoEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 173, -1));

        jLabel10.setText("Nacionalidad:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel11.setText("Codigo de estilo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));
        getContentPane().add(txt_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 173, -1));
        getContentPane().add(txt_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 224, 173, -1));

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 153, 90, 40));

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 204, 90, 40));

        cbo_funcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..................", "a", "b", "c", "d", "f", "g" }));
        getContentPane().add(cbo_funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 195, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 89, 90, 46));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Connection cn=null;
        Statement st=null;
        try{
            String nombre=txt_nombre.getText().toUpperCase().trim();
            if(!nombre.equalsIgnoreCase("")){
                if(!Validacion.existencia_numero(nombre)){
                    String apellido=txt_apellido.getText().toUpperCase().trim();
                    if(!apellido.equalsIgnoreCase("")){
                        if(!Validacion.existencia_numero(apellido)){
                            String direccion=txt_direccion.getText().toUpperCase().trim();
                            if(!direccion.equalsIgnoreCase("")){
                                String telefono=txt_telefono.getText().trim();
                                if(!telefono.equalsIgnoreCase("")){
                                    if(!Validacion.existencia_letras(telefono)){
                                        String funcion=cbo_funcion.getSelectedItem().toString();
                                        if(!funcion.equalsIgnoreCase("..................")){
                                            String fechaString="";
                                            Date fecha= txt_fechaNacimiento.getDate();
                                            if(fecha!=null){
                                                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
                                                fechaString=sdf.format(fecha);
                                                String correo=txt_correo.getText().trim();
                                                if(!correo.equalsIgnoreCase("")){
                                                    if(Validacion.existencia_arroba(correo)){
                                                        String dni=txt_dni.getText().trim();
                                                        if(!dni.equalsIgnoreCase("")){
                                                            if(!Validacion.existencia_letras(dni)){
                                                                String nacionalidad=txt_nacionalidad.getText().toUpperCase().trim();//debe ser un combo
                                                                if(!nacionalidad.equalsIgnoreCase("")){
                                                                    if(!Validacion.existencia_numero(nacionalidad)){
                                                                        String codigo_estilo=txt_codigoEstilo.getText().toUpperCase().trim();
                                                                        if(!codigo_estilo.equalsIgnoreCase("")){
                                                                            if(!Validacion.repite_codigoEstilo(codigo_estilo)){
                                                                                cn=Conection.getConnection();
                                                                                st=cn.createStatement();
                                                                                    
                                                                                st.executeUpdate("insert into dbo.empleados values('"+nombre+"','"+apellido+"','"+direccion+"','"+telefono+"','"+funcion+"',convert(datetime,'"+fechaString+"',5),'"+correo+"','"+dni+"','"+nacionalidad+"','"+codigo_estilo+"');");//sentencia para ingresar los datos
                                                                                
                                                                                JOptionPane.showMessageDialog(null, "Se ingresó correctamente!!");  
                                                                                
                                                                            }else{
                                                                                JOptionPane.showMessageDialog(null,"El codigo de estilo ya existe!!","Mensaje",2);
                                                                            }
                                                                        }else{
                                                                            JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                                                        }
                                                                    }else{
                                                                        JOptionPane.showMessageDialog(null,"La nacionalidad no debe contener números!!","Mensaje",2);
                                                                    }
                                                                }else{
                                                                    JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                                                }
                                                            }else{
                                                                JOptionPane.showMessageDialog(null,"El dni no debe contener letras!!","Mensaje",2);
                                                            }
                                                        }else{
                                                            JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                                        }
                                                    }else{
                                                         JOptionPane.showMessageDialog(null,"El correo debe tener @!!","Mensaje",2);
                                                    }
                                                }else{
                                                    JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                            }
                                        }else{
                                            JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El telefono no debe contener letras!!","Mensaje",2);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números!!","Mensaje",2);
                        } 
                    }else{
                        JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El nombre no debe contener números!!","Mensaje",2);
                }
            }else{
               JOptionPane.showMessageDialog(null,"Complete todos los campos!!","Mensaje",3);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void limpiar_campos(){
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        cbo_funcion.setSelectedIndex(0);
        txt_fechaNacimiento.setDate(null);
        txt_correo.setText("");
        txt_dni.setText("");
        txt_nacionalidad.setText("");
        txt_codigoEstilo.setText("");
    }
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Frm6 objF=new Frm6();
        objF.setVisible(true);
        objF.setLocationRelativeTo(null);
        objF.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar_campos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox cbo_funcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigoEstilo;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private com.toedter.calendar.JDateChooser txt_fechaNacimiento;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
