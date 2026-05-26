class BinarySearchTree:
    
    def __init__(self):
        self.root = None
        
    def insert(self, node):
        self.root = self.insert_helper(self.root, node)
    
    def insert_helper(self, root, node):
        if root == None:
            root = node
        elif node.data < root.data:
            root.left = self.insert_helper(root.left, node)
        elif node.data > root.data:
            root.right = self.insert_helper(root.right, node)
            
        return root
            
    def display(self):
        self.display_helper(self.root)
        
    def display_helper(self, root):
        if root != None:
            self.display_helper(root.left)
            print(f'{root.data} ')
            self.display_helper(root.right)
            
    def search(self, data):
        return self.search_helper(self.root, data)
        
    def search_helper(self, root, data):
        if root == None:
            return False
        elif data < root.data:
            return self.search_helper(root.left, data)
        elif data > root.data:
            return self.search_helper(root.right, data)
        elif data == root.data:
            return True
        
        return False
        
    def delete(self, data):
        if not self.search(data):
            print(f'{data} No existe en el Árbol')
            return
        
        self.delete_helper(self.root, data)
        
    def delete_helper(self, root, data):
        if root == None:
            return None
        elif data < root.data:
            root.left = self.delete_helper(root.left, data)
        elif data > root.data:
            root.right = self.delete_helper(root.right, data)
        elif data == root.data: # Llegamos al nodo a eliminar
            if root.left == None and root.right == None: # Es una hoja
                root = None # Se elimina
            elif root.right != None:
                root.data = self.successor(root)
                root.right = self.delete_helper(root.right, root.data)
            elif root.left != None:
                root.data = self.predecessor(root)
                root.left = self.delete_helper(root.left, root.data)
        return root            

    def successor(self, root):
        root = root.right
        while root.left != None:
            root = root.left
        return root.data

    def predecessor(self, root):
        root = root.left
        while root.right != None:
            root = root.right
        return root.data