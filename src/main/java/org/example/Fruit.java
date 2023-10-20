

package org.example;

public abstract class Fruit implements ComparableFruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return this.weight;
    }
}
