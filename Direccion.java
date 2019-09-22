package clases.cifo.com;

public class Direccion extends Empleados implements Saludar {

	private int stockoptions;           //nueva propiedad

	public int getStockoptions() {
		return stockoptions;
	}

	public void setStockoptions(int stockoptions) {
		this.stockoptions = stockoptions;
	}
	

	public Direccion(String nombre, String dni, int stock) {
		super(nombre, dni);
		stockoptions=stock; //lo añadimos en el constructor
	}
	
	//Modifica el método sueldoNeto llamando a la función sueldoNeto de la clase madre y sumándole las StockOption multiplicadas por 0.1
	
	double sueldoNeto () {
		return (super.sueldoNeto() + (stockoptions*0.1));		
	}
	
	public void saludo() {
	    // El cuerpo de saludo se pone aquí
	    System.out.println("Hola desde Dirección");
	}
}
