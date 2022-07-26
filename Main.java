package arrDynamic;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        for (int i = 1; i < 7; i++) {
            array.append(i);
        }
        //array.remove(5);

        System.out.println(array.toString());

        array.insert(3,33);
        System.out.println(array.toString());

        array.insert(4,333);
        System.out.println(array.toString());

        array.insert(1,111);
        System.out.println(array.toString());

        array.remove(1);
        array.remove(3);
        array.remove(3);
        System.out.println(array.toString());

        array.insert(7,111);
        System.out.println(array.toString());

        array.append(222);
        System.out.println(array.toString());
    }
}



