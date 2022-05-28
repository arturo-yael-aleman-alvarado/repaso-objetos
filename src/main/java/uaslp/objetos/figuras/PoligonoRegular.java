package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{

    private int lados;
    private double lado;
    private double area;

    public PoligonoRegular(int lados, double lado){
        if(lados < 5){
            throw new NumeroInvalidoDeLados("Number of sides valid from 5");
        }
        this.lados = lados;
        this.lado = lado;
    }

    public PoligonoRegular(int lados){
        if(lados < 5){
            throw new NumeroInvalidoDeLados("\n" + "Number of sides valid from 5");
        }

        this.lados = lados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lados < 5){
            throw new NumeroInvalidoDeLados("Number of sides valid from 5");
        }
        this.lado = lado;
    }

    public double getArea() {
        double perimetro;
        double apotema;
        double angulo;

        perimetro = lado * lados;
        angulo = 360 / lados;
        apotema = lado / (2 * Math.tan(Math.toRadians(angulo / 2)));
        area = (perimetro * apotema) / 2;
        return area;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
