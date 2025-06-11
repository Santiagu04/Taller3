package edu.iudigital.ColeccionesP2_3;
import java.util.*;
import java.util.stream.Collectors;

public class Colecciones {
    private Scanner sc = new Scanner(System.in);
    private List<Persona> personas = new ArrayList<>();

    public void ingresarPersonas() {
        String continuar = "si";
        while (continuar.equalsIgnoreCase("si")) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("Género: ");
            String genero = sc.nextLine();

            System.out.print("Sueldo por hora: ");
            double sueldohora = Double.parseDouble(sc.nextLine());

            System.out.print("Cargo: ");
            String cargo = sc.nextLine();

            personas.add(new Persona(nombre, apellido, edad, genero, sueldohora, cargo));

            System.out.print("¿Desea ingresar otra persona? (si/no): ");
            continuar = sc.nextLine();
        }
    }

    public void mostrarCantidad() {
        System.out.println("\nCantidad de personas: " + personas.size());
    }

    public void mostrarPromedioEdad() {
        double promedio = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("Promedio de edades: " + promedio);
    }

    public void mostrarMayoresEdad() {
        long mayores = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
        System.out.println("Cantidad de personas mayores de edad: " + mayores);
    }

    public void mostrarNombresConA() {
        List<Persona> nombresConA = personas.stream()
                .filter(p -> p.getNombre().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Personas cuyo nombre empieza con 'A':");
        nombresConA.forEach(System.out::println);
    }

    public void mostrarApellidosConM() {
        List<Persona> apellidosConM = personas.stream()
                .filter(p -> p.getApellido().toLowerCase().contains("m"))
                .collect(Collectors.toList());

        System.out.println("Personas con apellido que contiene 'M':");
        apellidosConM.forEach(System.out::println);
    }
    
    public void mostrarSueldoDirectoresMasculinos() {
        personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("director") && p.getGenero().equalsIgnoreCase("M"))
                .peek(p -> System.out.print("Nombre: " + p.getNombre() + " " + p.getApellido() + " "))
                .map(p -> p.getSueldohora() * 8)
                .forEach(sueldo -> System.out.println("Sueldo por 8 horas: $" + sueldo));
    }
    
    public void mostrarPrimeraDesarrolladoraFemenina() {
        Optional<Persona> desarrolladora = personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador") && p.getGenero().equalsIgnoreCase("F"))
                .findFirst();

        desarrolladora.ifPresent(p -> {
            System.out.println("Primera desarrolladora femenina:");
            System.out.println(p);
        });
    }
    
    public void mostrarDesarrolladorQueMasGana() {
        Optional<Persona> masGana = personas.stream()
                .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador"))
                .max(Comparator.comparingDouble(Persona::getSueldohora));

        if (masGana.isPresent()) {
            System.out.println("Desarrollador que más gana por hora:");
            System.out.println(masGana.get());
        }
    }
    
    public void mostrarMujeresOrdenadasPorNombre() {
        List<Persona> mujeresOrdenadas = personas.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("F"))
                .sorted(Comparator.comparing(Persona::getNombre))
                .collect(Collectors.toList());

        System.out.println("Mujeres ordenadas por nombre:");
        mujeresOrdenadas.forEach(System.out::println);
    }
}