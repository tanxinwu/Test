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
	 * �������������
	 * ������ڵ���null��ʾ�Ҳ���
	 * ������ڵ��������һ�������ڵ���������������
	 * ���һ���ڵ�����������һ���ڵ��������������ڵ���������������
	 * ��������ڵ㶼�����������������Ⱦ���������
	 * ��������ڵ㶼�����������������Ⱦ���������
	 * 
	 * 
	 * @param root ���ڵ�
	 * @param node1 һ���ڵ�
	 * @param node2 ��һ���ڵ�
	 * @return
	 */
	public static BiNode findCommonAncester(BiNode root,BiNode node1,BiNode node2) {
		// ������ڵ��ǿձ�ʾ�����۲�����
		if (root == null || node1 == null ||node2 == null ) {
			return null;
		}
		//��� ���ڵ�ǡ��������һ���ڵ��ʾ���ڵ�����������
		if (root.getData() == node1.getData() ||root.getData() == node2.getData()) {
			return root;
		}
		
		//������ڵ㲻��������ȣ�ȥ��������
		BiNode leftAnc = findCommonAncester(root.getLchild(), node1, node2);
		//������ڵ㲻��������ȣ�ȥ��������
		BiNode rightAnc = findCommonAncester(root.getRchild(), node1, node2);
		//��������������ҵ�һ���ڵ��ʾroot�������������
		if (leftAnc!=null && rightAnc!= null ) {
			return root;
		}
		//���ֻ�������������������ҵ������ڵ㣬����Ĺ������Ⱦ�������������������
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
