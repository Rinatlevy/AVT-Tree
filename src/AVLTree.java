/**
 *
 * AVLTree
 *
 * An implementation of aמ AVL Tree with
 * distinct integer keys and info.
 *
 */

public class AVLTree {

	private IAVLNode root;
	private IAVLNode min;
	private IAVLNode max;
	private int size;

  /**
   * public boolean empty()
   *
   * Returns true if and only if the tree is empty.
   *
   */
  public boolean empty() {
    return root == null; // to be replaced by student code
  }

 /**
   * public String search(int k)
   *
   * Returns the info of an item with key k if it exists in the tree.
   * otherwise, returns null.
   */
 public String rec_search(IAVLNode node, int k){
 	if(!node.isRealNode()){
 		return null;
	}
	if(k== node.getKey()){
		return node.getValue();
	}
	if (k < node.getKey()){
		return rec_search(node.getLeft(),k);
	}
	else {
		return rec_search(node.getRight(),k);
	}
 }
  public String search(int k) {
  	 return rec_search(this.getRoot(),k);
  }

  /**
   * public int insert(int k, String i)
   *
   * Inserts an item with key k and info i to the AVL tree.
   * The tree must remain valid, i.e. keep its invariants.
   * Returns the number of re-balancing operations, or 0 if no re-balancing operations were necessary.
   * A promotion/rotation counts as one re-balance operation, double-rotation is counted as 2.
   * Returns -1 if an item with key k already exists in the tree.
   */



   public int insert(int k, String i) {
	  return 420;	// to be replaced by student code
   }

  /**
   * public int delete(int k)
   *
   * Deletes an item with key k from the binary tree, if it is there.
   * The tree must remain valid, i.e. keep its invariants.
   * Returns the number of re-balancing operations, or 0 if no re-balancing operations were necessary.
   * A promotion/rotation counts as one re-balance operation, double-rotation is counted as 2.
   * Returns -1 if an item with key k was not found in the tree.
   */
   public int delete(int k)
   {
	   return 421;	// to be replaced by student code
   }

   /**
    * public String min()
    *
    * Returns the info of the item with the smallest key in the tree,
    * or null if the tree is empty.
    */

   public String min_help(){
	   IAVLNode parent = root;
	   if (this.empty()){
		   return null;
	   }
	   IAVLNode left = root.getLeft();
	   while(left.isRealNode()){
		   parent = left;
		   left = left.getLeft();
	   }
	   return parent.getValue();

   }
   public String min() {
   	return this.min.getValue();

   }

   /**
    * public String max()
    *
    * Returns the info of the item with the largest key in the tree,
    * or null if the tree is empty.
    */
   public String max()
   {
   	return this.max.getValue();

   }

	public String max_help() {
		IAVLNode parent = this.getRoot();
		if (this.empty()){
			return null;
		}
		IAVLNode right = parent.getRight();
		while(right.isRealNode()){
			parent = right;
			right = right.getRight();
		}
		return parent.getValue(); // to be replaced by student code
	}

  /**
   * public int[] keysToArray()
   *
   * Returns a sorted array which contains all keys in the tree,
   * or an empty array if the tree is empty.
   */

  public IAVLNode[] inorder(){
  	root = this.getRoot();

  }
  public int[] keysToArray()
  {
        return new int[33]; // to be replaced by student code
  }

  /**
   * public String[] infoToArray()
   *
   * Returns an array which contains all info in the tree,
   * sorted by their respective keys,
   * or an empty array if the tree is empty.
   */
  public String[] infoToArray()
  {
        return new String[55]; // to be replaced by student code
  }

   /**
    * public int size()
    *
    * Returns the number of nodes in the tree.
    */
   public int size()
   {
	   return this.size; // to be replaced by student code
   }
   
   /**
    * public int getRoot()
    *
    * Returns the root AVL node, or null if the tree is empty
    */
   public IAVLNode getRoot()
   {
	   return this.root;
   }
   
   /**
    * public AVLTree[] split(int x)
    *
    * splits the tree into 2 trees according to the key x. 
    * Returns an array [t1, t2] with two AVL trees. keys(t1) < x < keys(t2).
    * 
	* precondition: search(x) != null (i.e. you can also assume that the tree is not empty)
    * postcondition: none
    */   
   public AVLTree[] split(int x)
   {
	   return null; 
   }
   
   /**
    * public int join(IAVLNode x, AVLTree t)
    *
    * joins t and x with the tree. 	
    * Returns the complexity of the operation (|tree.rank - t.rank| + 1).
	*
	* precondition: keys(t) < x < keys() or keys(t) > x > keys(). t/tree might be empty (rank = -1).
    * postcondition: none
    */   
   public int join(IAVLNode x, AVLTree t)
   {
	   return -1;
   }

	/** 
	 * public interface IAVLNode
	 * ! Do not delete or modify this - otherwise all tests will fail !
	 */
	public interface IAVLNode{	
		public int getKey(); // Returns node's key (for virtual node return -1).
		public String getValue(); // Returns node's value [info], for virtual node returns null.
		public void setLeft(IAVLNode node); // Sets left child.
		public IAVLNode getLeft(); // Returns left child, if there is no left child returns null.
		public void setRight(IAVLNode node); // Sets right child.
		public IAVLNode getRight(); // Returns right child, if there is no right child return null.
		public void setParent(IAVLNode node); // Sets parent.
		public IAVLNode getParent(); // Returns the parent, if there is no parent return null.
		public boolean isRealNode(); // Returns True if this is a non-virtual AVL node.
    	public void setHeight(int height); // Sets the height of the node.
    	public int getHeight(); // Returns the height of the node (-1 for virtual nodes).
	}

   /** 
    * public class AVLNode
    *
    * If you wish to implement classes other than AVLTree
    * (for example AVLNode), do it in this file, not in another file. 
    * 
    * This class can and MUST be modified (It must implement IAVLNode).
    */
  public class AVLNode implements IAVLNode{
  		private String info;
  		private int key = -1;
  		private IAVLNode parent;
  		private IAVLNode left;
  		private IAVLNode right;
  		private int height;
		public int getKey()
		{
			return this.key; // to be replaced by student code
		}
		public String getValue() {
			if (isRealNode()){
				return this.info; // to be replaced by student code
			} return null;
		}
		public void setLeft(IAVLNode node)
		{
			this.left = node; // to be replaced by student code
		}
		public IAVLNode getLeft()
		{
			return this.left; // to be replaced by student code
		}
		public void setRight(IAVLNode node)
		{
			this.right = node; // to be replaced by student code
		}
		public IAVLNode getRight()
		{
			return this.right; // to be replaced by student code
		}
		public void setParent(IAVLNode node)
		{
			this.parent=node; // to be replaced by student code
		}
		public IAVLNode getParent()
		{
			return this.parent; // to be replaced by student code
		}
		public boolean isRealNode()
		{
			return this.key!=-1; // to be replaced by student code
		}
	    public void setHeight(int height)
	    {
	       this.height = height; // to be replaced by student code
	    }
	    public int getHeight()
	    {
	      return this.getHeight(); // to be replaced by student code
	    }
  }

}
  
