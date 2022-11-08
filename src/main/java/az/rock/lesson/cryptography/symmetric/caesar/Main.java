package az.rock.lesson.cryptography.symmetric.caesar;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String cipherText = caesarCipher.encrypt("This is a plain text",5);
        System.out.println(cipherText);

        String plainText = caesarCipher.decrypt("YMNXENXEFEUQFNSEYJBY",5);
        System.out.println(plainText);
    }
}
