public class CollectionFrameWork {

    /**
     * This is an introduction to the collection
     * use  the collection framework
     * framework
     * @param args
     * Array concept
     */

    public static void main(String[] args) {
    }

    private int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid.length || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;
        int area = 1;

        area +=dfs(grid, i+1, j);
        area += dfs(grid, i, j -1);
        return area;
    }
}


class Algorithms{

    public int age = 10;
    public String name = "Joseph";






}


class Comparator{

    public static void main(String[] args) {



    }
}





