package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion instace;
    public static Direccion getInstance(){
        if(instace==null){
            instace=new Direccion();
        }
        return instace;
    }

    private Direccion(){}
}
