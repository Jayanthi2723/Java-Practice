import java.util.*;

public class HackDiva {
  static int bfs(int start, List<Integer> graph, int n) {
     boolean[] visited = new boolean[n+1];
     Queue queue = new LinkedList<>();
     queue.add(start);
     visited[start] = true;
     int steps = 0;
     int nodesVisited = 0;
     while (!queue.isEmpty()) {
       int size = queue.size();
       for (int i = 0; i < size; i++) {
         int node = queue.poll();
         nodesVisited++;
         for (int neighbor : graph.get(node)) {
           if (!visited[neighbor]) {
             queue.add(neighbor);
             visited[neighbor] = true; } } } steps++;
           }
           return nodesVisited == n ? steps : -1;
         }

public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int t = scanner.nextInt();
    while (t-- > 0) {
       long n = scanner.nextLong();
        List> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
           graph.add(new ArrayList<>());
          } for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               if (i != j && (n % Math.abs(i-j) == 0) && Math.abs(i-j) > 1) {
                  graph.get(i).add(j);
                }
              }
            }
            int minSteps = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
              int steps = bfs(i, graph, (int)n);
               if (steps != -1 && steps < minSteps) {
                 minSteps = steps;
               }
             } System.out.println(minSteps);
            }
          }
         }
