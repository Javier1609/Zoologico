package animales;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class animales_terrestres {
    public static class animales_terrestre extends animales{

        boolean patas;
        boolean cola;
        boolean pelaje;
        String tipo_terrestre;


        public boolean isPatas() {
            return patas;
        }
          @Test
        public void setPatas() {
            this.patas = patas;
        }

        public boolean isCola() {
            return cola;
        }
       @Test
        public void setCola() {
            this.cola = cola;
        }

        public boolean isPelaje() {
            return pelaje;
        }
       @Test
        public void setPelaje() {
            this.pelaje = pelaje;
        }

        public String getTipo_terrestre() {
            return tipo_terrestre;
        }
       @Test
        public void setTipo_terrestre() {
            this.tipo_terrestre = tipo_terrestre;
        }


    }
}
