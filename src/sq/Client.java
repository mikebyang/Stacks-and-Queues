package sq;

public class Client<T>{

    // prints the contents of stack of Integers s, in
    // top-to-bottom order. This mthod may change s
    // temporarily, but by the time it exits, s must be
    // set back to the contens it had when printStack was
    // called.
	public static void printStack(Stack<Integer> s){
	    // fill in here
		Stack<Integer> s2 = new Stack<Integer>();
		int temp;
		while(s.isEmpty() != true){
			temp = s.pop();
			s2.push(temp);
			System.out.println(temp);
		}
		while(s2.isEmpty() != true){
			s.push(s2.pop());
		}
	}

    // this method reverses the order of the items in the
    // stack.  What was the top Integer becomes the bottom,
    // next-to-top become next-to-bottom, etc.
	public static void flipStack(Stack<Integer> s){
	    //fill in here
		Queue<Integer> q = new Queue<Integer>();
		while(s.isEmpty() != true){
			q.enqueue(s.pop());
		}
		while(q.isEmpty() != true){
			s.push(q.dequeue());
		}
	}
}
