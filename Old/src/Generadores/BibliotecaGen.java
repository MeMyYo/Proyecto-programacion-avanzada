package Generadores;

import java.util.ArrayList;

import orm.Biblioteca;

public class BibliotecaGen {
	ArrayList<String> nombre;
	ArrayList<String> idBiblioteca;
	ArrayList<String> direccion;
	ArrayList<String> idCiudad;
	ArrayList<String> propietario;
	ArrayList<Integer> numeroDeTelefono;
	ArrayList<String> correoElectronico;
	
	ArrayList<Biblioteca> bibliotecas;
	public BibliotecaGen() 
	{
		this.inicializarArrays();
		this.generateAll();
	}
	
	public void inicializarArrays()
	{
		this.nombre=new ArrayList<>();
		this.idBiblioteca=new ArrayList<>();
		this.direccion=new ArrayList<>();
		this.idCiudad=new ArrayList<>();
		this.propietario=new ArrayList<>();
		this.numeroDeTelefono=new ArrayList<>();
		this.correoElectronico=new ArrayList<>();
		this.bibliotecas=new ArrayList<>();
	}
	
	public void generateAll()
	{
		Biblioteca b1=new Biblioteca("bibTemuco1","1","calleTemuco","1","Miguel Jimenez",452123123,"bibTemuco1@biblioteca.com");
		this.bibliotecas.add(b1);
		Biblioteca b2=new Biblioteca("bibSantiago1","2","calleSantiago","2","Jacinto Rojas",452124124,"bibSantiago1@biblioteca.com");
		this.bibliotecas.add(b2);
		Biblioteca b3=new Biblioteca("bibBuenosAires1","3","calleBuenosAires","3","Facundo Vega",452223223,"bibBuenosAires1@biblioteca.com");
		this.bibliotecas.add(b3);
		Biblioteca b4=new Biblioteca("bibBariloche1","4","calleBariloche","4","Armando Casas",452323323,"bibBariloche1@biblioteca.com");
		this.bibliotecas.add(b4);
		Biblioteca b5=new Biblioteca("bibNewYork1","5","calleNewYork","5","Mark Nier",452823823,"bibNewYork1@biblioteca.com");
		this.bibliotecas.add(b5);
	}
	
	public ArrayList<Biblioteca> getBibliotecas()
	{
		return this.bibliotecas;
	}
}
