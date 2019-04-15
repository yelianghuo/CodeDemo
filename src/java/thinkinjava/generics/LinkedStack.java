package thinkinjava.generics;

/**
 * Created by yelianghuo on 2018/7/22.
 */
public class LinkedStack<T> {
    // static class have muti type in linklist

    private static class MutiNode<U> {
        U item;
        MutiNode<U> next;

        MutiNode() {
            item = null;
            next = null;
        }
        MutiNode(U item, MutiNode<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean mutiEnd() {
            return item == null && next == null;
        }
    }
    private MutiNode mutiTop = new MutiNode<T>();

    public <V> void mutiPush(V item) {
        mutiTop = new MutiNode<>(item, mutiTop);
    }
    public Object mutiPop() {
        Object result = mutiTop.item;
        if(!mutiTop.mutiEnd()) {
            mutiTop = mutiTop.next;
        }
        return result;
    }

    // inner class
    private class Node {
        T item;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }

    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }
    public T pop() {
        T result = top.item;
        if(!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
        LinkedStack<String> mlss = new LinkedStack<>();
        mlss.mutiPush("daa");
        mlss.mutiPush(12);
        mlss.mutiPush(new People());
        System.out.println(mlss.mutiPop());
        System.out.println(mlss.mutiPop());
        System.out.println(mlss.mutiPop());
    }
}
