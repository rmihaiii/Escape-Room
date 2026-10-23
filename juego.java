// Integrantes: Marc Prats, Robert Szabadi, Pol Camps

import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan_num = new Scanner(System.in);

        int respuesta = 0;
        int codigo = 0;
        int intentos = 3;
        boolean nivel_1 = false;
        boolean nivel_2 = false;
        boolean nivel_3 = false;
        String continuar = "";

        System.out.println(
                "=================================================================================================================================================\n");
        System.out.println(
                "Año 2187. Despiertas tirado en el suelo de la nave Orión, con las luces de emergencia parpadeando en rojo. Un meteorito ha golpeado el casco y ha dejado la nave sin energía. Las puertas están bloqueadas y el oxígeno se está agotando poco a poco.\n");
        System.out.println(
                "Eres el único tripulante que sigue consciente. Tu única salida es la cápsula de escape, pero para llegar a ella tendrás que abrir la puerta de la sala de máquinas, reiniciar el reactor y descifrar el código de la cápsula.\n");
        System.out.println("Tienes poco tiempo. ¡Piensa rápido!\n\n");
        System.out.println("Pulsa la tecla 'Enter' para continuar\n");
        System.out.println(
                "=================================================================================================================================================");
        continuar = scan.nextLine();

        // ================= PRUEBA 1: LA PUERTA =================
        System.out.println("LA PUERTA BLOQUEADA\n\n");
        System.out.println(
                "Corres por el pasillo hasta la sala de máquinas, pero la puerta está bloqueada. En un panel con la pantalla medio rota aparece una secuencia de números parpadeando:\n");
        System.out.println("2, 3, 6, 7, 14, 15, 30, ...\n");
        System.out.println("Pulsa la tecla 'Enter' para continuar\n");
        System.out.println(
                "=================================================================================================================================================");
        continuar = scan.nextLine();

        System.out.println(
                "Un mensaje te avisa:\n\nEl sistema usa dos operaciones que se van alternando. Introduce el siguiente número de la secuencia para abrir la puerta. Solo tienes 3 intentos antes de que el sistema se bloquee.\n\n");
        System.out.println("Tu respuesta: (INTRODUCE UN NUMERO)\n");
        System.out.println(
                "=================================================================================================================================================");

        while (intentos > 0 && !nivel_1) {
            respuesta = scan_num.nextInt();
            if (respuesta == 31) {
                System.out.println("¡Bien! La puerta se abre con un chasquido.\n\n");
                nivel_1 = true;
            } else {
                intentos--;
                System.out.println("Código incorrecto. Te quedan " + intentos + " intentos.");
            }
        }

        if (!nivel_1) {
            System.out.println("El sistema se bloquea y el oxígeno se agota. HAS PERDIDO.");
        } else {
            intentos = 3;

            // ================= PRUEBA 2: EL REACTOR =================
            System.out.println("EL REACTOR\n\n");
            System.out.println(
                    "Entras en la sala de máquinas. En el centro está el reactor, apagado y en silencio. Una pantalla parpadea con un mensaje de emergencia:\n");
            System.out.println("\"Introduce el código de arranque de 3 cifras.\"");
            System.out.println("- La suma de las tres cifras es 12.");
            System.out.println("- La primera cifra es el triple de la última.");
            System.out.println("- La cifra del medio es la primera menos la última.\n");
            System.out.println("Pulsa la tecla 'Enter' para continuar\n");
            System.out.println(
                    "=================================================================================================================================================");
            continuar = scan.nextLine();

            System.out.println(
                    "Piensa bien las pistas antes de escribir. Solo tienes 3 intentos antes de que el reactor se sobrecargue.\n\n");
            System.out.println("Tu respuesta: (INTRODUCE UN NUMERO)\n");
            System.out.println(
                    "=================================================================================================================================================");

            while (intentos > 0 && !nivel_2) {
                respuesta = scan_num.nextInt();
                if (respuesta == 642) {
                    System.out.println("¡El reactor arranca con un zumbido y las luces vuelven!\n\n");
                    nivel_2 = true;
                } else {
                    intentos--;
                    System.out.println("Código incorrecto. Te quedan " + intentos + " intentos.");
                }
            }

            if (!nivel_2) {
                System.out.println("El reactor se sobrecarga y la nave explota. HAS PERDIDO.");
            } else {
                intentos = 3;

                // ================= PRUEBA 3: LA CÁPSULA =================
                System.out.println("CÁPSULA DE ESCAPE\n\n");
                System.out.println(
                        "Con el reactor encendido, la nave tiembla. Corres hasta la cápsula de escape, pero el panel te pide un código de seguridad.\n");
                System.out.println("Pulsa la tecla 'Enter' para continuar\n");
                System.out.println(
                        "=================================================================================================================================================");
                continuar = scan.nextLine();

                System.out.println("El panel de la cápsula muestra un mensaje:\n");
                System.out.println("\"Código de seguridad de 4 cifras.\"");
                System.out.println("- 1ª cifra: el resto de dividir 47 entre 5.");
                System.out.println("- 2ª cifra: el doble de la 1ª, más 1.");
                System.out.println("- 3ª cifra: la suma de la 1ª y la 2ª, menos 3.");
                System.out.println("- 4ª cifra: el producto de la 1ª y la 3ª, menos la 2ª.\n");
                System.out.println("Pulsa la tecla 'Enter' para continuar\n");
                System.out.println(
                        "=================================================================================================================================================");
                continuar = scan.nextLine();

                System.out.println(
                        "Introduce el código de 4 cifras. Solo tienes 3 intentos antes de que el sistema se bloquee para siempre.\n\n");
                System.out.println("Tu respuesta: (INTRODUCE UN NUMERO)\n");
                System.out.println(
                        "=================================================================================================================================================");

                while (intentos > 0 && !nivel_3) {
                    codigo = scan_num.nextInt();
                    if (codigo == 2543) {
                        System.out.println("¡Clic! La cápsula se abre.");
                        nivel_3 = true;
                    } else {
                        intentos--;
                        System.out.println("Código incorrecto. Te quedan " + intentos + " intentos.");
                    }
                }

                if (!nivel_3) {
                    System.out.println("El sistema se bloquea. Sin salida y sin aire... HAS PERDIDO.");
                } else {
                    System.out.println(
                            "\nTe lanzas dentro de la cápsula y los motores rugen. La nave Orión se queda atrás mientras sales disparado al espacio.\n\n");
                    System.out.println("¡HAS ESCAPADO! ¡ENHORABUENA!\n");
                    System.out.println("        /\\");
                    System.out.println("       /  \\");
                    System.out.println("      | () |");
                    System.out.println("      |    |");
                    System.out.println("     /|    |\\");
                    System.out.println("    / |    | \\");
                    System.out.println("   /__|____|__\\");
                    System.out.println("      /_||_\\");
                    System.out.println("       (  )");
                    System.out.println("       ^^^^");
                    System.out.println(
                            "=================================================================================================================================================");
                }
            }
        }

        scan.close();
        scan_num.close();
    }
}
