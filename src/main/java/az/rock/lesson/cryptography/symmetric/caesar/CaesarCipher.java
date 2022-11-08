package az.rock.lesson.cryptography.symmetric.caesar;

import az.rock.lesson.cryptography.Constant;

import java.util.Locale;

/**
 * Symmetric  Encryption - Caesar
 *  Encryption E(x) = (x + m) mod 26
 *  Decryption D(x) = (x - m) mod 26
 *  n is a key
 */
public class CaesarCipher{

    public String encrypt(String plainText,int key){
        final StringBuilder cipherText = new StringBuilder();
        plainText = plainText.toUpperCase(Locale.ROOT);

        for (var i = 0;i < plainText.length();i++){
            char character = plainText.charAt(i);
            int charIndex = Constant.ALPHABET.getValue().indexOf(character);
            char encryptChar = Constant.ALPHABET.getValue().charAt(Math.floorMod((charIndex + key) , Constant.ALPHABET.getValue().length()));
            cipherText.append(encryptChar);
        }

        return cipherText.toString();
    }


    public String decrypt(String cipherText,int key){
        final StringBuilder plainText = new StringBuilder();
        for (var i = 0;i < cipherText.length();i++) {
            char character = cipherText.charAt(i);
            int charIndex = Constant.ALPHABET.getValue().indexOf(character);
            char decryptChar = Constant.ALPHABET.getValue().charAt(Math.floorMod(charIndex - key,Constant.ALPHABET.getValue().length()));
            plainText.append(decryptChar);
        }
        return plainText.toString();
    }

}
