package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        url = System.getProperty("url", "http://facebook.com"),
        login = System.getProperty("login"),
        email = System.getProperty("email"),
        password = System.getProperty("password"),
        yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru/"),
        yandexMarketItemName = System.getProperty("yandexMarketItem", "iphone");
}
