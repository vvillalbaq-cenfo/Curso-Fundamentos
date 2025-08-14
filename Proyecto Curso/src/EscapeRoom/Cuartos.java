package EscapeRoom;

import utilitarios.Utils;

public class Cuartos {

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
    static boolean finalDelJuego = false;
    static String nombreUsuario = "";

    // Rutina de método para solicitar nombre de usuario

    public static void solicitarNombreUsuario() {
        Utils.leerString("");
        boolean validacionNombreUsuario = false;
        do {
            nombreUsuario = Utils.leerString("Ingrese su nombre de usuario:");
            if (nombreUsuario != null && !nombreUsuario.trim().isEmpty()) {
                validacionNombreUsuario = true;
                System.out.println("Usuario " + nombreUsuario + " creado exitosamente.");

            } else {
                System.out.println("El nombre de usuario no puede estar vacío. Intenta de nuevo.");
            }
            Utils.pausar();
            Utils.limpiarConsola();
        } while (!validacionNombreUsuario);
    }

    // Reglas del Juego
    public static void mostrarReglas() {
        System.out.println(
                "Este es un juego de escape room donde debes resolver acertijos y encontrar pistas para escapar de diferentes cuartos.");
        System.out.println(
                "Cada cuarto tiene sus propios desafíos y debes completar todos para ganar el juego. Cada cuarto tiene un tiempo límite de 10 minutos.");
        System.out.println("Debes encontrar las llaves o códigos necesarios para avanzar al siguiente cuarto.");
        System.out.println("Recuerda que el tiempo es limitado y cada acción que tomes consumirá tiempo.");
        System.out.println(
                "Debes estar atento a las pistas que encuentres en cada cuarto. Para abrir las cajas fuertes y conseguir los códigos para abrir la puerta final.");
        System.out.println(
                "Además, debes de revisar como mínimo un cuarto, un objeto y tener mínimo una pista resuelta para poder salir del Escape Room.");
        System.out.println(
                "Si consumes los 10 minutos, un gas mortífero te aniquilará. Recuerda que tienes un máximo de 3 vidas por cuarto. Si superas este límite, perderás el juego.");
        System.out.println("¡Buena suerte, " + nombreUsuario + "!");
        Utils.pausar();
    }

