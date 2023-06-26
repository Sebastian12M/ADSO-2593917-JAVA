
package ModuloNotas;

import BD.DataBase;
import BD.Estudiantes;
import BD.Profesor;
import Menu.MenuProfesor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class ListarEstudiantes extends javax.swing.JFrame {

    DataBase database = new DataBase();
    private JButton [] etqButton;
    private JButton [] etqButton2;
    private JLabel etqTemporal;
    private JLabel etqTemporal2;
    private Profesor profe;
    private MenuProfesor menu;
    public ListarEstudiantes(Profesor profe, MenuProfesor menu) {
        this.profe=profe;
        this.menu=menu;
        initComponents();
        init2();
    }

    public void init2(){
        setLocationRelativeTo(null);
        mostrarTodos();
        MostrarTodo.setLayout( new BoxLayout(MostrarTodo, BoxLayout.Y_AXIS) );
        MostrarTodo.setBackground(Color.WHITE);
        
    }
    public void mostrarTodos(){
        Estudiantes [] estudiantes=database.mostrarEstudiantes();
          etqButton=new JButton[estudiantes.length];
          etqButton2=new JButton[estudiantes.length];
          
            for(int i=0;i<estudiantes.length;i++){
                if(estudiantes[i]!=null){
                    etqTemporal = new JLabel("Cedula: "+estudiantes[i].getCedula()+"   "+"Nombre: "+estudiantes[i].getNombre()+"   "+"Apellido: "+estudiantes[i].getApellido());
                    etqButton[i]= new JButton("Asignar Notas");
                    etqTemporal2 = new JLabel("-----------------------------------------------------------------------------------------------------------------");
                    etqTemporal.setFont(new Font("Source Han Sans Cn Bold", Font.PLAIN, 17));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    MostrarTodo.add(etqTemporal);
                    MostrarTodo.add(etqButton[i]);
                    MostrarTodo.add(etqTemporal2);
                    int posicion =i;
                    
                    
                    
                    etqButton[i].addActionListener(new ActionListener() {
                    @Override
                        public void actionPerformed(ActionEvent e) {
                        Double matematicas[]=database.Matematicas(estudiantes[posicion].getCedula());
                        Double espaniol[]=database.espaniol(estudiantes[posicion].getCedula());
                        Double informatica[]=database.informatica(estudiantes[posicion].getCedula());
                        
                        
                        
                        AsignarNotas notas = new AsignarNotas(estudiantes[posicion].getNombre(), matematicas,espaniol,informatica, estudiantes[posicion].getCedula(),profe,ListarEstudiantes.this);
                        dispose();
                        notas.setVisible(true);
                        System.out.print(estudiantes[posicion].getNombre());
                    
                        }
                    });
                
                }else{
                    break;
                }
            }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarTodo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Source Han Sans CN Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Notas de estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BotonVolver.setFont(new java.awt.Font("Source Han Sans CN Bold", 1, 14)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        MostrarTodo.setFont(new java.awt.Font("Source Han Sans CN Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout MostrarTodoLayout = new javax.swing.GroupLayout(MostrarTodo);
        MostrarTodo.setLayout(MostrarTodoLayout);
        MostrarTodoLayout.setHorizontalGroup(
            MostrarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        MostrarTodoLayout.setVerticalGroup(
            MostrarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(MostrarTodo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(BotonVolver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonVolver)
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
       dispose();
       this.menu.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel MostrarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
