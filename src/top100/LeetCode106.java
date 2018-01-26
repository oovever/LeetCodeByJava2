package top100;

/**
 * @author OovEver
 * 2018/1/26 21:59
 */
public class LeetCode106 {
    int curroot=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        curroot=postorder.length-1;
        return  build(0,inorder.length-1,inorder,postorder);
    }
    private TreeNode build(int instart,int inend,int[] inorder, int[] postorder){
        if(curroot<0||instart>inend) return null;
        TreeNode root=new TreeNode(postorder[curroot]);
        int mid=0;
        for(int i=instart;i<=inend;i++){
            if(inorder[i]==postorder[curroot]){
                mid=i;
                break;
            }

        }
        curroot--;
        root.right=build(mid+1,inend,inorder,postorder);
        root.left=build(instart,mid-1,inorder,postorder);

        return root;
    }
}
