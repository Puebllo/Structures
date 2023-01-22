package c9_javaUtlis;

import appMain.SolverAbstract;

import java.util.Comparator;
import java.util.Stack;

public class StackTest extends SolverAbstract {

    @Override
    protected void solve() {
        Stack<String> s = new Stack<>();
        s.push("Chandler"); s.push("Joey"); s.push("Pheebs"); s.push("Rachel"); s.push("Monica"); s.push("Ross");

        System.out.println("==== STACK CONTAINS =====");
        System.out.println(s);

        System.out.println("==== STACK TOP ELEMENT =====");
        System.out.println(s.peek());

        System.out.println("==== STACK BOTTOM ELEMENT =====");
        System.out.println(s.firstElement());

        System.out.println("==== GET ELEMENT FROM STACK =====");
        System.out.println(s.pop());

        System.out.println("==== stack after element fetch =====");
        System.out.println(s);

        System.out.println("==== REMOVE ELEMENT FROM STACK =====");
        System.out.println(s.remove("Pheebs"));
        System.out.println(s);

    }
}
