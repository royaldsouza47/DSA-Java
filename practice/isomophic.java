import java.util.HashMap;

public class isomophic {

    public static Boolean iso(String s, String t){
        HashMap<Character,Character> mapS=new HashMap<>();
        HashMap<Character,Character> mapT= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(mapS.containsKey(sc)&& mapS.get(sc)!=tc){
                return false;
            }
            if(mapT.containsKey(tc)&& mapT.get(tc)!=sc){
                return false;
            }
            mapS.put(sc,tc);
            mapT.put(tc,sc);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(iso("royal", "bobin"));
    }
}
