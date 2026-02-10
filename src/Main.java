package src;

import java.util.ArrayList;

public class Main {

    private static final int[] SIZES = {3000};
    private static final int ITERATIONS = 10000;

    public static void main(String[] args) {
        System.out.println("Inicia el profiler y presiona Enter para comenzar las pruebas");
        System.out.println("Cada sort se ejecutara " + ITERATIONS + " veces por tamanio");
        try { System.in.read(); } catch (Exception e) {}

        for (int size : SIZES) {
            GenerateFile.generateFile(size);
            String content = ReadFile.read();
            ArrayList<Integer> numbers = parseNumbers(content);

            System.out.println("\nOrdenando " + size + " elementos (" + ITERATIONS + " iteraciones)");

            runGnomesort(numbers);
            System.out.println("  Gnomesort completado");

            runMergesort(numbers);
            System.out.println("  Mergesort completado");

            runQuicksort(numbers);
            System.out.println("  Quicksort completado");

            runRadixSort(numbers);
            System.out.println("  RadixSort completado");

            runTimsort(numbers);
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

    private static void runGnomesort(ArrayList<Integer> original) {
        Gnomesort<Integer> sorter = new Gnomesort<>();
        for (int i = 0; i < ITERATIONS; i++) {
            sorter.sort(new ArrayList<>(original));
        }
    }

    private static void runMergesort(ArrayList<Integer> original) {
        Mergesort<Integer> sorter = new Mergesort<>();
        for (int i = 0; i < ITERATIONS; i++) {
            sorter.sort(new ArrayList<>(original));
        }
    }

    private static void runQuicksort(ArrayList<Integer> original) {
        Quicksort<Integer> sorter = new Quicksort<>();
        for (int i = 0; i < ITERATIONS; i++) {
            sorter.sort(new ArrayList<>(original));
        }
    }

    private static void runRadixSort(ArrayList<Integer> original) {
        RadixSort sorter = new RadixSort();
        for (int i = 0; i < ITERATIONS; i++) {
            sorter.sort(new ArrayList<>(original));
        }
    }

    private static void runTimsort(ArrayList<Integer> original) {
        Timsort<Integer> sorter = new Timsort<>();
        for (int i = 0; i < ITERATIONS; i++) {
            sorter.sort(new ArrayList<>(original));
        }
    }
}
