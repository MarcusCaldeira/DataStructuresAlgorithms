public class Stack {

    private int maxSize;
    private char[] stackArray;
    //will represent the last item placed on top of the stack.
    private int top;


    public Stack(int Size) {
        this.maxSize = Size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    public void push(char j){
        if(isFull()){
            System.out.println("this stack is already full");
        }else{
            top++;
            stackArray[top] = j;
        }
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("the stack is already empty");
            return 0;
        }else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }
    public char peak(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (maxSize -1 == top);
    }


}
