package oppg1;
import java.util.*;

public class KopierListe {
    public static void main(String[] args){
        int[] tab1 = {1, 4, 6, -2};
        int[] tab2 = {7, 14, -6, 0};

        for(int i=0; i<tab1.length; i++){
            tab2[i] = tab1[(tab1.length-1)-i];
        }
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
    }
}
