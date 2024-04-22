package Easy;
import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<str.length;i++){
            if(map.get(pattern.charAt(i))==null){
                if(map.containsValue(str[i])){
                    return false;
                }
                else{
                    map.put(pattern.charAt(i),str[i]);
                }
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
        }
        return true;
    }
}