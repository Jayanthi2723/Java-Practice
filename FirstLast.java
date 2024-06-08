public class FirstLast{
  public static int[] searchRange(int target){
    int[] nums={3,4,4,4,4,4,4,4,4,6};
    int l=0,h=nums.length-1,mid=0;
    int[] res={-1,-1};
    while(l<=h){
      mid=(l+h)/2;
      if(target==nums[mid]){
        res[0]=mid;
        h=mid-1;
        //System.out.println(h);
      }
      else if(nums[mid]<target){
        l=mid+1;
        //System.out.println(l);
      }
      else{
        h=mid-1;
        //System.out.println(h);
      }
      return res;
    }
    l=0;
    h=nums.length-1;
    mid=0;
    while(l<=h){
      mid=(l+h)/2;
      if(target==nums[mid]){
        res[1]=mid;
        l=mid+1;
        //System.out.println(l);
      }
      else if(nums[mid]<target){
        h=mid+1;
        //System.out.println(h);
      }
      else{
        h=mid+1;
        //System.out.println(h);
        //break;
      }
    }
    return res;
  }
  public static void main(String[] args){
    //int target=4;
    searchRange(4);
  }
}
