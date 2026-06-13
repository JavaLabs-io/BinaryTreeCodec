# Binary Tree Codec

A Java project that converts a binary tree into a string and reconstructs the same tree from that string.

## Why I Built This

This project was built to understand how tree data can be stored and restored while preserving its structure.

It demonstrates a common concept used in data storage and communication between systems.

## How It Works

The project uses **preorder traversal** to process the tree.

Traversal order:

1. Current node
2. Left subtree
3. Right subtree

Null nodes are stored as `"null"` so the exact shape of the tree can be reconstructed during deserialization.

## Features

* Serialize a binary tree into a string
* Deserialize a string back into a binary tree
* Preserves the complete tree structure
* Uses recursion for both operations
* Simple console-based implementation

## Example

### Binary Tree

```text
      1
     / \
    2   3
```

### Serialized Output

```text
1,2,null,null,3,null,null,
```

### Restored Tree

```text
      1
     / \
    2   3
```

---

## Concepts Practiced

* Binary Trees
* Recursion
* Depth First Search (DFS)
* Tree Traversal
* String Processing
* Serialization
* Deserialization
