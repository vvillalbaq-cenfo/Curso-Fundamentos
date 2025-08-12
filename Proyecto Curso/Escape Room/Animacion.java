package EscapeRoom;

import utilitarios.Utils;

public class Animacion {
        // Métodos para mostrar mapas de cuartos
    public static void verMapaCuartoFinal() {
        Utils.establecerColorBlanco();
        System.out.println("        Mapa del Cuarto Final - Escape Room");
        System.out.println("                   ┌───────────────────┐   ");
        System.out.println("  Puerta Principal │     Pizarra       │   ");
        System.out.println("                   │                   │   ");
        System.out.println("                   ├───────┬───────────┤   ");
        System.out.println("                   │ Silla │ Foto Vieja│   ");
        System.out.println("                   │       │           │   ");
        System.out.println("                   ├───────┴───────────┤   ");
        System.out.println("                   │   Caja Fuerte     │   ");
        System.out.println("                   └──────┬────────────┘   ");
        System.out.println("                          │                ");
        System.out.println("                     Puerta Final          ");
    }

    public static void verMapaCuartoRojo() {
        Utils.establecerColorRojo();
        System.out.println("        Mapa del Cuarto Rojo - Escape Room");
        System.out.println("                   ┌──────────────────┐   ");
        System.out.println("  Puerta Principal │Cámara Fotográfica│   ");
        System.out.println("                   │                  │   ");
        System.out.println("                   ├───────┬──────────┤   ");
        System.out.println("                   │Lámpara│Escritorio│   ");
        System.out.println("                   │       │          │   ");
        System.out.println("                   ├───────┴──────────┤   ");
        System.out.println("                   │  Caja Fuerte     │   ");
        System.out.println("                   └──────┬───────────┘   ");
        System.out.println("                          │               ");
        System.out.println("            Puerta a siguiente cuarto     ");
    }

    public static void verMapaCuartoAzul() {
        Utils.establecerColorAzul();
        System.out.println("          Mapa del Cuarto Azul - Escape Room");
        System.out.println("                   ┌────────────────────┐   ");
        System.out.println("  Puerta Principal │     Escritorio     │   ");
        System.out.println("                   │ ┌───────────────┐  │   ");
        System.out.println("                   │ │ Vaso          │  │   ");
        System.out.println("                   │ │ Encendedor    │  │   ");
        System.out.println("                   │ │ Papiro        │  │   ");
        System.out.println("                   │ └───────────────┘  │   ");
        System.out.println("                   ├────────────────────┤   ");
        System.out.println("                   │  Caja Fuerte       │   ");
        System.out.println("                   └────────┬───────────┘   ");
        System.out.println("                            │               ");
        System.out.println("            Puerta a siguiente cuarto       ");
    }

    public static void verMapaCuartoAmarillo() {
        Utils.establecerColorAmarillo();
        System.out.println("          Mapa del Cuarto Amarillo - Escape Room");
        System.out.println("                   ┌────────────────────┐   ");
        System.out.println("  Puerta Principal │     Escritorio     │   ");
        System.out.println("                   │ ┌───────────────┐  │   ");
        System.out.println("                   │ │ Estantería    │  │   ");
        System.out.println("                   │ │ Espejo        │  │   ");
        System.out.println("                   │ │ Auriculares   │  │   ");
        System.out.println("                   │ └───────────────┘  │   ");
        System.out.println("                   ├────────────────────┤   ");
        System.out.println("                   │  Caja Fuerte       │   ");
        System.out.println("                   └────────┬───────────┘   ");
        System.out.println("                            │               ");
        System.out.println("            Puerta a siguiente cuarto       ");
    }

    public static void verMapaCuartoCian() {
        Utils.establecerColorCian();
        System.out.println("          Mapa del Cuarto Cian - Escape Room");
        System.out.println("                   ┌────────────────────┐   ");
        System.out.println("  Puerta Principal │     Escritorio     │   ");
        System.out.println("                   │ ┌───────────────┐  │   ");
        System.out.println("                   │ │ Impresora     │  │   ");
        System.out.println("                   │ │ Maleta        │  │   ");
        System.out.println("                   │ │ Caja de discos│  │   ");
        System.out.println("                   │ └───────────────┘  │   ");
        System.out.println("                   ├────────────────────┤   ");
        System.out.println("                   │  Caja Fuerte       │   ");
        System.out.println("                   └────────┬───────────┘   ");
        System.out.println("                            │               ");
        System.out.println("            Puerta a siguiente cuarto       ");
    }

