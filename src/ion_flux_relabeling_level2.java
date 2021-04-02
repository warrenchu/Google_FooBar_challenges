
/*
Ion Flux Relabeling: Challenge 2
*/
import java.lang.Math;
import java.util.Arrays;

public class ion_flux_relabeling_level2 {
    //a helper function to find the node above
    public static int find_above(int root, int node, int below) {
        // find the node above
        // root is the first element above
        // below is the total number of nodes below the root
        // get left and right of the node
        // the size of the tree below the node is 1/2 of the size of the original...
        below = below/2;
        int right = root - 1;
        int left = root-1 - below  ;
        // base case- if right or left = node, then return the root.
        if(right==node || left==node) {
            return root;
        }
        else{
            // check the left and right subtree
            if(node <= left) {
                return find_above(left, node, below);
            }
            else{
                return find_above(right, node, below);
            }
        }

    }
    public static int[] solution(int h, int[] q) {
        // maximum number of nodes is 2^h-1 in a binary tree- get an int.
        int root = (int)Math.pow(2, h) - 1;
        // create an array of the same length as q. store the labels here.
        int [] converters = new int[q.length];
        for(int i=0; i< q.length; i++){

            if (q[i] < root  && q[i] >=1) {
                int below = root-1;
                converters[i] = find_above(root, q[i], below);
            }
            else {
                converters[i] = -1;
            }
        }
        return converters;

    }
    public static void main(String[] args){
        //to test the program..
        int[] test = new int[] {19,14,28};
        int[] result = solution(5, test);
        System.out.println(Arrays.toString(result));
    }
}
