import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(char c: input.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(c);
            }
        }


        System.out.println("The sentence with each word reversed is: " + sb.toString());
        sc.close();
    }
}
//Your code reverses each individual word in the sentence while maintaining the original word order, which is correct. However, there’s a small improvement you can make to avoid an extra space at the end of the final output.

//Currently, when you append each reversed word to the result StringBuilder, a space is also added at the end. This means that when the sentence is printed, there will be an additional trailing space. To remove this, you can use trim() to remove any extra whitespace from the beginning and end of the final result string.
