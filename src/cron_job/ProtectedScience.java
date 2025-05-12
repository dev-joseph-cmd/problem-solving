package cron_job;

import org.w3c.dom.ls.LSOutput;
import testing_protected_field.FirstClass;

import java.util.*;

public class ProtectedScience {

    public static void main(String[] args) {
        String name = "John";

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
    FirstClass firstClass = new FirstClass("Joseph", 20);
    String description = firstClass.description;



    private String removeToValidSequence(String s){
        Set<Integer> removeCharacter = new HashSet<>();
        Stack<Integer> characters = new Stack<>();

        if(s.isBlank()){
            return "";
        }


        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '('){
                characters.push(i);
            }

            if(s.charAt(i) == ')'){
                if(!characters.isEmpty()){
                    characters.pop();
                }else{
                    removeCharacter.add(i);
                }
            }
        }

        if(!characters.isEmpty()){
            while(!characters.isEmpty()){
                removeCharacter.add(characters.pop());
            }
        }


        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            if(!removeCharacter.contains(i)){
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }



    private boolean isValid(String s){

        Map<Character, Character> characterMap = new HashMap<>();

        characterMap.put('}', '{');
        characterMap.put(']', '[');
        characterMap.put(')', '(');
        Stack<Character> characters = new Stack<>();

        for(int i = 0; i < s.length(); i ++){

            char c = s.charAt(i);
            characterMap.computeIfAbsent(c, (k) ->{

                characters.push(c);


            });
        }


    }



}
