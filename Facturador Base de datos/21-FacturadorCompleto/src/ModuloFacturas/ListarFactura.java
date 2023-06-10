
package ModuloFacturas;

import Clases.DataBase;
import Clases.Factura;
import Clases.Factura_producto;
import Clases.Producto;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import ModuloFacturas.CargarFactura;
import java.text.SimpleDateFormat;


public class ListarFactura extends javax.swing.JFrame {

    Menu ventanaMenu;
    private JLabel etqTemporal;
    private JButton [] etqButton;
    public ListarFactura(Menu ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
       
        initComponents();
        initAlternComponents();
        
    }

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        Mostrar.setLayout( new BoxLayout(Mostrar, BoxLayout.Y_AXIS) );
        Mostrar.setBackground(Color.WHITE);
        ListarFacturas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Facturas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 500));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MostrarLayout = new javax.swing.GroupLayout(Mostrar);
        Mostrar.setLayout(MostrarLayout);
        MostrarLayout.setHorizontalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        MostrarLayout.setVerticalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(Mostrar);

        BotonVolver.setBackground(new java.awt.Color(51, 51, 255));
        BotonVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("VOLVER");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        dispose();
        this.ventanaMenu.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

   
    public void ListarFacturas(){
          Factura [] factura=this.ventanaMenu.database.MostrarFacturas();
          etqButton=new JButton[factura.length];
          for(int i=0;i<factura.length;i++){
              if(factura[i]!=null){
                etqTemporal = new JLabel("#Factura:"+factura[i].getId_factura()+"   "+"Fecha: "+factura[i].getFecha()+"   "+"Total: "+factura[i].getTotal());
                etqButton[i]= new JButton("Mostrar Detalles");
                etqTemporal.setFont(new Font("Arial", Font.PLAIN, 17));
                etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                Mostrar.add(etqTemporal);
                Mostrar.add(etqButton[i]);
                
                
                int posicion =i;
                
                etqButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DataBase base = new DataBase();
                    Factura_producto listado[]= base.productos(factura[posicion].getId_factura());
                    
                    System.out.println("Posición del botón clikeado: " + posicion);
                    
                    String total=String.valueOf(factura[posicion].getTotal());
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    String fecha=formato.format(factura[posicion].getFecha());
                    
                    
                    
                    CargarFactura pagina = new CargarFactura(factura[posicion].getCedula_cliente(), factura[posicion].getCedula_vendedor(), total,listado, fecha, factura[posicion].getId_factura());
                    
                    pagina.setVisible(true);
                    
                    
                    
                }
            });
       

            }else{
                break;
            }


        }
    }
    
    
   
    
    

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel Mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
