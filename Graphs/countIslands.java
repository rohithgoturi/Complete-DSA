import java.util.LinkedList;
import java.util.Queue;

public class countIslands {
    static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int countIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 'L' && !vis[i][j]) {

                    count++;

                    bfs(i, j, grid, vis);
                }
            }
        }

        return count;
    }

    public static void bfs(int row, int col, char[][] grid, boolean[][] vis) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(row, col));
        vis[row][col] = true;

        while (!q.isEmpty()) {

            Pair p = q.remove();

            int r = p.row;
            int c = p.col;

            // Top
            if (r - 1 >= 0) {
                if (grid[r - 1][c] == 'L' && !vis[r - 1][c]) {
                    vis[r - 1][c] = true;
                    q.add(new Pair(r - 1, c));
                }
            }

            // Bottom
            if (r + 1 < n) {
                if (grid[r + 1][c] == 'L' && !vis[r + 1][c]) {
                    vis[r + 1][c] = true;
                    q.add(new Pair(r + 1, c));
                }
            }

            // Left
            if (c - 1 >= 0) {
                if (grid[r][c - 1] == 'L' && !vis[r][c - 1]) {
                    vis[r][c - 1] = true;
                    q.add(new Pair(r, c - 1));
                }
            }

            // Right
            if (c + 1 < m) {
                if (grid[r][c + 1] == 'L' && !vis[r][c + 1]) {
                    vis[r][c + 1] = true;
                    q.add(new Pair(r, c + 1));
                }
            }

            // Top-Left
            if (r - 1 >= 0 && c - 1 >= 0) {
                if (grid[r - 1][c - 1] == 'L' && !vis[r - 1][c - 1]) {
                    vis[r - 1][c - 1] = true;
                    q.add(new Pair(r - 1, c - 1));
                }
            }

            // Top-Right
            if (r - 1 >= 0 && c + 1 < m) {
                if (grid[r - 1][c + 1] == 'L' && !vis[r - 1][c + 1]) {
                    vis[r - 1][c + 1] = true;
                    q.add(new Pair(r - 1, c + 1));
                }
            }

            // Bottom-Left
            if (r + 1 < n && c - 1 >= 0) {
                if (grid[r + 1][c - 1] == 'L' && !vis[r + 1][c - 1]) {
                    vis[r + 1][c - 1] = true;
                    q.add(new Pair(r + 1, c - 1));
                }
            }

            // Bottom-Right
            if (r + 1 < n && c + 1 < m) {
                if (grid[r + 1][c + 1] == 'L' && !vis[r + 1][c + 1]) {
                    vis[r + 1][c + 1] = true;
                    q.add(new Pair(r + 1, c + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'L', 'W', 'L', 'L', 'W'},
            {'L', 'L', 'W', 'L', 'W'},
            {'W', 'W', 'L', 'W', 'W'},
            {'L', 'W', 'L', 'L', 'L'},
            {'W', 'W', 'W', 'W', 'W'}
        };

        int numberOfIslands = countIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }
}
