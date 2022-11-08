package az.rock.lesson.cryptography.symmetric.caesar;

import az.rock.lesson.cryptography.Constant;
import az.rock.lesson.cryptography.FrequencyAnalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CaesarCipherFrequencyAnalysis implements FrequencyAnalysis {

    private final Map<Character,Integer> frequencies = new HashMap<>();

    @Override
    public void analyse(String cipherText){


    }

    public Map<Character,Integer>  run(String text){
        text = text.toUpperCase();
        final String finalText = text;
        IntStream.range(0,text.length()).forEach(i->{
            var character = finalText.charAt(i);
            if (Constant.ALPHABET.getValue().indexOf(character) != -1)
                this.frequencies.put(character,this.frequencies.getOrDefault(character,0) + 1);
        });
        return this.frequencies;
    }

    public void showFrequencies(String text){
        this.run(text).entrySet().forEach(System.out::println);
    }

}
