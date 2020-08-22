package collections.sorting;

public class ComparableStudent implements Comparable<ComparableStudent> {
    String name;

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ComparableStudent o) {
        int result = this.name.compareTo(o.getName());
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else return 0;
    }
}
