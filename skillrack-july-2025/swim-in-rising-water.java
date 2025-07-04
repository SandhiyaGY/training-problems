// LEETCODE:778
// Approach:Using priority queue we can iterate through the minimum elevation and using bfs find the maximum elevation that reaches the end point
class Solution{
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[2], b[2]));
        pq.offer(new int[]{0, 0, grid[0][0]});
        visited[0][0] = true;
        int ans = grid[0][0];
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], h = curr[2];
            ans = Math.max(ans, h);
            if (x == n-1 && y == n-1) return ans;
            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.offer(new int[]{nx, ny, grid[nx][ny]});
                }
            }
        }
        return -1; 
    }
}
