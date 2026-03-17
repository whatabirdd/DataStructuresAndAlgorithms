import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsorted Array ---------------------------------------------------");
        ArrayList<Integer> integerList = Lab4.getList();
        Lab4.outputList(integerList);

        System.out.println("\n\nBubble sort results ----------------------------------------------");
        //Measuring the time it takes for Bubble Sort
        long bubbleStart = System.nanoTime();
        ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
        long bubbleEnd = System.nanoTime();
        Lab4.outputList(bubbleSortedList);
        long bubbleTime = bubbleEnd - bubbleStart;
        System.out.println("\nBubble Sort Time: " + bubbleTime + " nanoseconds");

        System.out.println("\n\nInsertion sort results -------------------------------------------");
        //Measuring the time it takes for Insertion Sort
        long insertionStart = System.nanoTime();
        ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
        long insertionEnd = System.nanoTime();
        Lab4.outputList(insertionSortedList);
        long insertionTime = insertionEnd - insertionStart;
        System.out.println("\nInsertion Sort Time: " + insertionTime + " nanoseconds");
    }
}

class Lab4 {
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
        // Step 1 - Implement insertion sort algorithm here
        for (int i = 1; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);
            int j = i - 1;
            while (j >= 0 && integerList.get(j) > currentElement) {
                integerList.set(j + 1, integerList.get(j));
                j--;
            }
        }
        return integerList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
        // Step 2 - Implement the bubble sort algorithm here
        int n = integerList.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (integerList.get(j) > integerList.get(j + 1)) {
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return integerList;
    }

    public static ArrayList<Integer> getList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
            while ((line = br.readLine()) != null) {
                integerList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integerList;
    }

    public static void outputList(ArrayList<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
