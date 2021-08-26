package ssufal.sorting;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] numb = { 2, 13, 4, 37, 14, 63, 5, 46, 32, 33, 23, 9, 22, 68, 44, 22, 27, 78, 33, 93 };
        System.out.println(Arrays.toString(numb));
        Arrays.sort (numb);
        MohammadSort.sort(numb);
        System.out.println(Arrays.toString(numb));

    }
}
