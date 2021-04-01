import java.util.Arrays;
// This is Google's Foobar challenge 1.
public class skippingwork_solution {
    public static int solution(int[] x, int[] y) {
        // Your code here
        // firstly sort the array
        // then check if elements are in x or y
        // one list is longer than the other
        Arrays.sort(x);
        Arrays.sort(y);
            if (x.length > y.length){
                for(int i=0; i < x.length; i++) {
                    if (x[i] != y[i]) {
                        return x[i];
                    }
                }
            }
            else{
                for(int j=0; j<y.length; j++) {
                    if(y[j] != x[j]) {
                        return y[j];
                    }
                }
            }
            return 0;
    }
    public static void main(String[] args) {
        int w[] = new int[] {13, 5, 6, 2, 5};
        int q[] = new int[] {5, 2, 5, 13};
        System.out.println(solution(w, q));
    }
}

