package Generadores;

import java.util.ArrayList;

import objetos.Ciudad;

public class CiudadGen {

	private ArrayList<Ciudad> ciudades;
	public CiudadGen()
	{
		ciudades=new ArrayList<>();
		this.generateCiudades();
	}
	
	private void generateCiudades()
	{
		Ciudad c1=new Ciudad("1","Temuco","p01");
		ciudades.add(c1);
		Ciudad c2=new Ciudad("2","Santiago","p01");
		ciudades.add(c2);
		Ciudad c3=new Ciudad("3","Buenos Aires","p02");
		ciudades.add(c3);
		Ciudad c4=new Ciudad("4","Bariloche","p02");
		ciudades.add(c4);
		Ciudad c5=new Ciudad("5","New York","p03");
		ciudades.add(c5);
	}
	
	public ArrayList<Ciudad> getCiudades()
	{
		return ciudades;
	}
}
