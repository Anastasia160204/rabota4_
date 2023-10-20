package org.example;

import java.util.ArrayList;
import java.util.List;

public class BananaBox  {
    private List<Banana> list;

    public BananaBox() {
        this.list = new ArrayList<>();
    }

    public List<Banana> getList() {
        return this.list;
    }

    public void add(Banana banana) {
        list.add(banana);
    }

    public float getWeight() {
        float weight = 0;
        for (Banana item : list) {
            weight += item.getWeight();
        }
        return weight;
    }
    void moveTo(BananaBox box) {
        if (box != this) {
            box.getList().addAll(list);
            list.clear();
        }
    }

    public boolean compare(BananaBox otherBox) {
            BananaBox otherBananaBox = (BananaBox) otherBox;
            return Math.abs(this.getWeight() - otherBananaBox.getWeight()) < 0.0001;

    }

    void printBox() {
        if (list.isEmpty()) {
            System.out.println("Коробка  пуста");
        } else {
            for (Banana b : list) {
                System.out.println(b);
            }
        }
    }
}