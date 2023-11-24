package LinkedListPack;

public class LinkedList01 {
	Node head;
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
				
			}
			n.next=node;
		}
	}
	public void insertAtStart(int data) {
		Node n=new Node();
		n.data=data;
		n.next=null;
		n.next=head;
		head=n;
	}
	public void inserAt(int index,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
			
		}
	}
	public void deleteAt(int index) {
		
	
		if(index==0) {
			Node n=head;
			head=n.next;
		}
		else {
			Node n=head;
			Node n1;
			for(int i=0; i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
//	public void delete(int data) {
//		boolean found=true;
//		Node n1;
//		if(head.data==data) {
//			head=head.next;
//		}
//		else {
//			Node n=head;
//			while(found||n.next!=null) {
////				 n=n.next;
//				if(n.data==data) {
//					n1=n;
//					n.next=n1.next;
//					found=false;
//					break;
//				}
//				n=n.next;
//			}
//		}
//		if(found==false) {
//			System.out.println("Found element: "+data);
//		}
//		else {
//			System.out.println("Element is not there!");
//		}
//	}
	public void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	public void findElement(int data) {
		boolean found=true;
		//Node n=head;
		if(head.data==data) {
			System.out.println("Element is there: "+data);
		}
		else {
			Node n=head;
			while(found||n.next!=null) {
				//n=n.next;
				if(n.data==data) {
					found=true;
					break;
				}
				else if(n.next==null) {
					break;
				}
				else {
					n=n.next;
				}
				
				

			}
			if(found==false) {
				System.out.println("Element is there: "+data);
			}
			else {
				System.out.println("Element is not found!!");
			}
			
			
		}
	}

}
