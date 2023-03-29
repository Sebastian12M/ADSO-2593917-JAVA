import java.util.Date;
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private String [] lista_transacciones;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.lista_transacciones=new String [5];
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			this.registrarLogTarjeta(password, numero, valor, numero);
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}

	public void mostrarSaldo(){
		System.out.println("Este es el saldo de su tarjeta: "+this.saldo);
		this.registrarLogTarjeta("CONSULTAR SALDO", this.numero , 00000000, "OK:200");
	}

	public void setContrasena(String newPass){
		this.password=newPass;
		this.registrarLogTarjeta("CAMBIO CONTRASEÑA", this.numero , 00000000, "OK:200");
	}

	public void setSaldo(int new_saldo){
		this.saldo=new_saldo;
		this.registrarLogTarjeta("TRANSACCION CAJERO", this.numero , this.saldo, "OK:200");
		
	}

	public void registrarLogTarjeta(String tipo, String numero_t, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+numero_t+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void imprimirLog(){
		System.out.println("-----------------------------------------\n");
		for (int i=0; i<this.lista_transacciones.length; i++) {
			if (this.lista_transacciones[i] != null) {
				System.out.println("     => "+this.lista_transacciones[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}
	


}