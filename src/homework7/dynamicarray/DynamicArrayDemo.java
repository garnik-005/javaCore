package homework7.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i + 1);
        }
        dynamicArray.print();

        for (int i = 0; i < 15; i++) {
            dynamicArray.add(i + 1);

        }
        System.out.println(dynamicArray.getByIndex(10));
        dynamicArray.print();
        for (int i = 0; i < 40; i++) {
            dynamicArray.add(i+1);

        }
        dynamicArray.print();
        System.out.println(dynamicArray.getByIndex(0));
        System.out.println(dynamicArray.getByIndex(dynamicArray.getSize()-1));
        System.out.println(dynamicArray.getByIndex(-1));
        System.out.println(dynamicArray.getByIndex(dynamicArray.getSize()+1));
        DynamicArray emptyArray = new DynamicArray();
        System.out.println(emptyArray.getByIndex(0));
    }

}
