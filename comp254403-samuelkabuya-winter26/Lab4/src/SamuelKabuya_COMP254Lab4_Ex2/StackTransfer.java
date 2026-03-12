package SamuelKabuya_COMP254Lab4_Ex2;

public class StackTransfer {

    public static <E> void transfer(Stack<E> S, Stack<E> T){
        while (!S.isEmpty()){
            T.push(S.pop());
        }
    }

    public static void main(String[] args){
        Stack<Integer> S = new ArrayStack<>();
        Stack<Integer> T = new ArrayStack<>();

        S.push(10);
        S.push(20);
        S.push(30);

        System.out.println("Stack S before transfer: " + S);
        System.out.println("Stack T before transfer: " + T);

        transfer(S,T);

        System.out.println("After Transfer:");
        System.out.println("Stack S" + S);
        System.out.println("Stack T" + T);

    }
}
