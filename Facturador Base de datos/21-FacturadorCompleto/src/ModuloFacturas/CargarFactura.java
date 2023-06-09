
package ModuloFacturas;

import Clases.Factura_producto;
import Principal.Menu;
import java.util.Date;

public class CargarFactura extends javax.swing.JFrame {

     String cedula_cli;
     String cedula_ven;
     String total;
     Factura_producto listado[];
     String fecha;
     String id_factu;
     
    public CargarFactura(String cedula_cli, String cedula_ven, String total, Factura_producto listado[], String fecha, String id_factu) {
        this.cedula_cli=cedula_cli;
        this.cedula_ven=cedula_ven;
        this.total=total;
        this.listado= listado;
        this.fecha=fecha;
        this.id_factu=id_factu;
        initComponents();
        init2();
        this.asignarProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNumFactu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        InputCedulaCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputCedulaVendedor = new javax.swing.JTextField();
        LabelTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarProductos = new javax.swing.JTextArea();
        BotonVolver = new javax.swing.JButton();
        LabelFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        LabelNumFactu.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LabelNumFactu.setForeground(new java.awt.Color(255, 255, 255));
        LabelNumFactu.setText("#Factura:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(LabelNumFactu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(LabelNumFactu)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Cedula cliente:");

        InputCedulaCliente.setEditable(false);
        InputCedulaCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Cedula vendedor:");

        InputCedulaVendedor.setEditable(false);
        InputCedulaVendedor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        LabelTotal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LabelTotal.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setText("Productos");

        MostrarProductos.setEditable(false);
        MostrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        MostrarProductos.setColumns(20);
        MostrarProductos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        MostrarProductos.setRows(5);
        jScrollPane1.setViewportView(MostrarProductos);

        BotonVolver.setBackground(new java.awt.Color(51, 0, 255));
        BotonVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(204, 204, 204));
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        LabelFecha.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LabelFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(LabelFecha)))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InputCedulaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(LabelTotal))
                                    .addComponent(InputCedulaCliente)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel5)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InputCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(InputCedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(LabelFecha))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed
    
    private void init2(){
         setLocationRelativeTo(null);
    }
    
    private void asignarProductos(){
        this.InputCedulaCliente.setText(cedula_cli);
        this.InputCedulaVendedor.setText(cedula_ven);
        this.LabelTotal.setText("Total: "+total);
        this.LabelFecha.setText(fecha);
        this.LabelNumFactu.setText("ID Factura: "+id_factu);
        
        
        for(int i =0;i<this.listado.length;i++){
            if(this.listado[i]!=null){
                Factura_producto tempo= this.listado[i];
                String captura = "ID Producto: "+tempo.getId_producto()+" --- "+"Cantidad: "+tempo.getCantidad()+" --- "+"Subtotal: "+tempo.getSubtotal()+"\n";
                this.MostrarProductos.append(captura);
            }
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField InputCedulaCliente;
    private javax.swing.JTextField InputCedulaVendedor;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelNumFactu;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTextArea MostrarProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
