import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite seu email: ");
        String email = in.nextLine().trim();
        in.close();

        boolean valido = true;
        if (!email.contains("@") || !email.endsWith(".com")) {
            valido = false;
        }

        System.out.println(valido ? "Email valido" : "Email invalido");
    }
}