/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author alulab14
 */
public class frmPanel extends javax.swing.JDialog {

    /**
     * Creates new form Panel
     */
    public static int contador=0;
    public static int i=0;
    public static int j=0;
    public frmPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panel0.setVisible(true);
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel5.setVisible(false);
                
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
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        ImageIcon icon=new ImageIcon(getClass().getResource("/Vista/png3/fondo.jpg"));
        Image image = icon.getImage();
        desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 680));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 780));
        jPanel1.setLayout(null);

        panel0.setBackground(new java.awt.Color(0, 122, 204));
        panel0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton12.setBackground(new java.awt.Color(0, 122, 204));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/016-plus-1.png"))); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 122, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-code.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 122, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/002-shop.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 122, 204));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/003-report.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 122, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/006-exit.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel0Layout = new javax.swing.GroupLayout(panel0);
        panel0.setLayout(panel0Layout);
        panel0Layout.setHorizontalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel0Layout.createSequentialGroup()
                .addGroup(panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel0Layout.setVerticalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel0Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        jPanel1.add(panel0);
        panel0.setBounds(0, 0, 50, 780);
        panel0.getAccessibleContext().setAccessibleName("panel0");

        panel1.setBackground(new java.awt.Color(0, 122, 204));

        jButton5.setBackground(new java.awt.Color(0, 122, 204));
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);

        jButton6.setBackground(new java.awt.Color(0, 122, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Mantenimiento");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 122, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Almacen");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 122, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Reportes");
        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jPanel1.add(panel1);
        panel1.setBounds(50, 0, 130, 300);
        panel1.getAccessibleContext().setAccessibleName("panel1");

        panel2.setBackground(new java.awt.Color(0, 122, 204));

        jButton13.setBackground(new java.awt.Color(0, 122, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);

        jButton17.setBackground(new java.awt.Color(0, 122, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Proveedores");
        jButton17.setBorder(null);
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panel2);
        panel2.setBounds(180, 0, 150, 150);

        panel3.setBackground(new java.awt.Color(0, 122, 204));

        jButton23.setBackground(new java.awt.Color(0, 122, 204));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);

        jButton24.setBackground(new java.awt.Color(0, 122, 204));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Reporte Productos ");
        jButton24.setBorder(null);
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 122, 204));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Reporte de Clientes");
        jButton25.setBorder(null);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panel3);
        panel3.setBounds(440, 0, 150, 230);

        panel5.setBackground(new java.awt.Color(0, 122, 204));

        jButton29.setBackground(new java.awt.Color(0, 122, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);

        jButton30.setBackground(new java.awt.Color(0, 122, 204));
        jButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Producto");
        jButton30.setBorder(null);
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(0, 122, 204));
        jButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Gestion de Almacenes");
        jButton31.setBorder(null);
        jButton31.setContentAreaFilled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(0, 122, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Movimiento de Almacenes");
        jButton32.setBorder(null);
        jButton32.setContentAreaFilled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panel5);
        panel5.setBounds(700, 0, 150, 300);

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.add(desktop);
        desktop.setBounds(330, 0, 670, 680);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 680);

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
            panel5.setVisible(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(panel2.isVisible()==false){
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel5.setVisible(false);
            desktop.setLocation(330,0);
            desktop.setSize(670,680);
        }
        else{
            panel2.setVisible(false);
            desktop.setLocation(180,0);
            desktop.setSize(820,680);
            desktop.getComponent(0).setSize(desktop.getWidth(),desktop.getHeight());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(panel5.isVisible()==false){
            panel5.setVisible(true);
            panel5.setLocation(180,0);
            panel2.setVisible(false);
            panel3.setVisible(false);
            desktop.setLocation(330,0);
            desktop.setSize(670,680);
        }
        else{
            panel5.setVisible(false);
            desktop.setLocation(180,0);
            desktop.setSize(820,680);
            desktop.getComponent(0).setSize(desktop.getWidth(),desktop.getHeight());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(panel3.isVisible()==false){
            panel3.setVisible(true);
            panel3.setLocation(180,0);
            panel2.setVisible(false);
            panel5.setVisible(false);
            desktop.setLocation(330,0);
            desktop.setSize(670,680);
        }
        else{
            panel3.setVisible(false);
            desktop.setLocation(180,0);
            desktop.setSize(820,680);
            desktop.getComponent(0).setSize(desktop.getWidth(),desktop.getHeight());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(contador==0){
            frmGestProveedores nuevo=new frmGestProveedores();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setAlignmentX(TOP_ALIGNMENT);
            nuevo.setAlignmentY(0);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            contador++;
        }else{
            JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if(contador==0){
            frmGestProductos nuevo=new frmGestProductos();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setAlignmentX(TOP_ALIGNMENT);
            nuevo.setAlignmentY(0);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            
            contador++;
        }else{
        JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if(contador==0){
            frmGestAlma nuevo = new frmGestAlma();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setAlignmentX(TOP_ALIGNMENT);
            nuevo.setAlignmentY(0);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            
            contador++;
        }else{
            JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if(contador==0){
            frmMovAlmacen nuevo=new frmMovAlmacen();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setAlignmentX(TOP_ALIGNMENT);
            nuevo.setAlignmentY(0);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            
            contador++;
        }else{
            JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(panel1.isVisible()==false){
            panel1.setVisible(true);
            panel2.setVisible(true);
        }
        else{
            if(panel1.isVisible()==true && panel2.isVisible()==false){
                panel2.setVisible(true);
            }
            else{
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel5.setVisible(false);
            }
        }                     
        if(panel1.isVisible()==true&& (panel3.isVisible()==true || panel5.isVisible()==true)){
            panel3.setVisible(false);
            panel5.setVisible(false);
            panel2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(panel1.isVisible()==false){
            panel1.setVisible(true);
            panel5.setLocation(180,0);
            panel5.setVisible(true);
        }
        else{
            if(panel1.isVisible()==true && panel5.isVisible()==false){
                panel5.setLocation(180,0);
                panel5.setVisible(true);
            }
            else{
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel5.setVisible(false);
            }
        }    
        if(panel1.isVisible()==true&& (panel2.isVisible()==true || panel3.isVisible()==true)){
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel5.setLocation(180,0);
            panel5.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(panel1.isVisible()==false){
            panel1.setVisible(true);
            panel3.setLocation(180,0);
            panel3.setVisible(true);
        }
        else{
            if(panel1.isVisible()==true && panel3.isVisible()==false){
                panel3.setLocation(180,0);
                panel3.setVisible(true);
            }
            else{
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel5.setVisible(false);
            }
        }    
        if(panel1.isVisible()==true&& (panel2.isVisible()==true || panel5.isVisible()==true)){
            panel2.setVisible(false);
            panel5.setVisible(false);
            panel3.setLocation(180,0);
            panel3.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frmLogin nuevo=new frmLogin();
        nuevo.setVisible(true);
        contador=0;
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        
        if(contador==0){
            frmRepProd nuevo=new frmRepProd();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            contador++;
        }else{
            JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(contador==0){
            frmRepCli nuevo=new frmRepCli();
            desktop.add(nuevo);
            nuevo.setVisible(true);
            nuevo.setSize(desktop.getWidth(),desktop.getHeight());
            nuevo.setLocation(0,0);
            contador++;
        }else{
            JOptionPane.showMessageDialog(this,"Por favor cierre la ventana actual","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

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
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel0;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel5;
    // End of variables declaration//GEN-END:variables
}
