package uaslp.objetos.figuras;

public class Cuadrado implements Figura{

    private double lado;
    private double area;

    public Cuadrado(double lado){
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado = lado;
    }

    public Cuadrado(){
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        this.lado = lado;
    }

    public double getArea() {
        if(lado == 0){
            throw new LadoNoProvistoException();
        }
        area = lado * lado;
        return area;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }
}
