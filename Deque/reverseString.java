import java.util.*;

class Main {
    public static void main(String[] args) {

        String s  = "HELLO";
        Deque<Character>dq=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            dq.addFirst(s.charAt(i));   // OLLEH
        }

        StringBuilder res=new StringBuilder();
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }
        System.out.println(res);
    }
}
