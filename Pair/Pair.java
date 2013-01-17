package com.iut.Pair;

import java.util.Scanner;

public class Pair {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre entier");
		String str = sc.nextLine();
		float nb = Integer.parseInt(str);
		if ((nb > 0) && (nb % 2) == 0) {
			System.out.println("Le nombre est positif et impair");
		}
		if (nb < 0) {
			if (((nb * -1) % 2) == 0) {
				System.out.println("Le nombre est négatif et impair");
			}
		}
	}
}
