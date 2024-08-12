
import java.io.*;

class SegmentTrees {
    
    public static void buildTree(int[] arr, int[] tree, int start, int end, int treeNode){
        
        if(start == end){
            tree[treeNode] = arr[start];
            return;
        }
        
        int mid = (start + end)/2;
        
        buildTree(arr, tree, start, mid, 2*treeNode );
        buildTree(arr, tree, mid+1, end, 2*treeNode + 1);
        
        tree[treeNode] = tree[2*treeNode] + tree[2*treeNode + 1];
    }
    
    public static void updateTree(int[] arr, int[] tree, int start, int end,int treeNode, int index, int value){
        
        if(start == end){
            arr[index] = value;
            tree[treeNode] = value;
            return;
        }
        
        int mid = (start + end) / 2;
        
        if(index > mid){
            updateTree(arr, tree, mid + 1, end, 2*treeNode+1, index, value);
        }
        else{
            updateTree(arr, tree, start, mid, 2*treeNode, index, value);
        }
        
        tree[treeNode] = tree[2*treeNode] + tree[2*treeNode+1];
    }
    
    public static int query(int[] tree, int start, int end, int treeNode, int left, int right){
        
        //Completely outside given range
        if(start > right || end < left)
           return 0;
           
        //Completely inside given range
        if(start >= left && end <= right){
            return tree[treeNode];
        }
        
        //partially
        
        int mid = (start + end) / 2;
        
        int ans1 = query(tree, start, mid, 2*treeNode,left, right);
        int ans2 = query(tree, mid + 1, end, 2*treeNode+1, left, right);
        
        return ans1 + ans2;
    }
    
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int[] tree = new int[10];  // 2*n size
		
		buildTree(arr, tree, 0, 4, 1);
		
		for(int i = 0; i<10; i++){
		    System.out.print(tree[i]+" ");
		}
		
		System.out.println();
		updateTree(arr, tree, 0, 4, 1, 4, 10);
		
		for(int i = 0; i<10; i++){
		    System.out.print(tree[i]+" ");
		}
		
		System.out.println();
		
		int ans = query(tree, 0 , 4 , 1,2,4);
		System.out.println(ans);
		
	}
}
