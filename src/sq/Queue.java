package sq;

public class Queue<T> {

	private CLL<T> queue;  // the circular linked list that
	//                        reqresents the queue
	
	// constructor - new Queue( ) returns a
	// reference to an empty Queue
	public Queue( ){
	    // fill in here
	    this.queue = new CLL<T>();
	}
	
	public void enqueue(T data){
	    // fill in here
	    if(this.queue == null){
	    	this.queue.addAtFront(data);
	    }
	    else{
	    	this.queue.addAtRear(data);
	    }
	}
	public T dequeue( ){
	    // fill in here
	    return this.queue.removeFront();
	}
	public boolean isEmpty( ){
	    // fill in here
	    return this.queue.isEmpty();
	}	
}
