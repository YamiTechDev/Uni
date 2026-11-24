import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> copy1 = new HashSet<>(set1);
        Set<T> copy2 = new HashSet<>(set2);
        copy1.removeAll(set2);
        copy2.removeAll(set1);
        copy1.addAll(copy2);
        return copy1;
    }

}
