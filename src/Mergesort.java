package src;

import java.util.ArrayList;

public class Mergesort<T extends Comparable<T>> {

    public void sort(ArrayList<T> list) {
        if (list.size() <= 1) return;
        mergeSort(list, 0, list.size() - 1);
    }

    private void mergeSort(ArrayList<T> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private void merge(ArrayList<T> list, int left, int mid, int right) {
        ArrayList<T> temp = new ArrayList<>();

        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i).compareTo(list.get(j)) <= 0) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }

        while (i <= mid) temp.add(list.get(i++));
        while (j <= right) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }
}
