package Seguridad;
import java.util.ArrayList;

public class Seguridad {
    public class Camara {
        private String ubicacion;
        private boolean estado;

        public Camara(String ubicacion) {
            this.ubicacion = ubicacion;
            this.estado = false;
        }

        public void grabar() {
            if (estado) {
                System.out.println("Grabando en " + ubicacion);
            } else {
                System.out.println("La cámara en " + ubicacion + " está desactivada");
            }
        }

        public void activar() {
            estado = true;
        }

        public void desactivar() {
            estado = false;
        }
    }
    public class Sensor {
        private String ubicacion;
        private boolean estado;

        public Sensor(String ubicacion) {
            this.ubicacion = ubicacion;
            this.estado = false;
        }

        public void detectarMovimiento() {
            if (estado) {
                System.out.println("Movimiento detectado en " + ubicacion);
            } else {
                System.out.println("El sensor en " + ubicacion + " está desactivado");
            }
        }

        public void activar() {
            estado = true;
        }

        public void desactivar() {
            estado = false;
        }
    }

    public class security {
        private ArrayList<Camara> camaras;
        private ArrayList<Sensor> sensores;

        public void security() {
            camaras = new ArrayList<>();
            sensores = new ArrayList<>();
        }

        public void agregarCamara(Camara camara) {
            camaras.add(camara);
        }

        public void agregarSensor(Sensor sensor) {
            sensores.add(sensor);
        }

        public void activarCamaras() {
            for (Camara camara : camaras) {
                camara.activar();
            }
        }

        public void desactivarCamaras() {
            for (Camara camara : camaras) {
                camara.desactivar();
            }
        }

        public void activarSensores() {
            for (Sensor sensor : sensores) {
                sensor.activar();
            }
        }

        public void desactivarSensores() {
            for (Sensor sensor : sensores) {
                sensor.desactivar();
            }
        }
    }

}
