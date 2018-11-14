/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaDeNegocio.ProductosBL;
import com.sun.webkit.event.WCKeyEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Usuario
 */
public class frmAddProd extends javax.swing.JDialog {

    /**
     * Creates new form frmAddProd
     */
    public frmAddProd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbunidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        radAlta = new javax.swing.JRadioButton();
        radRegular = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextArea(4,50);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Producto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 30, 60, 20);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre);
        txtnombre.setBounds(150, 20, 200, 30);

        jLabel3.setText("Descripción:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 104, 80, 20);

        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 190, 60, 20);

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtprecio);
        txtprecio.setBounds(150, 180, 50, 30);

        jLabel5.setText("Unidad de Medida:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 230, 110, 14);

        cmbunidad.setBackground(new java.awt.Color(255, 255, 204));
        cmbunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "unidad", "ciento", "metro", "bolsa", "docena", "kilogramo" }));
        jPanel1.add(cmbunidad);
        cmbunidad.setBounds(150, 230, 100, 20);

        jLabel6.setText("Tipo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 270, 70, 14);

        jLabel7.setText("Stock Mínimo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 310, 90, 14);

        txtStockMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockMinKeyTyped(evt);
            }
        });
        jPanel1.add(txtStockMin);
        txtStockMin.setBounds(150, 300, 50, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-error.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 350, 100, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/003-plus.png"))); // NOI18N
        jButton1.setText("Añadir");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 350, 100, 40);

        radAlta.setBackground(new java.awt.Color(204, 204, 204));
        radAlta.setText("Alta demanda");
        radAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAltaActionPerformed(evt);
            }
        });
        jPanel1.add(radAlta);
        radAlta.setBounds(150, 270, 110, 23);

        radRegular.setBackground(new java.awt.Color(204, 204, 204));
        radRegular.setText("Regular");
        radRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRegularActionPerformed(evt);
            }
        });
        jPanel1.add(radRegular);
        radRegular.setBounds(270, 270, 80, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("S/.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 190, 16, 14);

        jLabel8.setText("Codigo:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 70, 70, 20);

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(150, 60, 90, 30);

        txtdesc.setWrapStyleWord(true);
        txtdesc.setLineWrap(true);
        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        txtdesc.setMinimumSize(new java.awt.Dimension(250, 70));
        txtdesc.setPreferredSize(new java.awt.Dimension(250, 70));
        txtdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescKeyTyped(evt);
            }
        });
        jPanel1.add(txtdesc);
        txtdesc.setBounds(150, 100, 250, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtcodigo.getText().trim().compareTo("")==0||txtdesc.getText().trim().compareTo("")==0||
           txtStockMin.getText().trim().compareTo("")==0
           ||txtnombre.getText().trim().compareTo("")==0||txtprecio.getText().trim().compareTo("")==0){
            JOptionPane.showMessageDialog(this,
                "Hay campos vacios","Error",
                ERROR_MESSAGE);
        }else if(txtcodigo.getText().length()!=5){
            JOptionPane.showMessageDialog(this,
                "El codigo debe tener 6 caracteres","Error",
                ERROR_MESSAGE);
        
        }
        else if(radAlta.isSelected()==false&&radRegular.isSelected()==false)
            JOptionPane.showMessageDialog(this,
                "Elija un tipo","Error",
                ERROR_MESSAGE);
        else{
        String nombre=txtnombre.getText();
        String desc=txtdesc.getText();
        String id=txtcodigo.getText().toUpperCase();
        String unidad=cmbunidad.getSelectedItem().toString().toUpperCase();
        double precio=Double.parseDouble(txtprecio.getText());
        int stock=0;
        int tipo;
        if(radAlta.isSelected()==true)
            tipo=1;
        else tipo=0;
        int stockMin=Integer.parseInt(txtStockMin.getText());
        
        ProductosBL prodBL=new ProductosBL();
        try{
            prodBL.insertarProducto(id, nombre, unidad, precio, desc, stock, tipo, stockMin, 1);
            JOptionPane.showMessageDialog(this, 
                  "Se añadio el producto correctamente","Aviso",
                  INFORMATION_MESSAGE);
        }catch(Exception ex){}
        
        
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void radAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAltaActionPerformed
        // TODO add your handling code here:
        if(radRegular.isSelected()==true){
            radAlta.setSelected(true);
            radRegular.setSelected(false);
        }
    }//GEN-LAST:event_radAltaActionPerformed

    private void radRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRegularActionPerformed
        // TODO add your handling code here:
        if(radAlta.isSelected()==true){
            radRegular.setSelected(true);
            radAlta.setSelected(false);
        }
    }//GEN-LAST:event_radRegularActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtnombre.getText().endsWith(" "))
            evt.consume();
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtnombre.getText().isEmpty())
            evt.consume();
        
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK && evt.getKeyChar()!=KeyEvent.VK_SPACE){
            if(!s1.matches("[aA-zZ]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten letras a-z","Error",
                ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK){
            if(txtcodigo.getText().length()>=5){
                evt.consume();
            }
            if(!s1.matches("[aA-zZ0-9]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten caracteres alfanumericos","Error",
                ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK){
            if(txtprecio.getText().length()>=7){
                evt.consume();
            }
            if(!s1.matches("[0-9.]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten numeros","Error",
                ERROR_MESSAGE);
            }
            if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
                evt.consume();
            }
            if(evt.getKeyChar()=='.'&&txtprecio.getText().contains(".")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtStockMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockMinKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK){
            if(txtStockMin.getText().length()>=5){
                evt.consume();
            
            }
            if(!s1.matches("[0-9]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten numeros","Error",
                ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtStockMinKeyTyped

    private void txtdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtdesc.getText().endsWith(" "))
            evt.consume();
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtdesc.getText().isEmpty())
            evt.consume();
        
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK && evt.getKeyChar()!=KeyEvent.VK_SPACE&&evt.getKeyChar()!=KeyEvent.VK_ENTER){
            if(txtdesc.getText().length()>=102)
                evt.consume();
            if(!s1.matches("[aA-zZ0-9/]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten caracteres alfanumericos","Error",
                ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtdescKeyTyped

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
            java.util.logging.Logger.getLogger(frmAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmAddProd dialog = new frmAddProd(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbunidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radAlta;
    private javax.swing.JRadioButton radRegular;
    private javax.swing.JTextField txtStockMin;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
