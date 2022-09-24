class Solution {
    public String decodeString(String s) {
        Stack<String> result = new Stack<>();
        Stack<Integer> frequency = new Stack<>();
        
        int index = 0;
        String ans = "";
        
        while(index<s.length()){
            if(Character.isDigit(s.charAt(index)))
            {
                int count =0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10*count + (s.charAt(index) - '0');
                    index=index+1;
                }
                frequency.push(count);
            }
            else if(s.charAt(index)=='[')
            {
                result.push(ans);
                ans ="";
                index++;
            }
            else if(s.charAt(index)==']')
            {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = frequency.pop();
                for(int i=0; i<count; i++){
                    temp.append(ans);
                }
                ans = temp.toString();
                index++;
            }
            else
            {
                ans = ans + s.charAt(index);
                index++;
            }
        }
        return ans;
    }
}