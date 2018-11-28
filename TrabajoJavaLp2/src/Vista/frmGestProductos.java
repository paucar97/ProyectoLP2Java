/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaDeNegocio.ProductosBL;
import static Vista.frmPanel.contador;
import static Vista.frmPanel.i;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class frmGestProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmGestProductos
     */
    public Producto producto;
    public frmGestProductos() {
        producto=new Producto();
        BasicInternalFrameUI basic=((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener:basic.getNorthPane().getMouseListeners()){
            basic.getNorthPane().removeMouseListener(listener);
        }
        initComponents();
        jCod.setSelected(true);
        ArrayList<Producto>productos=new ArrayList<Producto>();
        ProductosBL productoBL=new ProductosBL();
        
        DefaultTableModel model=(DefaultTableModel) tblProd.getModel();
        try{
            productos=productoBL.listarProductos();
            Object rowData[]=new Object[8];
            for(int i=0;i<productos.size();i++){
                rowData[0]=productos.get(i).getCodigo();
                rowData[1]=productos.get(i).getNombre();
                rowData[2]=productos.get(i).getDescripcion();
                rowData[3]=productos.get(i).getPrecio();
                rowData[4]=productos.get(i).getUm();
                rowData[5]=productos.get(i).getTipo();
                rowData[6]=productos.get(i).getStock();
                rowData[7]=productos.get(i).getMinimoStock();    
                model.addRow(rowData);
            }
        }catch (Exception e){
           System.out.println("Error de bd");
        }
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        jCod = new javax.swing.JRadioButton();
        jNomb = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 680));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/008-settings.png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-error.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/015-search.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setText("...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));

        tblProd=new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblProd.setBackground(new java.awt.Color(255, 255, 204));
        tblProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Precio", "U. Medida", "Tipo", "Stock", "Stock Minimo"
            }
        ));
        tblProd.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProd);

        jCod.setBackground(new java.awt.Color(204, 204, 204));
        jCod.setText("Codigo");
        jCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodActionPerformed(evt);
            }
        });

        jNomb.setBackground(new java.awt.Color(204, 204, 204));
        jNomb.setText("Nombre");
        jNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/png3/004-error.png"))); // NOI18N
        btnCancelar.setText("Regresar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNomb)))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCod)
                    .addComponent(jNomb))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmAddProd prod=new frmAddProd(null, true);
        prod.setVisible(true);
        if(prod.isVisible()==false){
//            JOptionPane.showConfirmDialog(this,"cerro","Aviso",WARNING_MESSAGE);
            DefaultTableModel model=(DefaultTableModel)tblProd.getModel();
            model.setRowCount(0);
            ProductosBL prodBL=new ProductosBL();
            ArrayList<Producto>productos=new ArrayList<Producto>();
            try{
            productos=prodBL.listarProductos();
            Object rowData[]=new Object[8];
            for(int i=0;i<productos.size();i++){
                rowData[0]=productos.get(i).getCodigo();
                rowData[1]=productos.get(i).getNombre();
                rowData[2]=productos.get(i).getDescripcion();
                rowData[3]=productos.get(i).getPrecio();
                rowData[4]=productos.get(i).getUm();
                rowData[5]=productos.get(i).getTipo();
                rowData[6]=productos.get(i).getStock();
                rowData[7]=productos.get(i).getMinimoStock();    
                model.addRow(rowData);
            }
        }catch (Exception e){
           System.out.println("Error de bd");
        }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row;
        if(tblProd.getSelectedRow()!=-1){
            row = tblProd.getSelectedRow();
            String cod=tblProd.getModel().getValueAt(row,0).toString();
            String nombre=tblProd.getModel().getValueAt(row,1).toString();
            String desc=tblProd.getModel().getValueAt(row,2).toString();
            double precio=Double.parseDouble(tblProd.getModel().getValueAt(row,3).toString());
            String unidad=tblProd.getModel().getValueAt(row,4).toString();
            int tipo=Integer.parseInt(tblProd.getModel().getValueAt(row,5).toString());
            int stock=Integer.parseInt(tblProd.getModel().getValueAt(row,6).toString());
            int stockMin=Integer.parseInt(tblProd.getModel().getValueAt(row,7).toString());

            producto.setCodigo(cod);
            producto.setNombre(nombre);
            producto.setDescripcion(desc);
            producto.setPrecio(precio);
            producto.setTipo(tipo);
            producto.setStock(stock);
            producto.setMinimoStock(stockMin);

            frmModProd prod=new frmModProd(null,true,producto,unidad);
            prod.setVisible(true);

            if(prod.isVisible()==false){
    //            JOptionPane.showConfirmDialog(this,"cerro","Aviso",WARNING_MESSAGE);
                DefaultTableModel model=(DefaultTableModel)tblProd.getModel();
                model.setRowCount(0);
                ProductosBL prodBL=new ProductosBL();
                ArrayList<Producto>productos=new ArrayList<Producto>();
                try{
                productos=prodBL.listarProductos();
                Object rowData[]=new Object[8];
                for(int i=0;i<productos.size();i++){
                    rowData[0]=productos.get(i).getCodigo();
                    rowData[1]=productos.get(i).getNombre();
                    rowData[2]=productos.get(i).getDescripcion();
                    rowData[3]=productos.get(i).getPrecio();
                    rowData[4]=productos.get(i).getUm();
                    rowData[5]=productos.get(i).getTipo();
                    rowData[6]=productos.get(i).getStock();
                    rowData[7]=productos.get(i).getMinimoStock();    
                    model.addRow(rowData);
                }
            }catch (Exception e){
               System.out.println("Error de bd");
            }
        }
    }else        JOptionPane.showMessageDialog(this,"Seleccione el producto","Advertencia",WARNING_MESSAGE);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tblProd.getSelectedRow()!=-1){
        int resultado=JOptionPane.showConfirmDialog(null,"¿Seguro que desea eliminar el producto?");
        if(resultado==JOptionPane.YES_OPTION){
            int column=0;
            int row=tblProd.getSelectedRow();
            String id=tblProd.getModel().getValueAt(row, column).toString();
            ProductosBL prodBL=new ProductosBL();
            try{
                prodBL.eliminarProducto(id);
            }catch(Exception ex){
                System.out.println(ex);
            }
            DefaultTableModel model=(DefaultTableModel)tblProd.getModel();
            model.setRowCount(0);
            
            ArrayList<Producto>productos=new ArrayList<Producto>();
            try{
            productos=prodBL.listarProductos();
            Object rowData[]=new Object[8];
            for(int i=0;i<productos.size();i++){
                rowData[0]=productos.get(i).getCodigo();
                rowData[1]=productos.get(i).getNombre();
                rowData[2]=productos.get(i).getDescripcion();
                rowData[3]=productos.get(i).getPrecio();
                rowData[4]=productos.get(i).getUm();
                rowData[5]=productos.get(i).getTipo();
                rowData[6]=productos.get(i).getStock();
                rowData[7]=productos.get(i).getMinimoStock();    
                model.addRow(rowData);
            }
        }catch (Exception e){
           System.out.println("Error de bd");
        }
        }
        }else JOptionPane.showMessageDialog(this,"Seleccione el producto","Advertencia",WARNING_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:

        if(i==0)
        jTextField1.setText("");
        i++;
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodActionPerformed
        // TODO add your handling code here:
        if(jNomb.isSelected()==true){
            jCod.setSelected(true);
            jNomb.setSelected(false);
        }
    }//GEN-LAST:event_jCodActionPerformed

    private void jNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombActionPerformed
        // TODO add your handling code here:
        if(jCod.isSelected()==true){
            jNomb.setSelected(true);
            jCod.setSelected(false);
        }
    }//GEN-LAST:event_jNombActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        contador--;
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            ArrayList<Producto>listaBusq=new ArrayList<Producto>();
            ArrayList<Producto>productos=new ArrayList<Producto>();
            ProductosBL productoBL=new ProductosBL();
            productos=productoBL.listarProductos();
            DefaultTableModel model=(DefaultTableModel) tblProd.getModel();

            String criterio;
            criterio=jTextField1.getText().toString().trim();
            if(jTextField1.getText().isEmpty()){
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<productos.size();i++){
                    rowData[0]=productos.get(i).getCodigo();
                    rowData[1]=productos.get(i).getNombre();
                    rowData[2]=productos.get(i).getDescripcion();
                    rowData[3]=productos.get(i).getPrecio();
                    rowData[4]=productos.get(i).getUm();
                    rowData[5]=productos.get(i).getTipo();
                    rowData[6]=productos.get(i).getStock();
                    rowData[7]=productos.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
            if(jCod.isSelected()){
                criterio=criterio.toUpperCase();
                for(int i=0;i<productos.size();i++){
                    if(productos.get(i).getCodigo().contains(criterio)){
                        Producto prod=new Producto();
                        prod=productos.get(i);
                        listaBusq.add(prod);
                    }
                }
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<listaBusq.size();i++){
                    rowData[0]=listaBusq.get(i).getCodigo();
                    rowData[1]=listaBusq.get(i).getNombre();
                    rowData[2]=listaBusq.get(i).getDescripcion();
                    rowData[3]=listaBusq.get(i).getPrecio();
                    rowData[4]=listaBusq.get(i).getUm();
                    rowData[5]=listaBusq.get(i).getTipo();
                    rowData[6]=listaBusq.get(i).getStock();
                    rowData[7]=listaBusq.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
            if(jNomb.isSelected()){
                for(int i=0;i<productos.size();i++){
                    if(productos.get(i).getNombre().contains(criterio)){
                        Producto prod=new Producto();
                        prod=productos.get(i);
                        listaBusq.add(prod);
                    }
                }
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<listaBusq.size();i++){
                    rowData[0]=listaBusq.get(i).getCodigo();
                    rowData[1]=listaBusq.get(i).getNombre();
                    rowData[2]=listaBusq.get(i).getDescripcion();
                    rowData[3]=listaBusq.get(i).getPrecio();
                    rowData[4]=listaBusq.get(i).getUm();
                    rowData[5]=listaBusq.get(i).getTipo();
                    rowData[6]=listaBusq.get(i).getStock();
                    rowData[7]=listaBusq.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try{
            ArrayList<Producto>listaBusq=new ArrayList<Producto>();
            ArrayList<Producto>productos=new ArrayList<Producto>();
            ProductosBL productoBL=new ProductosBL();
            productos=productoBL.listarProductos();
            DefaultTableModel model=(DefaultTableModel) tblProd.getModel();

            String criterio;
            criterio=jTextField1.getText().toString().trim();
            if(jTextField1.getText().isEmpty()){
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<productos.size();i++){
                    rowData[0]=productos.get(i).getCodigo();
                    rowData[1]=productos.get(i).getNombre();
                    rowData[2]=productos.get(i).getDescripcion();
                    rowData[3]=productos.get(i).getPrecio();
                    rowData[4]=productos.get(i).getUm();
                    rowData[5]=productos.get(i).getTipo();
                    rowData[6]=productos.get(i).getStock();
                    rowData[7]=productos.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
            if(jCod.isSelected()){
                criterio=criterio.toUpperCase();
                for(int i=0;i<productos.size();i++){
                    if(productos.get(i).getCodigo().contains(criterio)){
                        Producto prod=new Producto();
                        prod=productos.get(i);
                        listaBusq.add(prod);
                    }
                }
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<listaBusq.size();i++){
                    rowData[0]=listaBusq.get(i).getCodigo();
                    rowData[1]=listaBusq.get(i).getNombre();
                    rowData[2]=listaBusq.get(i).getDescripcion();
                    rowData[3]=listaBusq.get(i).getPrecio();
                    rowData[4]=listaBusq.get(i).getUm();
                    rowData[5]=listaBusq.get(i).getTipo();
                    rowData[6]=listaBusq.get(i).getStock();
                    rowData[7]=listaBusq.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
            if(jNomb.isSelected()){
                for(int i=0;i<productos.size();i++){
                    if(productos.get(i).getNombre().contains(criterio)){
                        Producto prod=new Producto();
                        prod=productos.get(i);
                        listaBusq.add(prod);
                    }
                }
                model.setRowCount(0);
                Object rowData[]=new Object[8];
                for(int i=0;i<listaBusq.size();i++){
                    rowData[0]=listaBusq.get(i).getCodigo();
                    rowData[1]=listaBusq.get(i).getNombre();
                    rowData[2]=listaBusq.get(i).getDescripcion();
                    rowData[3]=listaBusq.get(i).getPrecio();
                    rowData[4]=listaBusq.get(i).getUm();
                    rowData[5]=listaBusq.get(i).getTipo();
                    rowData[6]=listaBusq.get(i).getStock();
                    rowData[7]=listaBusq.get(i).getMinimoStock();   
                    model.addRow(rowData);
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JRadioButton jCod;
    private javax.swing.JRadioButton jNomb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
}
