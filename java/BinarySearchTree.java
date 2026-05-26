public class BinarySearchTree {
    public Node root;
    
    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        if(root == null){
            root = node;
        }else if(node.data < root.data){
            root.left = insertHelper(root.left, node);
        }else if(node.data > root.data){
            root.right = insertHelper(root.right, node);
        }

        return root;
    }

    public void display(){
        displayHelper(root);
        System.out.println("");
    }

    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){
        if(root == null){
            return false;
        }else if(data == root.data){
            return true;
        }else if(data < root.data){
            return searchHelper(root.left, data);
        }else if(data > root.data){
            return searchHelper(root.right, data);
        }
        return false;
    }

    public void remove(int data){
        if(!this.search(data)){
            System.out.println(data + " does not exists");
            return;
        }
        removeHelper(root, data);
    }
    
    private Node removeHelper(Node root, int data){
        if(root == null){
            return null;
        }else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }else { // Llegamos al nodo a eliminar
            if(root.left == null && root.right == null){ // Es una hoja
                root = null;
            }else if(root.right != null){
                // Encontrar un sucesor para reemplazar el nodo
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }else if(root.left != null){
                // Encontrar un predecesor para reemplazar el nodo
                root.data = predecessors(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    
    // Encontrar el valor mas pequeño debajo de cierto nodo
    private int successor(Node root){
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
        
    private int predecessors(Node root){
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}