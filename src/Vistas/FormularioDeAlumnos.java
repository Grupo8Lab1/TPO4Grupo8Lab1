/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import TPO4_class.Alumno;
<<<<<<< Updated upstream
=======
import static TPO4_class.TPO4Grupo8Lab1.listaAlumnos;
>>>>>>> Stashed changes
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static TPO4_class.TPO4Grupo8Lab1.listaAlumnos;

/**
 *
 * @author nacho
 */
public class FormularioDeAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form Tpo3Vista
     */
    public FormularioDeAlumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtfNombre = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jtfLegajo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbFormularioDeInscripcion = new javax.swing.JButton();
        jbFormularioDeMateria = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(95, 158, 160));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(82, 82, 82));
        jPanel1.setToolTipText("");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Nuevo");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlNombre.setText("Nombre:");

        jlApellido.setText("Apellido:");

        jlDNI.setText("Legajo");

        jtfLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLegajoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(19, 41, 0));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario de Alumno ");

        jbFormularioDeInscripcion.setText("Formulario de Inscripcion");
        jbFormularioDeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormularioDeInscripcionActionPerformed(evt);
            }
        });

        jbFormularioDeMateria.setText("Formulario de materia");
        jbFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormularioDeMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDNI)
                            .addComponent(jlApellido)
                            .addComponent(jlNombre))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(96, 96, 96)
                        .addComponent(jbBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbFormularioDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFormularioDeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDNI))
                .addGap(121, 121, 121)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFormularioDeInscripcion)
                    .addComponent(jbFormularioDeMateria))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar))
                .addGap(65, 65, 65))
        );

        content.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        content.setForeground(new java.awt.Color(82, 82, 82));
        content.setToolTipText("");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void presentarvistas(javax.swing.JPanel a) {
        a.setSize(473, 411);
        a.setLocation(0, 0);
        content.removeAll();
        content.add(a, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    private void jbFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormularioDeMateriaActionPerformed
        FormularioDeMaterias a = new FormularioDeMaterias();
        presentarvistas(a);

    }//GEN-LAST:event_jbFormularioDeMateriaActionPerformed

    private void jtfLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLegajoActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfLegajo.setText("");

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if ("".equals(jtfNombre.getText()) || "".equals(jtfApellido.getText()) || "".equals(jtfLegajo.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
        } else {
            try {
<<<<<<< Updated upstream

                Alumno n = new Alumno(Integer.parseInt(jtfLegajo.getText()),jtfApellido.getText(),jtfNombre.getText());
                //agregar alumno


=======
>>>>>>> Stashed changes
                Alumno AlumAux = new Alumno(Integer.parseInt(jtfLegajo.getText()), jtfApellido.getText(), jtfNombre.getText());
                if (listaAlumnos.contains(AlumAux)) {
                    JOptionPane.showMessageDialog(null, "Este n° de Legajo ya se encontraba asociado a otro alumno.");
                } else {
                    listaAlumnos.add(AlumAux);
                    JOptionPane.showMessageDialog(null, "Alumno registrado satisfactoriamente.");
                }

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error, Ingrese un numero de legajo valido.");
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbFormularioDeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormularioDeInscripcionActionPerformed
        FormularioDeInscripcion a = new FormularioDeInscripcion();
        presentarvistas(a);

    }//GEN-LAST:event_jbFormularioDeInscripcionActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioDeAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioDeAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioDeAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioDeAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioDeAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbFormularioDeInscripcion;
    private javax.swing.JButton jbFormularioDeMateria;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
