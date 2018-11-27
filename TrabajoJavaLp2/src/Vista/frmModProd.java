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
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static jdk.nashorn.internal.objects.NativeMath.round;
import modelo.Medida;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class frmModProd extends javax.swing.JDialog {

    /**
     * Creates new form frmModProd
     */
    private String id;
    private int stockP;
    public frmModProd(java.awt.Frame parent, boolean modal,Producto prod, String unidad) {
        super(parent, modal);
        initComponents();
        radalta.setSelected(true);
        cbounidad.setSelectedIndex(0);
        txtnombre.setText(prod.getNombre());
        txtcod.setText(prod.getCodigo());
        txtdesc.setText(prod.getDescripcion());
        txtmin.setText(Integer.toString(prod.getMinimoStock()));
        txtprecio.setText(Double.toString(prod.getPrecio()));
        cbounidad.setSelectedItem(0);
        if(prod.getTipo()==1)
            radalta.setSelected(true);
        else rarreg.setSelected(true);
        id=prod.getCodigo();
        stockP=prod.getStock();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtmin = new javax.swing.JTextField();
        cbounidad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        radalta = new javax.swing.JRadioButton();
        rarreg = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextArea(4,50);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Producto");
        setMaximumSize(new java.awt.Dimension(414, 362));
        setMinimumSize(new java.awt.Dimension(414, 362));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 80, 14);

        jLabel2.setText("Descrpición:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 90, 14);

        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 180, 60, 14);

        jLabel4.setText("Unidad de Medida:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 220, 130, 14);

        jLabel5.setText("Tipo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 260, 70, 14);

        jLabel6.setText("Stock Mínimo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 300, 90, 14);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre);
        txtnombre.setBounds(160, 10, 200, 30);

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtprecio);
        txtprecio.setBounds(160, 170, 50, 30);

        txtmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtminActionPerformed(evt);
            }
        });
        txtmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtminKeyTyped(evt);
            }
        });
        jPanel1.add(txtmin);
        txtmin.setBounds(160, 290, 60, 30);

        cbounidad.setBackground(new java.awt.Color(255, 255, 204));
        cbounidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "unidad", "ciento", "metro", "bolsa", "docena", "kilogramo" }));
        cbounidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbounidadActionPerformed(evt);
            }
        });
        jPanel1.add(cbounidad);
        cbounidad.setBounds(160, 220, 80, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-error.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 350, 100, 33);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/002-checked.png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 350, 100, 33);

        radalta.setBackground(new java.awt.Color(204, 204, 204));
        radalta.setText("Alta demanda");
        radalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radaltaActionPerformed(evt);
            }
        });
        jPanel1.add(radalta);
        radalta.setBounds(160, 260, 110, 23);

        rarreg.setBackground(new java.awt.Color(204, 204, 204));
        rarreg.setText("Regular");
        rarreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rarregActionPerformed(evt);
            }
        });
        jPanel1.add(rarreg);
        rarreg.setBounds(270, 260, 90, 23);

        jLabel7.setText("S/.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 180, 14, 14);

        jLabel8.setText("Codigo:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 60, 80, 14);

        txtcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodKeyTyped(evt);
            }
        });
        jPanel1.add(txtcod);
        txtcod.setBounds(160, 50, 90, 30);

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
        txtdesc.setBounds(160, 90, 250, 70);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbounidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbounidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbounidadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtcod.getText().trim().compareTo("")==0||txtdesc.getText().trim().compareTo("")==0||
           txtmin.getText().trim().compareTo("")==0
           ||txtnombre.getText().trim().compareTo("")==0||txtprecio.getText().trim().compareTo("")==0){
            JOptionPane.showMessageDialog(this,
                "Hay campos vacios","Error",
                ERROR_MESSAGE);
        }else if(txtcod.getText().length()!=5){
            JOptionPane.showMessageDialog(this,
                "El codigo debe tener 6 caracteres","Error",
                ERROR_MESSAGE);
        
        }
        else if(radalta.isSelected()==false&&rarreg.isSelected()==false)
            JOptionPane.showMessageDialog(this,
                "Elija un tipo","Error",
                ERROR_MESSAGE);
        else{
        try{
            ProductosBL prodBL=new ProductosBL();           
            String nombre=txtnombre.getText();
            String desc=txtdesc.getText();
            String id=txtcod.getText().toUpperCase();
            String unidad=cbounidad.getSelectedItem().toString().toUpperCase();
            double precio=Double.parseDouble(txtprecio.getText());
            
            int tipo;
            if(radalta.isSelected()==true)
                tipo=1;
            else tipo=0;
            int stockMin=Integer.parseInt(txtmin.getText());

            Producto product=new Producto(id, nombre, desc,precio,Medida.unidad, tipo, stockMin, stockP);
            
            prodBL.modificarProducto(product,unidad,this.id);
            JOptionPane.showMessageDialog(this, 
                  "Se modificó el producto correctamente","Aviso",
                  INFORMATION_MESSAGE);
        }catch(Exception ex){}
        this.dispose();
        
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void radaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radaltaActionPerformed
        // TODO add your handling code here:
        if(rarreg.isSelected()==true){
            radalta.setSelected(true);
            rarreg.setSelected(false);
        }
    }//GEN-LAST:event_radaltaActionPerformed

    private void rarregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rarregActionPerformed
        // TODO add your handling code here:
        if(radalta.isSelected()==true){
            rarreg.setSelected(true);
            radalta.setSelected(false);
        }
    }//GEN-LAST:event_rarregActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtnombre.getText().endsWith(" "))
            evt.consume();
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtnombre.getText().isEmpty())
            evt.consume();
        
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK && evt.getKeyChar()!=KeyEvent.VK_SPACE){
            if(txtnombre.getText().length()>=20){
                evt.consume();
            }
            if(!s1.matches("[aA-zZ]")){
                evt.consume();
                getToolkit().beep();
                JOptionPane.showMessageDialog(this,
                "Solo se admiten letras a-z","Error",
                ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK){
            if(txtcod.getText().length()>=5){
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
    }//GEN-LAST:event_txtcodKeyTyped

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

    private void txtminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtminActionPerformed

    private void txtminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK){
            if(txtmin.getText().length()>=5){
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
    }//GEN-LAST:event_txtminKeyTyped

    private void txtdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtdesc.getText().endsWith(" "))
            evt.consume();
        if(evt.getKeyChar()==KeyEvent.VK_SPACE && txtdesc.getText().isEmpty())
            evt.consume();

        String s1=String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()!=WCKeyEvent.VK_BACK && evt.getKeyChar()!=KeyEvent.VK_SPACE&&evt.getKeyChar()!=KeyEvent.VK_ENTER){
            if(txtdesc.getText().length()>=70)
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
            java.util.logging.Logger.getLogger(frmModProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmModProd dialog = new frmModProd(new javax.swing.JFrame(), true,null,null);
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
    private javax.swing.JComboBox<String> cbounidad;
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
    private javax.swing.JRadioButton radalta;
    private javax.swing.JRadioButton rarreg;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtmin;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
