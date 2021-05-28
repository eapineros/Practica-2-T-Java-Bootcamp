package ejercicio2;

public class Circulo extends FiguraGeometrica {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    //Getter and Setters

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
