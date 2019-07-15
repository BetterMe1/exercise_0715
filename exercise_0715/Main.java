package exercise.exercise_0715;

/*
木棒拼图
 */
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int I = in.nextInt();
            int L = in.nextInt();
            if(I == 1){//添加
                int j=0;
                for(;j<list.size(); j++){
                    if(list.get(j) >= L){
                        list.add(j,L);
                        break;
                    }
                }
                if(list.size() == j){
                    list.add(L);
                }
                sum += L;
            }else{
                list.remove(list.indexOf(L));
                sum -= L;
            }
            int max = list.get(list.size()-1);
            if(sum - max > max){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
*/

/*
地下迷宫
 */
import java.util.Scanner;

public class Main {
    public static String path = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = in.nextInt();
            }
        }
        Helper(grid,0,0,visited,"",p);
        System.out.println(path);
    }
    public static void Helper(int[][] grid,int i,int j, boolean[][] visited,String res,int p) {
        if(i == 0 && j == grid[0].length-1 && grid[i][j] == 1){
            if(p >=0 ){
                path = res + "["+i+","+j+"]";
            }else{
                path =  "Can not escape!";
            }
            return;
        }
        if(i >=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1 && !visited[i][j]){
            visited[i][j] = true;
            res += "["+i+","+j+"],";
            Helper(grid,i,j+1,visited,res,p-1);//向右
            Helper(grid,i+1,j,visited,res,p);//向下
            Helper(grid,i,j-1,visited,res,p-1);//向左
            Helper(grid,i-1,j,visited,res,p-3);//向上
        }
    }
}