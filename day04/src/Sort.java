import java.lang.reflect.Array;

/**
 * @Author: 24570
 * @Date: 2021/11/26 10:23
 * @Description: Sort
 * @Version 1.0.0
 */
public class Sort {
    public static void main(String[] args) {
        int[] ints = {10, 2, 1, 3, 43, 11, 47};
        int temp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-i-1; j++) {
                if (ints[j]>ints[j+1]){
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    //sdfsssadfsadfsafasdf
}
