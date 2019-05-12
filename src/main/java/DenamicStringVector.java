public class DenamicStringVector {

    private String [] data = new String[2];
    private int size = 0;

    public static void main(String[] args) {
        DenamicStringVector denamicStringVector = new DenamicStringVector();
        denamicStringVector.add("1");
        denamicStringVector.add("2");
        denamicStringVector.add("Lenka");
        denamicStringVector.add("3");

        System.out.println(denamicStringVector.get(2));
        System.out.println(denamicStringVector.getLast());
        System.out.println(denamicStringVector.size());
    }

    private String getLast() {
        return data[data.length-1];

    }

    private String get(int i) {
        return data[i];
    }

    private int size() {
        return this.size;
    }

    private void add(String s) {
        if(data.length <= size){
            String [] temp = data;
            data = new String[size * 2];
            for(int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
        data[size] = s;
        size++;
    }
}
