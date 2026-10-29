import java.util.*;

public class WEEK11_TASK7_TREE_PREORDER_TRAVERSAL {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return;
        }

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value != -1) {
                nodes[i] = new Node(value);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nodes[i] != null) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                if (left < n) nodes[i].left = nodes[left];
                if (right < n) nodes[i].right = nodes[right];
            }
        }
        preorder(nodes[0]);
    }
}
