package org.ream.objects;

public class LinearNode<T> {
    public LinearNode<T> next = null;
    public T value;

    LinearNode(T value) {
        this.value = value;
    }

    LinearNode(T value, LinearNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
