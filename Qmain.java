import java.util.Scanner;

public class Qmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o lado do quadrado: ");
        
        int lado = sc.nextInt();
        Quadrado q1 = new Quadrado(lado);
        
        System.out.println(q1.lado);
        System.out.println(q1.area());
        System.out.println(q1.comprimento());
        
        q1.desenha(lado);

    }
}
