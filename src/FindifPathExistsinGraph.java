import java.util.*;

public class FindifPathExistsinGraph {
    public static void main(String[] args) {
        int n = 6, source = 0, destination = 5;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        System.out.println(solution(n, edges, source, destination));
    }

    private static boolean solution(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjacency_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacency_list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjacency_list.get(edge[0]).add(edge[1]);
            adjacency_list.get(edge[1]).add(edge[0]);
        }

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(source);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        while (!deque.isEmpty()) {
            int node = deque.pop();

            if (node == destination) {
                return true;
            }

            if (visited[node]) {
                continue;
            }
            visited[node] = true;

            for (int neighbor : adjacency_list.get(node)) {
                deque.push(neighbor);
            }
        }

        return false;
    }
}
