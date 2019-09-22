package clases.cifo.com;

public class Program {

	public static void main(String[] args) {

		
		Empleados emp1,emp2;   //Creación dos empleados prueba
		
		Administracion adm;
		Gerente ger;
		Direccion dir;
		Clientes cl1;
		
		emp1 = new Empleados ("Anna Catala", "39704510R");
		emp2 = new Empleados ("Pepe Sanchez", "44444444A");
		
		adm = new Administracion ("Jon Palo", "88888888B");
		
		ger = new Gerente ("Pau Pons", "101010101I");
		
		dir = new Direccion ("Sam Smith", "111111111L", 300000);
		
		cl1 = new Clientes("Laia Casas", "laia@casas.cat", "Externo");
				
		
		//Añadimos el sueldo al primer empleado
		emp1.setSueldo(2900);
		
		ger.setSueldo(5000);
		ger.setDietas(2500);
		
		dir.setSueldo(10000);
		//dir.setStockoptions(300000); Añadido en el constructor de Direccion
		
		//Mostramos valores para comprobar
		System.out.println(emp1.getNombre());
		System.out.println(emp1.getSueldo());
		System.out.println(emp2.getSueldo());
		
		adm.setSeccion("Sección A"); //añadimos nueva proviedad
		
		System.out.println(adm.getSeccion());
		
		System.out.println(ger.sueldoNeto());
		System.out.println(dir.sueldoNeto());
		
		emp1.saludo();
		emp2.saludo();
		
		adm.saludo();
		ger.saludo();
		dir.saludo();
		cl1.saludo();
	}

}
