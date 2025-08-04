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
        boolean validacionNombreUsuario = false, cuartoRojoCompleto = false, cuartoAmarilloCompleto = false, cuartoCianCompleto = false; // Variables para controlar el estado de los cuartos
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
                            System.out.println("Aún no tienes pistas del cuarto rojo.");
                            Utils.pausar();
                        }
                        if (cuartoAmarilloCompleto) { // Si el cuarto amarillo está completo, muestra la pista encontrada
                            System.out.println("Tu inventario contiene: ");
                            System.out.println("Pista encontrada en el cuarto amarillo: W");
                            Utils.pausar();
                        } else { // Si el cuarto amarillo no está completo, informa al usuario
                            System.out.println("Aún no tienes pistas del cuarto amarillo.");
                            Utils.pausar();
                        }

                        if (cuartoCianCompleto) { // Si el cuarto cian está completo, muestra la pista encontrada
                            System.out.println("Tu inventario contiene: ");
                            System.out.println("Pista encontrada en el cuarto cian: E");
                            Utils.pausar();
                        } else { // Si el cuarto cian no está completo, informa al usuario
                            System.out.println("Aún no tienes pistas del cuarto cian.");
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
                    if (cuartoRojoCompleto == true) {
                        if (cuartoAmarilloCompleto == false) { // Verifica si el cuarto amarillo ya está completo
                            verMapaCuartoAmarillo(); // Muestra el mapa del cuarto amarillo
                            Utils.pausar(); // Pausa para que el usuario vea el mapa
                            Utils.establecerColorBlanco(); // Establece el color de la consola a blanco ya que si no se cambia, queda en amarillo
                            interaccionCuartoAmarillo("W"); // Llama al método de interacción con el cuarto amarillo y devuelve la pista encontrada
                            cuartoAmarilloCompleto = true; // Marca el cuarto amarillo como completo
                        } else {
                            System.out.println("Ya has completado el cuarto amarillo."); // Informa al usuario que ya ha completado el cuarto amarillo
                            Utils.pausar();
                        }
                    } else {
                        System.out.println("Debes completar el cuarto verde antes de ingresar al cuarto amarillo."); 
                                                                                                              
                    }
                    break;
                case "Cuarto Azul": // Yen

                    break;
                case "Cuarto Magenta": // Ale

                    break;
                case "Cuarto Cian": // Vic
                    if (cuartoAmarilloCompleto == true) {
                        if (cuartoCianCompleto == false) { // Verifica si el cuarto cian ya está completo
                            verMapaCuartoCian(); // Muestra el mapa del cuarto cian
                            Utils.pausar(); // Pausa para que el usuario vea el mapa
                            Utils.establecerColorBlanco(); // Establece el color de la consola a blanco ya que si no se cambia, queda en amarillo
                            interaccionCuartoCian("E"); // Llama al método de interacción con el cuarto cian y devuelve la pista encontrada
                            cuartoCianCompleto = true; // Marca el cuarto cian como completo
                        } else {
                            System.out.println("Ya has completado el cuarto Cian."); // Informa al usuario que ya ha completado el cuarto cian
                            Utils.pausar();
                        }
                    } else {
                        System.out.println("Debes completar el cuarto magenta antes de ingresar al cuarto cian.");

                    }
                    break;
                case "Cuarto Final": // Yen

                    break;
            }

            // Validación para salir del juego
            Utils.limpiarConsola();
        } while (!cuartoCianCompleto); // Final del juego

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
     * Método para manejar la interacción en el cuarto amarillo.
     * Este método permite al jugador interactuar con diferentes objetos en el
     * cuarto,
     * 
     * @param pista
     * @return
     */
    public static String interaccionCuartoAmarillo(String pista) {
        String[] opcionesMenu = { "Estanteria", "Espejo", "Audifonos", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10; // Tiempo en minutos
        int codigoCaja = 0; // Código de la caja fuerte establecido en 0 para que el jugador lo ingrese
        int vidasActuales = 3; // Vidas del jugador
        boolean estanteria = false, cajaFuerte = false, audifonos = false, cajaAbierta = false,
                espejo = false, sabeClave = false, salirCuarto = false; // Variable para controlar
                                                                        // el juego

        // Inicio del juego en el cuarto amarillo. El jugador puede interactuar con
        // diferentes objetos y resolver acertijos.
        // Cada acción toma tiempo y el jugador tiene un límite de vidas.El objetivo es
        // encontrar una pista para avanzar en el juego.
        while (salirCuarto == false || (vidasActuales > 0 && tiempo > 0 && !cajaAbierta)) {

            verMapaCuartoAmarillo(); // Muestra el mapa del cuarto rojo
            Utils.establecerColorBlanco(); // Establece el color de la consola a blanco porque lo dejaba en rojo si no
                                           // se cambiaba
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogio la opción " + opcion); // Muestra la opción seleccionada por el usuario

            switch (opcion) {
                case "Estanteria": // Interacción con la estantería
                    if (!estanteria) {
                        System.out.println(
                                "Tiene un libro con una página marcada: “Los reflejos engañan, pero a veces son la clave para ver lo que está oculto”.");
                        estanteria = true;
                    } else {
                        System.out.println("Ya revisaste la estantería, no hay nada más que hacer aquí.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Espejo": // Interacción con el espejo
                    if (!espejo) {
                        System.out.println("El espejo refleja la combinación en la pared 539");
                        espejo = true;
                    } else {
                        System.out.println("Ya revisaste el espejo.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Audifonos": // Interacción con los audífonos
                    if (!audifonos) {
                        System.out.println(
                                "Al ponerte los audífonos, escuchas un mensaje: Izquierda, derecha, izquierda");
                        audifonos = true;
                    } else {
                        System.out.println("Ya revisaste los audífonos.");
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
                            if (codigoCaja == 935) {
                                cajaAbierta = true;
                                System.out.println(
                                        "¡Correcto! La caja fuerte se ha abierto. Encuantras una nota con la letra H");
                                pista = "W";
                                Utils.pausar();
                                System.out.println("Saliste del cuarto  con la pista:" + pista);
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
                            "Deseas salir del cuarto amarillo? Si sales sin revisar ningún elemento, pierdes una vida. (true/false)");
                    tiempo = -1;
                    if (salirCuarto)
                        if (!estanteria && !espejo && !audifonos) { // Si no se ha revisado nada, se pierde una vida
                            System.out.println(
                                    "Has decidido salir del cuarto amarillo. Pero pierdes una vida por salir sin resolver nada.");
                            vidasActuales--;
                        }
                    if (estanteria && !espejo && !audifonos) { // Si solo se revisó la estanteria, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado la estanteria, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!estanteria && espejo && !audifonos) { // Si solo se revisó el espejo, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado el espejo, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!estanteria && !espejo && audifonos) { // Si solo se revisó los audífonos, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado los audífonos, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (estanteria && espejo && audifonos) { // Si se revisaron todos los objetos, pero no abre la
                                                             // caja fuerte informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado la estanteria, el espejo y los audifonos, pero no has abierto la caja fuerte.");
                        vidasActuales--;
                    }
                    break;
            }
        }

        return pista;
    }

  /**
     * Método para manejar la interacción en el cuarto cian.
     * Este método permite al jugador interactuar con diferentes objetos en el
     * cuarto,
     * 
     * @param pista
     * @return
     */
     public static String interaccionCuartoCian(String pista) {
        String[] opcionesMenu = { "Impresora", "Caja de Discos", "Maleta", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10; // Tiempo en minutos
        int codigoCaja = 0; // Código de la caja fuerte establecido en 0 para que el jugador lo ingrese
        int vidasActuales = 3; // Vidas del jugador
        boolean impresora = false, cajaFuerte = false, maleta = false, cajaAbierta = false,
                cajaDeDiscos = false, sabeClave = false, salirCuarto = false; // Variable para controlar el juego

        // Inicio del juego en el cuarto cian. El jugador puede interactuar con
        // diferentes objetos y resolver acertijos.
        // Cada acción toma tiempo y el jugador tiene un límite de vidas.El objetivo es
        // encontrar una pista para avanzar en el juego.
        while (salirCuarto == false || (vidasActuales > 0 && tiempo > 0 && !cajaAbierta)) {
            verMapaCuartoCian(); // Muestra el mapa del cuarto cian
            Utils.establecerColorBlanco(); // Establece el color de la consola a blanco porque lo dejaba en rojo si no se cambiaba
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogio la opción " + opcion); // Muestra la opción seleccionada por el usuario

            switch (opcion) {
                case "Impresora": // Interacción con la impresora
                    if (!impresora) {
                        System.out.println("Al activarla, imprime una hoja con la frase: Si escapar deseas, toca escuchar la verdad");
                        impresora = true;
                    } else {
                        System.out.println("Ya revisaste la impresora, no hay nada más que hacer aquí.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Caja de Discos": // Interacción con la caja de discos
                    if (!cajaDeDiscos) {
                        System.out.println("La caja de discos tiene un disco con la pista: La verdad se oculta en la imaginación del viajero");
                        cajaDeDiscos = true;
                    } else {
                        System.out.println("Ya revisaste la caja de discos.");
                    }
                    tiempo = -1;
                    Utils.pausar();
                    Utils.limpiarConsola();
                    break;
                case "Maleta": // Interacción con la maleta
                    if (!maleta) {
                        System.out.println("Al abrir la maleta, encuentras una nota que  dice: Soy un pato solo, junto a mi primo el balon y su hermano el flaco");
                        maleta = true;
                    } else {
                        System.out.println("Ya revisaste la maleta.");
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
                            if (codigoCaja == 201) {
                                cajaAbierta = true;
                                System.out.println("¡Correcto! La caja fuerte se ha abierto. Encuantras una nota con la letra E");
                                pista = "E";
                                Utils.pausar();
                                System.out.println("Saliste del cuarto  con la pista:" + pista);
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
                            "Deseas salir del cuarto amarillo? Si sales sin revisar ningún elemento, pierdes una vida. (true/false)");
                    tiempo = -1;
                    if (salirCuarto)
                        if (!impresora && !cajaDeDiscos && !maleta) { // Si no se ha revisado nada, se pierde una vida
                            System.out.println(
                                    "Has decidido salir del cuarto amarillo. Pero pierdes una vida por salir sin resolver nada.");
                            vidasActuales--;
                        }
                    if (impresora && !cajaDeDiscos && !maleta) { // Si solo se revisó la impresora, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado la impresora, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!impresora && cajaDeDiscos && !maleta) { // Si solo se revisó el caja de discos, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado el caja de discos, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (!impresora && !cajaDeDiscos && maleta) { // Si solo se revisó los maleta, informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado los maleta, pero no has encontrado nada más.");
                        vidasActuales--;
                    }
                    if (impresora && cajaDeDiscos && maleta) { // Si se revisaron todos los objetos, pero no abre la
                                                             // caja fuerte informa al usuario
                        System.out.println(
                                "Has decidido salir del cuarto amarillo. Has revisado la impresora, la caja de discos y la maleta, pero no has abierto la caja fuerte.");
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
     * Metodo para mostrar el mapa del cuarto amarillo
     * Este método imprime un mapa ASCII que representa la disposición de los
     * objetos en el cuarto.
     */
    public static void verMapaCuartoAmarillo() {
        Utils.establecerColorAmarillo();
        System.out.println("Mapa del Cuarto Amarillo - Escape Room");
        System.out.println("            Puerta          ");
        System.out.println("               │            ");
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
     * Metodo para mostrar el mapa del cuarto amarillo
     * Este método imprime un mapa ASCII que representa la disposición de los
     * objetos en el cuarto.
     */
    public static void verMapaCuartoCian() {
        Utils.establecerColorCian();
        System.out.println("Mapa del Cuarto Cian - Escape Room");
        System.out.println("            Puerta          ");
        System.out.println("               │            ");
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

}
