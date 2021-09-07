package com.base.graduation.graph;

public class VNode {

	private Integer data;
	private ArcNode firstarc;
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public ArcNode getFirstarc() {
		return firstarc;
	}
	public void setFirstarc(ArcNode firstarc) {
		this.firstarc = firstarc;
	}
	public VNode(Integer data, ArcNode firstarc) {
		super();
		this.data = data;
		this.firstarc = firstarc;
	}
	
	
}
