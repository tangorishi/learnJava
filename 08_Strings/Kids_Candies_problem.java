//Leetcode problem 1431//
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=-1;
        for(int i: candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> res= new ArrayList();
        for (int i:candies){
            if(i +extraCandies>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
        
    }
}
