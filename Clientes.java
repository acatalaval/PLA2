package clases.cifo.com;

public class Clientes implements Saludar {
	
	private String nombre;
	private String email;
	private String tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Clientes (String nom, String cor, String tip) {
	        nombre=nom;
	        email=cor;
	        tipo=tip;
	}
	
	public void saludo () {
	    // El cuerpo de saludo se pone aquí
	    System.out.println("Hola desde Clientes");
	}
	
}

