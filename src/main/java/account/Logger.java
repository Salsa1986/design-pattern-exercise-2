package account;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public void log(String message){
        System.out.println(message);
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }



}
