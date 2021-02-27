package sort;

import java.util.Arrays;

public class heap_sort {
    public static void main(String[] args) {
        int[] base = new int[]{4, 2, 7, 9, 10, 1, 3, 5, 13, 11};
        HEAPSORT(base);
        System.out.println(Arrays.toString(base));
    }

    public static void MAX_HEAPIFY(int[] base, int i, int len){
        int j;
        int tmp = base[i-1];
        while(i<=len/2){ // 자식 존재 여부
            j = i*2;
            if((j<len) && (base[j-1] <base[j])){
                j++;
            }
            if(tmp >= base[j-1]){
                break;
            }
            base[i-1] = base[j-1];
            i=j;
        }
        base[i-1] = tmp;
    }

    public static int[] HEAPSORT(int[] base){
        int len = base.length;
        for(int i = len/2;i>0;i--){
            MAX_HEAPIFY(base,i,len);
        }
        do{
            int tmp = base[0];
            base[0] = base[len-1];
            base[len-1] = tmp;
            len = len-1;
            MAX_HEAPIFY(base,1,len);
        }while(len > 1);

        return base;
    }
}
