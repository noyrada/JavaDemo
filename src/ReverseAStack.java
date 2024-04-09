import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args)
    {
        //pushing -adding elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");
        System.out.println(st);

        reverse();

        System.out.println("Reversed Stack");
        System.out.println(st);
    }

    static Stack<Character> st = new Stack<>();

    //Inserting elements at the bottom of a stack
    static void insert_at_bottom(char x){
        if (st.isEmpty()){
            st.push(x);
        }else {
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);

            st.push(a);
        }
    }
    public static void reverse(){
        if (st.size() > 0){
            char x = st.peek();
            st.pop();
            reverse(); //this is the trick of reversing stack

            insert_at_bottom(x);
        }
    }
}
