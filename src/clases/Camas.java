package clases;

public class Camas {
	
	
	private int NumCama;
	private int Categoria;
	private double PrecioDia;
	private int Estado;
	public Camas(int numCama, int categoria, double precioDia, int estado) {
		
		NumCama = numCama;
		Categoria = categoria;
		PrecioDia = precioDia;
		Estado = estado;
	}
	public int getNumCama() {
		return NumCama;
	}
	public void setNumCama(int numCama) {
		NumCama = numCama;
	}
	public int getCategoria() {
		return Categoria;
	}
	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public double getPrecioDia() {
		return PrecioDia;
	}
	public void setPrecioDia(double precioDia) {
		PrecioDia = precioDia;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	
	
	

}
