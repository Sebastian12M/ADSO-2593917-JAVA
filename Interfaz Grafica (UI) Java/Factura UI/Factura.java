import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Factura extends JFrame {

    public int cont;
    public int arreglo_clientes [];
    public String nombres_clientes [];
    public boolean encontrar;
    public String direccion_clientes [];
    public String id_producto [];
    public String nombre_producto[];
    public int valor_producto[];
    public int valor_pagar;
    public String cedulas [];
    public String nombres_ven[];
    
    public Factura(){
        this.cont=0;
        this.arreglo_clientes= new int[20];
        this.nombres_clientes=new String[20];
        this.direccion_clientes= new String[20];
        this.encontrar=true;
        this.id_producto= new String[5];
        this.nombre_producto= new String[5];
        this.valor_producto= new int[5];
        this.valor_pagar=0;
        this.cedulas= new String [4];
        this.nombres_ven= new String[4];

        initComponent();
    }

    public void  initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,600);
        setTitle("Facturas");
        setLocationRelativeTo(null);

        //Contenedor principal
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(11,1));
        contenedor.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        

        //Primero
        JLabel datos_titulo = new JLabel("Datos Cliente: ");
        datos_titulo.setFont( new Font("Serif", Font.PLAIN, 22));


        //Campo buscar cedula
        JPanel cedula = new JPanel();
        cedula.setLayout(new GridLayout(1,3));
        JLabel titulo_cedula = new JLabel("Cedula: ");
        JTextField input_cedula = new JTextField();
        input_cedula.setPreferredSize(new Dimension(200, 200));
        JButton buscar_cedula = new JButton("Buscar");

        //mostrar datos cliente
        JPanel mostrar_cliente = new JPanel();
        mostrar_cliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mostrar_cliente.setLayout(new GridLayout(2,2));
        
        JLabel nombre_cliente = new JLabel("Nombre: ");
        JTextArea mostrar_nombrecli = new JTextArea();
        mostrar_nombrecli.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JLabel direccion_cliente = new JLabel("Direccion: ");
        JTextArea mostrar_direccioncli = new JTextArea();
        mostrar_direccioncli.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //Segundo
        JLabel datos_vendedor = new JLabel("Datos vendedor: ");
        datos_vendedor.setFont( new Font("Serif", Font.PLAIN, 22));

        //campo buscar cedula vendedor
        JPanel cedula_vendedor = new JPanel();
        cedula_vendedor.setLayout(new GridLayout(1,3));
        JLabel label_cedulaven = new JLabel("Cedula: ");
        JTextField input_cedulaven = new JTextField();
        JButton buscar_cedulaven = new JButton("Buscar: ");

        //mostrar datos vendedor
        JPanel mostrar_vendedor = new JPanel();
        mostrar_vendedor.setLayout(new GridLayout(1,2));
        JLabel nombre_vendedor = new JLabel("Nombre: ");
        JLabel mostrar_nombreven = new JLabel("-----");
        


        //Tercero
        JLabel datos_productos = new JLabel("Productos: ");
        datos_productos.setFont( new Font("Serif", Font.PLAIN, 22));

        //nombre productos
        JPanel nombres_productos = new JPanel();
        nombres_productos.setLayout(new GridLayout(1,3));
        JLabel nombre_id = new JLabel("ID");
        JLabel nombre_nombre = new JLabel("Nombre");
        JLabel nombre_cant = new JLabel("Cant");

        //buscar productos
        JPanel buscar_productos = new JPanel();
        buscar_productos.setLayout(new GridLayout(1,4));
        JTextField id = new JTextField();
        JTextField nombre = new JTextField();
        JTextField cant = new JTextField();
        JButton boton_producto = new JButton("Agregar");


        //agregar productos
        JPanel argregar_productos = new JPanel();
        argregar_productos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        argregar_productos.setLayout(new GridLayout(1,1));
        JTextArea mostrar_id = new JTextArea();
        JScrollPane scroll_productos = new JScrollPane(mostrar_id);
        //JLabel mostrar_nombre  = new JLabel("---");
        //JLabel mostrar_cant  = new JLabel("---");
        //JLabel mostrar_total  = new JLabel("---");


        //total
        JPanel valor_total = new JPanel();
        valor_total.setLayout(new GridLayout(1,4));
        JLabel nada1 = new JLabel();
        JLabel nada2 = new JLabel();
        JLabel nada3 = new JLabel();
        JLabel nada4 = new JLabel("Total:  ");



        //Datos cliente
        cedula.add(titulo_cedula);
        cedula.add(input_cedula);
        cedula.add(buscar_cedula);

        //Mostrar datos cliente
        mostrar_cliente.add(nombre_cliente);
        mostrar_cliente.add(mostrar_nombrecli);
        mostrar_cliente.add(direccion_cliente);
        mostrar_cliente.add(mostrar_direccioncli);

        //Datos vendedor
        cedula_vendedor.add(label_cedulaven);
        cedula_vendedor.add(input_cedulaven);
        cedula_vendedor.add(buscar_cedulaven);

        //Mostrar datos vendedor
        mostrar_vendedor.add(nombre_vendedor);
        mostrar_vendedor.add(mostrar_nombreven);
        
        //nombres productos
        nombres_productos.add(nombre_id);
        nombres_productos.add(nombre_nombre);
        nombres_productos.add(nombre_cant);
        

        //Buscar productos
        buscar_productos.add(id);
        buscar_productos.add(nombre);
        buscar_productos.add(cant);
        buscar_productos.add(boton_producto);

        //mostrar productos
        argregar_productos.add(scroll_productos);
        //argregar_productos.add(mostrar_nombre);
        //argregar_productos.add(mostrar_cant);
        //argregar_productos.add(mostrar_total);

        //mostrar total
        valor_total.add(nada1);
        valor_total.add(nada2);
        valor_total.add(nada3);
        valor_total.add(nada4);

        contenedor.add(datos_titulo);
        contenedor.add(cedula);
        contenedor.add(mostrar_cliente);
        contenedor.add(datos_vendedor);
        contenedor.add(cedula_vendedor);
        contenedor.add(mostrar_vendedor);
        contenedor.add(datos_productos);
        contenedor.add(nombres_productos);
        contenedor.add(buscar_productos);
        contenedor.add(argregar_productos);
        contenedor.add(valor_total);


        ActionListener evento_buscarcli = new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
                String busqueda = input_cedula.getText();
                int busqueda1 = Integer.parseInt(busqueda);
                
                for(int i=0;i<arreglo_clientes.length;i++){
                    if(busqueda1==arreglo_clientes[i]){
                        mostrar_nombrecli.setText(nombres_clientes[i]);
                        mostrar_direccioncli.setText(direccion_clientes[i]);
                    }else{
                        encontrar=false;
                    }
                }

                if(encontrar==false){
                    for(int i=0;i<arreglo_clientes.length;i++){

                        if(nombres_clientes[i]==null){
                            arreglo_clientes[i]=busqueda1;
                            nombres_clientes[i]=mostrar_nombrecli.getText();
                            direccion_clientes[i]=mostrar_direccioncli.getText();
                            
                           break;
                        }
                           
                    }
                }
                
                encontrar=true;
                
               
            }
        };

        ActionListener evento_buscarven = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cedulas[0]="1225";
                cedulas[1]="12345";
                cedulas[2]="3333";
                cedulas[3]="8901";

                nombres_ven[0]="Camilo mendoza";
                nombres_ven[1]="Luisito posada";
                nombres_ven[2]="Maluma churrumy";
                nombres_ven[3]="Falcao moncada";

                String busqueda_cedual= input_cedulaven.getText();

                for(int i = 0;i<cedulas.length;i++){
                    if(busqueda_cedual.equals(cedulas[i])){
                        mostrar_nombreven.setText(nombres_ven[i]);
                    }
                }
            }
        };

        ActionListener evento_agregar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                id_producto[0]="123";
                id_producto[1]="1299";
                id_producto[2]="2089";

                nombre_producto[0]="Agua";
                nombre_producto[1]="Bombom";
                nombre_producto[2]="Frutiño";

                valor_producto[0]=2000;
                valor_producto[1]=700;
                valor_producto[2]=1500;



                String id_de_producto = id.getText();
                int cantidad_producto=Integer.parseInt(cant.getText());
                String nombre_de_producto=nombre.getText();
                String poner_text=" ";
                

                for(int i=0;i<nombre_producto.length;i++){
                    if(id_de_producto.equals(id_producto[i])){
                        int total_producto = valor_producto[i]*cantidad_producto;
                        poner_text += id_de_producto +" - "+nombre_de_producto+" - "+cantidad_producto+" = $"+total_producto+"\n";
                        valor_pagar=valor_pagar+total_producto;
                    }
                }
                
                double mostras_double= valor_pagar;
                String patron = "#,###.##";
                DecimalFormat formato = new DecimalFormat(patron);
                
                mostrar_id.append(poner_text);
                nada4.setText("Total: $ "+formato.format(valor_pagar));
            }
        };
        buscar_cedula.addActionListener(evento_buscarcli);
        boton_producto.addActionListener(evento_agregar);
        buscar_cedulaven.addActionListener(evento_buscarven);
        add(contenedor);
        revalidate();
        

    }
}
