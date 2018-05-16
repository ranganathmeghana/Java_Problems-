package Chapter2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciHeapClass

{
	private Node maxNode;
	private int heapCount;	
	private static final double oneOverLogPhi = 1.0 / Math.log((1.0 + Math.sqrt(5.0)) / 2.0);

public void insertToHeap(Node node, int value){
		
		node.value=value; 
		
		
		if(maxNode!=null){
			node.leftSibling=maxNode;
			node.rightSibling=maxNode.rightSibling;
			maxNode.rightSibling =node;
			node.rightSibling.leftSibling=node;
			
			if(value>maxNode.value){
				maxNode=node;
			}
		}
		
		else
		{
			maxNode=node;
		}
	
		heapCount= heapCount +1;
		
	}
	
	public Node getMaxNode() {
	return maxNode;
}

public void setMaxNode(Node maxNode) {
	this.maxNode = maxNode;
}

public int getHeapCount() {
	return heapCount;
}

public void setHeapCount(int heapCount) {
	this.heapCount = heapCount;
}

	public void increaseKey(Node node,int value)
	{
		node.value = node.value+value;
		
	    Node nodeParent = node.parent;
	    
	    
		
		if((nodeParent!=null) && (node.value>nodeParent.value)){
			
			removeFromParent(node,nodeParent);
			recursiveRemove(nodeParent);
			
		}
		
		if(node.value>maxNode.value){
			
			maxNode=node;
		}
		
//	}
//		if(node.parent == null && node.value> maxNode.value){
//			maxNode=node;
//		}
//		else if(node.parent!=null)
//		{
//			if(node.value> node.parent.value){
//				
//				node.leftSibling.rightSibling=node.rightSibling;
//				node.rightSibling.leftSibling=node.leftSibling;
//				node.parent.degree --;
//				
//				node.leftSibling=maxNode;
//				node.rightSibling=maxNode.rightSibling;
//				maxNode.rightSibling =node;
//				node.rightSibling.leftSibling=node;
//				
//				node.parent=null;
//				node.mark=false;
//				
//				if(node.parent.degree>=1 && node.parent.child==node){
//					node.parent.child=node.rightSibling;
//				}
//				
//				else if(node.parent.degree==0){
//					node.parent.child = null;
//				}
//			}
//		}
	
	}
	
	protected void removeFromParent(Node node1, Node node2){
		
		node1.leftSibling.rightSibling=node1.rightSibling;
		node1.rightSibling.leftSibling=node1.leftSibling;
		node2.degree--;
		
		if(node2.child==node1){
			
			node2.child=node1.rightSibling;
		}
		
		if(node2.degree==0){
			node2.child=null;
		}
		
		node1.leftSibling=maxNode;
		node1.rightSibling=maxNode.rightSibling;
		maxNode.rightSibling=node1;
		node1.rightSibling.leftSibling=node1;
		
		node1.parent=null;
		node1.mark=false;
		
	}
	
	protected void recursiveRemove(Node node){
		
		Node parent=node.parent;
		
		if(parent!=null){
			if(!node.mark){
				node.mark=true;
			}
			else{
				removeFromParent(node, parent);
				recursiveRemove(parent);
			}
		}
	}
	
	
	
	public Node removeMax()
	{
		//System.out.println("Remove Max START");
		Node initaialMax=maxNode;
		
		if(initaialMax!=null){
			int noOfChildren=initaialMax.degree;
			Node child=initaialMax.child;
			Node right;
			//System.out.println("Remove Max 1");
			while(noOfChildren>0)
			{
				right=child.rightSibling;
				
				child.leftSibling.rightSibling=child.rightSibling;
				child.rightSibling.leftSibling=child.leftSibling;
				
				child.leftSibling=maxNode;
				child.rightSibling=maxNode.rightSibling;
				maxNode.rightSibling=child;
				
				child.rightSibling.leftSibling=child;
				
				child.parent=null;
				child=right;
				noOfChildren--;
			}
			//System.out.println("Remove Max 2");
			
			initaialMax.leftSibling.rightSibling=initaialMax.rightSibling;
			initaialMax.rightSibling.leftSibling=initaialMax.leftSibling;
			
			//System.out.println("Remove Max 3");
			//if(initaialMax.rightSibling==null){
				
				if(initaialMax == initaialMax.rightSibling){
				
				maxNode=null;
			} else{
				maxNode=initaialMax.rightSibling;
				//System.out.println("Remove Max 4");
				meld();
				//System.out.println("Remove Max 5");
			}
			
			heapCount--;
			
		}
		//System.out.println("Remove Max END");
		return initaialMax;
	}
	
	public void splice(Node node1, Node node2)
	{
		
	}
	
	protected void meld(){
		//System.out.println("Meld START");
		int numOfRoots=0;
		int arraySize = ((int) Math.floor(Math.log(heapCount) * oneOverLogPhi)) + 1;
		
		List<Node> rootList= new ArrayList<Node>();
		
		for(int i=0; i <arraySize; i++){
			rootList.add(i,null);
		}
		
		Node initialMaxNode= maxNode;
		
		
		if(initialMaxNode!=null){
			numOfRoots++;
		    initialMaxNode=initialMaxNode.rightSibling;
		    //TODO initialMaxNode != null && 
		   // System.out.println("Meld while 2222222 START");
		    while(initialMaxNode!=maxNode){
		    	numOfRoots++;
		    	//System.out.println(initialMaxNode.getValue());
		    	initialMaxNode=initialMaxNode.rightSibling;
		    }
		   // System.out.println("Meld while 2222222 STOP");
		    /*if(initialMaxNode == null){
		    	//TODO 
		    	initialMaxNode= maxNode;
		    }*/
		}
		
		//System.out.println("Meld 1");
		
		while(numOfRoots>0){
			//System.out.println("While start");
			int degree=initialMaxNode.degree;
			Node nextNode=initialMaxNode.rightSibling;
			
			for(;;){
				//System.out.println("Meld for;; start");
				Node sameDegreeNode= rootList.get(degree);
				if(sameDegreeNode==null){
					
					break;
				}
				
				if(initialMaxNode.value < sameDegreeNode.value){
					
					Node temporary=sameDegreeNode;
					sameDegreeNode=initialMaxNode;
					initialMaxNode=temporary;
				}
				
				makeChild(initialMaxNode, sameDegreeNode);
				rootList.set(degree, null);
				degree++;
				//System.out.println("Meld for;; ENDS");
			}
			
			rootList.set(degree,initialMaxNode);
			
			initialMaxNode=nextNode;
			numOfRoots--;
		//	System.out.println("While STOP");
		}
		
		maxNode=null;
		//System.out.println("Meld 2");
		
		for(int i=0; i<arraySize; i++){
			Node node=rootList.get(i);
			if(node == null){
				continue;
			}
			
			if(maxNode!=null){
				
				node.leftSibling.rightSibling=node.rightSibling;
				node.rightSibling.leftSibling=node.leftSibling;
				
				node.leftSibling=maxNode;
				node.rightSibling=maxNode.rightSibling;
				maxNode.rightSibling=node;
				node.rightSibling.leftSibling=node;
				
				if(node.value>maxNode.value){
					maxNode=node;
				}
				
			}
			
			else{
				maxNode=node;
			}
		}
		
		//System.out.println("Meld ENDS");
		
	}
	
	protected void makeChild(Node node1, Node node2){
		
		node1.leftSibling.rightSibling=node1.rightSibling;
		node1.rightSibling.leftSibling=node1.leftSibling;
		
		node1.parent=node2;
		
		if(node2.child==null){
			node2.child=node1;
			node1.rightSibling=node1;
			node1.leftSibling=node1;
		}
		else
		{
			node1.leftSibling=node2.child;
			node1.rightSibling=node2.child.rightSibling;
			node2.child.rightSibling=node1;
			node1.rightSibling.leftSibling=node1;
		}
		
		node2.degree++;
		node1.mark=false;
	}
}

