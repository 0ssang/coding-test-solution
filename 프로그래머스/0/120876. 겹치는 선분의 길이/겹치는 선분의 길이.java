class Solution {
    public int solution(int[][] lines) {
         // [start, end]
        // 1. 세 선분을 각각 비교하여 겹치는 부분을 구해내는 과정 (총 3번 비교).
        int sum = 0;
        int newArr[][] = new int[3][2];
        int k = 0;
        for(int i = 0; i<lines.length - 1; i++){
            for(int j = i+1; j<lines.length; j++){
                newArr[k][0] = Math.max(lines[i][0], lines[j][0]);
                newArr[k][1] = Math.min(lines[i][1], lines[j][1]);
                if(newArr[k][0]<newArr[k][1]){
                    sum += newArr[k][1] - newArr[k][0];
                }
                k++;
                System.out.println("sum = "+sum);
            }
        }
        int end = Integer.MAX_VALUE;
        int start = Integer.MIN_VALUE;
        for(int[] a : newArr){
            System.out.println(a[0] + " " + a[1]);
            start = start < a[0] ? a[0] : start;
            end = end > a[1] ? a[1] : end;
        }
        if(start < end){
            sum -= (end - start)*2;
        }
        // 1-1. start 끼리 비교하여 둘 중 더 큰 것을 기록
        // 1-2. end 끼리 비교하여 둘 중 더 작은 것을 기록
        // 1-3. 만약 기록한 선분의 start 값이 end 값보다 크다면 이 선분들은 겹치지 않는다.
        // 1-4. 겹친다면 end - start 값을 더하여 저장한다.
        // 2. 겹치는 부분끼리 비교하여 세 선분이 겹치는 부분을 구한다.
        // 3. 세 선분이 겹치는 부분이 존재한다면, 전체 합에서 뺀다.
        return sum;
    }
}