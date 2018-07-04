package Generadores;

import java.util.ArrayList;
import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import orm.Autor;

public class AutorGen {

	private ArrayList<String> idAutor;
	private ArrayList<String> nombre;
	private ArrayList<String> apellidoPaterno;
	private ArrayList<String> apellidoMaterno;
	private ArrayList<LocalDate> fechaDeNacimiento;
	private ArrayList<String> genero;
	
	private ArrayList<Autor> autores;
	
	 public AutorGen(int cantidad) 
	 {
		 inicializarArrays();
		 this.ruts(cantidad);
		 this.nombres(cantidad/2, cantidad/2);
		 this.generateFechaNacimiento(cantidad);
		 this.generateAutores(cantidad);
	 }
	 
	 public void inicializarArrays()
	 {
		 idAutor=new ArrayList<>();
		 nombre=new ArrayList<>();
		 apellidoPaterno=new ArrayList<>();
		 apellidoMaterno=new ArrayList<>();
		 fechaDeNacimiento=new ArrayList<>();
		 genero=new ArrayList<>();
		 autores=new ArrayList<>();
	 }
	 
	public void nombres(int cantHombres, int cantMujeres) {

		// agregar mas nombres y apellidos para obtener mas variedad
		String[] nombresHombre = new String[] { "Pedro", "Juan", "Diego", "Alberto", "Pablo", "Manuel", "Lorenzo",
				"Roberto", "Adrian", "Carlos", "Daniel", "Arturo", "Alexis", "Francisco", "Agustin", "Gonzalo",
				"Benjamin", "Vicente", "Martin", "Joaquin", "Jose", "Lucas", "Mateo", "Javier", "Emilio", "Santiago",
				"Esteban", "David" };
		String[] nombresMujer = new String[] { "Ana", "Martina", "Diana", "Belen", "Camila", "Daniela", "Valentina",
				"Sofia", "Florencia", "Francisca", "Isidora", "Catalina", "Agustina", "Paz", "Rocio", "Julieta",
				"Renata", "Matilda", "Paulina" };
		String[] apellido = new String[] { "Rodriguez", "Garrido", "Martines", "Rojas", "Plaza", "Toledo", "Ortiz",
				"Zapata", "Fierro", "Suazo", "Zuniga", "Ovalle", "Sanhueza", "Obreque", "Aguero", "Gonzales", "Munoz",
				"Diaz", "Vazques", "Perez", "Soto", "Contreras", "Lopez", "Mora", "Morales", "Fuentes", "Valenzuela",
				"Araya", "Sepulveda", "Espinoza", "Torres", "Castillo", "Castro", "Chavez", "Bravo", "Gomez", "Iturria",
				"Pereira", "Salinas", "Sanchez", "Ruiz", "Tapia", "Carrasco", "Cortes", "Vergara", "Oliveros",
				"Riquelme", "Salazar", "Parra", "Medina" };

		// Generar nombres de hombres
		this.nombre = generateNombresFunction(cantHombres, nombresHombre);

		// Agregar genero hombre
		for (int i = 0; i < cantHombres; i++) {
			this.genero.add("hombre");
		}

		// Generar nombres de mujeres
		ArrayList<String> nombresMujeres = generateNombresFunction(cantMujeres, nombresMujer);
		this.nombre.addAll(nombresMujeres);

		// Agregar genero mujer
		for (int i = 0; i < cantMujeres; i++) {
			this.genero.add("mujer");
		}

		// Generar apellidos paterno y materno
		int cantTotal = cantHombres + cantMujeres;
		this.apellidoPaterno = generateApellidosFunction(cantTotal, apellido);
		this.apellidoMaterno = generateApellidosFunction(cantTotal, apellido);

	}

	private ArrayList<String> generateNombresFunction(int cant, String[] nombres) {
		ArrayList<String> nombresGenerados = new ArrayList();
		String exist = "";
		for (int i = 0; i < cant; i++) {
			int nom;
			nom = (int) (Math.random() * (nombres.length));
				
			nombresGenerados.add(nombres[nom]);
			exist += nom + "";
		}
		Collections.sort(nombresGenerados);

		return nombresGenerados;

	}

