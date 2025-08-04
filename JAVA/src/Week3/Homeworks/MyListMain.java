package Week3.Homeworks;

public class MyListMain {
    public static class MyList<T> {
        private T[] array;
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;

        public MyList() {
            array = (T[]) new Object[DEFAULT_CAPACITY];
        }
        public MyList(int capacity) {
            if (capacity < 0) {
                throw new IllegalArgumentException("Kapasite negatif olamaz.");
            }
            array = (T[]) new Object[capacity];
        }
        public int size() {
            return size;
        }
        public int getCapacity() {
            return array.length;
        }
        public void add(T data) {
            if (size == array.length) {
                increaseCapacity();
            }
            array[size++] = data;
        }
        private void increaseCapacity() {
            int newCapacity = array.length * 2;
            T[] newArray = (T[]) new Object[newCapacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
    }
}