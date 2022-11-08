package az.rock.lesson.cryptography.symmetric.caesar;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String cipherText = caesarCipher.encrypt("This is a plain text",3);
        System.out.println(cipherText);

        String plainText = caesarCipher.decrypt(cipherText,3);
        System.out.println(plainText);
    }
}
