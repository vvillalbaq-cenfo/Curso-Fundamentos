package practica03;
import utilitarios.Utils;
public class Practica03 {    
    // Definicion de Puntaje Referencia dado por la consigna
   private static final int PUNTAJE_REFERENCIA = 1000;
    
    public static void main(String[] args) {
        System.out.println("SISTEMA DE ESTADÍSTICAS DE VIDEOJUEGOS");
        
        // 1. Registro de datos
        int numJugadores = solicitarNumeroJugadores();
        
        String[] nombres = new String[numJugadores];
        int[][] puntajes = new int[numJugadores][];
        int[] numPartidas = new int[numJugadores];
        
        registrarJugadores(nombres, puntajes, numPartidas);
        
        // 2. Cálculo de estadísticas individuales();
        System.out.println("ESTADÍSTICAS INDIVIDUALES");
        
        for (int i = 0; i < numJugadores; i++) {
            mostrarEstadisticasIndividuales(nombres[i], puntajes[i], i + 1);
        }
        
        // 3. Análisis global
        System.out.println("ANÁLISIS GLOBAL");
        mostrarEstadisticasGlobales(nombres, puntajes);
        System.out.println("¡Análisis completado exitosamente!");
    }
    
    /**
     * Solicita y valida el número de jugadores
     */
    public static int solicitarNumeroJugadores() {
        return Utils.leerRangosEnteros("Ingrese el número de jugadores: ", 1, 100);
    }
    
    /**
     * Registra todos los jugadores con sus respectivos puntajes
     */
    public static void registrarJugadores(String[] nombres, int[][] puntajes, int[] numPartidas) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Registro del Jugador " + (i + 1));
            
            // Solicitar nombre
            nombres[i] = solicitarNombreJugador();
            
            // Solicitar número de partidas
            numPartidas[i] = solicitarNumeroPartidas();
            
            // Inicializar arreglo de puntajes
            puntajes[i] = new int[numPartidas[i]];
            
