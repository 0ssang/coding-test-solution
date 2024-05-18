class Solution {    
    static int[] numbers;
    static int target;
    static int answer = 0;

    public int solution(int[] nums, int t) {
        numbers = nums;
        target = t;
        
        dfs(0, 0);
        
        return answer;
    }
    
    public static void dfs(int sum, int depth){
        if(depth == numbers.length){
            if(target == sum) answer++;
            return;
        }

        dfs(sum + numbers[depth], depth + 1);
        dfs(sum - numbers[depth], depth + 1);
    }
}