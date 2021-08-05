package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] world, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (world[world.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}