            // Solicitar puntajes
            solicitarPuntajes(puntajes[i], nombres[i]);
        }
    }
    
    /**
     * Solicita y valida el nombre del jugador
     */
    public static String solicitarNombreJugador() {
        String nombre;
        do {
            nombre = Utils.leerString("Nombre del jugador: ");
            
            if (nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (nombre.isEmpty());
        
        return nombre;
    }
    
    /**
     * Solicita y valida el número de partidas
     */
    public static int solicitarNumeroPartidas() {
        return Utils.leerRangosEnteros("Número de partidas jugadas: ", 1, 50);
    }
    
    /**
     * Solicita y valida todos los puntajes de un jugador
     */
    public static void solicitarPuntajes(int[] puntajes, String nombreJugador) {
        System.out.println("Ingrese los puntajes de " + nombreJugador + ":");
        for (int i = 0; i < puntajes.length; i++) {
            puntajes[i] = Utils.leerRangosEnteros("Partida " + (i + 1) + ": ", 1, 999999);
        }
    }
    
    /**
     * Calcula el puntaje máximo 
     */
    public static int calcularMaximo(int[] puntajes) {
        int maximo = puntajes[0];
        for (int i = 1; i < puntajes.length; i++) {
            if (puntajes[i] > maximo) {
                maximo = puntajes[i];
            }
        }
        return maximo;
    }
    
    /**
     * Calcula el puntaje mínimo 
     */
    public static int calcularMinimo(int[] puntajes) {
        int minimo = puntajes[0];
        for (int i = 1; i < puntajes.length; i++) {
            if (puntajes[i] < minimo) {
                minimo = puntajes[i];
            }
        }
        return minimo;
    }
    
    /**
     * Calcula el promedio de puntajes
     */
    public static double calcularPromedio(int[] puntajes) {
        int suma = 0;
        for (int puntaje : puntajes) {
            suma += puntaje;
        }
        return (double) suma / puntajes.length;
    }
    
    /**
     * Cuenta cuántas partidas superan el puntaje 
     */
    public static int contarPartidasSobrePuntajeReferencia(int[] puntajes) {
        int contador = 0;
        for (int puntaje : puntajes) {
            if (puntaje > PUNTAJE_REFERENCIA) {
                contador++;
            }
        }
        return contador;
    }
    
    /**
     * Muestra las estadísticas individuales de un jugador
     */
    public static void mostrarEstadisticasIndividuales(String nombre, int[] puntajes, int numeroJugador) {
        System.out.println("Estadísticas de " + nombre );
        
        // Mostrar listado completo de puntajes
        System.out.print("Puntajes: ");
        Utils.establecerColorCian();
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print(puntajes[i]);
            if (i < puntajes.length - 1) {
                System.out.print(", ");
            }
        }
        Utils.reiniciarColores();
        System.out.println();
        
        // Mostrar estadísticas
        int maximo = calcularMaximo(puntajes);
        int minimo = calcularMinimo(puntajes);
        double promedio = calcularPromedio(puntajes);
        int partidasReferencia = contarPartidasSobrePuntajeReferencia(puntajes);
        
        System.out.print("Puntaje máximo: ");
        Utils.establecerColorVerde();
        System.out.println(maximo);
        Utils.reiniciarColores();
        
        System.out.print("Puntaje mínimo: ");
        Utils.establecerColorRojo();
        System.out.println(minimo);
        Utils.reiniciarColores();
        
        System.out.print("Promedio: ");
        Utils.establecerColorAmarillo();
        System.out.printf("%.2f\n", promedio);
        Utils.reiniciarColores();
        
        System.out.print("Partidas sobre " + PUNTAJE_REFERENCIA + " puntos: ");
        if (partidasReferencia > 0) {
            Utils.establecerColorVerde();
        } else {
            Utils.establecerColorRojo();
        }
        System.out.println(partidasReferencia);
        Utils.reiniciarColores();
    }
    
    /**
     * Encuentra el índice del jugador con el puntaje máximo 
     */
    public static int encontrarJugadorConPuntajeMaximo(int[][] puntajes) {
        int maxPuntaje = Integer.MIN_VALUE;
        int jugadorMaximo = 0;
        
        for (int i = 0; i < puntajes.length; i++) {
            int maximoJugador = calcularMaximo(puntajes[i]);
            if (maximoJugador > maxPuntaje) {
                maxPuntaje = maximoJugador;
                jugadorMaximo = i;
            }
        }
        
        return jugadorMaximo;
    }
    
    /**
     * Encuentra el mejor promedio por jugador
     */
    public static int encontrarJugadorConMejorPromedio(int[][] puntajes) {
        double mejorPromedio = Double.MIN_VALUE;
        int jugadorMejorPromedio = 0;
        
        for (int i = 0; i < puntajes.length; i++) {
            double promedioJugador = calcularPromedio(puntajes[i]);
            if (promedioJugador > mejorPromedio) {
                mejorPromedio = promedioJugador;
                jugadorMejorPromedio = i;
            }
        }
        
        return jugadorMejorPromedio;
    }
    
    /**
     * Muestra las estadísticas del sistema
     */
    public static void mostrarEstadisticasGlobales(String[] nombres, int[][] puntajes) {
        // Jugador con puntaje máximo
        int jugadorMaximo = encontrarJugadorConPuntajeMaximo(puntajes);
        int puntajeMaximoGlobal = calcularMaximo(puntajes[jugadorMaximo]);
        
        System.out.print("Jugador con el puntaje más alto: ");
        System.out.print(nombres[jugadorMaximo]);
        System.out.println(" (" + puntajeMaximoGlobal + " puntos)");
        
        // Jugador con mejor promedio
        int jugadorMejorPromedio = encontrarJugadorConMejorPromedio(puntajes);
        double mejorPromedioGlobal = calcularPromedio(puntajes[jugadorMejorPromedio]);
        
        System.out.print("Jugador con el mejor promedio: ");
        System.out.print(nombres[jugadorMejorPromedio]);
        System.out.printf(" (%.2f puntos)\n", mejorPromedioGlobal);
        
        // Estadísticas adicionales
        System.out.println("Resumen General");
        System.out.println("Total de jugadores registrados: " + nombres.length);
        
        int totalPartidas = 0;
        for (int[] puntajesJugador : puntajes) {
            totalPartidas += puntajesJugador.length;
        }
        System.out.println("Total de partidas registradas: " + totalPartidas);
        System.out.println("Puntaje de referencia utilizado: " + PUNTAJE_REFERENCIA + " puntos");
        
    }
    
    
}


