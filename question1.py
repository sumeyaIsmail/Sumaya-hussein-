class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_node_and_parents(root, val):
    parents = []
    def dfs(node):
        nonlocal parents
        if not node:
            return False
        if node.val == val:
            return True
        if dfs(node.left) or dfs(node.right):
            parents.append(node.val)
            return True
        return False
    if dfs(root):
        return parents
    return None

# Example usage:
root = Node(2, Node(4, Node(3), Node(3)), Node(2, Node(5), Node(6)))
print(find_node_and_parents(root, 6)) # prints [2, 2]
