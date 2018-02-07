package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String args[]) {
        int list[] = {5, 3, 2, 4, 6};
        selectionSort(
                list
        );
  //
    }

    public static void selectionSort(int list[]) {
        int x = list.length;

        for (int r = 0; r<(x-1);r++){
            int min=r;
            for(int p=r+1;p<x;p++)
            if (list[p] < list[r]) {

                int temp=list[min];
                 list[r]=list[p];
                 list[p]=temp;
                System.out.println(temp);

               // System.out.println(Arrays.toString(list));
            }
           // System.out.println(Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
    }

//        int n = lst.length;
//        for (int i = 0; i < n; i++) {
//            int index = 0;
//            int smallest = lst[i];
//            for (int j = i; j < n; j++) {
//                if (lst[j] < smallest) {
//                    smallest = lst[j];
//                    index = j;
//                }
//                int temp = lst[i];
//                lst[i] = smallest;
//                lst[index] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(lst));
    }

