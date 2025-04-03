package dazt.java.challenge.challenge_001_try_catch_finally;

import dazt.java.challenge.to.*;

public class TryCatchChallenge {

    private static final User[] USER_DATABASE = new User[]{
            new User(1L, "David", "Doe", true),
            new User(2L, "Lucas", "Doe", null),
            new User(3L, "John", "Doe", false),
            new User(4L, "Mary", "Doe", false),
            new User(5L, "Alicia", "Doe", null),
            new User(6L, "Frank", "Doe", true),
            new User(7L, "Mark", "Doe", false)
    };

    /**
     * El siguiente pedazo de código tiene como objetivo validar si un usuario está activo, si no,
     * debe mandar un mensaje por consola diciendo que el usuario no está activo,
     * el problema principal del código es que no está procesando todos los usuarios, sino que cuando encuentra un error
     * se detiene completamente, necesito que cuando el código encuentre un error procesando un usuario me diga:
     * 1. El usuario en donde se encontró el error, por ejemplo, "No se pudo procesar el usuario x, porque ocurrió un error", en donde x es el nombre del usuario.
     * 2. Debe mostrar un mensaje diciendo cuál es el error de forma dinámica, no puede ser un mensaje particular creado por el developer.
     * 3. Se deben procesar todos los usuarios, haya habido errores o no.
     * 4. Se debe mostrar un mensaje al final diciendo "Validación para usuario x finalizada", en donde x debe ser el nombre del usuario, haya habido errores en la validación o no.
     * 5. Además, necesito saber por qué mi código actual está fallando
     */

    public static void main(final String[] args) {

        for (User user : USER_DATABASE) {
            try {
                if (!user.getActive()) {
                    System.out.printf("El usuario: %s, no esta activo!%n", user.getName());
                }else {
                    System.out.printf("El usuario: %s, esta activo!%n", user.getName());
                }
            } catch (final Exception e) {
                System.out.printf("El usuario: %s  no ha sido procesado por que contiene un error%n",user.getName());
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Validacion para usuario "+user.getName()+" finalizada\n");
            }
        }
    }

}
