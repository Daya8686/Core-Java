package DS;

public class ListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(26);
		list.insert(78);
		list.insertAt(0, 55);
		list.insertAtStart(89);
		list.insertAt(4, 99);
		list.DeleteAt(0);
		list.DeleteAt(5);
		list.show();

	}

}
