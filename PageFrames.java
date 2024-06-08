package com.example.pageframes;

import java.util.LinkedList;

public class PageFrames {
    private LinkedList<Integer> frames;
    private int capacity;

    public PageFrames(int capacity) {
        this.frames = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean contains(int page) {
        return frames.contains(page);
    }

    public boolean isFull() {
        return frames.size() == capacity;
    }

    public void replace(int page) {
        if (isFull()) {
            frames.removeFirst();
        }
        frames.addLast(page);
    }

    public void remove(int page) {
        frames.removeFirstOccurrence(page);
    }
}
