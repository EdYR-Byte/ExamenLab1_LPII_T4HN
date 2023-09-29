package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@Column(name="IdEmpleado")
	private int idempleado;
	@Column(name="Apellidos")
	private String apellidos;
	@Column(name="Nombres")
	private String nombres;
	@Column(name="Edad")
	private int edad;
	@Column(name="Sexo")
	private String sexo;
	@Column(name="Salario")
	private int salario;
	
	
	
	public Empleado() {
	}

	public Empleado(String apellidos, String nombres, int edad, String sexo, int salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public int getSalario() {
		return salario;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	

}
