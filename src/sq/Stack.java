package sq;

public class Stack<T>{
    
	private CLL<T> stack;  // the circular llinked list that
	//                        reqresents the stack
	
	// constructor - new Stack( ) returns a
	// reference to an empty Stack	
	public Stack( ){
	    // fill in here
	    this.stack= new CLL<T>();
	}
	
	public void push(T data){
	    // fill in here
		this.stack.addAtFront(data);
	}
	public T pop( ){
	    // fill in here
	    return this.stack.removeFront();
	}
	public boolean isEmpty( ){
	    // fill in here
	    return this.stack.isEmpty();
	}
}
