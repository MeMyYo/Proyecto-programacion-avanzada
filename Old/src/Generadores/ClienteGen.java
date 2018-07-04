package Generadores;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import objetos.Cliente;

public class ClienteGen {

	/*
	 * String RUN; String nombre; String apellidoPaterno; String apellidoMaterno;
	 * String genero; String fechaDeNacimiento; String estadoDeTrabajo; String
	 * areaDeInteres; int diasDeAtraso; String idCiudad; int numeroDeCelular; int
	 * numeroDeTelefono; String correoElectronico;
	 */

	private ArrayList<String> runs;
	private ArrayList<String> nombre;
	private ArrayList<String> apellidoPaterno;
	private ArrayList<String> apellidoMaterno;
	private ArrayList<String> genero;
	private ArrayList<LocalDate> fechaDeNacimiento;
	private ArrayList<String> estadoDeTrabajo;
	private ArrayList<String> areaDeInteres;
	private ArrayList<Integer> diasDeAtraso;
	private ArrayList<Integer> numeroDeCelular;
	private ArrayList<Integer> numeroDeTelefono;
	private ArrayList<String> correoElectronico;
	private ArrayList<Cliente> clientes;
	private ArrayList<String> idCiudad;

	public ClienteGen(int cantClientes) {
		initializeArrayLists();
		//---
		this.nombres(cantClientes / 2, cantClientes / 2);
		this.ruts(cantClientes);
		this.generateFechaNacimiento(cantClientes);
		this.generateEstadoDeTrabajo(cantClientes);
		this.generateAreaDeInteres(cantClientes);
		this.generateDiasDeAtraso(cantClientes);
		this.generateNumeroDeCelular(cantClientes);
		this.generateNumeroDeTelefono(cantClientes);
		this.generateCorreoElectronico(cantClientes);
		this.generateidCiudad(cantClientes);
		//---
		this.generateClientsObjects(cantClientes);
	}
	
	private void generateClientsObjects(int cantClientes) {
		for(int i=0;i<cantClientes;i++)
		{
			String runLocal=this.runs.get(i);
			String nombreLocal=this.nombre.get(i);
			String apellidoPatLocal=this.apellidoPaterno.get(i);
			String apellidoMatLocal=this.apellidoMaterno.get(i);
			String generoLocal=this.genero.get(i);
			LocalDate fechaDeNacimientoLocal=this.fechaDeNacimiento.get(i);
			String estadoDeTrabajoLocal=this.estadoDeTrabajo.get(i);
			String areaDeInteresLocal=this.areaDeInteres.get(i);
			int diasDeAtrasoLocal=this.diasDeAtraso.get(i);
			int numeroDeCelularLocal=this.numeroDeCelular.get(i);
			int numeroDeTelefonoLocal=this.numeroDeTelefono.get(i);
			String correoElectronicoLocal=this.correoElectronico.get(i);
			String idCiudadLocal=this.idCiudad.get(i);
			Cliente cl=new Cliente(runLocal, nombreLocal, apellidoPatLocal, apellidoMatLocal, generoLocal, fechaDeNacimientoLocal, 
					estadoDeTrabajoLocal, areaDeInteresLocal, diasDeAtrasoLocal, numeroDeCelularLocal, numeroDeTelefonoLocal, 
					correoElectronicoLocal, idCiudadLocal);
			this.clientes.add(cl);
		}
		
	}

	public void initializeArrayLists()
	{
		this.runs=new ArrayList<>();
		this.nombre=new ArrayList<>();
		this.apellidoPaterno=new ArrayList<>();
		this.apellidoMaterno=new ArrayList<>();
		this.genero=new ArrayList<>();
		this.fechaDeNacimiento=new ArrayList<>();
		this.estadoDeTrabajo=new ArrayList<>();
		this.areaDeInteres=new ArrayList<>();
		this.diasDeAtraso=new ArrayList<>();
		this.numeroDeCelular=new ArrayList<>();
		this.numeroDeTelefono=new ArrayList<>();
		this.correoElectronico=new ArrayList<>();
		this.clientes=new ArrayList<>();
		this.idCiudad=new ArrayList<>();
	}

