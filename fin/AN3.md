public Node delete(int key) {
Node curr = top;
Node parent = top;
boolean isLeftChild = true;

    // 1. Search for the node
    while (curr != null && curr.data != key) {
        parent = curr;
        if (key < curr.data) {
            isLeftChild = true;
            curr = curr.left;
        } else {
            isLeftChild = false;
            curr = curr.right;
        }
    }

    if (curr == null) {
        // Not found
        return null;
    }

    // 2. Node to delete found, handle three cases

    // Case 1: No children (leaf node)
    if (curr.left == null && curr.right == null) {
        if (curr == top) {
            top = null; // Tree becomes empty
        } else if (isLeftChild) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }
    // Case 2: Only left child
    else if (curr.right == null) {
        if (curr == top) {
            top = curr.left;
        } else if (isLeftChild) {
            parent.left = curr.left;
        } else {
            parent.right = curr.left;
        }
    }
    // Case 3: Only right child
    else if (curr.left == null) {
        if (curr == top) {
            top = curr.right;
        } else if (isLeftChild) {
            parent.left = curr.right;
        } else {
            parent.right = curr.right;
        }
    }
    // Case 4: Two children
    else {
        Node successor = getSuccessor(curr);

        if (curr == top) {
            top = successor;
        } else if (isLeftChild) {
            parent.left = successor;
        } else {
            parent.right = successor;
        }

        successor.left = curr.left;
    }

    return curr;

}

// Helper method to find in-order successor
private Node getSuccessor(Node delNode) {
Node successorParent = delNode;
Node successor = delNode;
Node curr = delNode.right;

    while (curr != null) {
        successorParent = successor;
        successor = curr;
        curr = curr.left;
    }

    // If successor not immediate right child
    if (successor != delNode.right) {
        successorParent.left = successor.right;
        successor.right = delNode.right;
    }

    return successor;

}
