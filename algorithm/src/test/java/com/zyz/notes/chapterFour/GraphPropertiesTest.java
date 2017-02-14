package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2017/2/14.
 */
public class GraphPropertiesTest {
	private GraphProperties GP;

	@Before
	public void setUp() throws Exception {
		GP = new GraphProperties(new Graph(new In("E:\\winterVacation2016\\algorithm\\src\\main\\resources\\Q4112.txt")));
	}

	@Test
	public void eccentricity() throws Exception {
		assertEquals(3, GP.eccentricity(1));
	}

	@Test
	public void diameter() throws Exception {
		assertEquals(4, GP.diameter());
	}

	@Test
	public void radius() throws Exception {
		assertEquals(2, GP.radius());
	}

	@Test
	public void center() throws Exception {
		assertEquals(0, GP.center());
	}

}