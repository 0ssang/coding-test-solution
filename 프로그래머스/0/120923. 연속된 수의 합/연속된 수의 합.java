class Solution {
    public int[] solution(int num, int total) {
        // total 을 num 으로 나눈다.
        // 나누어떨어지는 값이 아니라면 몫과 몫+1 이 기준이 된다.
        int center = total % num == 0? total / num : total / num + 1;
        // 나눈 값을 기준으로 num 의 수 만큼 배열을 만든다.
        int[] arr = new int[num];
        // 기준값 - num/2 부터  num 만큼 반복을 시작한다.
        // 배열에 작은 순서부터 저장한다.
        for(int i = 0; i < arr.length; i++){
            arr[i] = center - num/2 + i;
        }
        
        return arr;
    }
}