import java.util.ArrayList;

public class RadixSort {

    public void sort(ArrayList<Integer> list) {
        int max = getMax(list);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(list, exp);
        }
    }

    private int getMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) max = num;
        }
        return max;
    }

    private void countingSort(ArrayList<Integer> list, int exp) {
        int n = list.size();
        ArrayList<Integer> output = new ArrayList<>();
        int[] count = new int[10];

        for (int i = 0; i < n; i++) output.add(0);

        for (int i = 0; i < n; i++) {
            count[(list.get(i) / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (list.get(i) / exp) % 10;
            output.set(count[index] - 1, list.get(i));
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            list.set(i, output.get(i));
        }
    }
}
