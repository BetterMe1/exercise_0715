package exercise.exercise_0715;

import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(max != min){
            max /= 2;
            if(max < min){
                int tmp = max;
                max = min;
                min = tmp;
            }
        }
        return max;
    }
}