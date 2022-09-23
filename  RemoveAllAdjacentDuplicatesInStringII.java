class Solution {
    public String removeDuplicates(String s) {
        
        Stack<int[]> st = new Stack<>();
        
        for(char ch: s.toCharArray()){
            
            if(!st.isEmpty() && st.peek()[0]==ch){
                st.peek()[1]++;
            }
            else{
                st.push(new int[]{ch, 1});
            }
            if(st.peek()[1]==2){
                st.pop();
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            int top[] = st.pop();
            while(top[1]--> 0)
                ans.append((char)top[0]);
        }
        return ans.reverse().toString();
    }
}