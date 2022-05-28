package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas {
    private static SalaDeJuntasC instance;
    @Override
    public String getNombre() {
        return "Sala C";
    }

    public static SalaDeJuntasC getInstance(){
        if(instance==null){
            instance=new SalaDeJuntasC();
        }
        return instance;
    }
}
