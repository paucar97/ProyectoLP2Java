/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author alulab14
 */
public class frmPanel extends javax.swing.JDialog {

    /**
     * Creates new form Panel
     */
    public static int i=0;
    public static int j=0;
    public frmPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panel0.setVisible(true);
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel7.setVisible(false);
                
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
        panel0 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        panel7 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setMaximumSize(new java.awt.Dimension(980, 400));
        setMinimumSize(new java.awt.Dimension(980, 400));
        setPreferredSize(new java.awt.Dimension(980, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(980, 400));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        panel0.setBackground(new java.awt.Color(0, 122, 204));
        panel0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel0.setLayout(new java.awt.GridLayout(10, 1));

        jButton12.setBackground(new java.awt.Color(0, 122, 204));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/016-plus-1.png"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panel0.add(jButton12);

        jButton1.setBackground(new java.awt.Color(0, 122, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/002-checked.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        panel0.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 122, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/009-pdf.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        panel0.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 122, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/006-exit.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        panel0.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 122, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/011-man.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        panel0.add(jButton4);

        jButton10.setBackground(new java.awt.Color(0, 122, 204));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajo/png3/005-lock.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        panel0.add(jButton10);

        jPanel1.add(panel0);
        panel0.setBounds(0, 0, 50, 400);
        panel0.getAccessibleContext().setAccessibleName("panel0");

        panel1.setBackground(new java.awt.Color(0, 122, 204));
        panel1.setLayout(new java.awt.GridLayout(10, 1));

        jButton5.setBackground(new java.awt.Color(0, 122, 204));
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        panel1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(0, 122, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Mantenimiento");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(0, 122, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Pedido");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(0, 122, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Almacen");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 122, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Pagos");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel1.add(jButton9);

        jButton11.setBackground(new java.awt.Color(0, 122, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Reportes");
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panel1.add(jButton11);

        jPanel1.add(panel1);
        panel1.setBounds(50, 0, 130, 400);
        panel1.getAccessibleContext().setAccessibleName("panel1");

        panel2.setBackground(new java.awt.Color(0, 122, 204));
        panel2.setLayout(new java.awt.GridLayout(10, 1));

        jButton13.setBackground(new java.awt.Color(0, 122, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        panel2.add(jButton13);

        jButton14.setBackground(new java.awt.Color(0, 122, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Usuarios");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setContentAreaFilled(false);
        panel2.add(jButton14);

        jButton15.setBackground(new java.awt.Color(0, 122, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Clientes");
        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton15.setContentAreaFilled(false);
        panel2.add(jButton15);

        jButton16.setBackground(new java.awt.Color(0, 122, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Transportistas");
        jButton16.setToolTipText("");
        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton16.setContentAreaFilled(false);
        panel2.add(jButton16);

        jButton17.setBackground(new java.awt.Color(0, 122, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Proveedores");
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        panel2.add(jButton17);

        jPanel1.add(panel2);
        panel2.setBounds(180, 0, 130, 400);

        panel7.setBackground(new java.awt.Color(0, 122, 204));
        panel7.setLayout(new java.awt.GridLayout(10, 1));

        jButton19.setBackground(new java.awt.Color(0, 122, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        panel7.add(jButton19);

        jButton18.setBackground(new java.awt.Color(0, 122, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Vendedores");
        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton18.setContentAreaFilled(false);
        panel7.add(jButton18);

        jPanel1.add(panel7);
        panel7.setBounds(310, 0, 130, 400);

        panel3.setBackground(new java.awt.Color(0, 122, 204));
        panel3.setLayout(new java.awt.GridLayout(10, 1));

        jButton23.setBackground(new java.awt.Color(0, 122, 204));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        panel3.add(jButton23);

        jButton24.setBackground(new java.awt.Color(0, 122, 204));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Reporte Productos ");
        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton24.setContentAreaFilled(false);
        panel3.add(jButton24);

        jButton25.setBackground(new java.awt.Color(0, 122, 204));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Reporte de Clientes");
        jButton25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton25.setContentAreaFilled(false);
        panel3.add(jButton25);

        jPanel1.add(panel3);
        panel3.setBounds(440, 0, 130, 400);

        panel4.setBackground(new java.awt.Color(0, 122, 204));
        panel4.setLayout(new java.awt.GridLayout(10, 1));

        jButton26.setBackground(new java.awt.Color(0, 122, 204));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        panel4.add(jButton26);

        jButton27.setBackground(new java.awt.Color(0, 122, 204));
        jButton27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Factura");
        jButton27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton27.setContentAreaFilled(false);
        panel4.add(jButton27);

        jButton28.setBackground(new java.awt.Color(0, 122, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Gestion de Pedidos");
        jButton28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton28.setContentAreaFilled(false);
        panel4.add(jButton28);

        jPanel1.add(panel4);
        panel4.setBounds(570, 0, 130, 400);

        panel5.setBackground(new java.awt.Color(0, 122, 204));
        panel5.setLayout(new java.awt.GridLayout(10, 1));

        jButton29.setBackground(new java.awt.Color(0, 122, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        panel5.add(jButton29);

        jButton30.setBackground(new java.awt.Color(0, 122, 204));
        jButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Producto");
        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        panel5.add(jButton30);

        jButton31.setBackground(new java.awt.Color(0, 122, 204));
        jButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Gestion de Almacenes");
        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton31.setContentAreaFilled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        panel5.add(jButton31);

        jButton32.setBackground(new java.awt.Color(0, 122, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Movimiento de Almacenes");
        jButton32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton32.setContentAreaFilled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        panel5.add(jButton32);

        jPanel1.add(panel5);
        panel5.setBounds(700, 0, 150, 400);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(desktop);
        desktop.setBounds(50, 0, 930, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(panel1.isVisible()==false)
            panel1.setVisible(true);
        else{
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel7.setVisible(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(panel2.isVisible()==false){
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel7.setVisible(false);
        }
        else{
            panel2.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(panel4.isVisible()==false){
            panel4.setVisible(true);
            panel4.setLocation(180,0);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel5.setVisible(false);
            panel7.setVisible(false);
        }
        else{
            panel4.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(panel5.isVisible()==false){
            panel5.setVisible(true);
            panel5.setLocation(180,0);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel7.setVisible(false);
        }
        else{
            panel5.setVisible(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(panel7.isVisible()==false){
            panel7.setVisible(true);
            panel7.setLocation(180,0);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
        }
        else{
            panel7.setVisible(false);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(panel3.isVisible()==false){
            panel3.setVisible(true);
            panel3.setLocation(180,0);
            panel2.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel7.setVisible(false);
        }
        else{
            panel3.setVisible(false);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        frmProveedores nuevo = new frmProveedores(null,true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        frmProductos nuevo = new frmProductos(null,true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        frmGestionAlmacen nuevo = new frmGestionAlmacen(null,true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        fmrMovimientoAlmacen nuevo=new fmrMovimientoAlmacen(null,true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPanel dialog = new frmPanel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel0;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel7;
    // End of variables declaration//GEN-END:variables
}
