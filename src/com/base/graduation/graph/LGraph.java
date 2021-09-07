package com.base.graduation.graph;

public class LGraph {
	private VNode[] vertices;
	private  int vexnum;
	private int arcnum;
	
	public LGraph(VNode[] vertices, int vexnum, int arcnum) {
		super();
		this.vertices = vertices;
		this.vexnum = vexnum;
		this.arcnum = arcnum;
	}
	public VNode[] getVertices() {
		return vertices;
	}
	public void setVertices(VNode[] vertices) {
		this.vertices = vertices;
	}
	public int getVexnum() {
		return vexnum;
	}
	public void setVexnum(int vexnum) {
		this.vexnum = vexnum;
	}
	public int getArcnum() {
		return arcnum;
	}
	public void setArcnum(int arcnum) {
		this.arcnum = arcnum;
	}
	
	
}
