package com.farafon.kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {

    private Tree tree = new Tree();

    @Before
    public void setupTree() throws Exception {
        tree.add(new Node("apple"));
        tree.head().add(new Node("cat", "dog"));
        Node box = new Node("box");
        Node cat_b = new Node("cat", "b");
        box.add(cat_b);
        box.add(new Node("apple", "b"));
        cat_b.add(new Node("b"));
        cat_b.add(new Node("bear"));
        cat_b.add(new Node("dog"));

        tree.head().add(box);

    }

    @Test
    public void testCountCat() {
        int result = tree.count("cat");
        Assert.assertEquals(2, result);
    }

    @Test
    public void printPathAppleCat() {
        tree.printPath("apple", "cat");
    }

    @Test
    public void printPathBOnly() {
        tree.printPath("apple", "b");
    }

    @Test
    public void printPath() {
        tree.printPath("apple", "cat", "b");
    }
}
