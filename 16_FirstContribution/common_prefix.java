/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

//Solution:

import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
     if(str==null){
      return "";
     }
     
     Arrays.sort(strs);
     String smallest=str[0];
     String largest=str[str.length-1];
     String ans="";

     for(int i=0;i<smallest.length;i++){
         if()
     }


    }
}
