
public class BinaryTreeNode<T> {

	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	private T data;

	public BinaryTreeNode() {
		this (null, null, null);
	}

	public BinaryTreeNode(T theData) {
		this (theData, null, null);
	}

	public BinaryTreeNode(T theData, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild) {
		data = theData;
		left = leftChild;
		right = rightChild;
	}

	public int size() {
		int size = 0; //the size of the tree

		//The size of the tree rooted at this node is one more than the
		//sum of the sizes of its children.
		if (left != null) {
			size = size + left.size();
		}

		if (right != null) {
			size = size + right.size();
		}

		//add one to account for the current node
		return size + 1;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> deepCopy() {
		BinaryTreeNode<T> l = null;
		BinaryTreeNode<T> r = null;

		if (this.left != null) {
			l = this.left.deepCopy();
		}

		if (this.right != null) {
			r = this.right.deepCopy();
		}

		return new BinaryTreeNode<T>(data, l, r);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (o == null || !(o instanceof BinaryTreeNode<?>)) {
			return false;
		}
		
		return equals(this, this.getClass().cast(o));
	}

	public boolean equals(BinaryTreeNode<T> root1, BinaryTreeNode<T> root2) {
		if (root1 == root2) {
			return true;
		}
		
		if (root1 == null || root2 == null) {
			return false;
		}

		return root1.getData().equals(root2.getData()) && equals(root1.getLeft(), root2.getLeft()) && equals(root1.getRight(), root2.getRight());
	}

	public int height() {
		if (data == null) {
			return 0;
		}

		return 1 + Math.max((left == null ? 0 : left.height()), (right == null ? 0 : right.height()));
	}

	public boolean full() {
		return (this.size() == Math.pow(2d, (double) this.height()) - 1);
	}

	public void mirror() {
		BinaryTreeNode<T> t = left;
		left = right;
		right = t;

		if (right != null) {
			right.mirror();
		}

		if (left != null) {
			left.mirror();
		}
	}

	public String inOrder() {
		if (data == null) {
			return "";
		}

		String r = "";
		r += (left == null ? "" : left.inOrder());

		r += "(" + data + ")";

		r += (right == null ? "" : right.inOrder());

		return r;
	}

}

