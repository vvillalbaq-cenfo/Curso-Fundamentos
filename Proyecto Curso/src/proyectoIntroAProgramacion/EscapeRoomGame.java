package proyectoIntroAProgramacion;

import utilitarios.Utils;

public class EscapeRoomGame {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        String[] opcionesMenu = { "Crear Usuario", "Reglas del Juego", "Inventario", "Cuarto Rojo", "Cuarto Verde",
                "Cuarto Amarillo", "Cuarto Azul", "Cuarto Magenta", "Cuarto Cian", "Cuarto Final" };
        String opcion = "";
        String nombreUsuario = "";
        int opcionSeleccionada;
        boolean validacionNombreUsuario = false, cuartoRojoCompleto = false;
        // Variables nuevas cuarto azul

        // Variables nuevas cuarto final

        /**
         * Inicio del juego, se crea un menú principal con opciones para el usuario.
         * El usuario puede crear un usuario, ver las reglas del juego y seleccionar
         * diferentes cuartos
         */
        do {
            Utils.limpiarConsola();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogio la opción " + opcion);

            switch (opcion) {
                case "Crear Usuario":
                    // Validación para crear un usuario solo una vez
                    if (validacionNombreUsuario == false) {
                        nombreUsuario = crearNombreUsuario();
                        Utils.pausar();
                        validacionNombreUsuario = true;

                        // Aqui creamos una salida en caso de que ya se tenga un usuario creado
                    } else {
                        System.out.println("Ya existe un usuario creado: " + nombreUsuario);
                        System.out.println("Si desea cambiar el nombre de usuario, por favor reinicie el juego.");
                        Utils.pausar();
                        Utils.limpiarConsola();
                    }
                    break;

                case "Reglas del Juego":
                    // Reglas del juego, se muestran solo si se ha creado un usuario
                    if (validacionNombreUsuario == true) {
                        System.out.println(
                                "Este es un juego de escape room donde debes resolver acertijos y encontrar pistas para escapar de diferentes cuartos.");
                        System.out.println(
                                "Cada cuarto tiene sus propios desafíos y debes completar todos para ganar el juego. Cada cuarto tiene un tiempo límite de 10 minutos.");
                        System.out.println(
                                "Debes encontrar las llaves o códigos necesarios para avanzar al siguiente cuarto.");
                        System.out.println(
                                "Recuerda que el tiempo es limitado y cada acción que tomes consumirá tiempo.");
                        System.out.println(
                                "Debes estar atento a las pistas que encuentres en cada cuarto. Para abrir las cajas fuertes y conseguir los códigos para abrir la puerta final.");
                        System.out.println(
                                "Además, debes de revisar como minimo un cuarto, un objeto y tener minumo una pista resuelta para poder salir del hotel.");
                        System.out.println(
                                "Si consumes los 10 minutos, un gas mortífero te aniquilará. Recuerda que tienes un máximo de 3 vidas por cuarto. Si superas este límite, perderás el juego.");
                        System.out.println("¡Buena suerte, " + nombreUsuario + "!");
                        Utils.pausar();
                        Utils.limpiarConsola();

                        // Validación para mostrar las reglas del juego solo si se ha creado un usuario
                    } else {
                        System.out.println("Debes crear un usuario primero para poder ver las reglas del juego.");
                        System.out.println("Por favor, regresa al menú principal y crea un usuario.");
                        Utils.pausar();
                        Utils.limpiarConsola();
                    }

                    break;
                case "Inventario": // Muestra el inventario del usuario
                    if (validacionNombreUsuario == true) { // Verifica si se ha creado un usuario
                        if (cuartoRojoCompleto) { // Si el cuarto rojo está completo, muestra la pista encontrada
                            System.out.println("Tu inventario contiene: ");
                            System.out.println("Pista encontrada en el cuarto rojo: O");
                            Utils.pausar();
                        } else { // Si el cuarto rojo no está completo, informa al usuario
                            System.out.println("Aún no tienes pistas.");
                            Utils.pausar();
                        }

                    } else {
                        System.out.println("Debes crear un usuario primero para poder ver el inventario."); // Verifica
                                                                                                            // si se ha
                                                                                                            // creado un
                                                                                                            // usuario
                        System.out.println("Por favor, regresa al menú principal y crea un usuario."); // Informa al
                                                                                                       // usuario
                        Utils.pausar();
                        Utils.limpiarConsola();
                    }

                    break;
                case "Cuarto Rojo": // Interacción con el cuarto rojo
                    if (cuartoRojoCompleto == false) { // Verifica si el cuarto rojo ya está completo
                        verMapaCuartoRojo(); // Muestra el mapa del cuarto rojo
                        Utils.pausar(); // Pausa para que el usuario vea el mapa
                        Utils.establecerColorBlanco(); // Establece el color de la consola a blanco ya que si no se
                                                       // cambia, queda en rojo
                        interaccionCuartoRojo("O"); // Llama al método de interacción con el cuarto rojo y devuelve la
                                                    // pista encontrada
                        cuartoRojoCompleto = true; // Marca el cuarto rojo como completo
                    } else {
                        System.out.println("Ya has completado el cuarto rojo."); // Informa al usuario que ya ha
                                                                                 // completado el cuarto rojo
                        Utils.pausar();
                    }
                    break;
                case "Cuarto Verde": // Ale //Por favor ingresar que si cuarto rojo no esta completo, no puede
                                     // ingresar.

                    break;
                case "Cuarto Amarillo": // Vic

                    break;
                case "Cuarto Azul": // Yen

                    break;
                case "Cuarto Magenta": // Ale

                    break;
                case "Cuarto Cian": // Vic

                    break;
                case "Cuarto Final": // Yen

                    break;
            }

            // Validación para salir del juego
            Utils.limpiarConsola();
        } while (!cuartoRojoCompleto); // Final del juego

