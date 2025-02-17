package kyu7;

import java.util.Comparator;

public class HerdingCats implements Comparator<HerdingCats.Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Double.compare(cat1.weight, cat2.weight);
    }

    static class Cat implements Comparable<Cat> {

        public String name;
        public double weight;

        Cat(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public int compareTo(Cat o) {
            return Double.compare(this.weight, o.weight);
        }
    }

}
