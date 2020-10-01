import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Coches {

    public static void main(String[] args) {
        List<String> coches = new ArrayList<>();
        coches.add("Renault");
        coches.add("Mercedes");
        coches.add("Ford");

        List<Integer> numeroDeLetrasDeLaMarca =
                coches.stream().map(coche -> coche.length()).filter(size -> size < 5).collect(Collectors.toList());

        numeroDeLetrasDeLaMarca.stream().forEach(item -> System.out.println(item));


    }

}
