import java.util.ArrayList;

public class KarateChop {
    public int chop(int i, ArrayList<Integer> list) {
        return chopRecursive(i, list, 0, list.size() - 1);
    }

    private int chopRecursive(int element, ArrayList<Integer> list, int left, int right) {
        if (left <= right) {
            int middle = left + (right - left) / 2;
            if (list.get(middle).equals(element)) return middle;
            if (list.get(middle) > element) return chopRecursive(element, list, left, middle - 1);
            return chopRecursive(element, list, middle + 1, right);
        }

        return -1;
    }
}