        System.out
                .println("¡Felicidades, has salido del cuarto! ¡Bienvenido a BK! Toma tu corona y tu juego adicional.");
        // Aqui solicitamos ayuda también a IA para redirigir a un usuario a una URL,
        // por lo que se agrego un publica static al Utils para poder usarlo.
        System.out.println("Redirigiendo a: https://www.burgerking.co.cr");
    }

    /**
     * Método para crear un nombre de usuario.
     * 
     * @return nombreUsuario
     */
    public static String crearNombreUsuario() {
        String nombreUsuario = Utils.leerString("Ingrese su nombre de usuario:");
        System.out.println("Usuario " + nombreUsuario + " creado exitosamente.");
        Utils.pausar();
        return nombreUsuario;
    }

    /**
     * Método para manejar la interacción en el cuarto rojo.
     * Este método permite al jugador interactuar con diferentes objetos en el
     * cuarto,
     * 
     * @param pista
     * @return
     */
    public static String interaccionCuartoRojo(String pista) {
        String[] opcionesMenu = { "Camara en la esquina del Cuarto", "Escritorio", "Lampara", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10; // Tiempo en minutos
        int codigoCaja = 0; // Código de la caja fuerte establecido en 0 para que el jugador lo ingrese
        int vidasActuales = 3; // Vidas del jugador
        boolean camaraFalsa = false, cajaFuerte = false, lampara = false, cajaAbierta = false,
                escritorio = false, sabeClave = false, salirCuarto = false; // Variable para controlar
                                                                            // el juego

        // Inicio del juego en el cuarto rojo. El jugador puede interactuar con
        // diferentes objetos y resolver acertijos.
        // Cada acción toma tiempo y el jugador tiene un límite de vidas.El objetivo es
        // encontrar una pista para avanzar en el juego.
        while (salirCuarto == false || (vidasActuales > 0 && tiempo > 0 && !cajaAbierta)) {

            verMapaCuartoRojo(); // Muestra el mapa del cuarto rojo
            Utils.establecerColorBlanco(); // Establece el color de la consola a blanco porque lo dejaba en rojo si no
                                           // se cambiaba
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogio la opción " + opcion); // Muestra la opción seleccionada por el usuario

            switch (opcion) {
                case "Camara en la esquina del Cuarto": // Interacción con la cámara
                    if (!camaraFalsa) {
                        System.out.println(
                                "No funciona esta cámara, pero detrás de ella hay una marca en la pared: una letra O dentro de un círculo, parece apuntar hacia el escritorio.");
                        camaraFalsa = true;
                    } else {
                        System.out.println("Ya revisaste la cámara, no hay nada más que hacer aquí.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Escritorio": // Interacción con el escritorio
                    if (!escritorio) {
                        System.out.println(
                                "Luz y sombra muestran el camino hacia la caja fuerte. A veces las cosas se toman al revés.");
                        escritorio = true;
                    } else {
                        System.out.println("Ya revisaste el escritorio.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Lampara": // Interacción con la lámpara
                    if (!lampara) {
                        System.out.println("Al encender la lámpara, proyecta un código: 247 en la pared.");
                        lampara = true;
                    } else {
                        System.out.println("Ya revisaste la lámpara.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Caja Fuerte": // Interacción con la caja fuerte
                    if (!cajaFuerte) {
                        System.out.println("La caja fuerte está cerrada con un código de 3 dígitos.");
                        sabeClave = Utils.leerBoolean("¿Sabes el código de la caja fuerte? (true/false)"); // Pregunta
                                                                                                           // al usuario
                                                                                                           // si sabe el
                                                                                                           // código

                        if (!sabeClave) { // Si el usuario no sabe el código, tiene la posibilidad de buscar más pistas
                            System.out.println("Mejor busca más pistas antes de intentar abrirla.");
                            Utils.pausar();
                            tiempo = -1;
                            break;
                        }
                        while (vidasActuales > 0 && !cajaAbierta) { // Mientras el jugador tenga vidas y la caja no esté
                                                                    // abierta, permite ingresar el código
                            codigoCaja = Utils.leerEntero("Escribe el código de la caja fuerte de 3 digitos:");
                            if (codigoCaja == 742) {
                                cajaAbierta = true;
                                System.out.println(
                                        "¡Correcto! La caja fuerte se ha abierto. Encuantras una nota con la letra O");
                                pista = "O";
                                Utils.pausar();
                                System.out.println("Saliste del cuarto rojo con la pista:" + pista);
                                return pista; // Retorna la pista encontrada
                            } else {
                                vidasActuales--; // Si el código es incorrecto, se resta una vida
                                tiempo = -1; // Se consume tiempo al intentar abrir la caja
                                if (vidasActuales > 0) { // Si aún quedan vidas, informa al usuario
                                    System.out.println("Código incorrecto. Te quedan " + vidasActuales + " intentos.");
                                    Utils.pausar();
                                    break;
                                } else {
                                    System.out.println( // Si no quedan vidas, informa al usuario y termina el juego
                                            "¡Fallaste todos los intentos! Has perdido todas tus vidas. Fin del juego.");
                                    Utils.pausar();
                                    return null; // Retorna null si se pierden todas las vidas
                                }
                            }
                        }
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean( // Pregunta al usuario si desea salir del cuarto
                            "Deseas salir del cuarto rojo? Si sales sin revisar ningún elemento, pierdes una vida. (true/false)");
                    tiempo = -1;
                    if (salirCuarto)
                        if (!camaraFalsa && !escritorio && !lampara) { // Si no se ha revisado nada, se pierde una vida
                            System.out.println(
                                    "Has decidido salir del cuarto rojo. Pero pierdes una vida por salir sin resolver nada.");
                            vidasActuales--;
                        }
                    if (camaraFalsa && !escritorio && !lampara) { // Si solo se revisó la cámara, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto rojo. Has revisado la cámara, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!camaraFalsa && escritorio && !lampara) { // Si solo se revisó el escritorio, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto rojo. Has revisado el escritorio, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!camaraFalsa && !escritorio && lampara) { // Si solo se revisó la lámpara, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto rojo. Has revisado la lámpara, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (camaraFalsa && escritorio && lampara) { // Si se revisaron todos los objetos, pero no abre la
                                                                // caja fuerte informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto rojo. Has revisado la cámara, el escritorio y la lámpara, pero no has abierto la caja fuerte.");
                        vidasActuales--;
                    }
                    break;
            }
        }

        return pista;
    }

    /**
     * Método para mostrar el mapa del cuarto rojo.
     * Este método imprime un mapa ASCII que representa la disposición de los
     * objetos en el cuarto.
     */
    public static void verMapaCuartoRojo() {
        Utils.establecerColorRojo();
        System.out.println("Mapa del Cuarto Rojo - Escape Room");
        System.out.println("        ┌──────────────────┐");
        System.out.println("        │ Cámara falsa     │");
        System.out.println("        │                  │");
        System.out.println("        ├───────┬──────────┤");
        System.out.println("        │Lámpara│Escritorio│");
        System.out.println("        │       │          │");
        System.out.println("        ├───────┴──────────┤");
        System.out.println("        │  Caja Fuerte     │");
        System.out.println("        └──────┬───────────┘");
        System.out.println("               │            ");
        System.out.println("            Puerta          ");
    }

    /**
     * Metodo para mostrar el mapa del cuarto verde
     * Este método imprime un mapa ASCII que representa la disposición de los
     * objetos en el cuarto.
     */

}
