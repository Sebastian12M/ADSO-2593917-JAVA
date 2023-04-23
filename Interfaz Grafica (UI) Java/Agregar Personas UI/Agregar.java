import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Agregar extends JFrame{
    public int cont;
    public String mostrar_nombres [];

    public Agregar(){
        this.cont=0;
        this.mostrar_nombres= new String [10];
        initComponent();
        
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(tamanio.width/2,tamanio.height/2);
        setTitle("Jugando Free fire");
        setLocationRelativeTo(null);

        //contenedor principal
        JPanel contenedor = new JPanel();
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        contenedor.setLayout(new GridLayout(3,1));
        

        JPanel contenedor_busqueda = new JPanel();
        contenedor_busqueda.setLayout(new GridLayout(1,4));
        

        JTextField nombres = new JTextField();
        JButton guardar = new JButton("Guardar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JLabel  mostrargg = new JLabel();
        JLabel mostrargh = new JLabel();

        contenedor.add(contenedor_busqueda);
        contenedor.add(mostrargg);
        contenedor.add(mostrargh);
        contenedor_busqueda.add(nombres);
        contenedor_busqueda.add(guardar);
        contenedor_busqueda.add(mostrar);
        contenedor_busqueda.add(buscar);
        


        ActionListener evento_guardar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
                
                    mostrar_nombres[cont]=nombres.getText();
                    cont++;
                
               
            }
        };

        ActionListener evento_mostrar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String mostrar_todo=" ";
                for(int i=0;i<mostrar_nombres.length;i++){
                    
                    if(mostrar_nombres[i]!=null){
                        mostrar_todo += i+"."+mostrar_nombres[i]+" ";
                    }

                    
                    
                }
                mostrargg.setText(mostrar_todo);
            }
        };

         ActionListener evento_buscar = new ActionListener(){
            public void actionPerformed(ActionEvent e){

                for(int i=0;i<mostrar_nombres.length;i++){
                    String a_buscar = nombres.getText();
                    int valor1 = Integer.parseInt(a_buscar);
                    if(valor1==i){
                        mostrargh.setText(mostrar_nombres[i]);
                        break;
                    }else{
                        mostrargh.setText("No se pudo encontrar");
                    }
                    
                }
                
            }
        };

        guardar.addActionListener(evento_guardar);
        mostrar.addActionListener(evento_mostrar);
        buscar.addActionListener(evento_buscar);

        add(contenedor);
        revalidate();
        pack();
        

    

    }
}