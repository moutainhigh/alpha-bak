package com.geektcp.alpha.algorithm.tree.tree;//package com.haizhi.graph.server.arango.search.tree;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by tanghaiyang on 2019/4/11.
// */
//
//public class Node {
//    private String text;
//    private List<Node> childList;
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public List<Node> getChildList() {
//        return childList;
//    }
//
//    public void setChildList(List<Node> childList) {
//        this.childList = childList;
//    }
//
//    public static Node getInitNode() {
//        Node nodeA = new Node();
//        nodeA.setText("A");
//        Node nodeB = new Node();
//        nodeB.setText("B");
//        Node nodeC = new Node();
//        nodeC.setText("C");
//        Node nodeD = new Node();
//        nodeD.setText("D");
//        Node nodeE = new Node();
//        nodeE.setText("E");
//
//        List<Node> lstB = new ArrayList();
//        lstB.add(nodeC);
//        lstB.add(nodeD);
//        nodeB.setChildList(lstB);
//
//        List<Node> lstA = new ArrayList();
//        lstA.add(nodeB);
//        lstA.add(nodeE);
//        nodeA.setChildList(lstA);
//        return nodeA;
//
//    }
//
//}