class Solution {
    public int solution(int price) {
        double discount = 1.0;
        if(price >= 100000 && price < 300000){
            discount = 0.95;
        }else if(price >= 300000 && price < 500000){
            discount = 0.9;
        }else if (price >= 500000){
            discount = 0.8;
        }
        return (int)(price * discount);
    }
}