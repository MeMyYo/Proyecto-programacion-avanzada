package Generadores;

import java.util.ArrayList;

import objetos.Pais;
public class PaisGen {

	ArrayList<Pais> paises;
	
	public PaisGen()
	{
		paises=new ArrayList<>();
		this.generatePaises();
	}
	
	public void generatePaises()
	{
		Pais p1=new Pais("p01","Chile");
		this.paises.add(p1);
		Pais p2=new Pais("p02","Argentina");
		this.paises.add(p2);
		Pais p3=new Pais("p03","Estados Unidos");
		this.paises.add(p3);
	}
	
	public ArrayList<Pais> getPaises()
	{
		return paises;
	}
}
