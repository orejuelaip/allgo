package clases;

public class Paciente {
	

private int codigo;
private String Apellido;
private String Nombres;
private String Telefono;
private String Dni;
public Paciente( int codigo,String apellido, String nombres, String telefono, String dni) {
	
	this.codigo= codigo;
	this.Apellido = apellido;
	this.Nombres = nombres;
	this.Telefono = telefono;
	this.Dni = dni;
	
}
public Paciente(){
	
}
public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getNombres() {
	return Nombres;
}
public void setNombres(String nombres) {
	Nombres = nombres;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getDni() {
	return Dni;
}
public void setDni(String dni) {
	Dni = dni;
}
	


	
	
}
