
package Principal;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Menu extends javax.swing.JFrame {

    Personas listaPersonas[];
    Vendedores listaVendedores[];
    Productos listaProductos[];
    int total;
    public Menu() {
        this.listaPersonas=new Personas[100];
        this.listaVendedores=new Vendedores[100];      
        this.listaProductos=new Productos[100];
        this.total=0;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelConMenu = new javax.swing.JPanel();
        ContClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CrearCliente = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();
        ContVendedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ContFacturas = new javax.swing.JPanel();
        BotonCrearFac = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        InputId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        InputCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarTodo = new javax.swing.JTextArea();
        LabelTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        InputDinero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setText("Facturador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panelConMenu.setBackground(new java.awt.Color(255, 255, 255));

        ContClientes.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Cliente");

        CrearCliente.setBackground(new java.awt.Color(0, 0, 0));
        CrearCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        CrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        CrearCliente.setText("Crear");
        CrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearClienteActionPerformed(evt);
            }
        });

        BotonModificar.setBackground(new java.awt.Color(0, 0, 0));
        BotonModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setBackground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonListar.setBackground(new java.awt.Color(0, 0, 0));
        BotonListar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonListar.setForeground(new java.awt.Color(255, 255, 255));
        BotonListar.setText("Listar clientes");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContClientesLayout = new javax.swing.GroupLayout(ContClientes);
        ContClientes.setLayout(ContClientesLayout);
        ContClientesLayout.setHorizontalGroup(
            ContClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContClientesLayout.createSequentialGroup()
                .addGroup(ContClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContClientesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(ContClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ContClientesLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        ContClientesLayout.setVerticalGroup(
            ContClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContClientesLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CrearCliente)
                .addGap(18, 18, 18)
                .addComponent(BotonModificar)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminar)
                .addGap(18, 18, 18)
                .addComponent(BotonListar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        ContVendedor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("Vendedor");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Crear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Listar Vendedores");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContVendedorLayout = new javax.swing.GroupLayout(ContVendedor);
        ContVendedor.setLayout(ContVendedorLayout);
        ContVendedorLayout.setHorizontalGroup(
            ContVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContVendedorLayout.createSequentialGroup()
                .addGroup(ContVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContVendedorLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(ContVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ContVendedorLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        ContVendedorLayout.setVerticalGroup(
            ContVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContVendedorLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        ContFacturas.setBackground(new java.awt.Color(204, 204, 204));

        BotonCrearFac.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        BotonCrearFac.setText("Productos");

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Crear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Eliminar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Listar Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContFacturasLayout = new javax.swing.GroupLayout(ContFacturas);
        ContFacturas.setLayout(ContFacturasLayout);
        ContFacturasLayout.setHorizontalGroup(
            ContFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContFacturasLayout.createSequentialGroup()
                .addGroup(ContFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContFacturasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BotonCrearFac))
                    .addGroup(ContFacturasLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(ContFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        ContFacturasLayout.setVerticalGroup(
            ContFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContFacturasLayout.createSequentialGroup()
                .addComponent(BotonCrearFac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(22, 22, 22)
                .addComponent(jButton11)
                .addGap(84, 84, 84))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Id");

        InputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIdActionPerformed(evt);
            }
        });
        InputId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputIdKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad");

        MostrarTodo.setEditable(false);
        MostrarTodo.setColumns(20);
        MostrarTodo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        MostrarTodo.setRows(5);
        jScrollPane1.setViewportView(MostrarTodo);

        LabelTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LabelTotal.setText("Total:");

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        InputDinero.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputDinero)
                .addGap(103, 103, 103))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(InputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(InputCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(InputDinero))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelConMenuLayout = new javax.swing.GroupLayout(panelConMenu);
        panelConMenu.setLayout(panelConMenuLayout);
        panelConMenuLayout.setHorizontalGroup(
            panelConMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelConMenuLayout.createSequentialGroup()
                        .addComponent(ContClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ContVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ContFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConMenuLayout.setVerticalGroup(
            panelConMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearClienteActionPerformed
        CrearCliente ventanaMenu=new CrearCliente(this);
        setVisible(false);
        ventanaMenu.setVisible(true);
        
    }//GEN-LAST:event_CrearClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       CrearVendedor crearven = new CrearVendedor(this);
        setVisible(false);
        crearven.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        CrearProducto crear = new CrearProducto(this);
        setVisible(false);
        crear.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        MostrarCliente mostrar = new MostrarCliente(this);
        setVisible(false);
        mostrar.setVisible(true);
    }//GEN-LAST:event_BotonListarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        ModificarCliente modificar = new ModificarCliente(this);
        setVisible(false);
        modificar.setVisible(true);
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
           EliminarCliente eliminar = new EliminarCliente(this);
           setVisible(false);
           eliminar.setVisible(true);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MostrarVendedor mostrar = new MostrarVendedor(this);
        setVisible(false);
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ModificarVendedor modven= new ModificarVendedor(this);
        setVisible(false);
        modven.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        EliminarVendedor eliminar= new EliminarVendedor(this);
        setVisible(false);
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarProductos mostrar = new MostrarProductos(this);
        setVisible(false);
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIdActionPerformed
           
    }//GEN-LAST:event_InputIdActionPerformed

    private void InputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputIdKeyPressed
        InputId.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                


                String texto = InputId.getText();
                System.out.println("Buscando: "+texto);

                for(int i =0;i<listaProductos.length;i++){
                    if(listaProductos[i]!=null && texto.equals(listaProductos[i].getId())){
                        InputNombre.setText(listaProductos[i].getNombre());
                    }
                }
            }
        });
    }//GEN-LAST:event_InputIdKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.factura();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EliminarProducto eliminar = new EliminarProducto(this);
        setVisible(false);
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void factura(){
         int cantidad= Integer.parseInt(InputCantidad.getText());
         String nombre= InputNombre.getText();
         int subtotal=0;
         
         for(int i =0;i<this.listaProductos.length;i++){
             if(this.listaProductos[i]!=null && nombre.equals(this.listaProductos[i].getNombre())){
                 if(cantidad<=Integer.parseInt(this.listaProductos[i].getCant())){
                    String id=InputId.getText();
                    String cantidades= InputCantidad.getText();
                    subtotal=Integer.parseInt(cantidades)*Integer.parseInt(this.listaProductos[i].getPrecio());
                    
                    String mostrar=id+"--"+nombre+"--"+cantidades+"--"+"$"+subtotal+"\n";
                    total=total+subtotal;
                    String todo= String.valueOf(total);
                    InputDinero.setText(todo);
                    this.MostrarTodo.append(mostrar);
                    int rest_cant= Integer.parseInt(this.listaProductos[i].getCant())-cantidad;
                    String menos_cant=String.valueOf(rest_cant);
                    this.listaProductos[i].setCant(menos_cant);
                 }else{
                     System.out.print("No hay");
                 }
             }
         }
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCrearFac;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JPanel ContClientes;
    private javax.swing.JPanel ContFacturas;
    private javax.swing.JPanel ContVendedor;
    private javax.swing.JButton CrearCliente;
    private javax.swing.JTextField InputCantidad;
    private javax.swing.JLabel InputDinero;
    private javax.swing.JTextField InputId;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTextArea MostrarTodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelConMenu;
    // End of variables declaration//GEN-END:variables
}
