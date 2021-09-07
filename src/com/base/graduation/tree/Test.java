package com.base.graduation.tree;

public class Test {

	
	public static void main(String[] args) {
		int[] datas = {23,435,56,3323,12,4,2,1,3,4566,77,88,99,557};
		
		BiNode rootNode = new BiNode(datas[0], null, null);
		for (int i = 1; i < datas.length; i++) {
			
			crateNode(rootNode,datas[i]);
			
		}
	 BiNode ancesterBiNode = 	findCommonAncester(rootNode, new BiNode(3,null,null), new BiNode(1, null, null));
			System.out.println(ancesterBiNode);
	}
	/**
	 * 找最近公共祖先
	 * 如果根节点是null表示找不到
	 * 如果根节点就是其中一个，根节点就是最近公共祖先
	 * 如果一个节点在左子树，一个节点在右子树，根节点就是最近公共祖先
	 * 如果两个节点都在左子树，公共祖先就是左子树
	 * 如果两个节点都在右子树，公共祖先就是右子树
	 * 
	 * 
	 * @param root 根节点
	 * @param node1 一个节点
	 * @param node2 另一个节点
	 * @return
	 */
	public static BiNode findCommonAncester(BiNode root,BiNode node1,BiNode node2) {
		// 如果跟节点是空表示，结论不存在
		if (root == null || node1 == null ||node2 == null ) {
			return null;
		}
		//如果 根节点恰好是其中一个节点表示根节点就是最近祖先
		if (root.getData() == node1.getData() ||root.getData() == node2.getData()) {
			return root;
		}
		
		//如果根节点不是最近祖先，去左子树找
		BiNode leftAnc = findCommonAncester(root.getLchild(), node1, node2);
		//如果根节点不是最近祖先，去右子树找
		BiNode rightAnc = findCommonAncester(root.getRchild(), node1, node2);
		//如果左右子树都找到一个节点表示root是最近公共祖先
		if (leftAnc!=null && rightAnc!= null ) {
			return root;
		}
		//如果只在左子树或者右子树找到两个节点，最近的公共祖先就是左子树或者右子树
		return leftAnc != null ? leftAnc : rightAnc;
	}
	

	private static BiNode crateNode(BiNode rootNode, int i) {
		// TODO Auto-generated method stub
		if (rootNode == null ) {
			rootNode = new BiNode(i, null, null);
			return rootNode;
		}
		if (rootNode.getData() < i) {
			rootNode.setRchild(crateNode(rootNode.getRchild(),i));
			return rootNode;
		}
		if (rootNode.getData() >i ) {
			rootNode.setLchild(crateNode(rootNode.getLchild(), i));
			return rootNode;
		}
		return null;
	}

}
