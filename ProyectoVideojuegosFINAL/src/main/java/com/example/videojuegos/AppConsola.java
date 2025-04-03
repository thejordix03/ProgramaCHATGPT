package com.example.videojuegos;

import com.example.videojuegos.model.Juego;
import com.example.videojuegos.model.Plataforma;
import com.example.videojuegos.model.Desarrollador;
import com.example.videojuegos.services.JuegoService;
import com.example.videojuegos.services.PlataformaService;
import com.example.videojuegos.services.DesarrolladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class AppConsola {

    @Autowired
    private PlataformaService plataformaService;
    @Autowired
    private DesarrolladorService desarrolladorService;
    @Autowired
    private JuegoService juegoService;

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestión de plataformas");
            System.out.println("2. Gestión de desarrolladores");
            System.out.println("3. Gestión de juegos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            String opcion = sc.nextLine();  // Leer la opción seleccionada

            switch (opcion) {
                case "1":
                    gestionarPlataformas(sc);
                    break;
                case "2":
                    gestionarDesarrolladores(sc);
                    break;
                case "3":
                    gestionarJuegos(sc);
                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    salir = true;  // Finaliza el programa
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }
        }

        sc.close();  // Cerrar el scanner al finalizar
    }

    // Menú de gestión de plataformas
    private void gestionarPlataformas(Scanner sc) {
        boolean salir = false;

        while (!salir) {
            System.out.println("--- MENÚ DE GESTIÓN DE PLATAFORMAS ---");
            System.out.println("1. Crear plataforma");
            System.out.println("2. Listar plataformas");
            System.out.println("3. Eliminar plataforma");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            String opcion = sc.nextLine();  // Leer la opción seleccionada
            switch (opcion) {
                case "1":
                    crearPlataforma(sc);
                    break;
                case "2":
                    listarPlataformas();
                    break;
                case "3":
                    eliminarPlataforma(sc);
                    break;
                case "0":
                    salir = true;  // Volver al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }
        }
    }

    private void crearPlataforma(Scanner sc) {
        System.out.print("Introduce el nombre de la plataforma: ");
        String nombre = sc.nextLine();
        Plataforma plataforma = new Plataforma();
        plataforma.setNombre(nombre);
        plataformaService.save(plataforma);
        System.out.println("Plataforma creada con éxito.");
    }

    private void listarPlataformas() {
        System.out.println("Plataformas disponibles:");
        plataformaService.findAll().forEach(plataforma -> System.out.println(plataforma.getId() + ". " + plataforma.getNombre()));
    }

    private void eliminarPlataforma(Scanner sc) {
        System.out.print("Introduce el ID de la plataforma a eliminar: ");
        Long id = Long.parseLong(sc.nextLine());
        plataformaService.deleteById(id);
        System.out.println("Plataforma eliminada con éxito.");
    }

    // Menú de gestión de desarrolladores
    private void gestionarDesarrolladores(Scanner sc) {
        boolean salir = false;

        while (!salir) {
            System.out.println("--- MENÚ DE GESTIÓN DE DESARROLLADORES ---");
            System.out.println("1. Crear desarrollador");
            System.out.println("2. Listar desarrolladores");
            System.out.println("3. Eliminar desarrollador");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            String opcion = sc.nextLine();  // Leer la opción seleccionada
            switch (opcion) {
                case "1":
                    crearDesarrollador(sc);
                    break;
                case "2":
                    listarDesarrolladores();
                    break;
                case "3":
                    eliminarDesarrollador(sc);
                    break;
                case "0":
                    salir = true;  // Volver al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }
        }
    }

    private void crearDesarrollador(Scanner sc) {
        System.out.print("Introduce el nombre del desarrollador: ");
        String nombre = sc.nextLine();
        Desarrollador desarrollador = new Desarrollador();
        desarrollador.setNombre(nombre);
        desarrolladorService.save(desarrollador);
        System.out.println("Desarrollador creado con éxito.");
    }

    private void listarDesarrolladores() {
        System.out.println("Desarrolladores disponibles:");
        desarrolladorService.findAll().forEach(desarrollador -> System.out.println(desarrollador.getId() + ". " + desarrollador.getNombre()));
    }

    private void eliminarDesarrollador(Scanner sc) {
        System.out.print("Introduce el ID del desarrollador a eliminar: ");
        Long id = Long.parseLong(sc.nextLine());
        desarrolladorService.deleteById(id);
        System.out.println("Desarrollador eliminado con éxito.");
    }

    // Menú de gestión de juegos
    private void gestionarJuegos(Scanner sc) {
        boolean salir = false;

        while (!salir) {
            System.out.println("--- MENÚ DE GESTIÓN DE JUEGOS ---");
            System.out.println("1. Crear juego");
            System.out.println("2. Listar juegos");
            System.out.println("3. Eliminar juego");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");

            String opcion = sc.nextLine();  // Leer la opción seleccionada
            switch (opcion) {
                case "1":
                    crearJuego(sc);
                    break;
                case "2":
                    listarJuegos();
                    break;
                case "3":
                    eliminarJuego(sc);
                    break;
                case "0":
                    salir = true;  // Volver al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
                    break;
            }
        }
    }

    // Método para crear un juego
    private void crearJuego(Scanner scanner) {
        System.out.print("Introduce el nombre del juego: ");
        String nombre = scanner.nextLine();

        // Obtener ID de la plataforma
        System.out.print("Introduce el ID de la plataforma: ");
        Long plataformaId = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea

        // Obtener ID del desarrollador
        System.out.print("Introduce el ID del desarrollador: ");
        Long desarrolladorId = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea

        // Buscar la plataforma y el desarrollador
        Plataforma plataforma = plataformaService.findById(plataformaId).orElse(null);
        Desarrollador desarrollador = desarrolladorService.findById(desarrolladorId).orElse(null);

        if (plataforma != null && desarrollador != null) {
            Juego juego = new Juego();
            juego.setNombre(nombre);
            juego.setPlataforma(plataforma); // Asignar plataforma
            juego.setDesarrollador(desarrollador); // Asignar desarrollador

            // Guardar el juego
            juegoService.save(juego);
            System.out.println("Juego creado con éxito.");
        } else {
            System.out.println("Plataforma o desarrollador no encontrados.");
        }
    }


    // Método para listar juegos
    private void listarJuegos() {
        List<Juego> juegos = juegoService.findAll();
        if (juegos.isEmpty()) {
            System.out.println("No hay juegos disponibles.");
        } else {
            System.out.println("Juegos disponibles:");
            for (Juego juego : juegos) {
                // Verificar si la plataforma y desarrollador no son nulos antes de intentar acceder a sus propiedades
                String plataformaNombre = (juego.getPlataforma() != null) ? juego.getPlataforma().getNombre() : "No asignada";
                String desarrolladorNombre = (juego.getDesarrollador() != null) ? juego.getDesarrollador().getNombre() : "No asignado";

                System.out.println("ID: " + juego.getId() + ", Nombre: " + juego.getNombre() + ", Plataforma: " + plataformaNombre + ", Desarrollador: " + desarrolladorNombre);
            }
        }
    }


    private void eliminarJuego(Scanner sc) {
        System.out.print("Introduce el ID del juego a eliminar: ");
        Long id = Long.parseLong(sc.nextLine());
        juegoService.deleteById(id);
        System.out.println("Juego eliminado con éxito.");
    }
}
