package edu.iudigital.ColeccionesP2_3;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double sueldohora;
    private String cargo;

    public Persona(String nombre, String apellido, int edad, String genero, double sueldohora, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.sueldohora = sueldohora;
        this.cargo = cargo;
    }

    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public String getApellido() { 
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido; 
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getSueldohora() {
        return sueldohora;
    }
    public void setSueldohora(double sueldohora) {
        this.sueldohora = sueldohora;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", edad: " + edad + ", género: " + genero + ", sueldo/hora: " + sueldohora + ", cargo: " + cargo;
    }
}