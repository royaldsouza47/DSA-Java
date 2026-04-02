import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;

public class CharacterFrequency {

    public static List<Character>sortByFreq(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            int freqA=map.get(a);
            int freqB=map.get(b);
            if(freqA!=freqB){
                return freqB-freqA;
            }
            return Character.compare(a,b);
        });
        return list;
    }
    public static void main(String[] args) {
       System.out.println(sortByFreq("tree"));
    }
}