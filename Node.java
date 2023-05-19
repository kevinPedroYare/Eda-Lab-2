public class Node<T>{
	private T data;
	private Node<T> nextNode;

	public Node(T dataNodo, Node<T> next){
		this.data = dataNodo;
		this.nextNode = next;
	}

	public Node(T dataNodo){
		this(dataNodo, null);
	}
	public Node(){
		this(null, null);
	}
	public T getInfo(){
		return this.data;
	}
	public Node<T> getNext(){
		return this.nextNode;
	}
	public void setData(T dataNodo){
		this.data = dataNodo;
	}
	public void setNext(Node<T> next){
		this.nextNode = next;
	}

	public void clear(){
		this.data = null;
		this.nextNode = null;
	}

	public boolean isEmpty(){
		if(data == null){
			return true;
		}else{
			return false;
		}
	}

	public String toString(){
		if(data != null){
			return data.toString();
		}else{
			return null;
		}
	}
}
