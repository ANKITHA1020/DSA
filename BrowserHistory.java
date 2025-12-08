class BrowserHistory {
     
    class Node {
        Node pre;
        Node next;
        String val;

        Node(String val) {
            this.val = val;
        }
    } 
     
    private Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode = new Node(url);
        current.next = null;  // Clear forward history
        newnode.pre = current;
        current.next = newnode;
        current = newnode;
    }
    
    public String back(int steps) {
        while (steps > 0 && current.pre != null) {
            current = current.pre;
            steps--;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
        return current.val;
    }
}