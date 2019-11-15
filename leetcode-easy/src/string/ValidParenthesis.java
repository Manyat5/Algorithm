package string;

import java.util.HashMap;
import java.util.Stack;

/**
 * 8-16
	 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
	
	有效字符串需满足：
	    左括号必须用相同类型的右括号闭合。
	    左括号必须以正确的顺序闭合。
	    注意空字符串可被认为是有效字符串。
 *finish:2019年8月16日12:38:09
 */
public class ValidParenthesis {
	public static boolean isValid(String str) {
		if(str!=null) {
			//数据处理过程
				//创建栈
				Stack<Character> stack=new Stack<Character>();
				//字符串去除空格
				str=str.replace(" ", "");
				//转化为单个字符的char类型
				char[] chars = str.toCharArray();
				for (char c : chars) {//所有字符进栈
					stack.push(c);
				}
			//递归判断
			return juge(stack, new Stack<Character>());
		}else {
			return false;
		}
    }
	//递归判断
	public static boolean juge(Stack<Character> stack1,Stack<Character> stack2) {
		//判断stack1是否为空，为空说明整个串复合规则，否则进行判断
		if(stack1.size()==0&&stack2.size()==0) {return true;}else {
			//判断Stack2是否为空，为空直接出栈进栈不做其他事，不为空则进行判断
			if(stack2.size()==0) {//为空
				//直接进栈出栈
				stack2.push(stack1.pop());
				return juge(stack1, stack2);
			}else if(stack1.size()==0) {//stack1为空且stack2不为空，说明遍历后没有符合条件的
				return false;//终止条件2
			}else {//不为空
				//顶栈判断，复合规则双双出栈，不符合则一进一出
				char stack1_peak=stack1.pop();//不管什么情况，栈1都要出栈
				char stack2_peak=stack2.peek();
				if(charMatch(stack1_peak, stack2_peak)) {//符合规则
					//栈2出栈
					stack2.pop();
					//递归判断
					return juge(stack1, stack2);
				}else {//不符合规则
					//栈2进栈
					stack2.push(stack1_peak);
					return juge(stack1, stack2);
				}
			}
		}
	}
	//匹配规则
	public static boolean charMatch(char char1 ,char char2 ) {
		if(char1=='('&&char2==')'||char1=='['&&char2==']'||char1=='{'&&char2=='}') {
			return true;
		}else if(char2=='('&&char1==')'||char2=='['&&char1==']'||char2=='{'&&char1=='}') {
			return true;
		}else {
			return false;
		}
	}
	//测试
	public static void main(String[] args) {
		String testStr="{[ ]}";
		System.out.println(ValidParenthesis.isValid(testStr));
	}
	
}
//标准答案
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
	    
	    //前括号先进栈，然后后括号近来判断
	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // 如果map中包含后括号
	      if (this.mappings.containsKey(c)) {

	        // 出栈获得栈顶元素， 如果栈为空，返回无效值#
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {//如果为前括号，则进栈
	        // If it was an opening bracket, push to the stack.
	        stack.push(c);
	      }
	    }
	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
	}


