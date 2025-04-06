package dazt.java.challenge.helpers;

import java.util.*;

public enum LogLevel {

    INFO,
    DEBUG,
    WARNING,
    ERROR;

    private static final List<String> LOG_LEVEL_LIST;

    static {
        LOG_LEVEL_LIST = Arrays.stream(LogLevel.values())
                .map(Enum::name)
                .toList();
    }

    public static boolean isLogLevelCorrect(String logLevel) {
        return LOG_LEVEL_LIST.contains(logLevel);
    }

}
