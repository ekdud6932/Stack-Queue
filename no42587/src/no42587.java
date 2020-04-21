/*
 
< ������ - �������� >
�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
�̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
 
1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
3. �׷��� ������ J�� �μ��մϴ�.

< ���ѻ��� >
���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.

< ����� �� >
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
