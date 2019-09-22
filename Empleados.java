package clases.cifo.com;

public class Empleados implements Saludar { //implemeta el interfac Saludar

	private String nombre; // Nombre y Apellidos del empleado
	private String dni;    // DNI del empleado
	private double sueldo;    // sueldo neto del empleado
	
	//Creados con Eclipse después de ver el doc de Word de Juan Pablo 	

	public Empleados(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	//método privado getIRPF (SÍ se puede acceder a atributos privados DENTRO de la clase. Fuera con Getters y Setters
	private double getIRPF(){
		if (sueldo<3000) {
			return 0.85;
		} else {
			return 0.75;
		}
	}	
	//método que nos devolverá el sueldo x 0.85
	double sueldoNeto() {
		return sueldo*getIRPF(); 
	}
	
	
	public void saludo () {
	    // El cuerpo de saludo se pone aquí
	    System.out.println("Hola desde Empleados");
	  }
}

