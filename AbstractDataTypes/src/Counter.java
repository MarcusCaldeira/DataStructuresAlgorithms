public class Counter {
    private String name;
    private int value;

    //Constructor
    public Counter(String name) {
        this.name = name;
    }
    public void increment(){
        value++;
    }
    public int getCurrentValue(){
        return value;
    }
    public String toString(){
        return name + ": " + value;
    }



}
