package LinkedListPack;

public class LinkedRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList01 l=new LinkedList01();
		l.insert(12);
		l.insert(65);
		l.insert(87);
		l.inserAt(0, 90);
		l.inserAt(2, 100);
		l.insertAtStart(1100);
		l.deleteAt(5);
		l.deleteAt(0);
		
//		l.delete(12);
		l.findElement(9);
		l.show();

	}

}
