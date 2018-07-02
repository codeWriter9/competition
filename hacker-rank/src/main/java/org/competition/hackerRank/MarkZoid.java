package org.competition.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarkZoid {

	/**
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r, c;
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[5];
		in.next();
		for (int i = 0; i < 5; i++) {
			grid[i] = in.next();
		}
		nextMove(r, c, grid);
	}

	/**
	 * 
	 * 
	 * 
	 * @param n
	 * @param grid
	 * @return
	 */
	static List<List<Integer>> listOfLoci(int n, String[] grid) {
		List<List<Integer>> listOfLoci = new ArrayList<List<Integer>>();
		int r2 = -1;
		int c2 = -1;

		for (int i = 0; i < n; i++) {
			char[] charArray = grid[i].toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[j] == 'd') {
					List<Integer> loci = new ArrayList<Integer>();
					loci.add(i);
					loci.add(j);
					listOfLoci.add(loci);
				}
			}
		}
		return listOfLoci;
	}

	static List<Integer> move(String move, List<Integer> coordinates) {
		if ("LEFT".equals(move)) {
			coordinates.set(1, coordinates.get(1) - 1);
		} else if ("RIGHT".equals(move)) {
			coordinates.set(1, coordinates.get(1) + 1);
		} else if ("UP".equals(move)) {
			coordinates.set(0, coordinates.get(0) - 1);
		} else if ("DOWN".equals(move)) {
			coordinates.set(0, coordinates.get(0) + 1);
		}
		return coordinates;
	}
	
	static boolean hasNotReached(int posr, int posc, int r2, int c2) {
		return !(posr == r2 && posc == c2);
	}

	/**
	 * 
	 * 
	 * 
	 * @param posr
	 * @param posc
	 * @param grid
	 */
	static void nextMove(int posr, int posc, String[] grid) {
		List<List<Integer>> listOfLoci = listOfLoci(5, grid);
		List<Integer> bot = Arrays.asList(new Integer[] {posr, posc});
		for (List<Integer> pos : listOfLoci) {			
			int r2 = pos.get(0);
			int c2 = pos.get(1);
			int count = 1;
			System.out.println(pos + " " + bot + " " + hasNotReached(posr, posc, r2, c2));
			while(hasNotReached(bot.get(0), bot.get(1), r2, c2)) {
				System.out.println(pos + " " + bot);
				String move = whereToMove(bot.get(0), bot.get(1), r2, c2);
				System.out.println(move);
				if(count > 10) System.exit(0);
				if(!"CLEAN".equals(move)) move(move, bot);
				else if(grid[r2].charAt(c2) == 'd') {
					grid[r2].toCharArray()[c2] = '-';
				}
				count++;
			}
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param r
	 * @param c
	 * @param r2
	 * @param c2
	 * @return
	 */
	static String whereToMove(int r, int c, int r2, int c2) {
		String move = null;
		System.out.println("r " + r + ",c " + c + ",r2 " + r2 + ",c " + c2);
		if (r == r2 && c == c2)
			move = "CLEAN";
		else if (r - r2 == 0) {
			if (c < c2) {
				move = "RIGHT";
			} else
				move = "LEFT";
		} else if (c - c2 == 0) {
			if (r < r2) {
				move = "DOWN";
			} else
				move = "UP";
		} else {
			if (Math.abs(r - r2) < Math.abs(c - c2)) {
				if (r < r2) {
					move = "DOWN";
				} else
					move = "UP";
			} else {
				if (c < c2) {
					move = "RIGHT";
				} else
					move = "LEFT";
			}
		}
		return move;
	}
}