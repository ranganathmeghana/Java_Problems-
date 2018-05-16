package Chapter2;


public class Node
{
	public Node leftSibling;
	public Node rightSibling;
	
	public Node(){
		leftSibling = this;
		rightSibling = this;
	}
	public Node getLeftSibling() {
		return leftSibling;
	}
	public void setLeftSibling(Node leftSibling) {
		this.leftSibling = leftSibling;
	}
	public Node getRightSibling() {
		return rightSibling;
	}
	public void setRightSibling(Node rightSibling) {
		this.rightSibling = rightSibling;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public boolean isMark() {
		return mark;
	}
	public void setMark(boolean mark) {
		this.mark = mark;
	}
	public Node parent;
	public Node child;
	public int value;
	public int degree;
	boolean mark;
	
}
