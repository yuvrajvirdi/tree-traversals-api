# tree-traversals-rest-api

Spring RESTful API for Binary Tree Traversals 

# Installation

Clone the repo into your desired directory

```bash
git clone https://github.com/yuvrajvirdi/tree-traversals-rest-api.git
```

# Use

In your directory, run the following code:

```bash
./mvnw spring-boot:run
```

* Navigate to **http://localhost:8080/traversal**
* All tree queries are done in the format of a level order traversal, since that is most common in reading trees, with dashes between the elements 
* Query a tree by typing ?treeString=YOUR-TREE
* An example of a query of the tree with the level order traversal of 4,2,6,1,3,5,7 would look like **http://localhost:8080/traversal?tree=4-2-6-1-3-5-7**

# Example

Querying the example link returns the following response:

```javascript
{
  "id":1,
  "treeString":"4-2-6-1-3-5-7",
  "preorder":"4-2-1-3-6-5-7",
  "inorder":"1-2-3-4-5-6-7",
  "postorder":"1-3-2-5-7-6-4"
}
```

