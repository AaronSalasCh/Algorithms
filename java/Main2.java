public class Main2 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(12));
        tree.insert(new Node(5));
        tree.insert(new Node(2));
        tree.insert(new Node(3));
        tree.insert(new Node(19));
        tree.insert(new Node(7));
        System.out.println(tree.search(7));
        tree.display();
        tree.remove(5);
        tree.display();
        System.out.println(tree.sum());
    }
}