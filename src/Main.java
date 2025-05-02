import org.w3c.dom.Node;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello developers");

        Map<String, String> dataSource = new HashMap<>();
        dataSource.put("Joseph", "Aidoo");
        System.out.println(dataSource);

//        System.out.println("Result of Problem 73: " + solveProblem73());


        dataSource.computeIfPresent("Joseph", (key, value) ->{

            if(key.equals("Joseph")){
                return "Acquah";
            }

            return "Mensah";

        }) ;

        System.out.println(dataSource);


        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "Hello developers";


        });

        future.thenAccept(result-> System.out.println(result));

        // understanding functional interface


    }


    private static  int longNetworkProcess(int value) throws InterruptedException {

        Thread.sleep(30000);

        return value + 50;
    }
    private static int longestNonRepeatingCharacters(String string){



        Map<String, Integer> map = new HashMap<>();

        map.put("name", 20);
        map.putIfAbsent("name", 45);
        System.out.println(map);

        if (string.isEmpty()) {

            return  0;
        }

        if(string.length() == 1) return 1;
        int left = 0, right = 0;
        int answer = 0;
        Set<Character> characters = new HashSet<>();
        while(right < string.length()){
            char c = string.charAt(right);
            while(characters.contains(c)){
                characters.remove(c);
                left = left + 1;

            }

            characters.add(c);
            answer = Math.max(answer, right  - left + 1);
            right = right + 1;

        }
        return answer;


    }

    private String minimumLength(String completeSentence, String start){

        if(completeSentence.isEmpty() || completeSentence.length() < start.length() || start.isEmpty()){
            return "";

        }

        Map<Character, Integer> targetMapStore = new HashMap<>();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(int i = 0; i < start.length(); i++){
            targetMapStore.put(start.charAt(i),  targetMapStore.getOrDefault(start.charAt(i),0 )  + 1);

            
        }

        int [] result = {-1, 0, 0 };

        int left = 0;
        int right = 0;

        while(right < completeSentence.length()){
            char c = completeSentence.charAt(0);

            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);

            return "";



        }
        

        return "";
    }

    public boolean isValidParenthesis(String s){

        Map<Character, Character> characterCharacterMap = new HashMap<>();

        characterCharacterMap.put(')', '(');
        characterCharacterMap.put('}', '{');
        characterCharacterMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!characterCharacterMap.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return true;
                }

                char top = stack.pop();
                if(top != characterCharacterMap.get(c)){
                    return false;
                }
            }
        }


        return stack.isEmpty();



    }

    public int longestValidParenthesis(String s){

        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == ')'){
                stack.push(-1);
            }else{

                stack.pop();

                if(stack.isEmpty()){
                    stack.push(1);
                }else{

                    Math.max(maxLength, i - stack.peek());
                }


            }
        }
        return maxLength;
    }




}




class Nodes{

    public static void main(String[] args) throws InterruptedException {

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.submit(()->{
            System.out.println("Hello");

            Thread.sleep(50000);
            return "Hello";
        });

        Future<String> future = singleThreadExecutor.submit(()->{
            try {
                Thread.sleep(5000000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "Hello";
        });


        future.cancel(true);

        System.out.println(future.isCancelled());



        if(singleThreadExecutor.awaitTermination(1, TimeUnit.MILLISECONDS)){
            System.out.println("Completed");
        }


        CompletableFuture<String> completableFuture = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(5000000); // Sleep for 5000 seconds (5000000 ms)
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return "Tried and tested";
                }).thenApplyAsync(result -> {
                    System.out.println("Hello");
                    return result + " and " + "for user resources";
                });



        completableFuture.thenAccept(System.out::println);



        // adding security implementation in java  solve real problems  and also







    }

    public Nodes prev;
    public Nodes next;
    public int data;

    public Nodes(int data){
        this.data = data;
        prev = next = null;
    }
}


class DoublyLinkedList{


    private Map<Integer, Nodes> map = new HashMap<>();
    private Nodes head = null;
    private Nodes tail = null;




    public Nodes insertNodeAtBeginning(Nodes head, int data){


        Nodes newNode = new Nodes(data);
        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        return newNode;


    }


    /**
     * Solves problem 73.
     * Placeholder for the actual implementation.
     *
     * @return String indicating the method is invoked.
     */
    public static String solveProblem73() {
        return "Problem 73 solution placeholder.";
    }


}


class LinkedListNode{

    public int data;
    public LinkedListNode next;
//    public LinkedListNode rightNode;


    public LinkedListNode(int data){

        this.data = data;
        this.next = null;
    }



}



class TreeNode{

    public TreeNode left;
    public TreeNode right;

    public int data;


    public TreeNode(int data){
        this.data = data;
        this.left = this.right = null;


    }



}

class Problems{
    public TreeNode removeLeaveNodes(TreeNode node,  List<Integer> leaves){

        if(node == null){
            return null;
        }
        if(node.left == null && node.right == null){
            leaves.add(node.data);
            return null;
        }

        node.left = removeLeaveNodes(node.left, leaves);
        return null;

    }

    public LinkedListNode removeNthNode(LinkedListNode head, int n){


        // list your dummmy node
        LinkedListNode dummyNode = new LinkedListNode(0);
        dummyNode.next = head;

        // initialize your fast and slow pointer

        LinkedListNode fastPointer = dummyNode;
        LinkedListNode slowPointer = dummyNode;
        for(int i = 0; i < n; i++){
            fastPointer = fastPointer.next;
        }

        while(fastPointer != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        slowPointer.next = slowPointer.next.next;
        return dummyNode.next;
    }


    // we are basically doing 2 things here


    public void reOrderLinkedList(LinkedListNode head){

        if(head == null){
            return;
        }

        // Fetch your linked list nodes
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //
        //separate the Linkedlist reverse the order side of
        // of the linkedList

        LinkedListNode prev = null;
        LinkedListNode currentNode = slow, tempNode = null;

        while(currentNode != null){
            tempNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = tempNode;
        }

        LinkedListNode fullNode = head, halfPartNode = currentNode;
        // joseph here we are doing 2 things here

        while(halfPartNode!= null){

            tempNode = fullNode.next;
            fullNode.next = halfPartNode;
            fullNode = tempNode;

            // let attached that to a second node to as well

            tempNode = halfPartNode.next;
            halfPartNode.next = fullNode;
            halfPartNode = tempNode;

        }

    }


    public LinkedListNode middleOfLinkedListNode(LinkedListNode head){

        LinkedListNode fast = head;
        LinkedListNode slow = head;


        while(fast != null && fast.next != null){
            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;




    }




}