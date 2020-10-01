import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> cadenas = new ArrayList<String>();
        cadenas.add("Yay");
        cadenas.add("Yayy");
        cadenas.add("Yayyy");


        Optional<String> maxNumY = cadenas.stream().max((cadena1,cadena2) -> {

            ArrayList<Character> cadena1Arr = new ArrayList<Character>();
            for (char c : cadena1.toCharArray()){
                cadena1Arr.add(c);
            }
            long yEnCadena1 = cadena1Arr.stream().filter(character -> character.equals('y')).count();

            ArrayList<Character> cadena2Arr = new ArrayList<Character>();
            for (char c : cadena2.toCharArray()){
                cadena2Arr.add(c);
            }
            long yEnCadena2 = cadena2Arr.stream().filter(character -> character.equals('y')).count();

            if (yEnCadena1 > yEnCadena2){
                return 1;
            }
            if (yEnCadena1 < yEnCadena2){
                return -1;
            }
            return 0;
        });

        //isPresent: para ver si hay algo o no, y con el get lo obtenemos
        if(maxNumY.isPresent()){
            System.out.println("Max num de Y: " + maxNumY.get());
        }



    }
}
