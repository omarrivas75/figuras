package figuras21;

public class Principal {

    public static void main(String[] args) {

        Figura2D f = new TrianguloRect(3,4);

        System.out.println(f.imprimeFigura());

        System.out.println();

        f = new Circulo(3);

        System.out.println(f.imprimeFigura());

    }
}
