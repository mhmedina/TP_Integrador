package pronosticos_trabajo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private List<Pronostico> pronosticos;

	public Persona(String string, String string2, int int1, int int2) {
		pronosticos = new ArrayList<Pronostico>();
		Pronostico p = new Pronostico("Equipo Local", "Equipo Visitante", int1, int2);
		Pronostico p1 = new Pronostico("Qatar", "Ecuador", 0, 2);

		pronosticos.add(p1);
		}
	

	public static void main(String[] args) {
		List<Pronostico> pronosticos = new ArrayList<>();
		pronosticos.add(new Pronostico("Qatar", "Ecuador", 0, 2));
	    
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Maria", "Perez", 5, 2));

		Pronostico pronosticoMaria = personas.get(0).pronosticos.get(0); // obtiene el primer pronóstico de la primera persona de la lista de personas

		if (pronosticoMaria.getGolesLocal() == 0 && pronosticoMaria.getGolesVisitante() == 2 && pronosticoMaria.getEquipoLocal().equals("Qatar") && pronosticoMaria.getEquipoVisitante().equals("Ecuador")) {
		    System.out.println("María Pérez acertó el resultado del partido Qatar vs Ecuador");
		} else {
		    System.out.println("María Pérez no acertó el resultado del partido Qatar vs Ecuador");
		}

	

	}
}



	
