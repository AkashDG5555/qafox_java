package qafox;

import java.util.Scanner;

public class exercise_5_vowel_or_not {
public static void main(String[] args) {
	Scanner sc1 =new Scanner(System.in);
	System.out.println("Ener any Character");
	
	char ch = sc1.next().charAt(0);
	boolean isvowel=false;
	
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U': isvowel=true;
	
	}
	if (isvowel) {
		System.out.println(ch+" is a vowel");
	}else {
		System.out.println(ch+" is not a vowel");
	}
}

}
