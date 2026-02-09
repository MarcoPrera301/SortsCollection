import java.util.ArrayList;

public class Timsort<T extends Comparable<T>> {

    private static final int RUN = 32; //elementos en una sublista

    public void sort(ArrayList<T> list) {
        int n = list.size();

        for (int i = 0; i < n; i += RUN) {
            insertionSort(list, i, Math.min(i + RUN - 1, n - 1));
        }

        for (int size = RUN; size < n; size *= 2) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                if (mid < right) {
                    merge(list, left, mid, right);
                }
            }
        }
    }

    private void insertionSort(ArrayList<T> list, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            T temp = list.get(i);
            int j = i - 1;

            while (j >= left && list.get(j).compareTo(temp) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }

    private void merge(ArrayList<T> list, int left, int mid, int right) {
        ArrayList<T> leftList = new ArrayList<>(list.subList(left, mid + 1));
        ArrayList<T> rightList = new ArrayList<>(list.subList(mid + 1, right + 1));

        int i = 0, j = 0, k = left;

        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i).compareTo(rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) list.set(k++, leftList.get(i++));
        while (j < rightList.size()) list.set(k++, rightList.get(j++));
    }
}
