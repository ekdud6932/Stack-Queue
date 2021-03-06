/*
 
< 프린터 - 문제설명 >
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 
이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 
1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.

< 제한사항 >
현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.

< 입출력 예 >
priorities			location	 return
[2, 1, 3, 2]			2			1
[1, 1, 9, 1, 1, 1]		0			5

 */



import java.util.Collections;
import java.util.PriorityQueue;

public class no42587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 1;
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int num : priorities) {
			queue.add(num);
		}
		
		while (!queue.isEmpty()) {
			for (int i = 0; i <priorities.length; i++) {
				if (priorities[i] == queue.peek()) {
					if (i == location) {
						return answer;
					}
					queue.poll();
					answer++;
				}
			}
		}
		
		return answer;
	}

}
