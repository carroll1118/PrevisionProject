package com.sxt.sys.utils;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeBuilder {

	/**
	 * 把简单的集合转成有层级关系的集合
	 * 
	 * @param nodes
	 * @param topPid
	 * @return
	 */
	public static List<TreeNode> builder(List<TreeNode> nodes, Integer topPid) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		for (TreeNode n1 : nodes) {
			if (n1.getPid() == topPid) {
				treeNodes.add(n1);
			}
			for (TreeNode n2 : nodes) {
				if (n2.getPid() == n1.getId()) {
					n1.getChildren().add(n2);
				}
			}
		}
		return treeNodes;
	}
}
