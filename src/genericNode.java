
public class genericNode <T> {
	
	private T nodeData;
	private genericNode<T> nodeLink;
	
	public genericNode(T data, genericNode<T> link){
		nodeData = data;
		nodeLink = link;
	}
	
	public genericNode<T> addNodeAfter(T element){
		nodeLink = new genericNode<T>(element, nodeLink);
		
		return nodeLink;
	}
	
	public boolean removeNodeAfer(){
		
		genericNode<T> temp = nodeLink;
		
		if(nodeLink != null){
			nodeLink = nodeLink.getLink();
		}
		
		return temp != nodeLink;
	}
	
	public int getListLength(genericNode<T> head){
		genericNode<T> cursor = head;
		int length = 1;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public static <T> int listLength(genericNode<T> head){
		genericNode<T> cursor = head;
		int length = 1;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public static <T> boolean listSearch (genericNode<T> head, T target){ 
		genericNode<T> cursor;
		
		for(cursor = head; cursor.getLink() != null; cursor = cursor.getLink()){
			if(target.equals(cursor.getData())){
				return true;
			}
		}
		
		return false;
	}

	public static <T> genericNode<T> nodeAt(genericNode<T> node, int position){
		int i = 1;
		genericNode<T> cursor = node;
		
			while((i < position) && (cursor != null)){
				i++;
				cursor = cursor.getLink();
			}
			
			return cursor;
	}
	
	public void displayData(){
		genericNode<T> cursor;
		
		for(cursor = this; cursor.getLink() != null; cursor = cursor.getLink()){
			System.out.println(cursor.getData());
		}
		System.out.println(cursor.getData());
	}
	
	public T getData(){
		return nodeData;
	}
	
	public genericNode<T> getLink(){
		return nodeLink;
	}
	
	public void setData(T data){
		nodeData = data;
	}
	
	public void setLink(genericNode<T> link){
		nodeLink = link;
	}

}
