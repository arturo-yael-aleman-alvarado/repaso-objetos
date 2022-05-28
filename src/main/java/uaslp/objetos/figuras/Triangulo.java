package uaslp.objetos.figuras;

public class Triangulo implements Figura{

    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura){
        if (base == 0) {
            throw new BaseNoProvistaException();
        }else if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base == 0) {
            throw new BaseNoProvistaException();
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        this.altura = altura;
    }

    public double getArea() {
        if (base == 0) {
            throw new BaseNoProvistaException();
        } else if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public String getName() {
        return "Triangulo";
    }

    public String getDescription() {
        return "Cualquier poligono de 3 aristas";
    }
}