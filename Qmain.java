import java.util.Scanner;

public class Qmain {
    public static void main(String[] args) {
        System.out.println("Digite o lado do quadrado: ");
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();
        Quadrado q1 = new Quadrado(lado);
        System.out.println(q1.lado);
        System.out.println(q1.area());
        System.out.println(q1.comprimento());
        q1.desenha(lado);

    }
}