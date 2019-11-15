package string;

import java.util.HashMap;
import java.util.Stack;

/**
 * 8-16
	 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
	
	��Ч�ַ��������㣺
	    �����ű�������ͬ���͵������űպϡ�
	    �����ű�������ȷ��˳��պϡ�
	    ע����ַ����ɱ���Ϊ����Ч�ַ�����
 *finish:2019��8��16��12:38:09
 */
public class ValidParenthesis {
	public static boolean isValid(String str) {
		if(str!=null) {
			//���ݴ������
				//����ջ
				Stack<Character> stack=new Stack<Character>();
				//�ַ���ȥ���ո�
				str=str.replace(" ", "");
				//ת��Ϊ�����ַ���char����
				char[] chars = str.toCharArray();
				for (char c : chars) {//�����ַ���ջ
					stack.push(c);
				}
			//�ݹ��ж�
			return juge(stack, new Stack<Character>());
		}else {
			return false;
		}
    }
	//�ݹ��ж�
	public static boolean juge(Stack<Character> stack1,Stack<Character> stack2) {
		//�ж�stack1�Ƿ�Ϊ�գ�Ϊ��˵�����������Ϲ��򣬷�������ж�
		if(stack1.size()==0&&stack2.size()==0) {return true;}else {
			//�ж�Stack2�Ƿ�Ϊ�գ�Ϊ��ֱ�ӳ�ջ��ջ���������£���Ϊ��������ж�
			if(stack2.size()==0) {//Ϊ��
				//ֱ�ӽ�ջ��ջ
				stack2.push(stack1.pop());
				return juge(stack1, stack2);
			}else if(stack1.size()==0) {//stack1Ϊ����stack2��Ϊ�գ�˵��������û�з���������
				return false;//��ֹ����2
			}else {//��Ϊ��
				//��ջ�жϣ����Ϲ���˫˫��ջ����������һ��һ��
				char stack1_peak=stack1.pop();//����ʲô�����ջ1��Ҫ��ջ
				char stack2_peak=stack2.peek();
				if(charMatch(stack1_peak, stack2_peak)) {//���Ϲ���
					//ջ2��ջ
					stack2.pop();
					//�ݹ��ж�
					return juge(stack1, stack2);
				}else {//�����Ϲ���
					//ջ2��ջ
					stack2.push(stack1_peak);
					return juge(stack1, stack2);
				}
			}
		}
	}
	//ƥ�����
	public static boolean charMatch(char char1 ,char char2 ) {
		if(char1=='('&&char2==')'||char1=='['&&char2==']'||char1=='{'&&char2=='}') {
			return true;
		}else if(char2=='('&&char1==')'||char2=='['&&char1==']'||char2=='{'&&char1=='}') {
			return true;
		}else {
			return false;
		}
	}
	//����
	public static void main(String[] args) {
		String testStr="{[ ]}";
		System.out.println(ValidParenthesis.isValid(testStr));
	}
	
}
//��׼��
class Solution {

	  // Hash table that takes care of the mappings.
	  private HashMap<Character, Character> mappings;

	  // Initialize hash map with mappings. This simply makes the code easier to read.
	  public Solution() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  }

	  public boolean isValid(String s) {

	    // Initialize a stack to be used in the algorithm.
	    Stack<Character> stack = new Stack<Character>();
	    
	    //ǰ�����Ƚ�ջ��Ȼ������Ž����ж�
	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // ���map�а���������
	      if (this.mappings.containsKey(c)) {

	        // ��ջ���ջ��Ԫ�أ� ���ջΪ�գ�������Чֵ#
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {//���Ϊǰ���ţ����ջ
	        // If it was an opening bracket, push to the stack.
	        stack.push(c);
	      }
	    }
	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
	}


