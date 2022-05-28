package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String sala) {
        if (sala == "Sala A") {
            return SalaDeJuntasA.getInstance();

        } else if (sala == "Sala B") {
            return SalaDeJuntasB.getInstance();

        }else if (sala == "Sala C") {
            return SalaDeJuntasC.getInstance();

        }
        return null;

    }

    public SalaDeJuntasFactory(){

    }
}
