package animales;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class animales_aviario {
    public static class animal_aviario extends animales {
        // Add your modifications here

        boolean vuela;
        boolean pico;
        boolean plumaje;
        String tipo_aviario;



        public boolean isVuela() {
            return vuela;
        }
          @Test
        public void setVuela() {
            this.vuela = vuela;
        }

        public boolean isPico() {
            return pico;
        }
        @Test
        public void setPico() {
            this.pico = pico;
        }

        public boolean isPlumaje() {
            return plumaje;
        }
        @Test
        public void setPlumaje() {
            this.plumaje = plumaje;
        }

        public String getTipo_aviario() {
            return tipo_aviario;
        }
        @Test
        public void setTipo_aviario() {
            this.tipo_aviario = tipo_aviario;
        }

    }
}
