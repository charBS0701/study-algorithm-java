package common;

import java.util.Arrays;

public class Utils {
    public static void print(Object obj) {
        if (obj.getClass().isArray()) {
            if (obj.getClass().getName().equals("[I"))
                System.out.println(Arrays.toString((int[]) obj));
            if (obj.getClass().getName().startsWith("[Ljava.lang.String"))
                System.out.println(Arrays.toString((String[]) obj));
        } else System.out.println(obj);
    }
}