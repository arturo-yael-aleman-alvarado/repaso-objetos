package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6 {

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void crearAlgoritmoX_Verificar_AigualB(){
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        int a=1,b=1;
        String c="Aldo";
        algoritmoX.algoritmoACubrir(a, b, c);

        Mockito.verify(dependencia1).save(c);
        Mockito.verify(dependencia3).recover();
    }

    @Test
    public void crearAlgoritmoX_Verificar_AmenorB(){
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        int a=3,b=1;
        String c="Aldo";
        algoritmoX.algoritmoACubrir(a, b, c);

        Mockito.verify(dependencia3).send(a,b);
        Mockito.verify(dependencia3).recover();
    }
}
