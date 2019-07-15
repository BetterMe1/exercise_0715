package exercise.exercise_0715;

/*
空格替换
 */
import java.util.*;

public class Replacement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(replaceSpace(str,str.length()));
    }
    public static String replaceSpace(String iniString, int length) {
        StringBuffer sb = new StringBuffer(iniString);
        int start = sb.indexOf(" ");
        while(start != -1){
            sb.replace(start,start+1,"%20");
            start = sb.indexOf(" ");
        }
        return sb.toString();
    }
}