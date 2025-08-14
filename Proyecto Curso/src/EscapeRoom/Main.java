package EscapeRoom;

import utilitarios.Utils;

public class Main {

    // Declaración array de pistas
    static String[] pistas = new String[7];

    // Declaración para cuando los cuartos estan completados
    static boolean cuartoRojoCompleto = false;
    static boolean cuartoAzulCompleto = false;
    static boolean cuartoVerdeCompleto = false;
    static boolean cuartoAmarilloCompleto = false;
    static boolean cuartoCianCompleto = false;
    static boolean cuartoMagentaCompleto = false;
    static boolean cuartoFinalCompleto = false;
    static boolean sabeClavePuerta = false;
    static String nombreUsuario = "";
    static String clavePuerta = "";

    public static void main(String[] args) {
        Animacion.bienvenida();
        
        Cuartos.solicitarNombreUsuario();

        String[] opcionesMenu = {
                "Reglas del Juego",
                "Inventario",
                "Cuarto Rojo",
                "Cuarto Verde",
                "Cuarto Amarillo",
                "Cuarto Azul",
                "Cuarto Magenta",
                "Cuarto Cian",
                "Cuarto Final",
                "Puerta de Salida"
        };

        String opcion = "";
        int opcionSeleccionada;
        boolean finalDelJuego = false;
        boolean gameOver = false;

        while (!finalDelJuego && !gameOver) {
            Utils.limpiarConsola();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Reglas del Juego":
                    Cuartos.mostrarReglas();
                    break;

                case "Inventario":
                    Cuartos.mostrarInventario();
                    break;

                case "Cuarto Rojo":
                    Cuartos.procesarCuartoRojo();
                    break;

                case "Cuarto Verde":
                    Cuartos.procesarCuartoVerde();
                    break;

                case "Cuarto Amarillo":
                    Cuartos.procesarCuartoAmarillo();
                    break;

                case "Cuarto Azul":
                    Cuartos.procesarCuartoAzul();
                    break;

                case "Cuarto Magenta":
                    Cuartos.procesarCuartoMagenta();
                    break;

                case "Cuarto Cian":
                    Cuartos.procesarCuartoCian();
                    break;

                case "Cuarto Final":
                    Cuartos.procesarCuartoFinal();
                    break;
                case "Puerta de Salida":
                    Cuartos.procesarPurtaDeSalida();
                    break;
            }

        }

    }


}