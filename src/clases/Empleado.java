package clases;

public class Empleado {

	private int CodEmpreado;
	private String Apellido;
	private String Nombres;
	private int TipoEmpleado;
	private String Login;
	private String password;
	private int Turno;
	public Empleado(int codEmpreado, String apellido, String nombres, int tipoEmpleado, String login, String password,
			int turno) {
		
		CodEmpreado = codEmpreado;
		Apellido = apellido;
		Nombres = nombres;
		TipoEmpleado = tipoEmpleado;
		Login = login;
		this.password = password;
		Turno = turno;
	}
	public int getCodEmpreado() {
		return CodEmpreado;
	}
	public void setCodEmpreado(int codEmpreado) {
		CodEmpreado = codEmpreado;
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
	public int getTipoEmpleado() {
		return TipoEmpleado;
	}
	public void setTipoEmpleado(int tipoEmpleado) {
		TipoEmpleado = tipoEmpleado;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTurno() {
		return Turno;
	}
	public void setTurno(int turno) {
		Turno = turno;
	}
	
	
	
}
