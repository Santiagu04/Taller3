package edu.iudigital.AnimalesP1;
import java.util.*;

public class Principal {
    private static Map<String, List<Animales>> clasificacion = new TreeMap<>();
    private static List<Animales> animales = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Clasificación de Animales (terrestre, aéreo, acuático)");
        String continuar;
        
        do {
            System.out.print("Ingrese el nombre del Animal: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese el tipo (Terrestre, Aéreo, Acuático): ");
            String tipo = scanner.nextLine().toLowerCase();
            
            System.out.print("Ingrese el género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            
            Animales animal = new Animales(nombre, tipo, genero
            );
            animales.add(animal);
            
            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);

            System.out.print("¿Desea ingresar otro animal? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("si"));
        
        System.out.println("\n--- Clasificación de Animales ---");
        for (Map.Entry<String, List<Animales>> entry : clasificacion.entrySet()) {
            String tipo = entry.getKey();
            List<Animales> lista = entry.getValue();
            System.out.println(tipo + ":");
            for (Animales a : lista) {
                System.out.println("  - " + a.getNombre());
            }
        }
    }
}