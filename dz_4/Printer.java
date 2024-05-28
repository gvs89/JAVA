import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        for (int i = (sortLength - 2) / 2; i >= 0; i--) {
            siftDown(tree, i, sortLength);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);

        for (int i = sortLength - 1; i > 0; i--) {
            swap(sortArray, 0, i);
            siftDown(sortArray, 0, i);
        }
    }

    private static void siftDown(int[] tree, int startPos, int endPos) {
        int root = startPos;
        while (root * 2 + 1 < endPos) { // Changed the condition to '<'
            int child = root * 2 + 1;
            if (child + 1 < endPos && tree[child] < tree[child + 1]) {
                child++;
            }
            if (child < endPos && tree[root] < tree[child]) { // Changed the condition to '<'
                swap(tree, root, child);
                root = child;
            } else {
                return;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[] { 17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1 };
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}