	private ArrayList<String> generateApellidosFunction(int cant, String[] apellido) {
		ArrayList<String> apellidosGenerados = new ArrayList();
		String exist = "";
		for (int i = 0; i < cant; i++) {
			int ape;
			ape = (int) (Math.random() * (apellido.length));
			apellidosGenerados.add(apellido[ape]);
			exist += ape + "";
		}
		Collections.sort(apellidosGenerados);
		return apellidosGenerados;

	}

	/**
	 * Ruts
	 * 
	 * @param cant
	 *            Cantidad a generar
	 * @return ArrayList conteniendo los ruts con putnos y guión. Sin repetidos
	 *         ordenados alfabéticamente
	 */
	public void ruts(int cant) {
		ArrayList<String> ruts = new ArrayList();
		for (int i = 0; i < cant; i++) {
			String rut = "";
			int sum = 0;
			int rand1 = (int) (Math.random() * 4) + 13;
			String num1 = "" + rand1;
			rut += num1;
			int rand2 = (int) (Math.random() * 999);
			String num2 = "" + rand2;
			if (num2.length() == 2) {
				num2 = "0" + num2;
			} else if (num2.length() == 1) {
				num2 = "00" + num2;
			}
			rut += num2;
			int rand3 = (int) (Math.random() * 999);
			String num3 = "" + rand3;
			if (num3.length() == 2) {
				num3 = "0" + num3;
			} else if (num3.length() == 1) {
				num3 = "00" + num3;
			}
			sum += Integer.parseInt("" + num3.toCharArray()[2]) * 2;
			sum += Integer.parseInt("" + num3.toCharArray()[1]) * 3;
			sum += Integer.parseInt("" + num3.toCharArray()[0]) * 4;
			sum += Integer.parseInt("" + num2.toCharArray()[2]) * 5;
			sum += Integer.parseInt("" + num2.toCharArray()[1]) * 6;
			sum += Integer.parseInt("" + num2.toCharArray()[0]) * 7;
			sum += Integer.parseInt("" + num1.toCharArray()[1]) * 2;
			sum += Integer.parseInt("" + num1.toCharArray()[0]) * 3;
			int div = sum / 11;
			int resto = sum - (div * 11);
			String verificador;
			switch (resto) {
			case 11:
				verificador = "0";
				break;
			case 10:
				verificador = "K";
				break;
			default:
				verificador = "" + resto;
				break;
			}
			rut += num3 + verificador;

			if (!ruts.contains(rut)) {
				ruts.add(rut);
			} else {
				i--;
			}
		}
		this.idAutor = ruts;
	}

	/*
	 * fechaDeNacimiento
	 */
	public void generateFechaNacimiento(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			int año = (rand.nextInt(390)) + 1600;
			Month[] meses = { Month.APRIL, Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.MAY, Month.JUNE,
					Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER };
			Month mes = meses[rand.nextInt(meses.length)];
			int dia = (rand.nextInt(28) + 1);
			this.fechaDeNacimiento.add(LocalDate.of(año, mes, dia));
		}
	}
	
	public void generateAutores(int cantAutores)
	{
		for(int i=0;i<cantAutores;i++)
		{
			Autor a1=new Autor();
			a1.setIdAutor(this.idAutor.get(i));
			a1.setNombre(this.nombre.get(i));
			a1.setApellidoPaterno(this.apellidoPaterno.get(i));
			a1.setApellidoMaterno(this.apellidoMaterno.get(i));
			a1.setGenero(this.genero.get(i));
			int año=this.fechaDeNacimiento.get(i).getYear();
			int mes=this.fechaDeNacimiento.get(i).getMonthValue();
			int dia=this.fechaDeNacimiento.get(i).getDayOfMonth();
			Time tm=new Time(año,mes,dia);
			
			a1.setFechaDeNacimiento(tm);
			
			
			this.autores.add(a1);
		}
	}

	
	public ArrayList<Autor> getAutores()
	{
		return autores;
	}
}
