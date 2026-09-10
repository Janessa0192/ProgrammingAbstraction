import java.util.*;

public class stringCode {
	
	public static int atmostKdistinct(String s,int k) {
		
		int res=0,left=0;
		
		Map<Character,Integer> freq = new HashMap<>();
		
		for(int right=0;right<s.length();right++) {
			
			freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right), 0)+1);
			
			while(freq.size()>k) {
				
				char leftchar = s.charAt(left);
				freq.put(leftchar, freq.get(leftchar)-1);
				if(freq.get(leftchar)==0) freq.remove(leftchar);
				left++;
			}
			
			res += right-left+1;
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		
		String s = "pqpqs";
		int k=2;
		
		System.out.println(atmostKdistinct(s, k)-atmostKdistinct(s, k-1));
		
	}
}
