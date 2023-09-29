package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
	public String crearEmpleado(String apellidos, String nombres, int edad, String sexo, int salario) {
		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		try {
			Empleado emp = new Empleado(apellidos, nombres, edad, sexo, salario);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			sessionfactory.close();
			
			return "Empleado registrado con exito!!!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al registrar Empleado";
	}

	public String eliminarEmpleado(int idempleado) {
		
		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, idempleado);
			session.delete(emp);
			session.getTransaction().commit();
			sessionfactory.close();
			
			return "Empleado Eliminado Correctamente!!!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al eliminar Empleado";
	}
	
	public String actualizarEmpleado(int idempleado, String apellidos, String nombres, int edad, String sexo, int salario) {
		
		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, idempleado);
			
			emp.setApellidos(apellidos);
			emp.setNombres(nombres);
			emp.setEdad(edad);
			emp.setSexo(sexo);
			emp.setSalario(salario);
			
			session.update(emp);
			session.getTransaction().commit();;
			sessionfactory.close();
			
			return "Empleado Actualizado con Exito!!!";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al Actualizar Empleado";
	}

	public String listarEmpleado(int idempleado) {
		
		SessionFactory sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado emp = session.get(Empleado.class, idempleado);
			session.getTransaction().commit();
			sessionfactory.close();
			
			return emp.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "No existe Empleado";
	}
}
