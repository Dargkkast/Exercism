public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(" ", 2)[1].replaceAll("[\n\r\t]", "").trim();
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("ERROR")) {
            return "error";
        }
        
        return logLine.contains("INFO")? "info" : "warning";
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        return message.substring(0, 1).toUpperCase() + message.substring(1) + " (" + logLevel(logLine) + ")";
    }
}
