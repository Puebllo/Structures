package c8_trees;

import appMain.SolverAbstract;

public class BST_TreeTester extends SolverAbstract {

    private Node root;

    @Override
    protected void initData() {
    root = null;
    }

    @Override
    protected void solve() {
       insertValueUnSorted(21);
       insertValueUnSorted(37);
       insertValueUnSorted(9);
       insertValueUnSorted(11);

        System.out.println("===== PRE ORDER TRAVERSAL =====");
       preOrderTraversal(root);
        System.out.println("");

        System.out.println("===== IN ORDER TRAVERSAL =====");
        inOrderTraversal(root);
        System.out.println("");

        System.out.println("===== POST ORDER TRAVERSAL =====");
        postOrderTraversal(root);
        System.out.println("");

/*       searchValue(9);
       searchValue(12);*/
    }

    private void postOrderTraversal(Node node) {
        if (node!=null){
            postOrderTraversal(node.getNodeLeft());
            postOrderTraversal(node.getNodeRight());
            System.out.print(node.getVal()+ " ");
        }
    }

    private void inOrderTraversal(Node node) {
        if (node!=null){
            inOrderTraversal(node.getNodeLeft());
            System.out.print(node.getVal()+ " ");
            inOrderTraversal(node.getNodeRight());
        }
    }

    private void preOrderTraversal(Node node) {
        if (node!=null){
            System.out.print(node.getVal() + " ");
            preOrderTraversal(node.getNodeLeft());
            preOrderTraversal(node.getNodeRight());
        }
    }


    private void insertValueUnSorted(int val){
        //sprawdz czy jest root
        Node toAdd = new Node(val);
        if (root == null){
            root = toAdd;
        }else{
            //tutaj while
            Node tmp = root;
            Node parent;
            while (true){
                parent = tmp;
                //sprawdz wartosc left node (val wieksze od left node to wstaw do prawego)

                if (val < tmp.getVal()){
                    tmp = tmp.getNodeLeft();

                    if (tmp == null) {
                        parent.setNodeLeft(toAdd);
                        break;
                    }
                }else{
                    tmp = tmp.getNodeRight();

                    if (tmp == null) {
                        parent.setNodeRight(toAdd);
                        break;
                    }
                }
            }
        }
    }

}
