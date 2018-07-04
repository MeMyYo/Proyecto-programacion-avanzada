package Generadores;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;

import objetos.Computador;

public class ComputadorGen {
	ArrayList<String>  idComputador;
	ArrayList<String> marca;
	ArrayList<LocalDate> fechaAdquisicion;
	ArrayList<LocalDate> fechaUltimaSolicitud;
	ArrayList<String> idBiblioteca;
	
	ArrayList<Computador> computadores;
	
	public ComputadorGen(int cantidad)
	{
		this.inicializarArrays();
		this.genId(cantidad);
		this.genFechaAdqu(cantidad);
		this.genMarca(cantidad);
		this.genFechaSol(cantidad);
		this.genIdBiblioteca(cantidad);
		this.genComputadores(cantidad);
	}
	
	public void inicializarArrays()
	{
		idComputador=new ArrayList<>();
		marca=new ArrayList<>();
		fechaAdquisicion=new ArrayList<>();
		this.fechaUltimaSolicitud=new ArrayList<>();
		idBiblioteca=new ArrayList<>();
		computadores=new ArrayList<>();
	}
	
	public void genId(int cant)
	{
		for (int i=0;i<cant;i++)
		{
		this.idComputador.add((this.idComputador.size()+1)+"");
		}
	}
	public void genMarca(int cant)
	{
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			String[] marcas = { "DELL", "HP", "Lenovo", "Hitachi" };
			this.marca.add(marcas[rand.nextInt(marcas.length)]);
		}
	}
	
	public void genFechaAdqu(int cant)
	{
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			int año = (rand.nextInt(25)) + 1980;
			Month[] meses = { Month.APRIL, Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.MAY, Month.JUNE,
					Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER };
			Month mes = meses[rand.nextInt(meses.length)];
			int dia = (rand.nextInt(28) + 1);
			this.fechaAdquisicion.add(LocalDate.of(año, mes, dia));
		}
	}
	
	public void genFechaSol(int cant)
	{
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			int año = (rand.nextInt(1)) + 2016;
			Month[] meses = { Month.APRIL, Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.MAY, Month.JUNE,
					Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER };
			Month mes = meses[rand.nextInt(meses.length)];
			int dia = (rand.nextInt(28) + 1);
			this.fechaUltimaSolicitud.add(LocalDate.of(año, mes, dia));
		}
	}
	
	public void genIdBiblioteca(int cant)
	{
		this.idBiblioteca.add("1");
		this.idBiblioteca.add("2");
		this.idBiblioteca.add("3");
		this.idBiblioteca.add("4");
		this.idBiblioteca.add("5");
		
		for (int i=5;i < cant; i++) {
			Random rand = new Random();
			String[] ids = { "1", "2", "3", "4","5" };
			this.idBiblioteca.add(ids[rand.nextInt(ids.length)]);
		}
	}
	
	public void genComputadores(int cant)
	{
		for(int i=0;i<cant;i++)
		{
			Computador comp=new Computador(
					this.idComputador.get(i),
					this.marca.get(i),
					this.fechaAdquisicion.get(i),
					this.fechaUltimaSolicitud.get(i),
					this.idBiblioteca.get(i)
					);
			
			this.computadores.add(comp);
		}
	}
	
	public ArrayList<Computador> getComputadores()
	{
		return this.computadores;
	}
	
	
}
