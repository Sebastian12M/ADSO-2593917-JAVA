import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;



public class Ventanas extends JFrame {
    public String valor;
    public JLabel peso;
    public Ventanas(){
        this.valor="hola";
        initComponent();
    }
    public void initComponent(){
        Toolkit sistema =Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();
        

        setVisible(true);
        setLocationRelativeTo(null);
        setSize(tamanio.width/2, tamanio.height/2);
        setTitle("Formato Moneda");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(2,1));
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel contenedor2 = new JPanel();
        contenedor2.setLayout(new GridLayout(1,3));

        JLabel cantidad = new JLabel("Cantidad: ");

        JLabel peso = new JLabel();

        JTextField campo_cant = new JTextField();

        JButton validar = new JButton("Ejecutar");


        contenedor.add(contenedor2);
        contenedor.add(peso);
        contenedor2.add(cantidad);
        contenedor2.add(campo_cant);
        contenedor2.add(validar);


        

        ActionListener evento_validar = new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                
                

                
                valor= campo_cant.getText();
                double valor2 = Double.parseDouble(valor);
                String patron = "#,###.##";
                DecimalFormat formato = new DecimalFormat(patron);
                peso.setText("$"+formato.format(valor2));
                if(valor.equalsIgnoreCase("")){
                    
                }
                   
                   
            }
        };

        validar.addActionListener(evento_validar);

        add( contenedor );
		revalidate();
		pack();
        
        

    }

}