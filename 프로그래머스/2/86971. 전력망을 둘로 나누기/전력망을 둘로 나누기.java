import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int min = n;
        
        for(int excludeIdx = 0; excludeIdx < wires.length; excludeIdx++){
            UnionFind uf = new UnionFind(n + 1);
            
            for(int i = 0; i<wires.length; i++){
                if(excludeIdx == i) continue;
                uf.union(wires[i][0], wires[i][1]);
            }
            
            int size1 = uf.getSize(wires[excludeIdx][0]);
            int size2 = uf.getSize(wires[excludeIdx][1]);
            
            int diff = Math.abs(size1 - size2);
            min = Math.min(min, diff);
        }
        return min;
    }
    
    class UnionFind {
        int[] parent;
        int[] size;
        
        UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            
            for(int i=0; i<n; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        
        int find(int x){
            if(parent[x] == x) return x;
            return parent[x] = find(parent[x]);
        }

        void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX == rootY) return;

            if(size[rootX] < size[rootY]){
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
        }

        int getSize(int x){
            return size[find(x)];
        }
    }
}