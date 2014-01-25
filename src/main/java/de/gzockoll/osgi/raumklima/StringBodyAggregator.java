package de.gzockoll.osgi.raumklima;

/**
 * Created by guido on 25.01.14.
 */
public class StringBodyAggregator {
    public String append(String existing, String next) {
        return existing + System.lineSeparator() + next;
    }
}