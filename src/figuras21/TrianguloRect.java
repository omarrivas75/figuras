package figuras21;

public class TrianguloRect extends Figura2D {

    private final double base;
    private final double altura;

    public TrianguloRect(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String imprimeFigura() {

        double area = (base * altura) / 2;

        return "Triángulo Rectángulo\n" +
               "Base: " + base +
               "\nAltura: " + altura +
               "\nÁrea: " + area;
    }
}