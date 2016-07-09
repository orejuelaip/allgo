package clases;

public class Hospitalizacion {
	private int CodHospitalizacion;
	private int CodPaciente;
	private int CodEmpleado;
	private int NumCama;
	private String FechaLlegada;
	private String HoraLlegada;
	private String FechaSalida;
	private String HoraSalida;
	private int Estado;
	public Hospitalizacion(int codHospitalizacion, int codPaciente, int codEmpleado, int numCama, String fechaLlegada,
			String horaLlegada, String fechaSalida, String horaSalida, int estado) {
		super();
		CodHospitalizacion = codHospitalizacion;
		CodPaciente = codPaciente;
		CodEmpleado = codEmpleado;
		NumCama = numCama;
		FechaLlegada = fechaLlegada;
		HoraLlegada = horaLlegada;
		FechaSalida = fechaSalida;
		HoraSalida = horaSalida;
		Estado = estado;
	}
	public int getCodHospitalizacion() {
		return CodHospitalizacion;
	}
	public void setCodHospitalizacion(int codHospitalizacion) {
		CodHospitalizacion = codHospitalizacion;
	}
	public int getCodPaciente() {
		return CodPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		CodPaciente = codPaciente;
	}
	public int getCodEmpleado() {
		return CodEmpleado;
	}
	public void setCodEmpleado(int codEmpleado) {
		CodEmpleado = codEmpleado;
	}
	public int getNumCama() {
		return NumCama;
	}
	public void setNumCama(int numCama) {
		NumCama = numCama;
	}
	public String getFechaLlegada() {
		return FechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		FechaLlegada = fechaLlegada;
	}
	public String getHoraLlegada() {
		return HoraLlegada;
	}
	public void setHoraLlegada(String horaLlegada) {
		HoraLlegada = horaLlegada;
	}
	public String getFechaSalida() {
		return FechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		FechaSalida = fechaSalida;
	}
	public String getHoraSalida() {
		return HoraSalida;
	}
	public void setHoraSalida(String horaSalida) {
		HoraSalida = horaSalida;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
	

}
