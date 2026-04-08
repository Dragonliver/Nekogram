package tw.nekomimi.nekogram.helpers;

public class Extra {
    // Константы
    public static final String SENTRY_DSN = "";
    public static final boolean FORCE_ANALYTICS = false;

    // Объект botInfo с методами, которые искал компилятор
    public static final BotInfo botInfo = new BotInfo();

    public static class BotInfo {
        public String getId() { return "0"; }
        public String getUsername() { return "nekogram_bot"; }
    }

    // Методы для работы с ботами (вызываются в UserHelper и других)
    public static String getHelperBot() {
        return "nekogram_bot";
    }

    public static String getUserInfoBot(boolean fallback) {
        return "nekogram_bot";
    }

    // Статические методы на случай прямого вызова из Extra
    public static String getId() { return "0"; }
    public static String getUsername() { return "nekogram_bot"; }
    
    // Метод для облачного хранилища (часто встречается в Nekogram)
    public static Object getCloudConfig() {
        return null;
    }
}
