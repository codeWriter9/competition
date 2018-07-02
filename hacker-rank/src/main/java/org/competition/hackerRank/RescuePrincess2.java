package org.competition.hackerRank;

import java.util.Scanner;

public class RescuePrincess2 {
	
	static String move(int r, int c, int r2, int c2) {
		String move = null;
		if(r - r2 == 0) {
			if(c < c2) {
				move = "RIGHT";
			}
			else move = "LEFT";
		}
		else if(c - c2 == 0) {
			if(r < r2) {
				move = "DOWN";
			}
			else move = "UP"; 
		}
		else {
			if(Math.abs(r-r2) < Math.abs(c-c2)) {
				if(r < r2) {
					move = "DOWN";
				}
				else move = "UP";
			}
			else {
				if(c < c2) {
					move = "RIGHT";
				}
				else move = "LEFT";
			}
		}		
		return move;
	}

	static void nextMove(int n, int r, int c, String[] grid) {
		int r2 = -1;
		int c2 = -1;
		
		for (int i = 0; i < n; i++) {			
			char [] charArray = grid[i].toCharArray();
			for(int j=0;j< charArray.length; j++) {
				if(charArray[j] == 'p') {
					r2 = i;
					c2 = j;
				}   
			}
		}
		System.out.println(move(r, c, r2, c2));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];
		in.next();
		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}
		nextMove(n, r, c, grid);
	}
}