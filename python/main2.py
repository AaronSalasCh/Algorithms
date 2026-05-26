from BinarySearchTree import BinarySearchTree
from Node import Node

tree = BinarySearchTree()

tree.insert(Node(12))
tree.insert(Node(5))
tree.insert(Node(2))
tree.insert(Node(3))
tree.insert(Node(19))
tree.insert(Node(7))

tree.display()

print(tree.search(12))

tree.delete(5)
tree.display()