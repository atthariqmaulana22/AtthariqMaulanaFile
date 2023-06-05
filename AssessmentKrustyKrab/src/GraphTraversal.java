import java.util.*;
public class GraphTraversal {
    private int V;
    private LinkedList<Integer>[] adjList;

    public GraphTraversal(int v) {
        V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        switch (v){
            case 0:
                System.out.println("Preheat Oven");
                break;
            case 1:
                System.out.print("PreHeat Pan");
                break;
            case 2:
                System.out.print("Bake Bread");
                break;
            case 3:
                System.out.print("Set Plate");
                break;
            case 4:
                System.out.print("Serve Bread");
                break;
            case 5:
                System.out.print("Add Krabby Patty");
                break;
            case 6:
                System.out.print("Add Some Pickles");
                break;
            case 7:
                System.out.print("Serve Krabby Patty");
                break;
            case 8:
                System.out.print("Add Tartar Sauce");
                break;
            case 9:
                System.out.print("Pour Sauce");
                break;
            case 10:
                System.out.print("Eat");
                break;
        }
        System.out.print(", ");

        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    public void BFS(int v) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            int n = queue.poll();
            switch (n){
                case 0:
                    System.out.println("Preheat Oven");
                    break;
                case 1:
                    System.out.print("PreHeat Pan");
                    break;
                case 2:
                    System.out.print("Bake Bread");
                    break;
                case 3:
                    System.out.print("Set Plate");
                    break;
                case 4:
                    System.out.print("Serve Bread");
                    break;
                case 5:
                    System.out.print("Add Krabby Patty");
                    break;
                case 6:
                    System.out.print("Add Some Pickles");
                    break;
                case 7:
                    System.out.print("Serve Krabby Patty");
                    break;
                case 8:
                    System.out.print("Add Tartar Sauce");
                    break;
                case 9:
                    System.out.print("Pour Sauce");
                    break;
                case 10:
                    System.out.print("Eat");
                    break;
            }
            System.out.print(", ");

            Iterator<Integer> i = adjList[n].listIterator();
            while (i.hasNext()) {
                int m = i.next();
                if (!visited[m]) {
                    visited[m] = true;
                    queue.add(m);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal g = new GraphTraversal(12);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,5);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,6);
        g.addEdge(3,7);
        g.addEdge(4,10);
        g.addEdge(5,7);
        g.addEdge(5,8);
        g.addEdge(6,10);
        g.addEdge(7,9);
        g.addEdge(8,9);
        g.addEdge(9,10);

        System.out.println("DFS Outout Resep: ");
        g.DFS(1);

        System.out.println("\nBFS Output Resep: ");
        g.BFS(1);
    }
}
