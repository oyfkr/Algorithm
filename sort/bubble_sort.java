package sort;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] base = {9,5,3,7,6};
        int tmp;
        for(int i = base.length-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(base[j] > base[j+1]){
                    tmp = base[j+1];
                    base[j+1] = base[j];
                    base[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(base));
    }
}
