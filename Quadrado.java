public class Quadrado {
    int lado;
    int base;
    int altura;
    int raio;

    Quadrado(int lado) {
        this.lado = lado;
    }

    Quadrado() {
        lado = 0;
    }

    double area() {
        return base * altura;
    }

    double comprimento() {
        return this.lado * 4;
    }

    void desenha(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

}
