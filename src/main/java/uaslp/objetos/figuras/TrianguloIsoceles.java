package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo{

    @Override
    public String getName() {
        return "Triangulo Isoceles";
    }

    public String getDescription() {
        return "Contiene 2 aristas de medidas equivalentes y 1 diferente";
    }
}