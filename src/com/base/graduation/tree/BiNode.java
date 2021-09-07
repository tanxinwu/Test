package com.base.graduation.tree;

public class BiNode {

	private int data;
	private BiNode lchild;
	private BiNode rchild;
	
	public BiNode(int data, BiNode lchild, BiNode rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BiNode getLchild() {
		return lchild;
	}
	public void setLchild(BiNode lchild) {
		this.lchild = lchild;
	}
	public BiNode getRchild() {
		return rchild;
	}
	public void setRchild(BiNode rchild) {
		this.rchild = rchild;
	}
	
}
