import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
public class RSA
{
    static BigInteger p, q, n, phi_n, e, d;
    static SecureRandom secureRandom;
    static int bitLength = 64;
    static String encrypt(String msg)
    {
        return new BigInteger(msg).modPow(e, n).toString();
    }
    static String decrypt(String cipher)
    {
        return new BigInteger(cipher).modPow(d, n).toString();
    }
    // TODO code application logic here
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        secureRandom = new SecureRandom();
        p = BigInteger.probablePrime(bitLength, secureRandom);
        q = BigInteger.probablePrime(bitLength, secureRandom);
        n = p.multiply(q);
        phi_n = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitLength / 2, secureRandom);
        while (e.gcd(phi_n).compareTo(BigInteger.ONE) != 0 &&e.compareTo(phi_n) < 0)
            e = e.add(BigInteger.ONE);
        d = e.modInverse(phi_n);
        System.out.println("P assigned as: " + p);
        System.out.println("Q assigned as: " + q);
        System.out.println("N assigned as: " + n);
        System.out.println("PHI_N assigned as: " + phi_n);
        System.out.println("\nEnter Message");
        String msg = sc.next();
        String encryptedMessage = encrypt(msg);
        System.out.println("Encrypted Message: " + encryptedMessage);
        String decryptedMessage = decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
        sc.close();
    }
}