	/**
	 * Nombres
	 * 
	 * @param cant
	 *            Cantidad a generar
	 * @return ArrayList conteniendo los nombres en formato "Apellido Nombre". Sin
	 *         repetidos ordenados alfabéticamente
	 */
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
		this.runs = ruts;
	}

	/*
	 * fechaDeNacimiento
	 */
	public void generateFechaNacimiento(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			int año = (rand.nextInt(40)) + 1960;
			Month[] meses = { Month.APRIL, Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.MAY, Month.JUNE,
					Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER };
			Month mes = meses[rand.nextInt(meses.length)];
			int dia = (rand.nextInt(28) + 1);
			this.fechaDeNacimiento.add(LocalDate.of(año, mes, dia));
		}
	}

	/*
	 * estadoDeTrabajo
	 */
	public void generateEstadoDeTrabajo(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			String[] estados = { "empleado", "cesante", "estudiante", "inhabilitado" };
			this.estadoDeTrabajo.add(estados[rand.nextInt(estados.length)]);
		}
	}

	/*
	 * Area de interes
	 */
	public void generateAreaDeInteres(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			String[] areas = { "informatica", "filosofia", "ciencias", "historia", "educacion", "novelas" };
			this.areaDeInteres.add(areas[rand.nextInt(areas.length)]);
		}
	}

	/*
	 * Dias de atraso
	 */
	public void generateDiasDeAtraso(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();
			this.diasDeAtraso.add(rand.nextInt(6));
		}
	}

	/*
	 * numero de celular
	 */
	public void generateNumeroDeCelular(int cant) {
		int numeroCelular = 900000001;
		for (int i = 0; i < cant; i++) {
			this.numeroDeCelular.add(numeroCelular++);

		}
	}

	/*
	 * numero de telefono
	 */
	public void generateNumeroDeTelefono(int cant) {
		int numeroTelefono = 452000001;
		for (int i = 0; i < cant; i++) {
			this.numeroDeTelefono.add(numeroTelefono++);

		}
	}

	/*
	 * correo electronico
	 */
	public void generateCorreoElectronico(int cant) {
		for (int i = 0; i < cant; i++) {
			String nombreLocal = this.nombre.get(i);
			String apellidoLocal = this.apellidoPaterno.get(i);
			String runLocal = this.runs.get(i);
			this.correoElectronico.add(nombreLocal + "." + apellidoLocal + "-" + runLocal + "@bibClient.com");
		}
	}

	/*
	 * idCiudad
	 */
	public void generateidCiudad(int cant) {
		for (int i = 0; i < cant; i++) {
			Random rand = new Random();

			this.idCiudad.add(((rand.nextInt(5) + 1) + ""));

			// Se crearan 3 ciudades
		}

	}

	public ArrayList<String> getRuns() {
		return runs;
	}

	public ArrayList<String> getNombre() {
		return nombre;
	}

	public ArrayList<String> getApellidoPaterno() {
		return apellidoPaterno;
	}

	public ArrayList<String> getApellidoMaterno() {
		return apellidoMaterno;
	}

	public ArrayList<String> getGenero() {
		return genero;
	}

	public ArrayList<LocalDate> getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public ArrayList<String> getEstadoDeTrabajo() {
		return estadoDeTrabajo;
	}

	public ArrayList<String> getAreaDeInteres() {
		return areaDeInteres;
	}

	public ArrayList<Integer> getDiasDeAtraso() {
		return diasDeAtraso;
	}

	public ArrayList<Integer> getNumeroDeCelular() {
		return numeroDeCelular;
	}

	public ArrayList<Integer> getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public ArrayList<String> getCorreoElectronico() {
		return correoElectronico;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<String> getIdCiudad() {
		return idCiudad;
	}

}
