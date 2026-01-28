public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num: arr)
        System.out.println(num +" ");
    }
}
***/
private int rangeSum(SegmenttreeNode node, int start, int end)
{
    if(node == null || start > node.end || end < node.start)
    {
        return 0;

    }
    if(start <= node.start && end >= node.end){
        return node.sum;

    }
    return rangeSum(node.left, start, end) + rangeSum(node.right, start, end);
}
public void update(int i, int val)
{
    update(root, i, val);
}
private void update(SegmenttreeNode node,int index, int val)
{
    if(node.start == node.end) 
}