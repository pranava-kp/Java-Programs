public class Mar07_2 {
    public static void main(String args[]) {
        String org = "This is a test. This is, too.";
        String search = "is", sub = "was", result = "";
        int i;
        do 
        { 
            // replace all matching substrings
            System.out.println(org);
            i = org.indexOf(search);
            if(i != -1)
            {
                result = org.substring(0, i);
                result = result + sub;
                result=result+org.substring(i+search.length());
                org = result;
            }
        } while(i != -1);
        
    }
}
