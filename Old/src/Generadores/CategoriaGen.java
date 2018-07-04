package Generadores;

import java.util.ArrayList;

import objetos.Categoria;

public class CategoriaGen {
	ArrayList<String> idCategoria;
	ArrayList<String> nombre;
	
	ArrayList<Categoria> categorias;
	
	public CategoriaGen()
	{
		this.inicializarArrays();
		this.generateAll();
	}
	
	public void inicializarArrays()
	{
		this.idCategoria=new ArrayList<>();
		this.nombre=new ArrayList<>();
		this.categorias=new ArrayList<>();
	}
	
	public void generateAll()
	{
		Categoria c1=new Categoria("1","Accion");
		categorias.add(c1);
		Categoria c2=new Categoria("2","Romance");
		categorias.add(c2);
		Categoria c3=new Categoria("3","Historia");
		categorias.add(c3);
		Categoria c4=new Categoria("4","Leyenda");
		categorias.add(c4);
		Categoria c5=new Categoria("5","Fisica");
		categorias.add(c5);
		Categoria c6=new Categoria("6","Quimica");
		categorias.add(c6);
		Categoria c7=new Categoria("7","Biologia");
		categorias.add(c7);
		Categoria c8=new Categoria("8","Programacion");
		categorias.add(c8);
		Categoria c9=new Categoria("9","Seguridad Informatica");
		categorias.add(c9);
		Categoria c10=new Categoria("10","Sistemas operativos");
		categorias.add(c10);
		Categoria c11=new Categoria("11","Novela policiaca");
		categorias.add(c11);
		Categoria c12=new Categoria("12","Filosofia");
		categorias.add(c12);
	}
	
	public ArrayList<Categoria> getCategorias()
	{
		return categorias;
	}
}
