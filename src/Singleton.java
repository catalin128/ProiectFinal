public class Singleton {
    private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Clasa Singleton";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
