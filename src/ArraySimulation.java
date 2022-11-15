import java.util.*;

public class ArraySimulation {
    public static void main (String[] args) {
        int[] list1 = {6, 3};
        int[] list2 = {8};
        int[] list3 = {2, 4, 6};
        int[] list4 = {1, 2, 3, 4};
        int[] list5 = {7, 3, 2, 0, 5};
        mystery(list1);
        mystery(list2);
        mystery(list3);
        mystery(list4);
        mystery(list5);
    }
    public static void mystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
