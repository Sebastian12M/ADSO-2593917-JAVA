import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.Random;

public class Triqui extends JFrame{
    private JLabel tablero [][];
    private int turno;
    private char tableros[][];
    private int primera_jugada;
    private boolean no_a_no_de;

    public Triqui(){
        this.tablero= new JLabel [3][3];
        this.turno=0;
        this.tableros=new char [3][3];
        this.primera_jugada=0;
        this.no_a_no_de=true;
        initComponent();

    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();
        setVisible(true);
        setTitle("Triqui");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        JPanel contenedor_principal = new JPanel();
        contenedor_principal.setLayout(new GridBagLayout());
        GridBagConstraints restriccion = new GridBagConstraints();

        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                tablero[i][j]=new JLabel("-");
                tablero[i][j].setFont( new Font("Serif", Font.PLAIN, 22));
                tablero[i][j].setHorizontalAlignment(JLabel.CENTER);
                Border borde_completo1 = BorderFactory.createLineBorder(Color.RED, 0);
                Border bordeSuperir1 = BorderFactory.createMatteBorder(2, 2, 2, 2,Color.yellow);
                Border borde_compuesto1 = BorderFactory.createCompoundBorder(borde_completo1, bordeSuperir1);
                tablero[i][j].setBorder(borde_compuesto1);
                restriccion.gridy=i;
                restriccion.gridx=j;
                restriccion.gridwidth=1;
                restriccion.gridheight=1;
                restriccion.weighty=1;
                restriccion.weightx=1;
                restriccion.fill=GridBagConstraints.BOTH;
                contenedor_principal.add(tablero[i][j], restriccion);
            }
        }

        JButton reiniciar = new JButton("Reiniciar");
        restriccion.gridy=3;
        restriccion.gridx=0;
        restriccion.gridwidth=3;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill=GridBagConstraints.BOTH;
        contenedor_principal.add(reiniciar, restriccion);

       

        
        MouseListener listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                    
                if(verificar_ganador()==false){
                    JLabel label = (JLabel) e.getSource();
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {

                        
                            if(turno==0 && label.getText()=="-"){
                                label.setText("X");
                            
                                if(verificar_ganador()){
                                    String nombre="EL MANCO";
                                    mostrar_ganador(nombre);
                                    turno=1;  
                                    break;
                                }
                                turno=1;   

                            }else if(turno==1){
                                maquina();

                                if(verificar_ganador()){
                                    String nombre="CHATOGT";
                                    mostrar_ganador(nombre);
                                    turno=0;
                                    break;
                                }

                                turno=0;
                            }   


                        }   
                    }
                } 
                 
                
                
               
            }
        };

        

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j].addMouseListener(listener);
                
            }
        }

        ActionListener evento_reiniciar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 for(int i=0;i<tablero.length;i++){
                    for(int j=0;j<tablero.length;j++){
                        tablero[i][j].setText("-");
                    }
                }

                
                primera_jugada=0;
                turno=0;
                
            }
        };

        reiniciar.addActionListener(evento_reiniciar);
        
        add(contenedor_principal);
        setResizable(false);
        revalidate();
        repaint();

    }

    public boolean verificar_ganador(){
            

        for(int i =0;i<tableros.length;i++){
            for(int j=0;j<tableros.length;j++){
                tableros[i][j] = tablero[i][j].getText().charAt(0);
            }
        }

        for(int i =0;i<tableros.length;i++){
            for(int j=0;j<tableros.length;j++){
                if(tableros[0][0]=='X' && tableros[0][1]=='X' && tableros[0][2]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[1][0]=='X' && tableros[1][1]=='X' && tableros[1][2]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[2][0]=='X' && tableros[2][1]=='X' && tableros[2][2]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][0]=='X' && tableros[1][0]=='X' && tableros[2][0]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][1]=='X' && tableros[1][1]=='X' && tableros[2][1]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][2]=='X' && tableros[1][2]=='X' && tableros[2][2]=='X'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][0]=='X' && tableros[1][1]=='X' && tableros[2][2]=='X'){
                    return true;
                }else if(tableros[0][2]=='X' && tableros[1][1]=='X' && tableros[2][0]=='X'){
                    return true;
                }


                if(tableros[0][0]=='O' && tableros[0][1]=='O' && tableros[0][2]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[1][0]=='O' && tableros[1][1]=='O' && tableros[1][2]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[2][0]=='O' && tableros[2][1]=='O' && tableros[2][2]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][0]=='O' && tableros[1][0]=='O' && tableros[2][0]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][1]=='O' && tableros[1][1]=='O' && tableros[2][1]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][2]=='O' && tableros[1][2]=='O' && tableros[2][2]=='O'){
                    System.out.print("ganador");
                    return true;
                }else if(tableros[0][0]=='O' && tableros[1][1]=='O' && tableros[2][2]=='O'){
                    return true;
                }else if(tableros[0][2]=='O' && tableros[1][1]=='O' && tableros[2][0]=='O'){
                    return true;
                }
            }
        }
                    
        return false;   
    }

    public void maquina(){
        

        if(primera_jugada==0){
            Random rand = new Random();
            int fila =rand.nextInt(3); 
            int columna =rand.nextInt(3);
            while (tableros[fila][columna] != '-') {
                fila = rand.nextInt(3);
                columna = rand.nextInt(3);
            }
            
            tablero[fila][columna].setText("O");
            primera_jugada=1;
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                
                    if(tableros[0][0]=='O' && tableros[0][1]=='O' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O");
                        
                    }else if(tableros[0][0]=='O' && tableros[0][1]=='-' && tableros[0][2]=='O'&& turno ==1){
                        tablero[0][1].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[0][1]=='O' && tableros[0][2]=='O'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA

                    }else if(tableros[1][0]=='O' && tableros[1][1]=='O' && tableros[1][2]=='-'&& turno ==1){
                        tablero[1][2].setText("O");
                     
                    }else if(tableros[1][0]=='O' && tableros[1][1]=='-' && tableros[1][2]=='O'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[1][0]=='-' && tableros[1][1]=='O' && tableros[1][2]=='O'&& turno ==1){
                        tablero[1][0].setText("O");
                        //tercera fila

                    }else if(tableros[2][0]=='O' && tableros[2][1]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[2][0]=='O' && tableros[2][1]=='-' && tableros[2][2]=='O'&& turno ==1){
                        tablero[2][1].setText("O");

                    }else if(tableros[2][0]=='-' && tableros[2][1]=='O' && tableros[2][2]=='O'&& turno ==1){
                        tablero[2][0].setText("O");

                        //VERTICAL
                    }else if(tableros[0][0]=='O' && tableros[1][0]=='O' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");
                        
                    }else if(tableros[0][0]=='O' && tableros[1][0]=='-' && tableros[2][0]=='O'&& turno ==1){
                        tablero[1][0].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[1][0]=='O' && tableros[2][0]=='O'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA

                    }else if(tableros[0][1]=='O' && tableros[1][1]=='O' && tableros[2][1]=='-'&& turno ==1){
                        tablero[2][1].setText("O");
                    
                    }else if(tableros[0][1]=='O' && tableros[1][1]=='-' && tableros[2][1]=='O'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[0][1]=='-' && tableros[1][1]=='X' && tableros[2][1]=='X'&& turno ==1){
                        tablero[0][1].setText("O");
                        //tercera fila

                    }else if(tableros[0][2]=='O' && tableros[1][2]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[0][2]=='O' && tableros[1][2]=='-' && tableros[2][2]=='O'&& turno ==1){
                        tablero[1][2].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][2]=='O' && tableros[2][2]=='O'&& turno ==1){
                        tablero[0][2].setText("O");
                        //diagonal

                    }else if(tableros[0][0]=='O' && tableros[1][1]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");
                        
                    }else if(tableros[0][0]=='O' && tableros[1][1]=='-' && tableros[2][2]=='O'&& turno ==1){
                        tablero[1][1].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[1][1]=='O' && tableros[2][2]=='O'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA
                    }else if(tableros[0][2]=='O' && tableros[1][1]=='O' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");
                     
                    }else if(tableros[0][2]=='O' && tableros[1][1]=='-' && tableros[2][0]=='O'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[0][2]=='-' && tableros[1][1]=='O' && tableros[2][2]=='O'&& turno ==1){
                        tablero[0][2].setText("O");
                        //tercera fila

                    }else if(tableros[2][0]=='O' && tableros[1][1]=='O' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O");  
                        //primera fila defensa
                    }else if(tableros[0][0]=='X' && tableros[0][1]=='X' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O");
                        
                    }else if(tableros[0][0]=='X' && tableros[0][1]=='-' && tableros[0][2]=='X'&& turno ==1){
                        tablero[0][1].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[0][1]=='X' && tableros[0][2]=='X'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA

                    }else if(tableros[1][0]=='X' && tableros[1][1]=='X' && tableros[1][2]=='-'&& turno ==1){
                        tablero[1][2].setText("O");
                     
                    }else if(tableros[1][0]=='X' && tableros[1][1]=='-' && tableros[1][2]=='X'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[1][0]=='-' && tableros[1][1]=='X' && tableros[1][2]=='X'&& turno ==1){
                        tablero[1][0].setText("O");
                        //tercera fila

                    }else if(tableros[2][0]=='X' && tableros[2][1]=='X' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[2][0]=='X' && tableros[2][1]=='-' && tableros[2][2]=='X'&& turno ==1){
                        tablero[2][1].setText("O");

                    }else if(tableros[2][0]=='-' && tableros[2][1]=='X' && tableros[2][2]=='X'&& turno ==1){
                        tablero[2][0].setText("O");
                        //VERTICAL

                    }else if(tableros[0][0]=='X' && tableros[1][0]=='X' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");
                        
                    }else if(tableros[0][0]=='X' && tableros[1][0]=='-' && tableros[2][0]=='X'&& turno ==1){
                        tablero[1][0].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[1][0]=='X' && tableros[2][0]=='X'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA

                    }else if(tableros[0][1]=='X' && tableros[1][1]=='X' && tableros[2][1]=='-'&& turno ==1){
                        tablero[2][1].setText("O");
                     
                    }else if(tableros[0][1]=='X' && tableros[1][1]=='-' && tableros[2][1]=='X'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[0][1]=='-' && tableros[1][1]=='X' && tableros[2][1]=='X'&& turno ==1){
                        tablero[0][1].setText("O");
                        //tercera fila
                    }else if(tableros[0][2]=='X' && tableros[1][2]=='X' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[0][2]=='X' && tableros[1][2]=='-' && tableros[2][2]=='X'&& turno ==1){
                        tablero[1][2].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][2]=='X' && tableros[2][2]=='X'&& turno ==1){
                        tablero[0][2].setText("O");
                        //diagonal

                    }else if(tableros[0][0]=='X' && tableros[1][1]=='X' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");
                        
                    }else if(tableros[0][0]=='X' && tableros[1][1]=='-' && tableros[2][2]=='X'&& turno ==1){
                        tablero[1][1].setText("O");
                         
                    }else if(tableros[0][0]=='-' && tableros[1][1]=='X' && tableros[2][2]=='X'&& turno ==1){
                        tablero[0][0].setText("O");
                        //SEGUNDA FILA

                    }else if(tableros[0][2]=='X' && tableros[1][1]=='X' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");
                     
                    }else if(tableros[0][2]=='X' && tableros[1][1]=='-' && tableros[2][0]=='X'&& turno ==1){
                        tablero[1][1].setText("O");
                     
                    }else if(tableros[0][2]=='-' && tableros[1][1]=='X' && tableros[2][2]=='X'&& turno ==1){
                        tablero[0][2].setText("O");
                        //tercera fila

                    }else if(tableros[2][0]=='X' && tableros[1][1]=='X' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O"); 

                    }else if(tableros[2][0]=='X' && tableros[1][1]=='X' && tableros[0][2]=='-'&& turno ==1){

                        //no ataque no defensa
                    }else if(tableros[0][0]=='O' && tableros[0][1]=='-' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][1].setText("O"); 

                    }else if(tableros[0][0]=='-' && tableros[0][1]=='O' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][1].setText("O"); 

                    }else if(tableros[1][0]=='-' && tableros[1][1]=='O' && tableros[1][2]=='-'&& turno ==1){
                        tablero[1][0].setText("O"); 

                    }else if(tableros[1][0]=='O' && tableros[1][1]=='-' && tableros[1][2]=='-'&& turno ==1){
                        tablero[1][2].setText("O"); 

                    }else if(tableros[1][0]=='-' && tableros[1][1]=='O' && tableros[1][2]=='-'&& turno ==1){
                        tablero[1][0].setText("O");

                    }else if(tableros[2][0]=='-' && tableros[2][1]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][0].setText("O"); 

                    }else if(tableros[2][0]=='O' && tableros[2][1]=='-' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O"); 

                    }else if(tableros[0][0]=='O' && tableros[1][0]=='-' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O"); 

                    }else if(tableros[0][0]=='-' && tableros[1][0]=='O' && tableros[2][0]=='-'&& turno ==1){
                        tablero[0][0].setText("O"); 

                    }else if(tableros[0][1]=='-' && tableros[1][1]=='O' && tableros[2][1]=='-'&& turno ==1){
                        tablero[2][1].setText("O"); 

                    }else if(tableros[0][1]=='O' && tableros[1][1]=='-' && tableros[2][1]=='-'&& turno ==1){
                        tablero[2][1].setText("O"); 

                    }else if(tableros[0][2]=='O' && tableros[1][2]=='-' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][2]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O");

                    }else if(tableros[0][0]=='-' && tableros[1][1]=='O' && tableros[2][2]=='-'&& turno ==1){
                        tablero[0][0].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][1]=='-' && tableros[2][0]=='O'&& turno ==1){
                        tablero[1][1].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][1]=='O' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");

                    }else if(tableros[0][2]=='-' && tableros[1][2]=='-' && tableros[2][2]=='O'&& turno ==1){
                        tablero[0][2].setText("O");

                    }else if(tableros[2][1]=='O' && tableros[1][1]=='-' && tableros[0][1]=='-'&& turno ==1){
                        tablero[0][1].setText("O");

                    }else if(tableros[0][0]=='O' && tableros[1][1]=='-' && tableros[2][2]=='-'&& turno ==1){
                        tablero[2][2].setText("O");

                    }else if(tableros[1][2]=='O' && tableros[1][1]=='-' && tableros[2][1]=='-'&& turno ==1){
                        tablero[2][1].setText("O");

                    }else if(tableros[1][2]=='O' && tableros[0][1]=='-' && tableros[0][0]=='-'&& turno ==1){
                        tablero[0][0].setText("O");

                    }else if(tableros[0][1]=='O' && tableros[1][1]=='-' && tableros[2][0]=='-'&& turno ==1){
                        tablero[2][0].setText("O");

                    }else if(tableros[1][1]=='O' && tableros[0][1]=='-' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][2].setText("O");

                    }else if(tableros[2][2]=='O' && tableros[0][0]=='-' && tableros[0][2]=='-'&& turno ==1){
                        tablero[0][0].setText("O");

                    }else if(tableros[1][0]=='O' && tableros[2][2]=='-' && tableros[0][0]=='-'&& turno ==1){
                        tablero[0][0].setText("O");

                    }else if(tableros[1][1]=='O' && tableros[2][2]=='-' && turno ==1 ){
                        tablero[2][2].setText("O");

                    }else if(tableros[1][2]=='O' && tableros[0][1]=='-'  && turno ==1){
                        tablero[0][1].setText("O");

                    }else if(tableros[0][1]=='O' && tableros[1][1]=='X' && tableros[2][0]== '-'  && turno ==1){
                        tablero[2][0].setText("O");

                    }else if(tableros[2][0]=='O' && tableros[1][0]=='X' && tableros[0][2]== 'X' && tableros[0][1] == '-'  && turno ==1){
                        tablero[0][1].setText("O");

                    }else if(tableros[1][0]=='O' && tableros[1][1]=='X' && tableros[0][1]== '-'   && turno ==1){
                        tablero[0][1].setText("O");

                    }else if(tableros[0][2]=='X' && tableros[0][1]=='O' && tableros[2][2]== '-'){
                        tablero[2][2].setText("O");

                    }else if(tableros[0][2]=='O' && tableros[0][1]=='X' && tableros[1][2]== 'X' && tableros[1][1]=='-' ){
                        tablero[2][2].setText("O");

                    }



                    
                    
                    
                     
                
                
            }
        }
        
    }

    public void mostrar_ganador(String nombre){
        JFrame ganador = new JFrame();
        ganador.setVisible(true);
        ganador.setSize(200,200);
        ganador.setTitle("Ganador");
        ganador.setLocationRelativeTo(null);
        ganador.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel conte_ganador = new JPanel();
        conte_ganador.setLayout(new GridLayout(1,1));
        JLabel nombres = new JLabel("Ganador: "+nombre);
        nombres.setFont(( new Font("Serif", Font.PLAIN, 30)));
        conte_ganador.add(nombres);
        ganador.add(conte_ganador);
        ganador.setResizable(false);
        ganador.revalidate();
        ganador.repaint();
        ganador.pack();
    }
}


