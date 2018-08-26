/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientodeitems;

import java.io.*;
import java.io.ObjectOutputStream;
import java.util.*;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;
import seguimientodeitems.Control.LiderProyecto;
import seguimientodeitems.Control.Miembro;
import seguimientodeitems.Control.Users;

/**
 *
 * @author ezequiel_o
 */
public class Programa extends javax.swing.JFrame {
    private List<Users> listaMiembros = new ArrayList<Users>();
    
   boolean f=false;
    /**
     * Creates new form Programa
     * @param user
     */
    
    
    public Programa(boolean f,Users user,Integer n) {
    //el bolean se usa mas abajo en el codigo para guardar el usuario con el numero de usuario en la listamiembros
    
        try{
    //serializar        
        ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream ("archivo.dat"));
        
        this.listaMiembros=(List<Users>) recuperando_fichero.readObject();
        recuperando_fichero.close();
        for (int i = 0; i < listaMiembros.size(); ++i) {
            System.out.println(listaMiembros.get(i).getLider().getNombre());
        }
        }
        catch(Exception e){
        };
         
         
        
        
        
        initComponents();this.setLocationRelativeTo(null); 
        CrearUsuario.setVisible(true);  
        jLabel4.setVisible(false);
        jLabelLegajo.setVisible(false);
        Legajo.setVisible(false);
    jTextField1.setVisible(false);
    jLabel5.setVisible(false);
        CrearUsuario.setVisible(false);
        //aca se usa para guardar los datos
        this.f=f;
        if ( this.f==true){
        try{
        ObjectOutputStream escribiendo_fichero= new ObjectOutputStream(new FileOutputStream ("archivo.dat"));
        listaMiembros.get(n).setListaDeItems(user.getListaDeItems());
        listaMiembros.get(n).setContrasenia(user.getContrasenia());
        listaMiembros.get(n).setLider(user.getLider());
        listaMiembros.get(n).setContrasenia(user.getContrasenia());
        
        escribiendo_fichero.writeObject(listaMiembros);
        escribiendo_fichero.close();
        
        dispose();
        
         }
        catch(Exception e){
        };
    
    };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreDeUsuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        NuevoUsuario = new javax.swing.JButton();
        Legajo = new javax.swing.JTextField();
        jLabelLegajo = new javax.swing.JLabel();
        LogInvista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CrearUsuario = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JlabelFondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(431, 280));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(51, 255, 255));
        salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(102, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icon (1).png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 30, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Nombre de usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        NombreDeUsuario.setText("Nombre de usuario");
        NombreDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, -1));

        password.setText("jPassw");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        Entrar.setBackground(new java.awt.Color(255, 0, 51));
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));

        NuevoUsuario.setBackground(new java.awt.Color(51, 255, 51));
        NuevoUsuario.setText("Nuevo usuario");
        NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        Legajo.setText("Legajo");
        Legajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LegajoActionPerformed(evt);
            }
        });
        Legajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LegajoKeyTyped(evt);
            }
        });
        getContentPane().add(Legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, -1));

        jLabelLegajo.setForeground(new java.awt.Color(255, 255, 0));
        jLabelLegajo.setText("Legajo");
        getContentPane().add(jLabelLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 20));

        LogInvista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogInvista.setForeground(new java.awt.Color(255, 51, 51));
        LogInvista.setText("Log In");
        getContentPane().add(LogInvista, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Nuevo usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 40));

        CrearUsuario.setText("Crear");
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));

        jTextField1.setText("Nombre del Lider");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 20));

        JlabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        JlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondo-celeste-oscuro-6269.jpg"))); // NOI18N
        getContentPane().add(JlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void NombreDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDeUsuarioActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        //String User= "admin";
        //String Contrasenia= "admin";
        String pass= new String(password.getPassword());
        String usuario= new String(NombreDeUsuario.getText());
        boolean not=false;
        //use un for normal y no el for each porque necesitava el indice i
for (int i = 0; i < listaMiembros.size(); ++i) {
            
        
        if(listaMiembros.get(i).getContrasenia().equals(pass) && listaMiembros.get(i).getUsuario().equals(usuario)){
            
            Interfaz prog =new Interfaz(listaMiembros.get(i),i);
            prog.setVisible(true);
            dispose();
            not=true;
        } } 
        if (not==(false))
        {JOptionPane.showMessageDialog(this,"Contraseña o usuario incorrecto");
        
    

        }
        
    }//GEN-LAST:event_EntrarActionPerformed

    private void NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoUsuarioActionPerformed
        CrearUsuario.setVisible(true);
        jLabel5.setVisible(true);
        jTextField1.setVisible(true);
        Entrar.setVisible(false);
        LogInvista.setVisible(false);
        jLabel4.setVisible(true);
        jLabelLegajo.setVisible(true);
        Legajo.setVisible(true);
        
        //crear nuevo usuario haciendo invisible y visible algunas componentes
    }//GEN-LAST:event_NuevoUsuarioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
        LiderProyecto nuevo = new LiderProyecto(jTextField1.getText());
         if(Legajo.getText().equals("") ||Legajo.getText().equals("Legajo"))
         {JOptionPane.showMessageDialog(rootPane, "campo vacio");}
         else{ nuevo.setLegajo(Integer.parseInt(Legajo.getText())); 
         String pass= new String(password.getPassword());
        Users nuevo2= new Users(NombreDeUsuario.getText(),pass,nuevo);
        listaMiembros.add(nuevo2);
         
        
         
        jTextField1.setText("Nombre Lider");
        Legajo.setText("");
        jTextField1.setVisible(false);
        CrearUsuario.setVisible(false);
        jLabel5.setVisible(false);
        Entrar.setVisible(true);
        LogInvista.setVisible(true);
        jLabel4.setVisible(false);
        jLabelLegajo.setVisible(false);
        Legajo.setVisible(false);
        //guarda el nuevo usuario en un archivo 
        try{
        ObjectOutputStream escribiendo_fichero= new ObjectOutputStream(new FileOutputStream ("archivo.dat"));
        escribiendo_fichero.writeObject(listaMiembros);
        escribiendo_fichero.close();
        
        
         }
        catch(Exception e){
        };
         
         }
    }//GEN-LAST:event_CrearUsuarioActionPerformed

    private void LegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LegajoActionPerformed

    private void LegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LegajoKeyTyped
        // por si se ponen numeros en el legajo
        char validar=  evt.getKeyChar();
        if (Character.isLetter(validar)){getToolkit().beep();evt.consume();
        JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        
        }
    }//GEN-LAST:event_LegajoKeyTyped

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                boolean f=false;
                Users user= new Users();
                
                new Programa(f,user,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearUsuario;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel JlabelFondo;
    private javax.swing.JTextField Legajo;
    private javax.swing.JLabel LogInvista;
    private javax.swing.JTextField NombreDeUsuario;
    private javax.swing.JButton NuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLegajo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
