package question1.Services;
import java.util.Stack;

public class ParanthesisChecker {
		private String value;

		public String getParanthesis() {
			return value;
		}

		public void setParanthesis(String paranthesis) {
			value = paranthesis;
		}
		public void checkBalance() {
			Stack<Character> st = new Stack<Character>();
			 boolean balanced = false;
			 boolean valid = false;
			for(char e: value.toCharArray()) {
				if(e == '{' || e == '[' || e == '(')
				{
					valid = true;
					st.push(e);
				}
				else if(e == ')' ||  e == ']' || e == '}') {
					valid = true;
					switch(e) {
						case ')':
							if(st.peek()=='(')
								st.pop();
							break;
						
						case ']':
							if(st.peek()=='[') 
								st.pop();
							break;
						case '}':
							if(st.peek()=='{') 
								st.pop();
					}
				
				}
				else {
					valid = false;
					break;
				}
			}
			if(st.isEmpty())
			{
				balanced = true;
			}
			if(valid & balanced) {
				System.out.println("The entered String has Balanced Brackets");
			}
			else if(!valid)
			{
				System.out.println("The entered String is not a valid paranthesis");
			}
			else if(!balanced) {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}

		
		
}

