package clases.cifo.com;

public class Gerente extends Empleados implements Saludar {

	private String departamento;  //nueva propiedad
	private int dietas;           //nueva propiedad
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getDietas() {
		return dietas;
	}

	public void setDietas(int dietas) {
		this.dietas = dietas;
	}

	public Gerente(String nombre, String dni) {
		super(nombre, dni);
	}
		
	//Modifica el método sueldoNeto llamando a la función sueldoNeto de la clase madre y sumándole las dietas
	double sueldoNeto () {
		return (super.sueldoNeto() + dietas);		
	}
	
	public void saludo () {
	    // El cuerpo de saludo se pone aquí
	    System.out.println("Hola desde Gerente");
	}
}
