public class Codec {

    public String serialize(TreeNode root){

        StringBuilder sb = new StringBuilder();
        serialization(root, sb);
        return sb.toString();

    }

    private void serialization(TreeNode node, StringBuilder sb){

        if(node == null){
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");

        serialization(node.left, sb);
        serialization(node.right, sb);
    }

    public TreeNode deserialize(String data){

        String[] arr = data.split(",");
        int[] index = {0};

        return deserialization(arr, index);
    }

    private TreeNode deserialization(String[] arr, int[] index){

        if(arr[index[0]].equals("null")){
            index[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(arr[index[0]]));
        index[0]++;

        node.left = deserialization(arr, index);
        node.right= deserialization(arr, index);

        return node;
    }
    
}
