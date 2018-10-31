package com.farafon.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Tree {

    Node node;

    public int count(String element) {
        return node.count(element);
    }

    public void add(Node node) {
        this.node = node;
    }

    public Node head() {
        return node;
    }

    public void printPath(String... elements) {
        Collection<Node> finalList = new HashSet<>();
        printPath(finalList, node, 0, elements);
        for (Node node1 : finalList) {
            System.out.println(node1);
        }

    }

    public void printPath(Collection<Node> finalList, Node head, int index, String... elements) {
        String start = elements[index];
        Collection<Node> startNodes = new HashSet<>();
        head.find(start, startNodes);
        for (Node startNode : startNodes) {
            for (int i = index + 1; i < elements.length; i++) {
                System.out.println("Looking for " + elements[i]);
                Collection<Node> found = new HashSet<>();
                startNode.find(elements[i], found);
                if (i < elements.length - 1) {
                    for (Node node1 : found) {
                        printPath(finalList, node1, i, elements);
                    }
                } else {
                    (finalList).addAll(found);
                }

            }
        }



    }
}
