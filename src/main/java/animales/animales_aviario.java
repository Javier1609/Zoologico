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

        public void setVuela(boolean vuela) {
            this.vuela = vuela;
        }

        public boolean isPico() {
            return pico;
        }

        public void setPico(boolean pico) {
            this.pico = pico;
        }

        public boolean isPlumaje() {
            return plumaje;
        }

        public void setPlumaje( boolean plumaje) {
            this.plumaje = plumaje;
        }

        public String getTipo_aviario() {
            return tipo_aviario;
        }

        public void setTipo_aviario(boolean Tipo_Aviario)  {this.tipo_aviario = tipo_aviario;
        }

    }

}
