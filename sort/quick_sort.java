package sort;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] base= {5,2,4,7,1,3,2,6};
        base = quickSort(base, 0,base.length-1);
        System.out.println(Arrays.toString(base));
    }

    public static int[] quickSort(int[] base,int p,int r){
        if(p<r){
            int q = partition(base,p,r);
            base = quickSort(base,p,q-1);
            base = quickSort(base,q+1,r);
        }
        return base;
    }

    public static int partition(int[] base,int p,int r){
        int pivot = base[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(base[j] <pivot){
                i++;
                int tmp = base[j];
                base[j] = base[i];
                base[i] = tmp;
            }
        }
        int tmp = base[r];
        base[r] = base[i+1];
        base[i+1] = tmp;
        return i+1;
    }
}
