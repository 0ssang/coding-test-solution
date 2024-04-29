class Solution {
    public int[] solution(int[][] score) {
        
        // 배열을 한번씩 모두 비교하여(2중 for 문) 순회한다.
        // 문제에서 평균을 물어보지는 않았으므로 두 점수의 합을 기준으로 평가한다.
        // 등수를 먹이는 방법은??
        //      순위를 나타내는 정수 변수 하나를 만든다.
        //      초기 값은 1로 하고 비교하여 더 큰 값이 있으면 변수를 1 증가시킨다.
        
        int[] res = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            int rank = 1;
            for(int j = 0; j < score.length; j++){
                if(score[i][0] + score[i][1] < score[j][0] + score[j][1]) rank++;
            }
            res[i] = rank;
        }
        
        return res;
    }
}