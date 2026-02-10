package src;

import java.util.ArrayList;

public class Main {

    private static final int[] SIZES = {10, 50, 100, 1000, 3000};

    public static void main(String[] args) {
        System.out.println("Adjunta VisualVM y presiona Enter para iniciar las pruebas");
        try { System.in.read(); } catch (Exception e) {}

        for (int size : SIZES) {
            GenerateFile.generateFile(size);
            String content = ReadFile.read();
            ArrayList<Integer> numbers = parseNumbers(content);

            System.out.println("\nOrdenando " + size + " elementos");

            runGnomesort(new ArrayList<>(numbers));
            System.out.println("  Gnomesort completado");

            runMergesort(new ArrayList<>(numbers));
            System.out.println("  Mergesort completado");

            runQuicksort(new ArrayList<>(numbers));
            System.out.println("  Quicksort completado");

            runRadixSort(new ArrayList<>(numbers));
            System.out.println("  RadixSort completado");

            runTimsort(new ArrayList<>(numbers));
            System.out.println("  Timsort completado");
        }

        System.out.println("\nTodas las pruebas completadas");
    }

    private static ArrayList<Integer> parseNumbers(String content) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] lines = content.trim().split("\n");
        for (String line : lines) {
            String trimmed = line.trim();
            if (!trimmed.isEmpty()) {
                numbers.add(Integer.parseInt(trimmed));
            }
        }
        return numbers;
    }

    private static void runGnomesort(ArrayList<Integer> list) {
        Gnomesort<Integer> sorter = new Gnomesort<>();
        sorter.sort(list);
    }

    private static void runMergesort(ArrayList<Integer> list) {
        Mergesort<Integer> sorter = new Mergesort<>();
        sorter.sort(list);
    }

    private static void runQuicksort(ArrayList<Integer> list) {
        Quicksort<Integer> sorter = new Quicksort<>();
        sorter.sort(list);
    }

    private static void runRadixSort(ArrayList<Integer> list) {
        RadixSort sorter = new RadixSort();
        sorter.sort(list);
    }

    private static void runTimsort(ArrayList<Integer> list) {
        Timsort<Integer> sorter = new Timsort<>();
        sorter.sort(list);
    }
}
