package JavaPhilosophy.collections;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangeWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i));
            ((Apple)apples.get(i)).id();
        }
    }
}
