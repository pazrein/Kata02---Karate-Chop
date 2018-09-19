package karateChop;

import java.util.ArrayList;

public class KarateChopIterative implements KarateChop {
    @Override
    public int chop(int i, ArrayList<Integer> list) {
        return chopIterative(i, list, 0, list.size() - 1);
    }

    private int chopIterative(int element, ArrayList<Integer> list, int left, int right) {
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (list.get(middle).equals(element)) {
                return middle;
            }

            if (list.get(middle) > element) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}