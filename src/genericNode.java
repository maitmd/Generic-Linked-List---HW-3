
public class genericNode <T> {
	
	private int nodeData;
	private genericNode<T> nodeLink;
	
	public genericNode(int data, genericNode<T> link){
		nodeData = data;
		nodeLink = link;
	}
	
	public genericNode<T> addNodeAfter(int element){
		genericNode<T> newNode = new genericNode<T>(element, nodeLink); //creating new node
		nodeLink = newNode; //replacing current linked node with new node
		
		return nodeLink;
	}
	
	public genericNode<T> removeNodeAfer(int element){
		
		genericNode<T> temp = nodeLink;
		nodeLink =  nodeLink.getLink();
		
		return temp;
	}
	
	public int listLength(genericNode<T> head){//Idk how what making this static does
		genericNode<T> cursor = head;
		int length = 0;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public static int listSLength(genericNode<?> head){//but I did it.
		genericNode<?> cursor = head;
		int length = 0;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public boolean listSearch(genericNode<T> head, T target){ 
		genericNode<T> cursor;
		
		for(cursor = head; cursor.getLink() != null; cursor = cursor.getLink()){
			if(target.equals(cursor.getData())){
				return true;
			}
		}
		
		return false;
	}

	public int getData(){
		return nodeData;
	}
	
	public genericNode<T> getLink(){
		return nodeLink;
	}
	
	public void setData(int data){
		nodeData = data;
	}
	
	public void setLink(genericNode<T> link){
		nodeLink = link;
	}

}
