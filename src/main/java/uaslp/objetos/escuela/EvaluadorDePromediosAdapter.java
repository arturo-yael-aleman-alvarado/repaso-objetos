package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {

    private EvaluadorDePromedios evaluadorDePromedios;
    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }
    public double evalua(String listaDeCalificaciones){
        List<String> listaCalificacionesCadena = new ArrayList<String>(Arrays.asList(listaDeCalificaciones.split(",")));
        List<Double> ListaCalifiaciones = new ArrayList<>();
        for(int i=0; i< listaCalificacionesCadena.size(); i++){
            String aux = listaCalificacionesCadena.get(i);
            ListaCalifiaciones.add(Double.parseDouble(aux));
        }
        return evaluadorDePromedios.evalua(ListaCalifiaciones);
    }
}