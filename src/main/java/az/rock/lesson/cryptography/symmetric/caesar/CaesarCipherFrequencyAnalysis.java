package az.rock.lesson.cryptography.symmetric.caesar;

import az.rock.lesson.cryptography.FrequencyAnalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CaesarCipherFrequencyAnalysis implements FrequencyAnalysis {

    @Override
    public void analyse(String cipherText){


    }

    public Map<Character,Integer>  run(String text){
        text = text.toUpperCase();
        Map<Character,Integer> frequencies = new HashMap<>();
        final String finalText = text;
        IntStream.range(0,text.length()).forEach(i->{
            char character = finalText.charAt(i);
            if (CaesarCipher.ALPHABET.indexOf(character) != -1){
                frequencies.put(character,frequencies.getOrDefault(character,0) + 1);
            }
        });
        return frequencies;
    }

    public void showFrequencies(String text){
        this.run(text).entrySet().forEach(System.out::println);
    }

}
