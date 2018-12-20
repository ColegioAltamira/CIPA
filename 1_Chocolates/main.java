import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        float P = Integer.parseInt(sr.nextLine());
        float N = Integer.parseInt(sr.nextLine());
        float G = Integer.parseInt(sr.nextLine());
        float L = Integer.parseInt(sr.nextLine());

        float res = (2*P+(N-P)+G)/L;

        if (0.0 == res - Math.floor(res)) {
            System.out.println((int)Math.floor(res));
        }
        else{
            System.out.println(0);
        }
    }
}