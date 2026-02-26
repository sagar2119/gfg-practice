import java.util.*;
class myStack {
    int arr[];
    int top;
    int capacity;
    public myStack(int n) {
        // Define Data Structures
        capacity=n;
        arr=new int[n];
        top =-1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top==-1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top ==capacity-1;
    }

    public void push(int x) {
        if(!isFull()){
            arr[++top] =x;
        }
        // Inserts x at the top of the stack
    }

    public void pop() {
        if(!isEmpty()){
            top--;
        }
        // Removes an element from the top of the stack
    }

    public int peek() {
        if(isEmpty()) return -1;
        return arr[top];
        // Returns the top element of the stack
    }
}