package testing_protected_field;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


record  students(String name, int age){

}

public class DataScience {
    public static void main(String[] args) {
        var student = new students("Joseph", 20);
        System.out.println(student.name());
        System.out.println(student.age());

    }

    private String reverseVowels(String string){

        List<String> vowels = List.of("a", "e", "i", "o", "u");

        int begin = 0;
        int end = string.length() - 1;

        for(int i = 0; i < string.length(); i++){
            char start = string.charAt(begin);
            char endChar = string.charAt(end);

          if(vowels.contains(String.valueOf(start).toLowerCase()) && vowels.contains(String.valueOf(endChar).toLowerCase())){

              char temp = start;
              start = endChar;
              endChar = temp;




          }
            begin++;
            end--;




        }

        return string;



    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    private String reverseVowels2(String string){



        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Set<Character> characters = new HashSet<>(vowels);
        System.out.println(characters);
        char[] chars = string.toCharArray();

        int begin = 0;
        int end = string.length() - 1;

        while(begin < end){
            while(begin < end && !vowels.contains(chars[begin])){
                begin++;
            }
            while(begin < end && !vowels.contains(chars[end])){
                end--;
            }
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
        }


        return new String(chars);


    }




    FirstClass firstClass = new FirstClass("Joseph", 20);
    String description = firstClass.description;
    String name = firstClass.name;
}