    // procesar Cuarto Rojo
    public static void procesarCuartoRojo() {
        if (!cuartoRojoCompleto) {
            Utils.establecerColorRojo();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoRojo();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoRojo();
            if (pistaObtenida != null) {
                pistas[0] = pistaObtenida;
                cuartoRojoCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto rojo.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Verde
    public static void procesarCuartoVerde() {
        if (!cuartoRojoCompleto) {
            System.out.println("Debes completar el cuarto rojo antes de ingresar al cuarto verde.");
            Utils.pausar();
            return;
        }

        if (!cuartoVerdeCompleto) {
            Utils.establecerColorVerde();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoVerde();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoVerde();
            if (pistaObtenida != null) {
                pistas[1] = pistaObtenida;
                cuartoVerdeCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto verde.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Amarillo
    public static void procesarCuartoAmarillo() {
        if (!cuartoVerdeCompleto) {
            System.out.println("Debes completar el cuarto verde antes de ingresar al cuarto amarillo.");
            Utils.pausar();
            return;
        }

        if (!cuartoAmarilloCompleto) {
            Utils.establecerColorAmarillo();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoAmarillo();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoAmarillo();
            if (pistaObtenida != null) {
                pistas[2] = pistaObtenida;
                cuartoAmarilloCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto amarillo.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Azul
    public static void procesarCuartoAzul() {
        if (!cuartoAmarilloCompleto) {
            System.out.println("Debes completar el cuarto amarillo antes de ingresar al cuarto azul.");
            Utils.pausar();
            return;
        }

        if (!cuartoAzulCompleto) {
            Utils.establecerColorAzul();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoAzul();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoAzul();
            if (pistaObtenida != null) {
                pistas[3] = pistaObtenida;
                cuartoAzulCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto azul.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Magenta
    public static void procesarCuartoMagenta() {
        if (!cuartoAzulCompleto) {
            System.out.println("Debes completar el cuarto azul antes de ingresar al cuarto magenta.");
            Utils.pausar();
            return;
        }

        if (!cuartoMagentaCompleto) {
            Utils.establecerColorMangenta();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoMagenta();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoMagenta();
            if (pistaObtenida != null) {
                pistas[4] = pistaObtenida;
                cuartoMagentaCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto magenta.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Cian
    public static void procesarCuartoCian() {
        if (!cuartoMagentaCompleto) {
            System.out.println("Debes completar el cuarto magenta antes de ingresar al cuarto cian.");
            Utils.pausar();
            return;
        }

        if (!cuartoCianCompleto) {
            Utils.establecerColorCian();
            animacionPuertaRealista();
            Utils.establecerColorBlanco();
            Animacion.verMapaCuartoCian();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoCian();
            if (pistaObtenida != null) {
                pistas[5] = pistaObtenida;
                cuartoCianCompleto = true;
            }
        } else {
            System.out.println("Ya has completado el cuarto cian.");
            Utils.pausar();
        }
    }

    // Procesar Cuarto Final
    public static void procesarCuartoFinal() {
        if (!todosLosCuartosCompletados()) {
            System.out.println("Debes completar todos los cuartos anteriores antes de acceder al cuarto final.");
            Utils.pausar();
            return;

        } else {
            animacionPuertaRealista();
            System.out.println("¡Bienvenido al cuarto final!");
            Animacion.verMapaCuartoFinal();
            Utils.pausar();
            Utils.establecerColorBlanco();
            String pistaObtenida = interaccionCuartoFinal();
            if (pistaObtenida != null) {
                pistas[6] = pistaObtenida;
                cuartoFinalCompleto = true;
            }

        }
    }

    public static boolean todosLosCuartosCompletados() {
        return cuartoRojoCompleto && cuartoVerdeCompleto && cuartoAmarilloCompleto && cuartoAzulCompleto
                && cuartoMagentaCompleto && cuartoCianCompleto;
    }

    // Interacción con el cuarto rojo
    public static String interaccionCuartoRojo() {
        String[] opcionesMenu = {
                "Inventario", "Camara en la esquina del Cuarto", "Escritorio", "Lampara", "Caja Fuerte", "Salir"
        };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean camaraFalsa = false, cajaFuerte = false, lampara = false, escritorio = false, gameOver = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while ((!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) || gameOver == true) {
            Animacion.verMapaCuartoRojo();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (camaraFalsa) {
                        System.out.println("En la camara encontraste: Una flecha señalando el escritorio");
                        if (escritorio) {
                            System.out.println(
                                    "En el escritorio encontraste: Luz y sombra muestran el camino hacia la caja fuerte. A veces las cosas se toman al revés.");
                            if (lampara) {
                                System.out.println(
                                        "En la lampara encontraste: Al encender la lámpara, proyecta un código: 247 en la pared");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Camara en la esquina del Cuarto":
                    if (!camaraFalsa) {
                        String pista = "Una flecha que señala el escritorio";
                        System.out.println(
                                "No funciona esta cámara, pero detrás de ella hay una marca en la pared: " + pista);
                        pistas[0] = pista;
                        camaraFalsa = true;
                    } else {
                        System.out.println("Ya revisaste la cámara, no hay nada más que hacer aquí.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Escritorio":
                    if (!escritorio) {
                        String pista = "Pista del escritorio: 'Luz y sombra muestran el camino'";
                        System.out.println(
                                "Luz y sombra muestran el camino hacia la caja fuerte. A veces las cosas se toman al revés.");
                        pistas[0] = pista;
                        escritorio = true;
                    } else {
                        System.out.println("Ya revisaste el escritorio.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Lampara":
                    if (!lampara) {
                        String pista = "Código proyectado por la lámpara: 247";
                        System.out.println("Al encender la lámpara, proyecta un código: 247 en la pared.");
                        pistas[0] = pista;
                        lampara = true;
                    } else {
                        System.out.println("Ya revisaste la lámpara.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(742, "O", vidasActuales, tiempo);
                    if (resultado != "S" && resultado != null) {
                        cajaAbierta = true;
                        cuartoRojoCompleto = true;
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra O");
                        Utils.pausar();
                        return resultado;
                    } else if (resultado == "S") {
                        tiempo--;
                        gameOver = true;
                        return null;

                    }

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto rojo? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(camaraFalsa, escritorio, lampara, cajaAbierta, vidasActuales,
                                "rojo");
                    }
                    tiempo--;
                    break;
            }
        }

        if (vidasActuales <= 0) {
            System.out.println("Has perdido todas las vidas. Fin del juego.");
            return null;
        }

        if (tiempo <= 0) {
            System.out.println("Se acabó el tiempo. El gas mortífero te ha vencido.");
            return null;
        }

        return null;
    }

    // Interacción con el cuarto azul
    public static String interaccionCuartoAzul() {
        String[] opcionesMenu = { "Inventario", "Vaso", "Encendedor", "Papiro", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean vaso = false, encendedor = false, papiro = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoAzul();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    if (encendedor && papiro && vaso) {
                        System.out.println("═════════════════════════════");
                        System.out.println("        INVENTARIO");
                        System.out.println("═════════════════════════════");
                        System.out.println(
                                "En el vaso encontraste: Al calentar el vaso con el encendedor, puedes ver el código 843");
                        if (encendedor) {
                            System.out.println(
                                    "Con el encendedor, no encuentras nada fuera de lo normal, pero puede ser útil.");
                            if (papiro) {
                                System.out.println(
                                        "Revisando el papiro encontraste que al extenderlo, puedes ver que dice muy borroso: El número más caliente.");

                            }
                        }
                    } else {
                        System.out.println(
                                "No hay nada en el inventario del cuarto azul todavía. Porfavor revisa todos los objetos.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Vaso":
                    if (!vaso) {
                        System.out.println("El vaso está con un líquido pero no parece tener nada.");
                        if (encendedor && papiro) {
                            System.out.println("Al calentar el vaso con el encendedor, puedes ver el código 843");
                            vaso = true;
                        }

                    } else {
                        System.out.println("Ya revisaste el vaso, no hay nada más que hacer aquí.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Encendedor":
                    if (!encendedor) {
                        System.out.println("No tiene nada fuera de lo normal, pero puede ser útil.");
                        encendedor = true;
                    } else {
                        System.out.println("Ya revisaste el encendedor.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Papiro":
                    if (encendedor) {
                        if (!papiro) {
                            System.out.println(
                                    "Encuentras un papiro, al extenderlo, puedes ver que dice muy borroso: El número más caliente.");
                            papiro = true;
                        } else {
                            System.out.println("Ya revisaste el papiro.");
                        }
                    } else {
                        System.out.println("El papiro require de calor para ser leído.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(843, "P", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra P");
                        Utils.pausar();
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto azul? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(vaso, encendedor, papiro, cajaAbierta, vidasActuales, "azul");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    // Interacción con el cuarto amarillo
    public static String interaccionCuartoAmarillo() {
        String[] opcionesMenu = { "Inventario", "Estanteria", "Espejo", "Audifonos", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean estanteria = false, espejo = false, audifonos = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoAmarillo();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (estanteria) {
                        System.out.println(
                                "En la estanteria encontraste un libro con una página marcada: Los reflejos engañan, pero a veces son la clave para ver lo que está oculto.");
                        if (espejo) {
                            System.out.println(
                                    "Con el espejo encontraste que refleja la combinación en la pared 539");
                            if (audifonos) {
                                System.out.println(
                                        "Con los audifonos pudiste escuchar: ¿Espejito, espejito, cual número al revés, es el más bonito?");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Estanteria":
                    if (!estanteria) {
                        System.out.println(
                                "Tiene un libro con una página marcada: Los reflejos engañan, pero a veces son la clave para ver lo que está oculto.");
                        estanteria = true;
                    } else {
                        System.out.println("Ya revisaste la estantería, no hay nada más que hacer aquí.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Espejo":
                    if (!espejo) {
                        System.out.println("El espejo refleja la combinación en la pared 539");
                        espejo = true;
                    } else {
                        System.out.println("Ya revisaste el espejo.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Audifonos":
                    if (!audifonos) {
                        System.out.println(
                                "Al ponerte los audífonos, escuchas un mensaje: ¿Espejito, espejito, cual número al revés, es el más bonito?");
                        audifonos = true;
                    } else {
                        System.out.println("Ya revisaste los audífonos.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(935, "W", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra W");
                        Utils.pausar();
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto amarillo? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(estanteria, espejo, audifonos, cajaAbierta, vidasActuales,
                                "amarillo");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    // Interacción con el cuarto magenta
    public static String interaccionCuartoMagenta() {
        String[] opcionesMenu = { "Inventario",
                "Caja con cerradura electrónica",
                "Caja de acertijo",
                "Nota bajo la baldosa",
                "Caja Fuerte",
                "Salir"
        };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean cerradura = false, acertijo = false, notaBaldosa = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoMagenta();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (cerradura) {
                        System.out.println(
                                "La cerradura electtronica, encontraste una nota que te pregunta: ¿Eres Romano?");
                        if (acertijo) {
                            System.out.println(
                                    "En la caja encontraste que la caja muestra un enigma en números romanos: 'V + X + III'");
                            if (notaBaldosa) {
                                System.out.println(
                                        "Debajo de la baldoza encontraste La nota que dice: 'Multiplica por 3");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Caja con cerradura electrónica":
                    if (!cerradura) {
                        System.out.println(
                                "La cerradura electrónica parece estar dañada, por lo que puedes abrirla sin problema. Dentro encuentras una nota con una pregunta");
                        System.out.println("¿Eres romano?");
                        cerradura = true;
                    } else {
                        System.out.println("Ya revisaste la cerradura.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja de acertijo":
                    if (!acertijo) {
                        System.out.println("La caja muestra un enigma en números romanos: 'V + X + III'");
                        acertijo = true;
                    } else {
                        System.out.println("Ya revisaste la caja de acertijo.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Nota bajo la baldosa":
                    if (!notaBaldosa) {
                        System.out.println("La nota dice: 'Multiplica por 3'.");
                        notaBaldosa = true;
                    } else {
                        System.out.println("Ya revisaste debajo de la baldosa.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(54, "P", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra P");
                        Utils.pausar();
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto magenta? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(cerradura, acertijo, notaBaldosa, cajaAbierta, vidasActuales,
                                "magenta");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    // Interacción con el cuarto verde
    public static String interaccionCuartoVerde() {
        String[] opcionesMenu = {
                "Inventario",
                "Bote de pintura",
                "Peluche rasgado",
                "Radio antigua",
                "Caja Fuerte",
                "Salir"
        };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean pintura = false, peluche = false, radio = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoVerde();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (pintura) {
                        System.out.println(
                                "Debajo del bote aparece un número parcialmente cubierto: 7_1");
                        if (peluche) {
                            System.out.println(
                                    "Dentro del peluche hay una nota que dice: 'El número que falta es igual a la expresión 12^0'.");
                            if (radio) {
                                System.out.println(
                                        "Al encender la radio, escuchas: \r\n" +
                                                "Un osito de peluche de taiwan\r\n" +
                                                "Una cascara de nuez en el mar\r\n" +
                                                "Suavecito como alfombra de piel\r\n" +
                                                "Delicioso como el dulce de leche");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Bote de pintura":
                    if (!pintura) {
                        System.out.println("Debajo del bote aparece un número parcialmente cubierto: 7_1.");
                        pintura = true;
                    } else {
                        System.out.println("Ya revisaste el bote de pintura.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Peluche rasgado":
                    if (!peluche) {
                        System.out.println(
                                "Dentro del peluche hay una nota que dice: 'El número que falta es igual a la expresión 12^0'.");
                        peluche = true;
                    } else {
                        System.out.println("Ya revisaste el peluche.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Radio antigua":
                    if (!radio) {
                        System.out
                                .println("Al encender la radio, escuchas: \r\n" +
                                        "Un osito de peluche de taiwan\r\n" +
                                        "Una cascara de nuez en el mar\r\n" +
                                        "Suavecito como alfombra de piel\r\n" +
                                        "Delicioso como el dulce de leche");
                        radio = true;
                    } else {
                        System.out.println("Ya revisaste la radio.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(701, "H", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra H");
                        Utils.pausar();
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto verde? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(pintura, peluche, radio, cajaAbierta, vidasActuales, "verde");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    // Interacción con el cuarto cian
    public static String interaccionCuartoCian() {
        String[] opcionesMenu = { "Inventario", "Impresora", "Caja de Discos", "Maleta", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean impresora = false, cajaDeDiscos = false, maleta = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoCian();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (impresora) {
                        System.out.println(
                                "Al activarla, imprime una hoja con la frase: Si escapar deseas, toca escuchar la verdad");
                        if (cajaDeDiscos) {
                            System.out.println(
                                    "La caja de discos tiene un disco con la pista: La verdad se oculta en la imaginación del viajero");
                            if (maleta) {
                                System.out.println(
                                        "Al abrir la maleta, encuentras una nota que dice: Soy un pato solo, junto a mi primo el balón y su hermano el flaco");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;

                case "Impresora":
                    if (!impresora) {
                        System.out.println(
                                "Al activarla, imprime una hoja con la frase: Si escapar deseas, toca escuchar la verdad");
                        impresora = true;
                    } else {
                        System.out.println("Ya revisaste la impresora, no hay nada más que hacer aquí.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja de Discos":
                    if (!cajaDeDiscos) {
                        System.out.println(
                                "La caja de discos tiene un disco con la pista: La verdad se oculta en la imaginación del viajero");
                        cajaDeDiscos = true;
                    } else {
                        System.out.println("Ya revisaste la caja de discos.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Maleta":
                    if (!maleta) {
                        System.out.println(
                                "Al abrir la maleta, encuentras una nota que dice: Soy un pato solo, junto a mi primo el balón y su hermano el flaco");
                        maleta = true;
                    } else {
                        if (cajaDeDiscos && impresora) {
                            System.out.println(
                                    "Debes inspeccionar primero la impresora o caja de discos para abrir la maleta.");
                        } else {
                            System.out.println("Ya revisaste la maleta.");
                        }

                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(201, "E", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra E");
                        Utils.pausar();
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto cian? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(impresora, cajaDeDiscos, maleta, cajaAbierta, vidasActuales,
                                "cian");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    // Interacción con el cuarto final
    public static String interaccionCuartoFinal() {
        String[] opcionesMenu = { "Inventario", "Silla", "Pizarra", "Foto Vieja", "Caja Fuerte", "Salir" };
        String opcion = "";
        int opcionSeleccionada;
        int tiempo = 10;
        int vidasActuales = 3;
        boolean silla = false, pizarra = false, fotoVieja = false;
        boolean cajaAbierta = false, salirCuarto = false;

        while (!salirCuarto && vidasActuales > 0 && tiempo > 0 && !cajaAbierta) {
            Animacion.verMapaCuartoFinal();
            Utils.establecerColorBlanco();
            opcionSeleccionada = Utils.seleccionarElementoTexto("CUARTO FINAL", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogió la opción " + opcion);

            switch (opcion) {
                case "Inventario":
                    System.out.println("═════════════════════════════");
                    System.out.println("        INVENTARIO");
                    System.out.println("═════════════════════════════");
                    if (silla) {
                        System.out.println(
                                "Debajo de la silla encontraste una nota arrugada. Dice: Entre uno y tres, el equilibrio se encuentra.");
                        if (pizarra) {
                            System.out.println(
                                    "En la pizarra viste escrito la frase: Cinco sentidos guían al sabio.");
                            if (fotoVieja) {
                                System.out.println(
                                        "En la parte trasera de la foto alguien escribió: El tiempo no borra lo que ocurrió aquel día. Han pasado 8 años.");
                            }
                        }
                    } else {
                        System.out.println("No hay nada en el inventario del cuarto rojo todavía.");
                    }
                    System.out.println("═════════════════════════════");
                    Utils.pausar();
                    break;
                case "Silla":
                    if (!silla) {
                        System.out.println(
                                "Debajo de la silla hay una nota arrugada. Dice: Entre uno y tres, el equilibrio se encuentra.");
                        silla = true;
                    } else {
                        System.out.println("Ya revisaste la silla. No hay nada más allí.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Pizarra":
                    if (!pizarra) {
                        System.out.println("La pizarra tiene escrita la frase: Cinco sentidos guían al sabio.");
                        pizarra = true;
                    } else {
                        System.out.println("Ya revisaste la pizarra.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Foto Vieja":
                    if (!fotoVieja) {
                        System.out.println(
                                "En la parte trasera de la foto alguien escribió: El tiempo no borra lo que ocurrió aquel día. Han pasado 8 años.");
                        fotoVieja = true;
                    } else {
                        System.out.println("Ya revisaste la foto vieja.");
                    }
                    tiempo--;
                    Utils.pausar();
                    break;

                case "Caja Fuerte":
                    String resultado = procesarCajaFuerte(258, "R", vidasActuales, tiempo);
                    if (resultado != null) {
                        System.out.println("Dentro de la caja fuerte encuentras una nota con la letra R");
                        return resultado;
                    }
                    break;

                case "Salir":
                    salirCuarto = Utils.leerBoolean(
                            "¿Deseas salir del cuarto final? Si sales sin revisar elementos, pierdes una vida. (true/false)");
                    if (salirCuarto) {
                        vidasActuales = procesarSalida(pizarra, fotoVieja, silla, cajaAbierta, vidasActuales,
                                "final");
                    }
                    tiempo--;
                    break;
            }
        }

        return manejarFinCuarto(vidasActuales, tiempo);
    }

    public static String procesarCajaFuerte(int codigoCorrecto, String pistaLetra, int vidasActuales, int tiempo) {
        System.out.println("La caja fuerte está cerrada con un código.");
        boolean sabeClave = Utils.leerBoolean("¿Sabes el código de la caja fuerte? (true/false)");

        if (!sabeClave) {
            System.out.println("Mejor busca más pistas antes de intentar abrirla.");
            Utils.pausar();
            return null;
        }

        while (vidasActuales > 0) {
            int codigoCaja = Utils.leerEntero("Escribe el código de la caja fuerte:");
            if (codigoCaja == codigoCorrecto) {
                System.out.println("¡Código correcto! Has abierto la caja fuerte.");
                Utils.pausar();
                return pistaLetra;

            } else {
                vidasActuales--;
                if (vidasActuales > 0) {
                    System.out.println("Código incorrecto. Te quedan " + vidasActuales + " intentos.");
                    Utils.pausar();
                    Utils.limpiarConsola();
                } else {
                    System.out.println("¡Fallaste todos los intentos! Has perdido todas tus vidas. Fin del juego.");
                    Animacion.gameOver();
                    Utils.pausar();
                    System.exit(0);
                    return null;

                }
            }
        }
        return null;
    }

    // Metodo para procesar la salida en la puerta de salida
  public static void procesarPurtaDeSalida() {
    if (cuartoAmarilloCompleto || cuartoAzulCompleto || cuartoCianCompleto || cuartoFinalCompleto
            || cuartoMagentaCompleto || cuartoRojoCompleto || cuartoVerdeCompleto) {
        System.out.println("La puerta está cerrada con un código de 7 letras.");
        boolean sabeClavePuerta = Utils.leerBoolean("¿Sabes el código de la puerta? (true/false)");

        if (!sabeClavePuerta) {
            System.out.println("Mejor busca más pistas antes de intentar abrirla.");
            Utils.pausar();
        } else if (sabeClavePuerta) {
            int intentos = 3;
            boolean acertado = false;

            // Primero el acertijo del pomo
            System.out.println("Antes de poder ingresar el código, debes girar el pomo resolviendo un acertijo...");
            System.out.println("Acertijo:");
            System.out.println("Entre panes me escondo, soy jugosa y sabrosa. Con queso o tocino, soy la reina gloriosa.");
            String respuestaPomo = Utils.leerString("¿Qué soy?");

            if (respuestaPomo.equalsIgnoreCase("hamburguesa")) {
                System.out.println("*CLICK* El pomo gira lentamente...");
                Utils.pausar();
                System.out.println("La puerta está lista para que ingreses el código.");
                Utils.pausar();

                // Solo si responde correctamente el acertijo, puede intentar el código
                while (intentos > 0 && !acertado) {
                    String codigoIngresado = Utils.leerString("Ingresa el código de 7 letras:");
                    if (codigoIngresado.equalsIgnoreCase("WHOPPER")) {
                        System.out.println("¡Código correcto! La puerta se abre...");
                        Utils.pausar();
                        Animacion.felicidades();
                        Utils.pausar();
                        acertado = true;
                        System.exit(0); 
                    } else {
                        intentos--;
                        if (intentos > 0) {
                            System.out.println("Código incorrecto. Te quedan " + intentos + " intento(s).");
                            Utils.pausar();
                            Utils.limpiarConsola();
                        }
                    }
                }

                if (!acertado) {
                    System.out.println("¡Fallaste todos los intentos del código! Has perdido todas tus vidas. Fin del juego.");
                    Animacion.gameOver();
                    Utils.pausar();
                    System.exit(0);
                }

            } else {
                System.out.println("Respuesta incorrecta del acertijo.");
                intentos--; 
                System.out.println("Has perdido una vida. Te quedan " + intentos + " vida(s).");
                
                if (intentos <= 0) {
                    System.out.println("¡Te has quedado sin vidas! Fin del juego.");
                    Animacion.gameOver();
                    Utils.pausar();
                    System.exit(0);
                }
                
                Utils.pausar();
                return; 
            }
        }
    } else {
        System.out.println("No has ingresado a ningún cuarto. Mejor busca más pistas antes de intentar abrirla.");
        Utils.pausar();
    }
}

    // Método para procesar la salida de un cuarto
    public static int procesarSalida(boolean obj1, boolean obj2, boolean obj3, boolean cajaAbierta, int vidasActuales,
            String nombreCuarto) {

        int objetosRevisados = 0;
        if (obj1)
            objetosRevisados++;
        if (obj2)
            objetosRevisados++;
        if (obj3)
            objetosRevisados++;

        if (vidasActuales > 0) {
            if (objetosRevisados == 0) {
                System.out.println(
                        "Saliste del cuarto " + nombreCuarto + " sin revisar ningún objeto. Pierdes una vida.");
                vidasActuales--;
            } else if (objetosRevisados == 1) {
                System.out.println("Revisaste solo un objeto del cuarto " + nombreCuarto + ". Pierdes una vida.");
                vidasActuales--;
            } else if (objetosRevisados == 2) {
                System.out.println("Revisaste dos objetos del cuarto " + nombreCuarto + ". Pierdes una vida.");
                vidasActuales--;
            } else if (objetosRevisados == 3 && !cajaAbierta) {
                System.out.println(
                        "Revisaste todos los objetos del cuarto " + nombreCuarto + ", pero no abriste la caja fuerte.");
                vidasActuales--;
            }
        } else {
            System.out.println("¡Fallaste todos los intentos! Has perdido todas tus vidas. Fin del juego.");
            Animacion.gameOver();
            Utils.pausar();
        }

        Utils.pausar();
        return vidasActuales;
    }

    // Método para manejar el fin de un cuarto
    public static String manejarFinCuarto(int vidasActuales, int tiempo) {
        if (vidasActuales <= 0) {
            System.out.println("Has perdido todas las vidas. Fin del juego.");
            Utils.pausar();
            return null;
        }

        if (tiempo <= 0) {
            System.out.println("Se acabó el tiempo. El gas mortífero te ha vencido.");
            Utils.pausar();
            return null;
        }

        return null;
    }

    // Método para mostrar inventario
    public static void mostrarInventario() {
        System.out.println("═════════════════════════════");
        System.out.println("        INVENTARIO");
        System.out.println("═════════════════════════════");

        boolean tieneItems = false;
        if (cuartoRojoCompleto && pistas[0] != null) {
            System.out.println("En el cuarto Rojo, encontraste una nota con la letra: " + pistas[0]);
            tieneItems = true;
        }
        if (cuartoVerdeCompleto && pistas[1] != null) {
            System.out.println("En el cuarto Verde, encontraste una nota con la letra: " + pistas[1]);
            tieneItems = true;
        }
        if (cuartoAmarilloCompleto && pistas[2] != null) {
            System.out.println("En el cuarto Amarillo, encontraste una nota con la letra: " + pistas[2]);
            tieneItems = true;
        }
        if (cuartoAzulCompleto && pistas[3] != null) {
            System.out.println("En el cuarto Azul, encontraste una nota con la letra: " + pistas[3]);
            tieneItems = true;
        }
        if (cuartoMagentaCompleto && pistas[4] != null) {
            System.out.println("En el cuarto Magenta, encontraste una nota con la letra: " + pistas[4]);
            tieneItems = true;
        }
        if (cuartoCianCompleto && pistas[5] != null) {
            System.out.println("En el cuarto Cian, encontraste una nota con la letra: " + pistas[5]);
            tieneItems = true;
        }
        if (cuartoFinalCompleto && pistas[6] != null) {
            System.out.println("En el cuarto Final, encontraste una nota con la letra: " + pistas[6]);
            tieneItems = true;
        }

        if (!tieneItems) {
            System.out.println("No tienes pistas aún.");
        }

        System.out.println("═════════════════════════════");
        Utils.pausar();
    }

    // Animación de abrir puertas //Los dibujos y animaciones realizadas en este
    // código se realizaron con ayuda de Copilot
    public static void animacionPuertaRealista() {
        if (!cuartoAmarilloCompleto || !cuartoAzulCompleto || !cuartoCianCompleto || !cuartoFinalCompleto
                || !cuartoMagentaCompleto || !cuartoRojoCompleto || !cuartoVerdeCompleto) {
            String[] frames = {
                    """
                            ╔════════════════════════════════════════════════════╗
                            ║                                                    ║
                            ║              ┌────────────────────────┐            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │███████████████████*████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              │████████████████████████│            ║
                            ║              └────────────────────────┘            ║
                            ║                                                    ║
                            ╚════════════════════════════════════════════════════╝
                            """,
                    """
                            ╔════════════════════════════════════════════════════╗
                            ║                                                    ║
                            ║              ┌────────────────────┐───┐            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │██████████████*█████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              │████████████████████│   |            ║
                            ║              └────────────────────┘───┘            ║
                            ║                                                    ║
                            ╚════════════════════════════════════════════════════╝
                            """,
                    """
                            ╔════════════════════════════════════════════════════╗
                            ║                                                    ║
                            ║              ┌───────────┐────────────┐            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │████████*██│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              │███████████│            |            ║
                            ║              └───────────┘────────────┘            ║
                            ║                                                    ║
                            ╚════════════════════════════════════════════════════╝
                            """,
                    """
                            ╔════════════════════════════════════════════════════╗
                            ║                                                    ║
                            ║              ┌─────┐─────────────────┐             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │████*│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              │█████│                 |             ║
                            ║              └─────┘─────────────────┘             ║
                            ║                                                    ║
                            ╚════════════════════════════════════════════════════╝
                            """,
            };

            for (String frame : frames) {
                Utils.limpiarConsola();
                System.out.println(frame);
                try {
                    Thread.sleep(600); // Tiempo entre cada frame
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

    }

}
