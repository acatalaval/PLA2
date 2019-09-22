package clases.cifo.com;

public class Administracion extends Empleados implements Saludar {
	
	private String seccion;  //nueva propiedad
	

	public String getSeccion() {
		return seccion;
	}



	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}



	public Administracion(String nombre, String dni) {
		super(nombre, dni);
		
	}

	public void saludo() {
	    // El cuerpo de saludo se pone aquí
	    System.out.println("Hola desde Administración");
	}
	
}
