package az.rock.lesson.cryptography.symmetric.caesar;

import az.rock.lesson.cryptography.Constant;
import az.rock.lesson.cryptography.Cracker;

public class CaesarCipherBruteForce implements Cracker {



    @Override
    public void crack(String cipherText) {

        for (var key = 0; key < Constant.ALPHABET.getValue().length(); ++key){
            String decryptText = "";
            System.out.println("------------------KEY: " + key + "------------------------------");
            for (var i = 0;i < cipherText.length();i++) {
                char character = cipherText.charAt(i);
                int charIndex = Constant.ALPHABET.getValue().indexOf(character);
                char decryptChar = Constant.ALPHABET.getValue().charAt(Math.floorMod(charIndex - key, Constant.ALPHABET.getValue().length()));
                decryptText = decryptText.concat(String.valueOf(decryptChar));
            }
            String result = String.format("Cracking Caesar-cipher with %s key the result is : %s",key,decryptText);
            System.out.println(result);
            System.out.println("----------------------------------------------------");
        }
    }
}
