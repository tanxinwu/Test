package com.base.graduation.graph;

public class ArcNode {

	private int adjvex;
	private ArcNode nextarc;
	public ArcNode(int adjvex, ArcNode nextarc) {
		super();
		this.adjvex = adjvex;
		this.nextarc = nextarc;
	}
	public int getAdjvex() {
		return adjvex;
	}
	public void setAdjvex(int adjvex) {
		this.adjvex = adjvex;
	}
	public ArcNode getNextarc() {
		return nextarc;
	}
	public void setNextarc(ArcNode nextarc) {
		this.nextarc = nextarc;
	}
	
}
