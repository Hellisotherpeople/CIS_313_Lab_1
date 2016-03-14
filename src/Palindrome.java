/*
 * CIs 313 Lab 1
 * Allen Roush 
 * Note: All functions (omitting comments and possibly bracket spaces) should be less than 9 lines of code. 
 */

import java.util.Scanner;

public class Palindrome
{
    Stack stack;
    Queue queue;

    public Palindrome()
    {
        stack = new Stack();
        queue = new Queue();
    }

    public static void main(String[] args)
    /* 
     * This method executes the other Palindrome methods 
     */
    {
        Palindrome palindrome = new Palindrome();
        String input = getInput();
        String processedString = processString(input);
        palindrome.populateDataStuctures(processedString);
        palindrome.isPalindrome(processedString);
    }

    public static String getInput()
    /* 
     * This method takes input from the user and returns a string that corespondes to the line that they typed into the CLI
     */
    {
        String pstring;
        System.out.println("Enter a string to test!");
        Scanner userinput = new Scanner(System.in);
        pstring = userinput.nextLine(); // Need to use this rather than .next to parse 
        userinput.close();
        return pstring;
    }

    public static String processString(String str)
    /* 
     * This method decapitalizes and removes the white space from a passed in string, and returns the new string. 
     */
    {
        String processedString;
        str = str.toLowerCase();
        processedString = str.replaceAll("\\s", ""); // gets rid of all white space chars and replaces them with empty chars. 
        return processedString;
    }

    public void populateDataStuctures(String str)
    /* 
     * This function populates the stack and queue with each character from the parsed string that it takes as input.  
     */
    {
        queue = new Queue();
        stack = new Stack();
        for (int i = 0; i < str.length(); i++)
        {
            char a_char = str.charAt(i);
            stack.push(new Node(a_char)); //push a new node initialized to the entered character 
            queue.enqueue(new Node(a_char));
        }
    }

    public boolean isPalindrome(String str)
    /*
     * This function uses the stack and queue to check if the user entered string is a Palindrome. Returns true if the string is a Palindrome. 
     */
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (stack.pop().data != queue.dequeue().data)
            {
                System.out.println("The inputed string is not a palindrome!");
                return false;
            }
        }
        System.out.println("The inputed string is a palindrome!");
        return true;
    }
}
