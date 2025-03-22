public class Mar10_03
{
    public static void main(String[] args)
    {
        String regex = "[a-zA-Z]+[.!,]";
        String text = "I am here, and everywhere!";
        text = text.replaceAll(regex,"ZZ");
        System.out.println(text);
    }
}