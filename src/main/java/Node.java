public class Node {

    private String number;
    //private String position;
    private Node next;
    private int size;

    private String player1;
    private String player2;


    public Node(String numb, Node nxt) {

        size = 0;
        number = numb;
        next = nxt;
        //player1 = null;
        //player2 = null;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
}
