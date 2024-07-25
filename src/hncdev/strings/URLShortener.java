package hncdev.strings;

import java.util.HashMap;
import java.util.Map;

public class URLShortener {

    private Map<String, String> urlMap;
    private Map<String, String> shortToLong;
    private int counter;
    private static final String BASE_URL = "http://tinyurl.com/";

    public URLShortener() {
        urlMap = new HashMap<>();
        shortToLong = new HashMap<>();
        counter = 0;
    }

    public String encode(String longUrl) {
        if (urlMap.containsKey(longUrl)) {
            return urlMap.get(longUrl);
        }

        counter++;
        String shortUrl = BASE_URL + counter;
        urlMap.put(longUrl, shortUrl);
        shortToLong.put(shortUrl, longUrl);
        return shortUrl;
    }

    public String decode(String shortUrl) {
        return shortToLong.getOrDefault(shortUrl, "");
    }

    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = urlShortener.encode(longUrl);
        System.out.println("Encoded URL: " + shortUrl);
        System.out.println("Decoded URL: " + urlShortener.decode(shortUrl));
    }
}
