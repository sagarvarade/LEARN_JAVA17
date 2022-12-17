package DSA.MasterClass.List.SinglyList;

public 
class SinglyList {
	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertToSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;

		if (head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}

	public void traverseSinglyLinkedList() {
		if (head == null) {
			System.out.println("SSL did not exist !!");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
	}

	boolean searchNode(int nodeValue) {
		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("\nFound " + nodeValue + ", at location : " + i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("node not found");
		return false;
	}
	
	public void deletionOfNode(int location) {
		if(head==null) {
			System.out.println("The SLL does not exist !");
			return;
		}
		else if(location == 0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
		}
		else if(location>=size) {
			Node tempNode=head;
			for(int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
			if(tempNode==head) {
				tail=head=null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}
		else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
	
	public void deleteSLL() {
		head=null;
		tail=null;
		System.out.println("\n Delete Successfully.");
	}
}