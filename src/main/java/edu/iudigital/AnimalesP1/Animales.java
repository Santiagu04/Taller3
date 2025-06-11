package edu.iudigital.AnimalesP1;
public class Animales{
    private String nombre;
    private String tipo;
    private String genero;
    
    public Animales (String nombre, String tipo, String genero){
        this.nombre = nombre;
        this.tipo = tipo.toLowerCase();
        this.genero = genero;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public String getGenero(){
        return genero;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo (String tipo){
        this.tipo = tipo.toLowerCase();
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    @Override
    public String toString(){
            return nombre;
    }
}