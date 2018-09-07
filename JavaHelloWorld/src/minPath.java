import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node {
    int x;
    int s;
    node(int x, int s) {
        this.x = x;
        this.s = s;
    }
}

public class minPath {
    static int[][] e = new int[51][51];
    static int[] book = new int[51];
    static int n, m;
    static int start, end;
    static int mark, sum;
    static Queue<node> queue = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        n = input.nextInt();
        m = input.nextInt();
        start = input.nextInt();
        end = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == j) {
                    e[i][j] = 0;
                } else {
                    e[i][j] = 99999999;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            e[a][b] = 1;
            e[b][a] = 1;
        }

        queue.offer(new node(start, 0));
        book[1] = start;

        bfs();
        System.out.println(sum);
    }
    public static void bfs() {
        int flag = 0;
        if (start == end) return; //error handle
        while (!queue.isEmpty()) {
            int cur = queue.peek().x;
            for (int i = 1; i <= n; i++) {
                if(e[cur][i] != 99999999 && book[i] == 0) {
                    mark = i;
                    sum = queue.peek().s + 1;
                    queue.offer(new node(i, sum));
                    book[i] = 1;
                }
                if(mark == end) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) {
                break;
            }
            queue.remove();
        }
        return;
    }

    public String BreadthFirstSearch( StartPoint, EndPoint){
        // if goal equal than home, then return null
        if (StartPoint == EndPoint) return null
    
        int[] edgeTo = new int[mSize];
        boolean[] marked = new boolean[mSize];
        for (int i = 0; i < mSize;i++) edgeTo[i] = -1;
        // initialise all node value to -1, which means each node has not been visited yet.
    
        Queue Q = new Queue<Integer>();//set a new Queue as Q
 
        marked[startPoint] = true;
        
        // start with BFS algo.
        Q.enqueue(startPoint);
        while (!Q.isEmpty()){
            int v = Q.dequeue();
            for (int i = 0; i < mSize; i++){
                if(A[v][i] != 0){ // scan the possable route from the node i
                    if(!marked[i]){
                        // if the node i has been noted, pass this point
                        // otherwise mark this node
                        edgeTo[i] = v;
                        marked[i] = true;
                        Q.enqueue(i);
                        // find the target point, the rest of graph is no needed anymore.
                        if (v == endPoint) {
                          Q.delete; // makeing queue becomes empty
                          break; 
                        }
                    }
                }
            }
        }
        //assign the target point
        int i = endPoint;
        
        //
        // using the path log which is edgeTo[] to list the entire path 
        //
        while (edgeTo[i] != startPoint){
            if(edgeTo[i] == -1){
                break; // the home has been found
            }
            int num = edgeTo[i] + 1;
            Link[i].next = edgeTo[i] // set the next node by the record of path
            Link[i].Var = A[edgeTo[i]][i] // get the direction from the map (array A)
            i = edgeTo[i];
        }
        return Link // it is the end of the rough's end therefore, it has found the all way from g to h
    }

    public static void RobotGo(int StartNote, char Rough[]) {
      int 


    }
}
