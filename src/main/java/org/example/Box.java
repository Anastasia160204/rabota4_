package org.example;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends ComparableFruit> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return this.list;
    }

    public void add(T fruit) {
        list.add(fruit);
    }


    void moveTo(Box<T> box) {
        if (box.getClass() == this.getClass()) {
            box.getList().addAll(list);
            list.clear();
        } else {
            System.out.println("нельзя перенести в эту же коробку.");
        }
    }

    float getWeight() {
        float weight = 0;
        for (T item : list) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }


    void printBox() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            for (T t : list) {
                System.out.println(t);
            }
        }
    }
}