public class Except{
    
    public static void main(String[] args) {
        int j,i=2;
        //for(int i=0;i<=3;i++)
        //{
            try{
                switch(i)
                {
                    case 0:
                    int zero=0;
                    j=999/zero;
                    break;
                    case 1:
                    int b[]=null;
                    j=b[0];
                    break;
                    case 2:
                    int c[]= new int[2];
                    j=c[10];
                    break;
                    case 3:
                    char ch="Java".charAt(9);
                    break;
                    
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error found");
                System.out.println(ex.getMessage());
            }
            finally{
                System.out.println("This always executes\nNo matter what");
            }
        //}
    }
}