
class ArrayTest {

    public static void insert(char[] ar, int pos, char val) {
    
    for(int ind=ar.length-1; ind>=pos; ind--) {
    
    ar[ind]=ar[ind-1];
    
    }
    
    ar[pos-1]=val;
}
}