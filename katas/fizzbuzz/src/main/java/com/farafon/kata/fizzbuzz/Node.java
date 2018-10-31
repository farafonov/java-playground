package com.farafon.kata.fizzbuzz;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Node {

    private Set<String> elements = new HashSet<>();
    private Set<Node> children = new HashSet<>();

    public Node(String... elements) {
        for (String element : elements) {
            this.elements.add(element);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(elements, node.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }

    public void add(Node node) {
        children.add(node);
    }

    public int count(String element) {
        int count = elements.contains(element) ? 1 : 0;
        for (Node child : children) {
            count += child.count(element);
        }
        return count;
    }

    public void find(String start, Collection<Node> foundNodes) {
        if (elements.contains(start)) {
            foundNodes.add(this);
        }
        for (Node child : children) {
            child.find(start, foundNodes);
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "elements=" + elements +
                '}';
    }
}
