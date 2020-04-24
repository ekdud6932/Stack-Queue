/*
 < ¦���� �����ϱ� >
 ¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. 
 �״���, �� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. 
 ���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. 
 ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.

 ���� ���, ���ڿ� S = baabaa ���
 b aa baa �� bb aa �� aa ��
 �� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.
 
< ���ѻ��� >
���ڿ��� ���� : 1,000,000������ �ڿ���
���ڿ��� ��� �ҹ��ڷ� �̷���� �ֽ��ϴ�.

 */


import java.util.Scanner;
import java.util.Stack;

public class no12973 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s){
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i= 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        if (stack.isEmpty()){
            answer = 1;
        }
        
        return answer;
    }

}
