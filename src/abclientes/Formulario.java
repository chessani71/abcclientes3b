package abclientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbMovimiento = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Password");

        jLabel3.setText("Correo");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        lbMovimiento.setText("Movimiento");

        btnAlta.setText("Alta");
        btnAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaMouseClicked(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBajaMouseClicked(evt);
            }
        });

        btnCambio.setText("Cambio");
        btnCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambioMouseClicked(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaMouseClicked(evt);
            }
        });

        btnListado.setText("Listado");
        btnListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListadoMouseClicked(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMovimiento)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(txtCorreo)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAlta)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaja)
                        .addGap(26, 26, 26)
                        .addComponent(btnCambio)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(btnListado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMovimiento)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlta)
                            .addComponent(btnBaja)
                            .addComponent(btnCambio)
                            .addComponent(btnConsulta)
                            .addComponent(btnListado)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaMouseClicked
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
            Statement comando=conexion.createStatement();
            ResultSet registro=
            comando.executeQuery("select * from tclientes where usuario='"+
                    txtUsuario.getText()+"'");
            if (registro.next()==false){
            comando.executeUpdate("insert into tclientes values('"+
                    txtUsuario.getText()+"','"+
                    txtPassword.getText()+"','"+
                    txtCorreo.getText()+"','"+
                    txtNombre.getText()+"','"+
                    txtApellido.getText()+"')"
                    );
             lbMovimiento.setText("Usuario agregado");
            }
            else
            {
                 lbMovimiento.setText("Usuario Duplicado");
            }
             conexion.close();
             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAltaMouseClicked

    private void btnBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBajaMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
            Statement comando=conexion.createStatement();
            comando.executeUpdate("delete from  tclientes where usuario='"+
                    txtUsuario.getText()+"'"
                    );
             conexion.close();
             
             lbMovimiento.setText("Usuario eliminado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBajaMouseClicked

    private void btnCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambioMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
            Statement comando=conexion.createStatement();
           
            comando.executeUpdate("update tclientes set password='"+
                    txtPassword.getText()+"',correo='"+
                    txtCorreo.getText()+"',nombre='"+
                    txtNombre.getText()+"',apellido='"+
                    txtApellido.getText()+"' where usuario='"+
                    txtUsuario.getText()+"'"
                    );
             conexion.close();
             
             lbMovimiento.setText("Usuario modificado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCambioMouseClicked

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
            Statement comando=conexion.createStatement();
            ResultSet registro=
            comando.executeQuery("select * from tclientes where usuario='"+
                    txtUsuario.getText()+"'"
                                );
             if (registro.next()==true){
                 txtPassword.setText(registro.getString("password"));
                 txtCorreo.setText(registro.getString("correo"));
                 txtNombre.setText(registro.getString("nombre"));
                 txtApellido.setText(registro.getString("apellido"));
             }
             conexion.close();
             
             lbMovimiento.setText("Usuario consultado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnConsultaMouseClicked

    private void btnListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListadoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Usuario");
        modeloTabla.addColumn("Password");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        String u,p,c,n,a;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
            Statement comando=conexion.createStatement();
            ResultSet registro=
            comando.executeQuery("select * from tclientes"
                                );
             while (registro.next()==true){
                 u=registro.getString("usuario");
                 p=registro.getString("password");
                 c=registro.getString("correo");
                 n=registro.getString("nombre");
                 a=registro.getString("apellido");
                 modeloTabla.addRow(
                           new Object[]{u,p,c,n,a}
                 );
                 tblClientes.setModel(modeloTabla);                        }
             conexion.close();
             
             lbMovimiento.setText("Usuario consultado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnListadoMouseClicked

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnListado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMovimiento;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
