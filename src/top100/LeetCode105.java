package top100;

/**
 * @author OovEver
 * 2018/1/26 21:35
 */
public class LeetCode105 {
    int curroot=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return  build(0,inorder.length-1,preorder,inorder);
    }
    private TreeNode build(int instart,int inend,int[] preorder, int[] inorder){
        if(curroot==preorder.length||instart>inend) return null;
        TreeNode root=new TreeNode(preorder[curroot]);
        int mid = 0;
        for(int i=instart;i<=inend;i++) {
            if (preorder[curroot] == inorder[i]) {
                mid = i;
                break;
            }
        }
        curroot++;
        root.left=build(instart,mid-1,preorder,inorder);
        root.right=build(mid+1,inend,preorder,inorder);
        return root;
    }
}
