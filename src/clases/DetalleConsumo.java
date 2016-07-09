package clases;

public class DetalleConsumo {
	private int CodConsumo;
	private int CodProducto;
	private int Cantidad;
	private double PrecioUnitario;
	private double Subtotal;
	public DetalleConsumo(int codConsumo, int codProducto, int cantidad, double precioUnitario, double subtotal) {
		
		CodConsumo = codConsumo;
		CodProducto = codProducto;
		Cantidad = cantidad;
		PrecioUnitario = precioUnitario;
		Subtotal = subtotal;
	}
	public int getCodConsumo() {
		return CodConsumo;
	}
	public void setCodConsumo(int codConsumo) {
		CodConsumo = codConsumo;
	}
	public int getCodProducto() {
		return CodProducto;
	}
	public void setCodProducto(int codProducto) {
		CodProducto = codProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	public double getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}
	
	

}
