package clases;

public class Servicio {
	private int CodServicio;
	private String Descripcion;
	private int Tipo;
	private double Precio;
	public Servicio(int codServicio, String descripcion, int tipo, double precio) {
		
		CodServicio = codServicio;
		Descripcion = descripcion;
		Tipo = tipo;
		Precio = precio;
	}
	public int getCodServicio() {
		return CodServicio;
	}
	public void setCodServicio(int codServicio) {
		CodServicio = codServicio;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
	

}
