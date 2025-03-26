package ordenacaoArray;
import java.util.*;

public class OrdenarArrays {
    public static void main(String[] args) {
       int[] n = {1,4,6,3,2,5};
       Arrays.sort(n);

       for (int i: n){
           System.out.println(i);
       }
    }
}
