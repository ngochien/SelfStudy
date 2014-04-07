package generics;

import java.util.List;

public class WildCardError {

    void foo(List<?> i) {
        i.set(0, null);
    }
}