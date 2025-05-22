package cron_job;

import org.w3c.dom.ls.LSOutput;
import testing_protected_field.FirstClass;

import javax.xml.crypto.Data;
import java.io.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ProtectedScience {

    public Character getCharacter(String input){

        input = input.toLowerCase();
        return null;


    }

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
        Map<String, String> map = new HashMap<>();

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

    private Map<String, Integer> dataMap = new HashMap<>();






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


class DynamicProgramming{




}


class DataStructure{




    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/joe24/concept.txt"));

        String line = null;

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        System.out.println((String) element());

    }


    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }


    // let use memoization for brute force cases
    // Check if the memo contains the key of the meon
    public static int fib2(int n, HashMap<Integer, Integer> memoizationMap){
        if(n == 0 || n == 1){
            return n;
        }
        if(memoizationMap.containsKey(n)){
            return memoizationMap.get(n);
        }
        int result = fib2(n - 1, memoizationMap) + fib2(n - 2, memoizationMap);
        memoizationMap.put(n, result);
        return result;

    }




    //Smaller amount are eas
    // return the same the report

    /**
     * This is exponential component
     *
     * exponential sequence we use on array
     *
     *
     *
     */


    public boolean sumPossible(int number, List<Integer> sequence, HashMap<Integer, Boolean> memoizationMap){

        if(number == 0){
            return true;
        }
        if(number < 0){
            return false;
        }


        if(memoizationMap.containsKey(number)){
            return memoizationMap.get(number);
        }

        for(int num : sequence){

            int amount = number - num;
            if(sumPossible(amount, sequence, memoizationMap)){
                memoizationMap.put(number, true);
                return true;
            }
        }

        return false;

    }


    public static <T> T element(){

        return (T) "Java developers";
    }












}


class DesignImplementation{

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
     Future<List<Integer>> future = executorService.submit(()->
             Arrays.asList(1, 2, 3, 4, 5)
        );




     sendReminderToEmployee();













    }


    public static Void runAsyncMethod() throws ExecutionException, InterruptedException {


        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() ->{

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Running  background task on thread: " + Thread.currentThread().getName() );

        });



       return completableFuture.get();




    }



    public static List<String> supplyAsyncCompletableFuture() throws ExecutionException, InterruptedException {

        CompletableFuture<List<String>> completableFutureString =  CompletableFuture
                .supplyAsync(()->{

                    System.out.println("This thread is being  executed by : "+Thread.currentThread().getName() );

                    try {
                        Thread.sleep(Duration.ofMinutes(1));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                    return Arrays.asList("Completable future  implemented", "successfully");

                });
        // use


        return completableFutureString.get();

    }




    public static void sendReminderToEmployee(){




        Employees employee1 = new Employees("John", 20, "New York", true);
        Employees employee2 = new Employees("Jane", 25, "New York", true);
        Employees employee3 = new Employees("Joseph", 30, "New York", true);
        Employees employee4 = new Employees("Joseph", 30, "New York", false);


        List<Employees> employees = Arrays.asList(employee1, employee2, employee3, employee4);

        CompletableFuture.supplyAsync(() ->{

            System.out.println(Thread.currentThread().getName() + " is running background task" );

            try {
                Thread.sleep(Duration.ofMinutes(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return employees;
        }).thenApplyAsync(employees1 ->{

            System.out.println(Thread.currentThread().getName() + " is running background task" );


            try {
                Thread.sleep(Duration.ofMinutes(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            return employees1.stream().filter(Employees::isOnContract).toList();

        }).thenAccept(employees1 -> {

            System.out.println(Thread.currentThread().getName() + " is running background task" );
            employees1.forEach(employee -> {

                System.out.println("Sending reminder to employee: " + employee.getName() + " at " + employee.getAddress());
            });


    });
}
















    }



class Employees{

    private String name;
    private int age;
    private String address;
    private boolean isOnContract;


    public Employees(String name, int age, String address, boolean isOnContract) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isOnContract = isOnContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOnContract() {
        return isOnContract;
    }

    public void setOnContract(boolean onContract) {
        isOnContract = onContract;
    }
}