import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        String[] palabra = sc.nextLine().split("");
        List<String> vocales = Arrays.asList("A","E","I","O","U","a","e","i","o","u");

        for (int i = 0; i < palabra.length; i++){
            if (palabra[i].equals("D")) {
                palabra[i] = "W";
                if (i > 0) {
                    if (vocales.contains(palabra[i-1])){
                        palabra[i] = "X";
                    }
                }
            }
            if (palabra[i].equals("d")) {
                palabra[i] = "w";
                if (i > 0) {
                    if (vocales.contains(palabra[i-1])){
                        palabra[i] = "x";
                    }
                    else{
                        palabra[i] = "w";
                    }
                }
            }
        }
        System.out.println(String.join("",palabra));
    }
}