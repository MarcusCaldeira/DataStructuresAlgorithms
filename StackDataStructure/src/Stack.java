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
        if(isFull()){
            System.out.println("this stack is already full");
        }else{
            top++;
            stackArray[top] = j;
        }
    }
    public long pop(){
        if(isEmpty()){
            System.out.println("the stack is already empty");
            return -1;
        }else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
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
