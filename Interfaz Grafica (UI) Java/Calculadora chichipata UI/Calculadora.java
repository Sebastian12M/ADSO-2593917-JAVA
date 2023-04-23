import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Calculadora extends JFrame {
    
    
    public Calculadora(){
        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(tamanio.width/2, tamanio.height);
        setTitle("Calculadora");

        //contenedor padre
        JPanel contenedor = new JPanel();
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        contenedor.setLayout(new GridLayout(2,1));


        //contendor  hijo privilegiado
        JPanel contenedor2 = new JPanel();
        contenedor2.setLayout(new GridLayout(2,2));

        




        //contenedro hijo resultado
        JPanel contenedor2_1 = new JPanel();
        contenedor2_1.setLayout(new GridLayout(1,1));

        JTextField numero1 = new JTextField();
        JTextField numero2 = new JTextField();
        JButton resta = new JButton("Resta");
        JButton suma = new JButton("Suma");
        JLabel resultado = new JLabel();

        contenedor.add(contenedor2);
        contenedor.add(contenedor2_1);
        contenedor2.add(numero1);
        contenedor2.add(numero2);
        contenedor2.add(resta);
        contenedor2.add(suma);
        contenedor2_1.add(resultado);
        

        ActionListener evento_suma = new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                String campo_1 = numero1.getText();
                String campo_2 = numero2.getText();
                int valor1 = Integer.parseInt(campo_1);
                int valor2 = Integer.parseInt(campo_2);

                int resultado1=valor1+valor2;

                resultado.setText("Resultado: "+resultado1);

            }
        };

         ActionListener evento_resta = new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                String campo_1 = numero1.getText();
                String campo_2 = numero2.getText();
                int valor1 = Integer.parseInt(campo_1);
                int valor2 = Integer.parseInt(campo_2);

                int resultado1=valor1-valor2;

                resultado.setText("Resultado: "+resultado1);

            }
        };

        suma.addActionListener(evento_suma);
        resta.addActionListener(evento_resta);

        add(contenedor);
        revalidate();
        pack();
    }
}