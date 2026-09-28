import java.util.*;
public class WEEK8_TASK4_VisitorPattern {
    interface TreeVis {
        int getResult();
        void visitNode(TreeNode node);
        void visitLeaf(TreeLeaf leaf);
    }
    static abstract class Tree {
        int value, depth;
        boolean red;
        Tree(int value, boolean red, int depth) {
            this.value = value;
            this.red = red;
            this.depth = depth;
        }

        abstract void accept(TreeVis visitor);
    }
    static class TreeNode extends Tree {
        List<Tree> children = new ArrayList<>();
        TreeNode(int value, boolean red, int depth) {
            super(value, red, depth);
        }
        @Override
        void accept(TreeVis visitor) {
            visitor.visitNode(this);
            for (Tree child : children) {
                child.accept(visitor);
            }
        }
    }

    static class TreeLeaf extends Tree {
        TreeLeaf(int value, boolean red, int depth) {
            super(value, red, depth);
        }

        @Override
        void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }

    static class SumInLeavesVisitor implements TreeVis {
        int sum = 0;

        @Override
        public int getResult() {
            return sum;
        }

        @Override
        public void visitNode(TreeNode node) {
        }

        @Override
        public void visitLeaf(TreeLeaf leaf) {
            sum += leaf.value;
        }
    }

    static class ProductOfRedNodesVisitor implements TreeVis {
        static final long MOD = 1000000007L;
        long product = 1;

        @Override
        public int getResult() {
            return (int) product;
        }

        @Override
        public void visitNode(TreeNode node) {
            if (node.red) {
                product = product * node.value % MOD;
            }
        }

        @Override
        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.red) {
                product = product * leaf.value % MOD;
            }
        }
    }

    static class FancyVisitor implements TreeVis {
        int evenDepthNodeSum = 0;
        int greenLeafSum = 0;

        @Override
        public int getResult() {
            return Math.abs(evenDepthNodeSum - greenLeafSum);
        }

        @Override
        public void visitNode(TreeNode node) {
            if (node.depth % 2 == 0) {
                evenDepthNodeSum += node.value;
            }
        }

        @Override
        public void visitLeaf(TreeLeaf leaf) {
            if (!leaf.red) {
                greenLeafSum += leaf.value;
            }
        }
    }

    static Tree build(int n, int[] values, int[] colors, List<List<Integer>> graph) {
        return buildAt(0, -1, 0, values, colors, graph);
    }

    static Tree buildAt(int v, int parent, int depth, int[] values,
                       int[] colors, List<List<Integer>> graph) {

        List<Integer> children = new ArrayList<>();
        for (int w : graph.get(v)) {
            if (w != parent) {
                children.add(w);
            }
        }

        boolean red = colors[v] == 0;

        if (children.isEmpty()) {
            return new TreeLeaf(values[v], red, depth);
        }

        TreeNode node = new TreeNode(values[v], red, depth);
        for (int w : children) {
            node.children.add(buildAt(w, v, depth + 1, values, colors, graph));
        }
        return node;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] values = new int[n];
            int[] colors = new int[n];

            for (int i = 0; i < n; i++) {
                values[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                colors[i] = in.nextInt();
            }

            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            Tree root = build(n, values, colors, graph);
            SumInLeavesVisitor a = new SumInLeavesVisitor();
            ProductOfRedNodesVisitor b = new ProductOfRedNodesVisitor();
            FancyVisitor c = new FancyVisitor();

            root.accept(a);
            root.accept(b);
            root.accept(c);

            System.out.println(a.getResult());
            System.out.println(b.getResult());
            System.out.println(c.getResult());
        }
    }
}
