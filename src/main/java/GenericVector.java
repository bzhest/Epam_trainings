public class GenericVector<E> {

    private Object [] data = new Object[2];
    private int size = 0;

    private E getLast() {
        return (E) data[size-1];

    }

    private E get(int i) {
        return (E)data[i];
    }

    private int size() {
        return this.size;
    }

    private void add(E s) {
        if(data.length <= size){
            Object [] temp = data;
            data = new Object[size * 2];
            for(int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
        data[size] = s;
        size++;
    }




    public static void main(String[] args) {
        GenericVector<String> genericVector = new GenericVector<>();
        genericVector.add("1");
        genericVector.add("2");
        genericVector.add("Lenka");
        genericVector.add("Selenium");

        System.out.println(genericVector.get(2));
        System.out.println(genericVector.getLast());
        System.out.println(genericVector.size());


        GenericVector<Integer> genericVector2 = new GenericVector<>();
        genericVector2.add(1);
        genericVector2.add(2);
        genericVector2.add(5);
        genericVector2.add(6);

        System.out.println(genericVector2.get(2));
        System.out.println(genericVector2.getLast());
        System.out.println(genericVector2.size());
    }
}
