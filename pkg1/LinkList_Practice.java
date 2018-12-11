package pkg1;

public class LinkList_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Node a = new Node(1);
			Node b = new Node(2);
			Node c = new Node(3);
			Node d = new Node(4);
			Node e = new Node(5);
			
			a.setNext(b);
			b.setNext(c);
			c.setNext(d);
			d.setNext(e);

			//printLL(a);
			System.out.println(KthNode(a,2 ).getData());
	}

	
	static void printLL(Node x) {
		
		while(x!=null) {
			System.out.println(x.getData());
			x=x.getNext();
		}
	}

	static Node KthNode(Node head, int k) {
		Node a=head;
		Node b=head;
		
		for(int i=0; i<k;i++) {
			a=a.getNext();
		}
		
		while(a.getNext()!=null) {
			a=a.getNext();
			b=b.getNext();
		}
		return b;
	}

}
