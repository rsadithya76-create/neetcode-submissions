class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> l1=new HashSet<>();
        for(int i:nums){
            if(!l1.contains(i)){
                l1.add(i);
            }
        }
        if(l1.size()!=nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}