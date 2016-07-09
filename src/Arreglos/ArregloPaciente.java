package Arreglos;

import java.util.ArrayList;
import java.util.Iterator;

import clases.Paciente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArregloPaciente {
	private ArrayList <Paciente> pac;
	private static int autog =0;
	
	
public ArregloPaciente() {
		pac= new  ArrayList <Paciente>();
		cargar();
}

	

public void agregarPaciente(Paciente  P){
	//validar que el cogdigo de r no este en otro objeto
	Paciente objRadio=null;
	int encontrado=0; // o : no entrado
	for(int i=0; i< tamano();i++){
		objRadio=obtener(i);
		if(objRadio.getCodigo()==P.getCodigo()){
			encontrado=1; // 1: si encontrado
		}
	}
	if(encontrado==0){
		pac.add(P);
	}
}
public void grabar(){
	try{
			FileWriter fr = new FileWriter("Pacientes.txt");
			PrintWriter pw = new PrintWriter(fr);
			
			for(Paciente P: pac){
				pw.println( P.getCodigo()+","+
							P.getNombres()+","+
							P.getApellido()+","+
							P.getDni()+","+
							P.getTelefono());
			}
			pw.close();//Cierra y envia los cambios

		}catch(Exception e){
			e.printStackTrace();	
		}
}
public void cargar(){
	try{
			FileReader fr = new FileReader("Pacientes.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea = null;
			while((linea = br.readLine())!= null){
				String[] sep = linea.split(",");//Separa
				Paciente T = new Paciente();
				T.setCodigo(Integer.parseInt(sep[0].trim()));
				T.setNombres(sep[1].trim());
				T.setApellido(sep[1].trim());
				T.setDni(sep[2].trim());
				T.setTelefono(sep[3].trim());
			    pac.add(T);
			}
		}catch(Exception e){
			e.printStackTrace();	
		}
}
public int retornarCod(){
	return autog;
}
public void generarCodigo() {
	autog++;
}
public void eliminar(Paciente P){
	pac.remove(P);
}
public void modificarPaciente(int indice,Paciente pacc){
	pac.set(indice, pacc);

}

public int tamano(){
	return pac.size();
}
public Paciente obtener(int i){
	return pac.get(i);
}
public void Modificar(Paciente p){
	Paciente P = null;
	int i=0;
	while(i < tamano()){
		P= obtener(i);
		if(P.getCodigo()== p.getCodigo()){
			pac.set(i,p);
			break;
		}
		i++;
	}

	
}
public Paciente buscarPaciente(int cod){
	Paciente P = null;
	int i=0;
	while(i < tamano()){
		P= obtener(i);
		i++;
		if(P.getCodigo()== cod){
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
