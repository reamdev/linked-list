package org.ream.objects;

import java.util.Objects;

public class LinkedList<T> {
    private LinearNode<T> root;

    public LinkedList() {
        this.root = null;
    }

    LinkedList(LinearNode<T> root) {
        this.root = root;
    }

    // Add node, this node added at the end
    public void add(T value) {
        LinearNode<T> linearNode = new LinearNode<T>(value); // Create new node

        if(this.root == null) {
            this.root = linearNode;
            return;
        }

        LinearNode<T> e = this.root;
        while(e.next != null) {
            e = e.next;
        }

        e.next = linearNode;
    }

    // Add node to beginning
    public void unShift(T value) {
        LinearNode<T> linearNode = new LinearNode<T>(value);

        if (this.root != null) {
            linearNode.next = this.root;
        }
        this.root = linearNode;
    }

    public boolean remove(String value) {
        LinearNode<T> prevLinearNode = null; // Previous node
        LinearNode<T> current = this.root; // Current node

        // Remove the root node
        if (Objects.equals(current.value, value)) {
            this.root = this.root.next;
            return true;
        }

        // Find node to delete and save the previous node
        while (current != null && current.value != value) {
            prevLinearNode = current;
            current = current.next;
        }

        // Check if the node exists
        if (current == null) return false;

        Objects.requireNonNull(prevLinearNode).next = current.next;
        return true;
    }

    public void printValues() {
        LinearNode<T> e = this.root;
        while (e != null) {
            System.out.println(e.value);
            e = e.next;
        }
    }
}
