import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class muneco {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Elige un juego:");
            System.out.println("1. Duelo vaquero");
            System.out.println("2. Carrera");
            System.out.println("3. Penalti");
            System.out.println("4. Carrera de coche");
            System.out.println("5. Salir");
            int juegoSeleccionado = scanner.nextInt();

            switch (juegoSeleccionado) {
                case 1:
                    duelovaquero(scanner);
                    break;
                case 2:
                    juegoCarrera(scanner);
                    break;
                case 3:
                    juegoPenalti(scanner);
                    break;
                case 4:
                    juegoCarreraCoches(scanner);
                case 5:
                    continuar = false;
                    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Selección inválida. Por favor, elige 1, 2, 3 o 4.");
                    break;
            }
        }
    }




    public static void duelovaquero(Scanner scanner) throws InterruptedException {
        System.out.println("Elige un muñeco que pienses que va a ganar:");
        System.out.println("1. Muñeco 1");
        System.out.println("2. Muñeco 2");
        int eleccion = scanner.nextInt();

        int vidaMuñeco1 = 10;
        int vidaMuñeco2 = 10;
        int espaciosEntreMuñecos = 3;
        boolean turnoMuñeco1 = true;

        while (vidaMuñeco1 > 0 && vidaMuñeco2 > 0) {
            int posicionInicialBala = (espaciosEntreMuñecos + 1) / 2;

            for (int i = 0; i <= espaciosEntreMuñecos; i++) {
                String espacioBala = " ".repeat(posicionInicialBala + i);

                if (turnoMuñeco1) {
                    System.out.println("        o               o ");
                    System.out.println("       /|-->           /|\\");
                    System.out.println("       " + espacioBala + "-");
                    System.out.println("       / \\             / \\ ");
                } else {
                    espacioBala = " ".repeat(espaciosEntreMuñecos - i);
                    System.out.println("        o               o ");
                    System.out.println("       /|\\           <--|\\");
                    System.out.println("       " + espacioBala + "-");
                    System.out.println("       / \\             / \\ ");
                }

                System.out.println("Vida: [" + vidaMuñeco1 + "]   Vida: [" + vidaMuñeco2 + "]");

                if (i < espaciosEntreMuñecos) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } else {
                    int dangAleatory = util.pedirNumeroAleatorioEntreDosNumeros(0, 5);
                    if (turnoMuñeco1) {
                        vidaMuñeco2 -= dangAleatory;
                    } else {
                        vidaMuñeco1 -= dangAleatory;
                    }

                    if (vidaMuñeco1 <= 0) {
                        System.out.println("        x               o ");
                        System.out.println("       /|              /|\\");
                        System.out.println("     __/ \\             / \\ ");
                        System.out.println("Vida: [ 0 ]   Vida: [" + vidaMuñeco2 + "]");
                        System.out.println("¡El Muñeco 1 ha muerto!");
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    }

                    if (vidaMuñeco2 <= 0) {
                        System.out.println("        o               x ");
                        System.out.println("       /|-->           /| ");
                        System.out.println("       / \\           __/ \\");
                        System.out.println("Vida: [" + vidaMuñeco1 + "]   Vida: [ 0 ]");
                        System.out.println("¡El Muñeco 2 ha muerto!");
                        TimeUnit.MILLISECONDS.sleep(1);
                        break;
                    }

                    turnoMuñeco1 = !turnoMuñeco1;
                }
            }
        }

        System.out.println("¡Impacto final!");
        System.out.println("Vida: [" + vidaMuñeco1 + "]   Vida: [" + vidaMuñeco2 + "]");

        if ((eleccion == 1 && vidaMuñeco1 > 0) || (eleccion == 2 && vidaMuñeco2 > 0)) {
            System.out.println("¡Tu elección ganó!");
        } else {
            System.out.println("¡Tu elección perdió!");
        }
    }

    public static void juegoCarrera(Scanner scanner) throws InterruptedException {
        System.out.println("Elige un muñeco para la carrera:");
        System.out.println("1. Muñeco 1");
        System.out.println("2. Muñeco 2");
        int eleccionCarrera = scanner.nextInt();

        int posicionMuñeco1 = 0;
        int posicionMuñeco2 = 0;
        int longitudCarrera = 20;

        while (posicionMuñeco1 < longitudCarrera && posicionMuñeco2 < longitudCarrera) {
            int avanceMuñeco1 = util.pedirNumeroAleatorioEntreDosNumeros(0, 3);
            int avanceMuñeco2 = util.pedirNumeroAleatorioEntreDosNumeros(0, 3);

            posicionMuñeco1 += avanceMuñeco1;
            posicionMuñeco2 += avanceMuñeco2;

            String espacioMuñeco1 = " ".repeat(posicionMuñeco1);
            String espacioMuñeco2 = " ".repeat(posicionMuñeco2);

            System.out.println("        " + espacioMuñeco1 + "corredor 1");
            System.out.println("        " + espacioMuñeco1 + "o ");
            System.out.println("       " + espacioMuñeco1 + "/|\\");
            System.out.println("       " + espacioMuñeco1 + "/ \\ ");
            System.out.println("        " + espacioMuñeco1 + "posición: " + posicionMuñeco1);
            System.out.println("");
            System.out.println("        " + espacioMuñeco2 + "corredor 2");
            System.out.println("        " + espacioMuñeco2 + "o ");
            System.out.println("       " + espacioMuñeco2 + "/|\\");
            System.out.println("       " + espacioMuñeco2 + "/ \\ ");
            System.out.println("        " + espacioMuñeco2 + "posición: " + posicionMuñeco2);

            TimeUnit.SECONDS.sleep(1);
        }

        if ((eleccionCarrera == 1 && posicionMuñeco1 >= longitudCarrera) || (eleccionCarrera == 2 && posicionMuñeco2 >= longitudCarrera)) {
            System.out.println("¡Tu elección ganó!");
        } else {
            System.out.println("¡Tu elección perdió!");
        }
    }

    public static void juegoPenalti(Scanner scanner) throws InterruptedException {
        System.out.println("¡Bienvenido al juego de Penaltis!");
        int golMuñeco1 = 0;
        int golMuñeco2 = 0;
        int espaciosEntreMuñecos = 3;
        boolean lanzadorMuñeco1 = true;

        while (golMuñeco1 < 2 && golMuñeco2 < 2) {
            // Alternar el lanzador
            lanzadorMuñeco1 = !lanzadorMuñeco1;

            System.out.println("Turno de " + (lanzadorMuñeco1 ? "Muñeco 1" : "Muñeco 2"));
            System.out.println("Elige una dirección para lanzar el penalti:");
            System.out.println("1. Izquierda");
            System.out.println("2. Centro");
            System.out.println("3. Derecha");
            int direccionLanzamiento = scanner.nextInt();

            int direccionPortero = util.pedirNumeroAleatorioEntreDosNumeros(1, 3);
            int posicionInicialBalon = (espaciosEntreMuñecos + 1) / 2;

            for (int i = 0; i <= espaciosEntreMuñecos; i++) {
                String espacioBalon = " ".repeat(posicionInicialBalon + i);
                System.out.print("\033[H\033[2J");  // Limpiar pantalla
                System.out.flush();

                if (lanzadorMuñeco1) {
                    System.out.println(" [ o               o ");
                    System.out.println(" |/|\\            /|\\");
                    System.out.println(" | / \\            / \\ ");
                    System.out.println(" [      " + espacioBalon + "o");
                } else {
                    System.out.println(" [ o              o ");
                    System.out.println("  /|\\           /|\\");
                    System.out.println(" | / \\           / \\ ");
                    System.out.println(" [      " + espacioBalon + "o");
                }

                if (i < espaciosEntreMuñecos) {
                    TimeUnit.SECONDS.sleep(1);
                } else {
                    if (direccionLanzamiento == direccionPortero) {
                        System.out.println("¡El portero ha detenido el penalti!");
                    } else {
                        System.out.println("¡Gol!");
                        if (lanzadorMuñeco1) {
                            golMuñeco1++;
                        } else {
                            golMuñeco2++;
                        }
                    }
                    System.out.println("Marcador: Muñeco 1 - " + golMuñeco1 + " | Muñeco 2 - " + golMuñeco2);
                }
            }
        }
            System.out.println("¡Fin del juego!");
            System.out.println("El ganador es " + (golMuñeco1 > golMuñeco2 ? "Muñeco 1" : "Muñeco 2") + "!");
    }
        public static void juegoCarreraCoches(Scanner scanner) throws InterruptedException {
            System.out.println("Elige un coche para la carrera:");
            System.out.println("1. Coche 1");
            System.out.println("2. Coche 2");
            int eleccionCarrera = scanner.nextInt();
            int posicionCoche1 = 0;
            int posicionCoche2 = 0;
            int longitudCarrera = 20;
            while (posicionCoche1 < longitudCarrera && posicionCoche2 < longitudCarrera) {
                int avanceCoche1 = util.pedirNumeroAleatorioEntreDosNumeros(0, 3);
                int avanceCoche2 = util.pedirNumeroAleatorioEntreDosNumeros(0, 3);
                posicionCoche1 += avanceCoche1;
                posicionCoche2 += avanceCoche2;
                String espacioCoche1 = " ".repeat(posicionCoche1);
                String espacioCoche2 = " ".repeat(posicionCoche2);
                System.out.println(" " + espacioCoche1 + "Coche 1");
                System.out.println(" " + espacioCoche2 + "   _______");
                System.out.println(" " + espacioCoche2 +"  /_|__|__\\ ");
                System.out.println(" " + espacioCoche2 +"=[__|__|____]");
                System.out.println(" " + espacioCoche2 + " (_)     (_)");
                System.out.println(" " + espacioCoche1 + "Posición: " + posicionCoche1);
                System.out.println("");
                System.out.println(" " + espacioCoche2 + "Coche 2");
                System.out.println(" " + espacioCoche2 + "   _______");
                System.out.println(" " + espacioCoche2 +"  /_|__|__\\ ");
                System.out.println(" " + espacioCoche2 +"=[__|__|____]");
                System.out.println(" " + espacioCoche2 + " (_)     (_)");
                System.out.println(" " + espacioCoche1 + "Posición: " + posicionCoche1);
                System.out.println(" " + espacioCoche2 + "Posición: " + posicionCoche2);
                TimeUnit.SECONDS.sleep(1); }
            if ((eleccionCarrera == 1 && posicionCoche1 >= longitudCarrera) || (eleccionCarrera == 2 && posicionCoche2 >= longitudCarrera))
            { System.out.println("¡Tu elección ganó!"); }
            else { System.out.println("¡Tu elección perdió!");
            }
        }
    }
