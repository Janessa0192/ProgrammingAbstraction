class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String,Integer> mp = new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] parts = cpdomain.split(" ");
            int c = Integer.parseInt(parts[0]);
            String domain = parts[1];
            while(true){

                mp.put(domain,mp.getOrDefault(domain,0)+c);

                int index = domain.indexOf('.');
                if(index == -1) break;

                domain = domain.substring(index+1);
            }
        }

        List<String> ls = new ArrayList<>();
        for(String ch : mp.keySet()){
            ls.add(mp.get(ch)+" "+ch);
        }

        return ls;

    }
}