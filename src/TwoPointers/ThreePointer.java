package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

    public class ThreePointer {
    public static ArrayList<ArrayList<Integer>> solution(int[] array) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i <array.length-1; i++) {
            if(i==0 || (i>0 && array[i]!=array[i+1])) {
                int left=i+1, right=array.length-1,target=-array[i];

                while (left < right ) {
                    int currentSum=0;
                    currentSum = array[left]+array[right];

                    if (currentSum == target) {
                        list.add(new ArrayList<>(Arrays.asList(
                                array[i], array[left], array[right]
                        )));

                        while (left<right && array[left]==array[left+1]) left++;
                        while (left<right && array[right]==array[right+1]) right--;

                        left++;
                        right--;
                    }
                    else if (currentSum > target) {
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] array = {-1,0,-1,2,4,-1};

        ArrayList<ArrayList<Integer>> lists = solution(array);
        for(ArrayList<Integer> list: lists) {
            System.out.println(list);
        }
    }
}
