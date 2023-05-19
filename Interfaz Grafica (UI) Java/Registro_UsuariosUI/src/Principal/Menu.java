package Principal;


public class Menu extends javax.swing.JFrame {

    Personas listaPersonas[];
    public Menu() {
        this.listaPersonas=new Personas[100];
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
        ContentMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContentPrincipal = new javax.swing.JPanel();
        BotonCrearUsuario = new javax.swing.JButton();
        BotonEliminarUsuario = new javax.swing.JButton();
        BotonModificarUsuario = new javax.swing.JButton();
        BotonListarUsuario = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ContentMenu.setBackground(new java.awt.Color(153, 0, 51));
        ContentMenu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        javax.swing.GroupLayout ContentMenuLayout = new javax.swing.GroupLayout(ContentMenu);
        ContentMenu.setLayout(ContentMenuLayout);
        ContentMenuLayout.setHorizontalGroup(
            ContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentMenuLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentMenuLayout.setVerticalGroup(
            ContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentMenuLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        ContentPrincipal.setBackground(new java.awt.Color(153, 0, 0));

        BotonCrearUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonCrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearUsuario.setText("Crear Usuario");
        BotonCrearUsuario.setFocusable(false);
        BotonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearUsuarioActionPerformed(evt);
            }
        });

        BotonEliminarUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarUsuario.setText("Eliminar Usuario");
        BotonEliminarUsuario.setFocusable(false);
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });

        BotonModificarUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificarUsuario.setText("Modificar Usuario");
        BotonModificarUsuario.setFocusable(false);
        BotonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarUsuarioActionPerformed(evt);
            }
        });

        BotonListarUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonListarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonListarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonListarUsuario.setText("Listar Usuario");
        BotonListarUsuario.setFocusable(false);
        BotonListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentPrincipalLayout = new javax.swing.GroupLayout(ContentPrincipal);
        ContentPrincipal.setLayout(ContentPrincipalLayout);
        ContentPrincipalLayout.setHorizontalGroup(
            ContentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPrincipalLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(ContentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        ContentPrincipalLayout.setVerticalGroup(
            ContentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BotonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarUsuarioActionPerformed
        ModificarPersona modificar = new ModificarPersona(this);
        setVisible(false);
        modificar.setVisible(true);
    }//GEN-LAST:event_BotonModificarUsuarioActionPerformed

    private void BotonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearUsuarioActionPerformed
        CrearUsuario ventana = new CrearUsuario(this);
        setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_BotonCrearUsuarioActionPerformed

    private void BotonListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarUsuarioActionPerformed
        ListaUsuarios mostrar_todo = new ListaUsuarios(this);
        setVisible(false);
        mostrar_todo.setVisible(true);
    }//GEN-LAST:event_BotonListarUsuarioActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
        Eliminar borrar = new Eliminar(this);
        setVisible(false);
        borrar.setVisible(true);
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed
    
    
    
    public static void main(String args[]) {
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearUsuario;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JButton BotonListarUsuario;
    private javax.swing.JButton BotonModificarUsuario;
    private javax.swing.JPanel ContentMenu;
    private javax.swing.JPanel ContentPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
