import java.util.ArrayList;

public class Gnomesort<T extends Comparable<T>> 
{

    public void sort(ArrayList<T> list) {
        int index = 0;

        while (index < list.size()) {
            if (index == 0) {
                index++;
            } else if (list.get(index).compareTo(list.get(index - 1)) >= 0) {
                index++;
            } else {
                swap(list, index, index - 1);
                index--;
            }
        }
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

