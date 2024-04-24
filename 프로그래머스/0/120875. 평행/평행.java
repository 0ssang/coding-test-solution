class Solution {
    public int solution(int[][] dots) {
        // 두 점은 겹칠 수 없다...
        // How to ?
        // 한 점을 기록하는 방법 == index i로 제어하기
        // 기울기를 구할 때 사용한 인덱스를 저장한다. dots[0~4] 중에 하나.
        // ex> dots[0]dots[1]로 구한 기울기는 dots[2]dots[3]과 비교하지 않는다.
        // ex> dots[0]dots[2]로 구한 기울기와 dots[1]dots[2]로 구한 기울기도 비교하지 않고 0을 리턴한다.
        // why? dots[2]가 중복되었기 때문이다.
        // 이 때 해당 인덱스를 기억하는 방법은???

        double d1 = 0.0;
        double d2 = 0.0;
        for(int i=1; i<dots.length; i++){
            int sum = 6 - i;
            int j = 0;
            if(sum > dots.length){
                // 01, 23 or 02, 13인 경우..
                j = dots.length -1;
            }else{
                // 03, 12 인 경우.. 즉 i = 3인 경우;
                j = dots.length -2;
            }
            int k = sum - j;
            d1 = (double) (dots[0][1] - dots[i][1]) / (dots[0][0] - dots[i][0]);
            d2 = (double) (dots[k][1] - dots[j][1]) / (dots[k][0] - dots[j][0]);
            if(d1 == d2) return 1;
        }
        return 0; 
    }
}