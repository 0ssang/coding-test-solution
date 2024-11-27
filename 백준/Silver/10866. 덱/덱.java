import java.io.*;
// 커스텀 덱 생성: 고정 배열과 포인터 2개 사용
class Deq {
    private int[] arr;
    private int front;
    private int back;

    public Deq(int size){
        this.arr = new int[size * 2];
        this.front = this.arr.length / 2 - 1;
        this.back = this.arr.length / 2;
    }

    public void pushFront(int value){
        arr[front] = value;
        front -= 1;
    }

    public void pushBack(int value){
        arr[back] = value;
        back += 1;
    }

    public int popFront() {
        if(this.isEmpty()) return -1;

        int value = arr[front + 1];
        front += 1;

        return value;
    }

    public int popBack() {
        if(this.isEmpty()) return -1;

        int value = arr[back - 1];
        back -= 1;

        return value;
    }

    public int getSize() {
        return back - front - 1;
    }

    public boolean isEmpty() {
        return this.getSize() <= 0;
    }

    public int getFront() {
        return arr[front + 1];
    }

    public int getBack(){
        return arr[back - 1];
    }
}

public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
        Deq deq = new Deq(N);
 
		for (int i = 0; i < N; i++) {
 
			String[] s = br.readLine().split(" ");
 
			switch (s[0]) {
 
				case "push_front": {
                    deq.pushFront(Integer.parseInt(s[1]));
					break;
				}
				
				case "push_back": {
                    deq.pushBack(Integer.parseInt(s[1]));
					break;
				}
 
				case "pop_front": {
                    int res = deq.popFront();
                    if(res == -1){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(res).append('\n');
                    }
					break;
				}
 
				case "pop_back": {
					int res = deq.popBack();
                    if(res == -1){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(res).append('\n');
                    }
					break;
				}
 
				case "size": {
					sb.append(deq.getSize()).append('\n');
					break;
				}
 
				case "empty": {
					if (deq.isEmpty()) {
						sb.append(1).append('\n');
					} 
					else {
						sb.append(0).append('\n');
					}
					break;
				}
 
				case "front": {
					if (deq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(deq.getFront()).append('\n');
					}
					break;
				}
 
				case "back": {
					if (deq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(deq.getBack()).append('\n');
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}