public class Stack {

    private int maxSize;
    private long [] stackArray;
    //will represent the last item placed on top of the stack.
    private int top;


    public Stack(int Size) {
        this.maxSize = Size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }
    public void push(long j){
        top++;
        stackArray[top] = j;
    }
    public long pop(){
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }
    public long peak(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (maxSize -1 == top);
    }


}
