package Trees;

public class BinarySearchTree {
	//add,count no nodes, height, in-order traversal 

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinarySearchTree(Node root) {
		super();
		this.root = root;
	}
	
	public void add(Node node){
		
		if(this.root==null){
			
			this.root=node;
		}
		
		else{
			Node temp=root;
			Node prev=null;
			while(temp!=null){
				prev=temp;
				if(node.getData()>temp.getData())
				{
					temp=temp.getRightChild();
				}
				else{
					temp=temp.getLeftChild();
				}
			}
			
			if(node.getData()>temp.getData()){
			
				temp.setRightChild(node);
			}
			else{
				
				temp.setLeftChild(node);
			}
		}
	}
}

class Node{
	
	public Node(int data, Node leftChild, Node rightChild) {
		super();
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	private int data;
	private Node leftChild;
	private Node rightChild;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
}