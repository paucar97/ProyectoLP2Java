/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.Almacen;
import modelo.Medida;
import modelo.Producto;

/**
 *
 * @author alulab14
 */
public class fmrMovimientoAlmacen extends javax.swing.JDialog {

    /**
     * Creates new form fmrMovimientoAlmacen
     */
    public fmrMovimientoAlmacen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        ArrayList<Producto> productos=new ArrayList<Producto>();
        initComponents();
        
        DefaultTableModel model=(DefaultTableModel) jTable3.getModel();
        try{
            productos=listarProductos();
            Object rowData[]=new Object[8];
            for(int i=0;i<productos.size();i++){
                rowData[0]=productos.get(i).getCodigo();
                rowData[1]=productos.get(i).getNombre();
                rowData[2]=productos.get(i).getStock();
                model.addRow(rowData);
            }
        }catch (Exception e){
            System.out.println("Error de bd");
        }
        
        ArrayList<Almacen> almacenes=new ArrayList<Almacen>();        
        try{
            almacenes=listarAlmacenes();
            for(Almacen almacen:almacenes){
                jComboBox1.addItem(almacen.getDireccion());
            }
        }catch (Exception e){
            System.out.println("Error de bd");
        }
    }
public ArrayList<Almacen> listarAlmacenes()throws Exception{
        ArrayList<Almacen> almacenes=new ArrayList<Almacen>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
            Statement cadena=con.createStatement();
            String sql="SELECT * FROM n_almacen";
            ResultSet rs=cadena.executeQuery(sql);
            Medida med;
            while(rs.next()){
                int codigo=rs.getInt("id_almacen");
                String direccion=rs.getString("direccion");
                int num = rs.getInt("numProdDif");
                Almacen almacen=new Almacen(codigo,direccion,num);
                almacenes.add(almacen);
               
            }
            con.close();
       
        return almacenes;
    
    }
public ArrayList<Producto> listarProductos()throws Exception{
        ArrayList<Producto> productos=new ArrayList<Producto>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
            Statement cadena=con.createStatement();
            String sql="SELECT * FROM n_producto";
            ResultSet rs=cadena.executeQuery(sql);
            Medida med;
            while(rs.next()){
                String codigo=rs.getString("id_producto");
                String nombre=rs.getString("nombre");
                double precio=rs.getFloat("precio");
                String desc=rs.getString("descripcion");
                int stock=rs.getInt("stock");
                int tipo=rs.getInt("tipo");
                int stockMin=rs.getInt("stokcMinimo");
                String unidad=rs.getString("UnidMedida");
            
                
                if(unidad.compareTo("UNIDAD")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.unidad,tipo,stockMin,stock);
                    productos.add(prod);
                }else if(unidad.compareTo("CENTENA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.centena,tipo,stockMin,stock);
                    productos.add(prod);
                }else if(unidad.compareTo("METRO")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.metro,tipo,stockMin,stock);
                    productos.add(prod);
                }else if(unidad.compareTo("BOLSA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.bolsa,tipo,stockMin,stock);
                    productos.add(prod);
                }else if(unidad.compareTo("DOCENA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.docena,tipo,stockMin,stock);
                    productos.add(prod);
                }else if(unidad.compareTo("KILOGRAMO")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.kilogramo,tipo,stockMin,stock);
                    productos.add(prod);
                }            
            }
            con.close();
       
        return productos;
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimiento de Almacenes");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 122, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Elija el almacén:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 228, -1));

        jLabel2.setText("Elija el Filtro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 20));

        jRadioButton1.setBackground(new java.awt.Color(0, 122, 204));
        jRadioButton1.setText("ID");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 122, 204));
        jRadioButton2.setText("Nombre");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 122, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/015-search.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 50, 70, -1));

        jTextField1.setText("...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 125, -1));

        jTable3.setBackground(new java.awt.Color(255, 255, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 296, 200));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Coloque el aumento/decremento de stock:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 20));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 60, -1));

        jButton2.setBackground(new java.awt.Color(0, 122, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-error.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 95, 35));

        jButton1.setBackground(new java.awt.Color(0, 122, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/003-plus.png"))); // NOI18N
        jButton1.setText("Modificar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 109, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
                  "Se modificó el stock","Aviso",
                  INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()==true){
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()==true){
            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(fmrMovimientoAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrMovimientoAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrMovimientoAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrMovimientoAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fmrMovimientoAlmacen dialog = new fmrMovimientoAlmacen(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
