//LEETCODE:864
class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int R=grid.length;
        int C=grid[0].length();
        int keyCount=0;
        boolean[][][] visited=new boolean[R][C][(1<<6)];
        Queue<int[]> queue=new LinkedList<>();
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                char ch=grid[row].charAt(col);
                if(ch>='a' && ch<='f'){
                    keyCount++;
                }else if(ch=='@'){
                    queue.offer(new int[]{row,col,0,0});
                    visited[row][col][0]=true;
                }
            }
        }
        int[][] diff=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            int[] curr=queue.poll();
            int row=curr[0],col=curr[1],moves=curr[2],flag=curr[3];
            if(flag==(1<<keyCount)-1){
                return moves;
            }
            for(int i=0;i<4;i++){
                int ar=row+diff[i][0];
                int ac=col+diff[i][1];
                if((ar>=0 && ar<R)&&(ac>=0 &&ac<C)){
                    char ch=grid[ar].charAt(ac);
                    if(ch=='#'){
                        continue;
                    }
                    if(ch>='A'&& ch<='F'){
                        if((flag & 1<<(ch-'A'))==0){
                            continue;
                        }
                    }
                    int newFlag=flag;
                    if(ch>='a' && ch<='f'){
                        newFlag|=(1<<(ch-'a'));
                    }
                    if(!visited[ar][ac][newFlag]){
                        queue.offer(new int[]{ar,ac,moves+1,newFlag});
                        visited[ar][ac][newFlag]=true;
                    }
                }
            }
        }
        return -1;
    }
}
