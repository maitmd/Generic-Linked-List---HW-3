
public class testNode {
	public static void main(String[] args) {
		genericNode<String> head = new genericNode<String>("me", null);
		genericNode<String> tail = head;
		genericNode<String> current = head;
		genericNode<String> temp; 
		
		String[] names = {"sam", "pam","tom","tim", "ben","ron"};
		
		for(int i = 0; i < names.length; i++){
			tail.addNodeAfter(names[i]);
			tail = tail.getLink();
		}
		
		System.out.println("print the list:\n");
		head.displayData();
		System.out.println("\n");
		
		System.out.println("position 3:\n");
		current = genericNode.nodeAt(head, 3);
		System.out.println(current.getData());
		temp = current.getLink();
		System.out.println("\n");
		
		System.out.println("remove node after position 3:\n");
		current.removeNodeAfer();
		System.out.println(temp.getData());
		System.out.println("\n");
		
		System.out.println("shorter list:\n");
		head.displayData();
		System.out.println("\n");
		
		System.out.println("list length:\n");
		System.out.println(current.getListLength(head));
		System.out.println(genericNode.listLength(head));
		System.out.println("\n");
		
		System.out.println("Searching for Ben and Tom:\n");
		System.out.println("Ben search results: " + genericNode.listSearch(head, "ben"));
		System.out.println("Tom search results: " + genericNode.listSearch(head, "tom"));
		
	}
}
