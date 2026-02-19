public class Ret {
    int base;
    int altura;

    Ret(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // ou, sem iniciação
    Ret() {
        base = 0;
        altura = 0;
    }

    double area() {
        return base * altura;
    }
}
