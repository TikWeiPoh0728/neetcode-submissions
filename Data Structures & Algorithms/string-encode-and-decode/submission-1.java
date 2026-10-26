class Solution {

    // strs = ["Hello","World"]
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            // s = Hello -> sb = 5#Hello 
            sb.append(s.length()).append('#').append(s);
        }
        // sb = 5#Hello5#World
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') j++; // j stops at 1 (the '#')
            int len = Integer.parseInt(str.substring(i,j)); // "5" -> 5
            int start = j + 1; 
            result.add(str.substring(start, start + len)); // substring(2,7) -> Hello
            i = start + len;
        }
        return result;
    }
}
