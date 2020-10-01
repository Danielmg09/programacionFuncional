import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Alumnos {
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();
        alumnos.add("Bob esponja");
        alumnos.add("Patricio");
        alumnos.add("Calamardo");

        //filtrar menos de 10 letras

        List<String> alumnoMenosDe10 = alumnos.stream().filter(alumno -> alumno.length()<6). collect(Collectors.toList());
        alumnoMenosDe10.forEach(alumno -> System.out.println(alumno));


        //mapearlos en una lista con numeros de vocales







    }
}
