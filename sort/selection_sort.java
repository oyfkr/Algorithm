import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] base = {9,5,3,7,6};
        int max = base[0];
        int index=0;
        for(int i = base.length-1; i>0;i--){
            for(int j = 0;j<=i;j++){
                if(max <= base[j]){
                    index = j;
                    max = base[j];
                }
            }
            base[index] = base[i];
            base[i] = max;
            max = base[0];
        }
        System.out.println(Arrays.toString(base));
    }
}
