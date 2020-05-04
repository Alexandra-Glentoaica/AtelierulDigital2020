package laborator3;

public class EagerInit {
    private static final EagerInit instance=new EagerInit();
    private EagerInit() {} //Constructorul este gol pentru a nu putea crea alt obiect de acest tip;

    public static EagerInit getInstance(){
        return instance;
    }


}
