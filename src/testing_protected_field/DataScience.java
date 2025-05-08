package testing_protected_field;

import java.util.*;
import java.util.concurrent.Flow;
import java.util.function.BiFunction;


record  students(String name, int age){

}

public class DataScience {
    public static void main(String[] args) {
        var student = new students("Joseph", 20);
        System.out.println(student.name());
        System.out.println(student.age());

    }


    public boolean checkRecord(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        List<Character> list = List.of('A', 'L', 'P');
        boolean isTrue = false;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!list.contains(c)){
                continue;

            }

            if(c == 'A'){
                int count = characterIntegerMap.getOrDefault('A', 0);
                if(count < 2)  isTrue = true;
                characterIntegerMap.put('A', count + 1);

            }else if(c == 'L'){



            }else{
                characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
            }





        }

        return characterIntegerMap.getOrDefault('A', 0) <= 1 && characterIntegerMap.getOrDefault('L', 0) <= 2 && characterIntegerMap.getOrDefault('P', 0) <= 2;





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



class GenericBox<T, V>{

    private T value;

    private V value2;


    public GenericBox(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }


    public String ConvertToString(){
        return (String) value;
    }


}


class TestingGenericConcept{

    public static void main(String[] args) {

        GenericBox<String, String> genericBox = new GenericBox<>("Paul");
        System.out.println(genericBox.getValue());
        genericBox.setValue("Joseph");
        System.out.println(genericBox.getValue());
        System.out.println(genericBox.getValue().getClass());


//        System.out.println(max("Joseph", "Joseph"));
//
//        String value = max("Ben", "Simon");
//        System.out.println(value);
//        System.out.println(value.getClass());
//        System.out.println(value.getClass().getTypeName());

        BiFunction<Integer, Integer, Integer> testingMethodReference =  TestingGenericConcept::getAdditionMethodReference;
        System.out.println(testingMethodReference.apply(10, 20));


    }



    public static Integer getAdditionMethodReference(Integer a, Integer b){
        return a + b;
    }





}


class TreeNode{

    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}


class Problems{


    public List<List<Integer>> ans = new ArrayList<>();



    public void getLevelsTree(TreeNode root, int level){


        if(this.ans.size() == level){

            this.ans.add(new ArrayList<>());
        }

        this.ans.get(level).add(root.data);

        if(root.left != null){
            getLevelsTree(root.left, level + 1);
        }

        if(root.right != null){
            getLevelsTree(root.right, level + 1);
        }


    }


    public List<List<Integer>> levelOrder(TreeNode root){
        if(root == null){
            return ans;
        }

        getLevelsTree(root, 0);
        return ans;
    }





}
