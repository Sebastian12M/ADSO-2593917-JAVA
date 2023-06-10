
package ModuloUsuarios;
import Principal.Menu;
import Clases.Persona;
import Clases.Producto;
import Principal.Alert;
public class EliminarUsuario extends javax.swing.JFrame {

    Menu ventanaMenu;
    String titulo;
    public EliminarUsuario(Menu ventanaMenu, String titulo) {
        this.ventanaMenu=ventanaMenu;
        this.titulo=titulo;
        initComponents();
        init2();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelCedula = new javax.swing.JLabel();
        InputCedula = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarDatos = new javax.swing.JTextArea();
        BotonCerrar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        LabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("ELIMINAR PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTitulo)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(LabelTitulo)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        LabelCedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelCedula.setText("Cedula");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        MostrarDatos.setColumns(20);
        MostrarDatos.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        MostrarDatos.setRows(5);
        jScrollPane1.setViewportView(MostrarDatos);

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

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
                        .addGap(59, 59, 59)
                        .addComponent(LabelCedula)
                        .addGap(18, 18, 18)
                        .addComponent(InputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(BotonBuscar)
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCedula)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_BotonCerrarActionPerformed
    
    private void init2(){
         setLocationRelativeTo(null);
         this.LabelTitulo.setText("ELIMINAR "+this.titulo);
         if(this.titulo.equals("PRODUCTO")){
             this.LabelCedula.setText("ID");
         }
    }
    
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
       String cedula =InputCedula.getText();
       
       if(!this.titulo.equals("PRODUCTO")){
            Persona temporal =(this.titulo.equalsIgnoreCase("CLIENTES"))?this.ventanaMenu.database.buscarCliente(cedula):this.ventanaMenu.database.buscarVendedor(cedula);
            if (temporal != null){
                String nombre=temporal.getNombres();
                String apellido=temporal.getApellidos();
                String datos=nombre+"----"+apellido;
                System.out.print(temporal);
                MostrarDatos.setText(datos);
                
            }else{
                Alert alerta = new Alert("NO EXISTE", "La cedula no esta registrada.", "error");
            }
       }
       
      
       if(this.titulo.equals("PRODUCTO")){
           Producto producto= this.ventanaMenu.database.buscarProducto(cedula);
            String nombre=producto.getNombre();
            String precio= String.valueOf(producto.getPrecio() );
            String datos=nombre+"----"+precio;
            
            MostrarDatos.setText(datos); 
       }
       
       
       
       
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        String cedula=InputCedula.getText();
        if(titulo.equalsIgnoreCase("CLIENTES")){
            this.ventanaMenu.database.EliminarCliente(cedula);
        }else if(titulo.equalsIgnoreCase("VENDEDOR")){
            this.ventanaMenu.database.EliminarVendedor(cedula);
        }else if(titulo.equalsIgnoreCase("PRODUCTO")){
            this.ventanaMenu.database.EliminarProducto(cedula);
        }
            
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_BotonEliminarActionPerformed
    
    //public boolean buscar(){
      
     // this.ventanaMenu.database.buscarCliente(cedula);
      
    //}
       
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JTextField InputCedula;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextArea MostrarDatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
