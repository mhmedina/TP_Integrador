//este tambien funciona 

package pronosticos_trabajo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    //Esto me esta permitiendo leer los resultados y pronosticos desde archivos externos
	private static final String ARCHIVO_RESULTADOS = "C:\\CURSO_JAVA\\GUIAS\\TRABAJOINTEGRADO\\resultadosCSV.CSV";
    private static final String ARCHIVO_PRONOSTICO = "C:\\CURSO_JAVA\\GUIAS\\TRABAJOINTEGRADO\\pronosticoCSV.CSV";
    

    public static void main(String[] args) {
        leerArchivoPronostico();
        leerArchivoResultados();
    }

    private static void leerArchivoPronostico() {
        Path ruta = Paths.get(ARCHIVO_PRONOSTICO);

        try (BufferedReader reader = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)) {
            List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);

            for (String linea : lineas) {
                System.out.println(linea.replace(';', '|'));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    // Aqui los lee  y muestra los valores en consola
    private static void leerArchivoResultados() {
        Path ruta = Paths.get(ARCHIVO_RESULTADOS);

        try (BufferedReader reader = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)) {
            List<String> lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);

            for (String linea : lineas) {
                System.out.println(linea.replace(';', '\t'));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        {
        	
        }
    }
}


	

	

