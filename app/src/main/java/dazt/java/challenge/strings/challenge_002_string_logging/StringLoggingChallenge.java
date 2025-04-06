package dazt.java.challenge.strings.challenge_002_string_logging;

import dazt.java.challenge.helpers.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class StringLoggingChallenge {

    private static final List<String> LOGS = List.of(
            "2025-04-05T10:19:25.000-05:00 [INFO] My Info Log",
            "2025-04-05T10:19:26.000-05:00 [ERROR] My Error Log",
            "2025-04-05T10:19:27.000-05:00 [WARNING] My Warning Log",
            "2025-04-05T10:19:28.000-05:00 [DEBUG] My Debug Log"
    );

    public static void main(String[] args) {
        for (String log : LOGS) {
            final var logLevel = getLogLevel(log);
            final var logMessage = getLogMessage(log);
            System.out.println("Procesando Log: '" + log + "'");
            System.out.println("LogLevel: " + logLevel);
            System.out.println("LogMessage: " + logMessage);
            System.out.println("Finalizado el procesamiento del log");
            System.out.println();

        }
    }

    /**
     * SOLO SE DEBE EDITAR EL CÓDIGO DENTRO DE LAS FUNCIONES "getLogLevel" y "getLogMessage".
     * <p>
     * La idea de las siguientes funciones es obtener un log e imprimir por consola el log level y el logMessage
     * por ejemplo, para el siguiente log: [ERROR] Ha ocurrido un error inesperado.
     * El LogLevel es: ERROR.
     * El LogMessage es: Ha ocurrido un error inesperado.
     * Se supondrá que todos los logs siempre siguen el siguiente formato: TimeStamp - [LogLevel] LogMessage
     * Para dar por completado el challenge se necesita explicar lo siguiente:
     * 1. ¿Qué es un log?, ¿Para qué nos sirve el Log?
     * 2. ¿Qué partes tiene un log?
     * 3. Las funciones deben retornar el valor correcto siguiendo el ejemplo planteado.
     * Recomendación: explorar primero la teoría y luego la practica.
     * Tip: usar los métodos, split, replace, trim y cualquier otro de la clase String.
     */
    public static String getLogLevel(final String log) {
        String logName = "";
        String [] errores = {"[ERROR]","[DEBUG]","[WARNING]", "[INFO]"};

        for (String nombreError: errores){
            if(log.contains(nombreError)){
                logName = nombreError;
            }
        }
        return logName;
    }

    public static String getLogMessage(final String log) {
        String logMessage= "";
        logMessage= log.substring(log.indexOf("]") + 1, log.length());
        return logMessage.trim();
    }

}
