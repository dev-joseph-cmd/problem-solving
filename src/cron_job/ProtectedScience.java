package cron_job;

import org.w3c.dom.ls.LSOutput;
import testing_protected_field.FirstClass;

import javax.xml.crypto.Data;
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









}

interface  DataSave{
    String getName(String name);
}

abstract class ResearchClass implements DataSave {
    abstract void dataAnalyst();

}

class Research extends  ResearchClass{

    @Override
    void dataAnalyst() {

    }

    @Override
    public String getName(String name) {
        return "";
    }

//    public static <T, R> String getStudentData(T data){
//
//    }
}


class User{

    private String name;
    private String username;
    private String password;


    private int age;
    private String address;
    private String phoneNumber;

    public User(String name, String username, String password, int age, String address, String phoneNumber) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //adding required fields here

    public static class UserBuilder{
        private String name;
        private String username;
        private String password;
        private int age;
        private String address;
        private String phoneNumber;

        public UserBuilder (String name, String username, String password){
            this.name = name;
            this.username = username;
            this.password = password;

        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }


        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            return null;
        }



    }


}
