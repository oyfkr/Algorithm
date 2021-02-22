package sort;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] base = {9,5,3,7,6};
        int tmp = 0;
        int j = 0;
        for(int i = 1; i<base.length;i++){
            tmp = base[i];
            for(j = i-1;j>=0 && base[j]>tmp;j--){
                base[j+1] = base[j];
            }
            base[j+1] = tmp;
        }
        System.out.println(Arrays.toString(base));
    }
}
