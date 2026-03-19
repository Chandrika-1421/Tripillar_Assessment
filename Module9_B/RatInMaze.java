package MODULE9_B;
    public class RatInMaze {
        static int n=5; //size of matrix
        static boolean isSafe(int[][]maze,int x,int y){
            return(x>=0 && y>=0 && x<n && y<n && maze[x][y]==1);
        }
        public static boolean solveMaze(int [][]maze,int x,int y,int [][]result){
            //Base case:destination reached
            if(x==n-1 && y==n-1 && maze[x][y]==1){
                result[x][y]=1;
                return true;
            }
            if(isSafe(maze,x,y)){
                result[x][y]=1;
                //Move Right
                if(solveMaze(maze,x,y+1,result))
                    return true;
                //Move Down
                if(solveMaze(maze,x+1,y,result))
                    return true;
                //BackTracking-->
                result[x][y]=0;
                return false;
            }
            return false;
        }
        public static void main(String[] args) {
            int maze[][]={{1,0,0,1,1},{1,1,1,0,1},{0,0,1,0,0},{0,0,1,1,1},{1,0,0,0,1}};
            int [][]result=new int[n][n];//the o/p is filled with 0
            if(solveMaze(maze,0,0,result)){
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(result[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("NO path exists");
            }
        }
    }


