public class List<T> {
    private Node<T> root;

    public List() {
        this.root = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> currentNode = root;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }
    public void print() {
        Node<T> currentNode = root;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }
}