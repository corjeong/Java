package test;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ȧ�� ���� �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //�ٸ� Ȧ�� ���� �־����
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print('*');
			}

			System.out.println();
			
			if(i < lineCount/2) {
				spaceCount--;
				starCount += 2;
			}
			else {
				spaceCount++;
				starCount -= 2;				
			}

		}

	}

}
