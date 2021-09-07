package com.base.graduation.graph;

public class Test {

	private static int sum= 0;
	private static boolean[] vis = new boolean[6];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VNode[] vertices = new VNode[6];
		for (int i = 0; i < vertices.length; i++) {
			if (i < vertices.length -1 ) {				
				ArcNode firstarc = new ArcNode(i+1, null);
				vertices[i] = new VNode(i+1, firstarc);				
			}else {
				vertices[i] = new VNode(i+1, null);		
			}
			ArcNode p = vertices[i].getFirstarc();
			int j = i + 1;
			while (j < vertices.length-1) {
				ArcNode nextArcNode = new ArcNode(j+1, null);
				p.setNextarc(nextArcNode);
				p = p.getNextarc();
				j ++;
			}	
			
		}
		LGraph graph = new LGraph(vertices, vertices.length, 15);
		int[] path = new int[6];
		countpath(graph, 3, 5, path, 0);
		System.out.println(sum);
	}

	public static void  countpath(LGraph graph,int s,int t, int path[],int depth) {
		path[depth++] = s;//s先入路径
		if (s == t) {
			sum ++; //总的路径数
			//输出路径中的节点
			for (int i = 0; i < path.length; i++) {
				if (path[i] != 0 ) {					
					System.out.print(path[i]+"\t");
				}
			}
			System.out.println();
			return;
			
		}
		
		vis[s] = true;
		//深度遍历
		for (ArcNode p = graph.getVertices()[s].getFirstarc();p!=null;p = p.getNextarc()) {
			int v = p.getAdjvex();
			if (!vis[v]) {
				countpath(graph, v, t, path, depth);
			}
		}
		vis[s] = false;
	}
}
