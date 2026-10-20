package figuras21;

    public class Circulo extends Figura2D {

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String imprimeFigura() {

        double area = Math.PI * radio * radio;

        return "Círculo\n" +
               "Radio: " + radio +
               "\nÁrea: " + area;
    }
}


