package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] world, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (world[world.length - 1 - index] != post[post.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
