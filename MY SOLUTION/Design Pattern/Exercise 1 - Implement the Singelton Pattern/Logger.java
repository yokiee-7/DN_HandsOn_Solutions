
public class Logger
{
    private static Logger instance;

    static Logger getInstanceInstance(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private int value;
    private Logger(int value){
        this.value=value;
    }

    public static Logger getInstance(int value){
        if(instance==null){
            instance = new Logger(value);
        }
        return instance;
    }

}

