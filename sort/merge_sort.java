package sort;

import java.util.Arrays;

public class merge_sort {
    static int[] tmp;
    public static void main(String[] args) {
        int[] base = {5,3,2,7,6,1,10,4};
        mergeSort(base,0,base.length-1);
        System.out.println(Arrays.toString(tmp));
    }
    public static void mergeSort(int[] base,int p,int r){
        if(p<r){
            int mid = (p+r)/2;
            mergeSort(base,p,mid);
            mergeSort(base,mid+1,r);
            merge(base,p,r,mid);
        }
    }
    public static void merge(int[] base, int p,int r, int mid){
        int i = p;
        int j = mid+1;
        int k = i;
        tmp = new int[base.length];
        while(i<=mid && j<=r){
            if(base[i] < base[j]){
                tmp[k++] = base[i++];
            }else{
                tmp[k++] = base[j++];
            }
        }
        while(i<=mid){
            tmp[k++] = base[i++];
        }
        while(j<=r){
            tmp[k++] = base[j++];
        }
        for(i = p;i<=r;i++){
            base[i] = tmp[i];
        }
    }
}
