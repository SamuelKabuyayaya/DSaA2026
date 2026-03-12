package SamuelKabuya_COMP254Lab4_Ex1;

public class PositionList<E> extends PositionalList<E> {
    public int indexOf(Position<E> p) {
        int index = 0;
        Position<E> walk = first();

        while (walk != null) {
            if (walk == p) {
                return index;
            }
            walk = after(walk);
            index++;
        }
        return -1;
    }


    public static void main(String[] args) {
        PositionList<String> list = new PositionList<>();

        list.addLast("Apple");
        Position<String> target = list.addLast("C");
        list.addLast("Cherry");
        list.addLast("Date");

        int index = list.indexOf(target);
        System.out.println("Target: " + index);

        Position<String> firstPos = list.first();
        System.out.println("Index of the first element in the list: " + list.indexOf(firstPos));

        Position<String> lastPos = list.last();
        System.out.println("Index of the last element in the list: " + list.indexOf(lastPos));

    }
}

