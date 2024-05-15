import java.util.*;
class Solution {
    public String solution(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        // 비교하는 로직
        // 문자열로 변환하여 리스트에 저장
        for (int num : nums) {
            list.add(String.valueOf(num));
        }

        // 리스트를 가지고 변환과정 수행 (리스트 정렬) why? Collections 클래스의 메서드를 사용하기 위함
        // 정렬 방법 = 앞+뒤 값과 뒤+앞 값의 크기를 비교하여 후자가 더 큰 경우 swap 한다.
        list.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1) *  -1);
        // Collections.sort(list, (s1, s2) -> (s1 + s2).compareTo(s2 + s1) *  -1)
        
        // 모든 요소가 0인 경우 ==> 답은 0;
        if(list.get(0).equals("0")) return "0";
        // StringBuilder 사용하여 리스트 append -> 문자열 생성
        for(String s : list){
            sb.append(s);
        }
        
        return sb.toString();
    }
}