package view;

import controller.EmpleadoController;

public class ViewController {

	public static void main(String[] args) {
		//>CREAR EMPLEADO
		//String emp = new EmpleadoController().crearEmpleado("Yparraguirre Rinza", "Edwin Smith", 23, "Masculino", 15000);
		//System.out.println(emp);
		
		//String emp2 = new EmpleadoController().crearEmpleado("Vargas Huaman", "Ana Maria", 26, "Femenino", 12000);
		//System.out.println(emp2);
		
		//String emp3 = new EmpleadoController().crearEmpleado("Vallejos Ramirez", "Jorge Lopez", 27, "Masculino", 13000);
		//System.out.println(emp3);
		
		//String emp4 = new EmpleadoController().crearEmpleado("Losada Prieto", "Luisa Antonia", 24, "Femenino", 15000);
		//System.out.println(emp4);
		
		//>ELIMINAR EMPLEADO
		//String emp = new EmpleadoController().eliminarEmpleado(2);
		//System.out.println(emp);
		
		//ACTUALIZAR EMPLEADO
		//String emp = new EmpleadoController().actualizarEmpleado(3, "Vallejos Ramirez", "Jorge Huaman", 23, "Masculino", 15000);
		//System.out.println(emp);
		
		//LISTAR EMPLEADO
		String emp = new EmpleadoController().listarEmpleado(1);
		System.out.printf(emp);
		
	}

}
