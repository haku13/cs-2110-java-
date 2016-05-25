public class BinaryTree<T> {

	private BinaryTreeNode<T> root;

	public BinaryTree() {
		this(null);
	}

	public BinaryTree(BinaryTreeNode<T> newRoot) {
		this.root = newRoot;
	}

	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o) {
		if (o instanceof BinaryTree<?>) {
			BinaryTree<T> ob = this.getClass().cast(o);
			
			if (ob.getRoot() != null) {
				return ob.getRoot().equals(this.getRoot());
			}
		}
		
		return false;
	}

	public BinaryTree<T> deepCopy() {
		BinaryTree<T> copy = new BinaryTree<T>();

		if (this.root != null) {
			copy.setRoot(this.root.deepCopy());
		}

		return copy;
	}

	public BinaryTree<T> combine(BinaryTreeNode<T> newRoot, BinaryTree<T> t, boolean left) {
		if (newRoot == null) {
			return null;
		}

		BinaryTree<T> r = new BinaryTree<T>();
		r.setRoot(newRoot);
		if (left) {
			r.root.setLeft(newRoot);
			r.combine(r.root.getRight(), r, left);
		} else {
			r.root.setRight(newRoot);
			r.combine(r.root.getLeft(), r, left);
		}

		return r.deepCopy();
	}

	public int size() {
		if (root == null) {
			return 0;
		}
		
		return root.size();
	}

	public int height() {
		if (root == null) {
			return 0;
		}
		
		return root.height();
	}

	public boolean full() {
		if (root == null) {
			return false;
		}
		
		return root.full();
	}

	public void mirror() {
		if (root != null) {
			BinaryTreeNode<T> t = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(t);
			
			root.getRight().mirror();
			root.getLeft().mirror();
		}
	}

	public String inOrder() {
		if (root == null) {
			return "";
		}
		
		return root.inOrder();
	}
}

