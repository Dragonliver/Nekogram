package tw.nekomimi.nekogram.helpers;

public class Extra {
    // Константы для аналитики и ошибок
    public static final String SENTRY_DSN = "";
    public static final boolean FORCE_ANALYTICS = false;
    
    // Заглушка для объекта botInfo и подобных
    public static final String botInfo = "";

    // Метод для получения системного помощника
    public static String getHelperBot() {
        return "nekogram_bot";
    }

    // Метод для получения бота информации о пользователях
    public static String getUserInfoBot(boolean fallback) {
        return "nekogram_bot";
    }

    // Дополнительные методы, если код ищет их в классе Extra
    public static String getId() {
        return "0";
    }

    public static String getUsername() {
        return "nekogram_bot";
    }
}
