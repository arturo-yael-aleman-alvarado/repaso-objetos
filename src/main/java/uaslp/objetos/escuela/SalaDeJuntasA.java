package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas {
    private static SalaDeJuntasA instance;
    @Override
    public String getNombre() {
        return "Sala A";
    }

    public static SalaDeJuntasA getInstance(){
        if(instance==null){
            instance=new SalaDeJuntasA();
        }
        return instance;
    }
}
