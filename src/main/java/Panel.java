public class Panel {

    private int size;
    private Node first;

    private int columns;
    private int rows;

    public Panel(int col, int ro) {

        first = null;
        columns = col;
        rows = ro;


    }

    public int calculateSize() {

        size =  columns * rows;

    }

    public void insertAtEnd() {

        if(first == null) {

            Node newNode = new Node("J1|J2", null);
            first = newNode;

        }

        else {

            for(int i = 1; i < calculateSize(); i++) {

                Node current = new Node((i+1)+"", null);

                first.setNext(current);

            }



        }


    }





}
