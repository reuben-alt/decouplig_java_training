package fr.lernejo.logger;

public class LoggerFactory {

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = "_ -> new", pure = true)
    public static Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
