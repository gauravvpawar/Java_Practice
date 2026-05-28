package _02_Conditions.PracticeQuestion;

// check weather vowels present in the given or consonants
// consonant mean all the reaming words in alphabet except vowels

import java.util.Scanner;

public class _07_CharacterCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);


        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Vowels");
        }else{
            System.out.println("consonants");
        }
    }
}
