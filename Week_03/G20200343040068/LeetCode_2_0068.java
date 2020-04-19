class LeetCode_2_0068 {

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

    // 先中节点，后子节点
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }
    private void dfs(Node node,List<Integer> list){
        if (node == null) {
            return;
        }
        list.add(node.val);
        for (Node n : node.children) {
            dfs(n,list);
        }

    }
}