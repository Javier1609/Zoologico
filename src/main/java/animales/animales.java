package animales;

import org.junit.Test;

public class animales {


    String nombre;
    String especie;
    String raza;
    String color;
    String sexo;
    String edad;
    String peso;
    String altura;
    String tipo;
    String habitat;
    String alimentacion;
    String reproduccion;
    String cuidados;
    String enfermedades;
    String vacunas;
    boolean salud;
    boolean comportamiento;
    int id;


    public void animales (String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.id = id;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }




    public String getNombre() {
        return nombre;
    }

    @Test
    public void setNombre() {
        this.nombre = nombre;
    }


    public String getEspecie() {
        return especie;
    }

      @Test
    public void setEspecie() {
        this.especie = especie;
    }


    public String getRaza() {
        return raza;
    }

     @Test
    public void setRaza() {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }

     @Test
    public void setColor() {
        this.color = color;
    }


    public String getSexo() {
        return sexo;
    }

     @Test
    public void setSexo() {
        this.sexo = sexo;
    }


    public String getEdad() {
        return edad;
    }

  @Test
    public void setEdad() {
        this.edad = edad;
    }


    public String getPeso() {
        return peso;
    }

   @Test
    public void setPeso() {
        this.peso = peso;
    }


    public String getAltura() {
        return altura;
    }

    @Test
    public void setAltura() {
        this.altura = altura;
    }


    public String getTipo() {
        return tipo;
    }

   @Test
    public void setTipo() {
        this.tipo = tipo;
    }


    public String getHabitat() {
        return habitat;
    }

    @Test
    public void setHabitat() {
        this.habitat = habitat;
    }


    public String getAlimentacion() {
        return alimentacion;
    }

    @Test
    public void setAlimentacion() {
        this.alimentacion = alimentacion;
    }


    public String getReproduccion() {
        return reproduccion;
    }

    @Test
    public void setReproduccion() {
        this.reproduccion = reproduccion;
    }


    public String getCuidados() {
        return cuidados;
    }

    @Test
    public void setCuidados() {
        this.cuidados = cuidados;
    }


    public String getEnfermedades() {
        return enfermedades;
    }

    @Test
    public void setEnfermedades() {
        this.enfermedades = enfermedades;
    }


    public String getVacunas() {
        return vacunas;
    }

   @Test
    public void setVacunas() {
        this.vacunas = vacunas;
    }


    public int getId() {
        return id;
    }

    @Test
    public void setId() {
        this.id = id;
    }

    public boolean isSalud() {
        return salud;
    }
    @Test
    public void setSalud() {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }
     @Test
    public void setComportamiento() {
        this.comportamiento = comportamiento;
    }

    public void buenasalud(boolean salud) {
        if (salud == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de salud");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de salud");
    }

    public void buencomportamiento(boolean comportamiento) {
        if (comportamiento == true)
            System.out.println("El animal " + nombre + " se encuentra en buen estado de comportamiento");
        else
            System.out.println("El animal " + nombre + " se encuentra en mal estado de comportamiento");
    }

    //metodo para registrar la alimentación
    public void registrarAlimentacion(String alimento) {
        System.out.println("El animal " + nombre + " ha sido alimentado con " + alimento);
    }

    //metodo para registrar la reproducción
    public void registrarReproduccion(String pareja) {
        System.out.println("El animal " + nombre + " ha tenido una relación con " + pareja);
    }
    //metodo para registrar los cuidados
    public void registrarCuidados(String cuidado) {
        System.out.println("El animal " + nombre + " ha sido cuidado con " + cuidado);
    }
    //metodo para registrar las enfermedades
    public void registrarEnfermedades(String enfermedad) {
        System.out.println("El animal " + nombre + " ha sido diagnosticado con " + enfermedad);
    }
    //metodo para registrar las vacunas
    public void registrarVacunas(String vacuna) {
        System.out.println("El animal " + nombre + " ha sido vacunado con " + vacuna);
    }
    //metodo para registrar el habitat
    public void registrarHabitat(String habitat) {
        System.out.println("El animal " + nombre + " ha sido trasladado a " + habitat);
    }
    //metodo para registrar el peso
    public void registrarPeso(String peso) {
        System.out.println("El animal " + nombre + " ha sido pesado y su peso es " + peso);
    }
    //metodo para registrar la altura
    public void registrarAltura(String altura) {
        System.out.println("El animal " + nombre + " ha sido medido y su altura es " + altura);
    }
    //metodo para registrar la edad
    public void registrarEdad(String edad) {
        System.out.println("El animal " + nombre + " ha sido medido y su edad es " + edad);
    }
    //metodo para registrar el color
    public void registrarColor(String color) {
        System.out.println("El animal " + nombre + " ha sido medido y su color es " + color);
    }
    //metodo para registrar la raza
    public void registrarRaza(String raza) {
        System.out.println("El animal " + nombre + " ha sido medido y su raza es " + raza);
    }
    //metodo para registrar la especie
    public void registrarEspecie(String especie) {
        System.out.println("El animal " + nombre + " ha sido medido y su especie es " + especie);
    }
    //metodo para registrar el nombre
    public void registrarNombre(String nombre) {
        System.out.println("El animal " + nombre + " ha sido medido y su nombre es " + nombre);
    }
    //metodo para registrar el sexo
    public void registrarSexo(String sexo) {
        System.out.println("El animal " + nombre + " ha sido medido y su sexo es " + sexo);
    }
    //metodo para registrar el tipo
    public void registrarTipo(String tipo) {
        System.out.println("El animal " + nombre + " ha sido medido y su tipo es " + tipo);
    }
    //metodo para registrar el id
    public void registrarId(int id) {
        System.out.println("El animal " + nombre + " ha sido medido y su id es " + id);
    }

    public void registrarSalud(boolean salud) {
        System.out.println("El animal " + nombre + " ha sido medido y su salud es " + salud);

       }


    //metodo para registrar el comportamiento
    public void registrarComportamiento(boolean comportamiento) {
        System.out.println("El animal " + nombre + " ha sido medido y su comportamiento es " + comportamiento);
    }






}