package tree;

import java.util.Scanner;

public class CreateBiTree {
	public static TNode Create(TNode root) {
		Scanner in = new Scanner(System.in);
		char element = in.nextLine().charAt(0);
		if(element != ' ') {
			root = new TNode();
			root.data = element;
			root.left = Create(root.left);
			root.right = Create(root.right);
		}else {
			root = null;
		}
		return root;
	}
	public static void PreOrder(TNode root) {
		if(root != null) {
			System.out.print(root.data+" ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	public static void main(String[] args) {
		BiTree tree = new BiTree();
		tree.root = Create(tree.root);
		PreOrder(tree.root);
	}

}
class TNode {
	public char data;
	public  TNode left;
	public TNode right;
}

class BiTree {
	TNode root;
	public BiTree() {
		this.root = null;
	}
}