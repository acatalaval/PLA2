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
		
	//Modifica el m�todo sueldoNeto llamando a la funci�n sueldoNeto de la clase madre y sum�ndole las dietas
	double sueldoNeto () {
		return (super.sueldoNeto() + dietas);		
	}
	
	public void saludo () {
	    // El cuerpo de saludo se pone aqu�
	    System.out.println("Hola desde Gerente");
	}
}
