package clases;

public class Medicamento {
	
	private int CodMedicamento;
	private String Nombre;
	private String Laboratorio;
	private double Precio;
	private int Stock;
	public Medicamento(int codMedicamento, String nombre, String laboratorio, double precio, int stock) {
		
		CodMedicamento = codMedicamento;
		Nombre = nombre;
		Laboratorio = laboratorio;
		Precio = precio;
		Stock = stock;
	}
	public int getCodMedicamento() {
		return CodMedicamento;
	}
	public void setCodMedicamento(int codMedicamento) {
		CodMedicamento = codMedicamento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getLaboratorio() {
		return Laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		Laboratorio = laboratorio;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	

}
