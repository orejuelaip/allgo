package clases;

public class Consumo {
	private int CodConsumo;
	private int CodPaciente;
	private String FechaConsumo;
	private double TotalPagar;
	private int Estado;
	public Consumo(int codConsumo, int codPaciente, String fechaConsumo, double totalPagar, int estado) {
		
		CodConsumo = codConsumo;
		CodPaciente = codPaciente;
		FechaConsumo = fechaConsumo;
		TotalPagar = totalPagar;
		Estado = estado;
	}
	public int getCodConsumo() {
		return CodConsumo;
	}
	public void setCodConsumo(int codConsumo) {
		CodConsumo = codConsumo;
	}
	public int getCodPaciente() {
		return CodPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		CodPaciente = codPaciente;
	}
	public String getFechaConsumo() {
		return FechaConsumo;
	}
	public void setFechaConsumo(String fechaConsumo) {
		FechaConsumo = fechaConsumo;
	}
	public double getTotalPagar() {
		return TotalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		TotalPagar = totalPagar;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}

}
