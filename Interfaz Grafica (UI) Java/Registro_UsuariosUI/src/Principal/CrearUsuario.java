
 
package Principal;




public class CrearUsuario extends javax.swing.JFrame {

    Menu ventanaMenu;
    public CrearUsuario(Menu ventanaMenu) {
        this.ventanaMenu= ventanaMenu;
        initComponents();
        initComponents2();
    }
    
    public void initComponents2(){
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        InputCedula = new javax.swing.JTextField();
        LabelCedula = new javax.swing.JLabel();
        LabelNombres = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        LabelApellidos = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        InputApellidos = new javax.swing.JTextField();
        InputTelefono = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        InputDireccion = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        BotonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Crear Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        InputCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCedulaActionPerformed(evt);
            }
        });

        LabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelCedula.setText("Cedula:");

        LabelNombres.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelNombres.setText("Nombre:");

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });

        LabelApellidos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelApellidos.setText("Apellidos:");

        LabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTelefono.setText("Telefono:");

        InputTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTelefonoActionPerformed(evt);
            }
        });

        LabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelDireccion.setText("Direccion:");

        BotonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        BotonCancelar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonRegistrar.setBackground(new java.awt.Color(0, 204, 51));
        BotonRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addGap(47, 47, 47)
                .addComponent(BotonRegistrar)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelApellidos)
                    .addComponent(LabelTelefono)
                    .addComponent(LabelDireccion)
                    .addComponent(LabelNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCedula)
                    .addComponent(InputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombres)
                    .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelApellidos)
                    .addComponent(InputApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefono)
                    .addComponent(InputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDireccion)
                    .addComponent(InputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar)
                    .addComponent(BotonCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void InputCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCedulaActionPerformed

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
               dispose();
               
               this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void InputTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTelefonoActionPerformed
        
    }//GEN-LAST:event_InputTelefonoActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String cedula = InputCedula.getText();
        String telefono = InputTelefono.getText();
        String nombre = InputNombre.getText();
        String apellido = InputApellidos.getText();
        String direccion = InputDireccion.getText();
                
        Personas temp = new Personas(cedula,nombre,apellido,telefono,direccion);
        
        for(int i=0;i<this.ventanaMenu.listaPersonas.length;i++){
            
            if(!"".equals(cedula) && !"".equals(telefono) && !"".equals(nombre) && !"".equals(apellido) && !"".equals(direccion)){
                if(this.ventanaMenu.listaPersonas[i]==null){
                    this.ventanaMenu.listaPersonas[i]=temp;
                    dispose();
                    this.ventanaMenu.setVisible(true);
                    break;
                } 
            }else if (cedula.equals("") && telefono.equals("") && nombre.equals("") && apellido.equals("") && direccion.equals("")){
                
                
                BotonRegistrar.setEnabled(false);
                break;
            }
           
        }
        BotonRegistrar.setEnabled(true);
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField InputApellidos;
    private javax.swing.JTextField InputCedula;
    private javax.swing.JTextField InputDireccion;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JTextField InputTelefono;
    private javax.swing.JLabel LabelApellidos;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelNombres;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
