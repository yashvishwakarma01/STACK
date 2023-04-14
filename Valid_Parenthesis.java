class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack=new Stack<>();
        Map<Character,Integer> map=new HashMap<>();
        boolean flag=true;
        map.put('(',1);
        map.put('{',2);
        map.put('[',3);
        map.put(')',-1);
        map.put('}',-2);
        map.put(']',-3);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=map.get(ch);
            if(val>0){
                stack.push(val);
            }else{
                if(stack.size()==0){
                    // flag=false;
                    // break;
                    return false;
                }else if(stack.peek()+val==0){
                    stack.pop();
                }else{
                 
                 return false;
                }
            }
        }
        // if(flag==false){
        //     return false;
        // }
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
