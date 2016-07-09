package Arreglos;

import java.util.ArrayList;

import clases.Camas;

public class ArreglosCamas {
	private ArrayList <Camas> pac;
	private static int autog =0;
	
	
public ArreglosCamas (){
		pac= new  ArrayList <Camas>();
}

public void agregarCama(Camas  P){
	pac.add(P);
}	

public int retornarCod(){
	return autog;
}
public void generarCodigo() {
	autog++;
}
public void eliminar(Camas P){
	pac.remove(P);
}


public int tamano(){
	return pac.size();
}
public Camas obtener(int i){
	return pac.get(i);
}
public void Modificar(Camas p){
	Camas P = null;
	int i=0;
	while(i < tamano()){
		P= obtener(i);
		if(P.getNumCama()== p.getNumCama()){
			pac.set(i,p);
			break;
		}
		i++;
	}

	
}
public Camas buscarCamas(int cod){
	Camas P = null;
	int i=0;
	while(i < tamano()){
		P= obtener(i);
		i++;
		if(P.getNumCama()== cod){
			break;
		}
		else{
			P=null;
			break;
		}
		
	}
	return P;
}


	

}
