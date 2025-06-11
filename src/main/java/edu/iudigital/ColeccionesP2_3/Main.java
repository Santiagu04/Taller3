package edu.iudigital.ColeccionesP2_3;
public class Main {
    public static void main(String[] args) {
        Colecciones gestor = new Colecciones ();
        
        gestor.ingresarPersonas();
        gestor.mostrarCantidad();
        gestor.mostrarPromedioEdad();
        gestor.mostrarMayoresEdad();
        gestor.mostrarNombresConA();
        gestor.mostrarApellidosConM();
        
        gestor.mostrarSueldoDirectoresMasculinos();
        gestor.mostrarPrimeraDesarrolladoraFemenina();
        gestor.mostrarDesarrolladorQueMasGana();
        gestor.mostrarMujeresOrdenadasPorNombre();
    }
}