    public static void verMapaCuartoMagenta() {
        Utils.establecerColorMangenta();
        System.out.println("                Mapa del Cuarto Magenta - Escape Room");
        System.out.println("                        ┌───────────────────────────┐");
        System.out.println("    Puerta Principal    │  Cerradura electrónica    │");
        System.out.println("                        ├───────────┬───────────────┤");
        System.out.println("                        │  Acertijo │  Nota Baldosa │");
        System.out.println("                        ├───────────┴───────────────┤");
        System.out.println("                        │        Caja Fuerte        │");
        System.out.println("                        └────────────┬──────────────┘");
        System.out.println("                      Puerta a siguiente cuarto");
    }

    public static void verMapaCuartoVerde() {
        Utils.establecerColorVerde();
        System.out.println("                 Mapa del Cuarto Verde - Escape Room");
        System.out.println("                           ┌───────────────────────┐");
        System.out.println("      Puerta Principal     │  Bote de pintura      │");
        System.out.println("                           ├──────────┬────────────┤");
        System.out.println("                           │  Peluche │  Radio     │");
        System.out.println("                           ├──────────┴────────────┤");
        System.out.println("                           │    Caja Fuerte        │");
        System.out.println("                           └────────┬──────────────┘");
        System.out.println("                         Puerta a siguiente cuarto");
    }

        // Bienvenida al juego
    public static void bienvenida() {
        Utils.limpiarConsola();
        Utils.establecerColorBlanco();
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("        ¡BIENVENIDO AL ESCAPE ROOM BIZCOCHO!               ");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("                                                           ");
        System.out.println("                ┌─────────────────┐                        ");
        System.out.println("                │    BIZCOCHO     │                        ");
        System.out.println("                │    ADVENTURE    │                        ");
        System.out.println("                └─────────────────┘                        ");
        System.out.println("                         │                                 ");
        System.out.println("                         │                                 ");
        System.out.println("                  Presiona ENTER                           ");
        System.out.println("                  para comenzar                            ");
        System.out.println("                                                           ");
        System.out.println("═══════════════════════════════════════════════════════════");
        Utils.pausar();
        Utils.limpiarConsola();
    }

    // Mensaje de Game Over
    public static boolean gameOver() {
        boolean gameOver = false;
        Utils.limpiarConsola();
        Utils.establecerColorRojo(); // Puedes cambiar el color si lo deseas
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("                      ¡GAME OVER!                          ");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("                                                           ");
        System.out.println("                ┌────────────────────┐                     ");
        System.out.println("                │   EL BIZCOCHO TE   │                     ");
        System.out.println("                │      ATRAPÓ!       │                     ");
        System.out.println("                └────────────────────┘                     ");
        System.out.println("                                                           ");
        System.out.println("             Gracias por jugar Escape Room Bizcocho        ");
        System.out.println("                                                           ");
        System.out.println("═══════════════════════════════════════════════════════════");
        Utils.pausar();
        Utils.limpiarConsola();
        return gameOver = true;
    }

    // Mensaje de victoria y apertura de URL
    public static void felicidades() {
        Utils.limpiarConsola();
        Utils.establecerColorVerde(); // Puedes usar otro color si prefieres
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("                    ¡FELICIDADES!                          ");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("                                                           ");
        System.out.println("             ┌────────────────────────────┐                ");
        System.out.println("             │  SALISTE DEL ESCAPE ROOM   │                ");
        System.out.println("             │         BIZCOCHO           │                ");
        System.out.println("             └────────────────────────────┘                ");
        System.out.println("                                                           ");
        System.out.println("            Toma tu premio: !Un juego sorpresa!            ");
        System.out.println("                                                           ");
        System.out.println("═══════════════════════════════════════════════════════════");
        Utils.pausar();
        Utils.limpiarConsola();

        // Abrir el enlace del premio //Esta parte se realizó con Copilot, ya que no
        // sabiamos como redirigir a URL
        String urlPremio = "https://ejemplo.com/juego-premio";
        abrirURL(urlPremio);
    }

    // Método para abrir una URL en el navegador //Esta parte se realizó con
    // Copilot, ya que no sabiamos como redirigir a URL
    public static void abrirURL(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
        } catch (Exception e) {
            System.out.println("No se pudo abrir el enlace. Abre manualmente: " + url);
        }
    }


}
