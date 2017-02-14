package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.Graph;

/**
 * Created by ZhangYuanzhuo on 2017/2/14.
 */
public class GraphProperties {
	private static final int INFINITY = Integer.MAX_VALUE;

	private final int s = 0;
	private int eccentricities[];

	public GraphProperties(Graph G) {
		DepthFirstSearch search = new DepthFirstSearch(G, s);
		if (search.count() != G.V()) {
			throw new IllegalArgumentException("G is not connected");
		}
		eccentricities = new int[G.V()];

		int temp;
		BreadthFirstPaths paths;
		for (int v = 0; v < G.V(); v++) {
			paths = new BreadthFirstPaths(G, v);
			for (int w = 0; w < G.V(); w++) {
				if ((temp = paths.distTo(w)) > eccentricities[v]) {
					eccentricities[v] = temp;
				}
			}
		}
	}

	public int eccentricity(int v) {
		return eccentricities[v];
	}

	public int diameter() {
		int	max = 0;
		for (int e : eccentricities) {
			if (max < e) {
				max = e;
			}
		}
		return max;
	}

	public int radius() {
		int	min = INFINITY;
		for (int e : eccentricities) {
			if (min > e) {
				min = e;
			}
		}
		return min;
	}

	public int center() {
		int center = 0;
		int	min = INFINITY;
		for (int i = 0; i < eccentricities.length; i++) {
			int e = eccentricities[i];
			if (min > e) {
				min = e;
				center = i;
			}
		}
		return center;
	}
}
