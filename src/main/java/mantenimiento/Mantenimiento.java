package mantenimiento;

import java.util.Date;

class mantenimiento {
    private String tipo;
    private Date fecha;
    private String estado;
    private String descripcion;
    private String instalacion;

    public mantenimiento(String tipo, Date fecha, String descripcion, String instalacion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.instalacion = instalacion;
        this.estado = "Programado";
    }

    public void iniciarMantenimiento() {
        this.estado = "En progreso";
    }

    public void completarMantenimiento() {
        this.estado = "Completado";
    }

    // Getters
    public String getTipo() {
        return this.tipo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getInstalacion() {
        return this.instalacion;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
}