public class Main {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Codec codec = new Codec();

        String serialized = codec.serialize(root);

        System.out.println("Original Tree Serialized:");
        System.out.println(serialized);

        TreeNode restored = codec.deserialize(serialized);

        System.out.println("\nTree Restored Successsfully");
        System.out.println("Root value: " + restored.val);
        System.out.println("Left child: " + restored.left.val);
        System.out.println("Right child: " + restored.right.val);

    }
    
}
