package creational.singleton;

public class AppConfig {

    // THREAD SAFE NOW
    // VOLATILE MAKES CHANGES MADE BY 1 THREAD VISIBLE TO OTHER THREAD IMMEDIATELY
    // SYNCHRONIZED ALLOWS ONLY 1 THREAD TO ENTER THE METHOD
    // Static instance
    private static volatile AppConfig instance;

    private AppConfig() {
        System.out.println("Object created");
    }

    public static AppConfig getInstance() {

        if (instance == null) {

            synchronized (AppConfig.class) {

                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public void showConfig() {
        System.out.println("Application configuration loaded");
    }
}
