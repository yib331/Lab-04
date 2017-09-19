/**
 * CS 2003 - Lab 2

 *@author Yiting Bai
 * @date 2017/9/5
 * @version 1.0
 * Tuesday
 */

import java.io.*;
import java.util.*;
public class SeatMap {
	
	private int row = 6;
	private int colume = 6;
	String[][] seat = new String [row][colume];
	
	public void scanner(){
		File inputfile = new File("names.dat");
		
		try {
			Scanner input = new Scanner(inputfile);
			for (int i = 0; i < row; i++) {
				for(int j = 0; j < colume; j++) {
					if(input.hasNext()){
						seat[i][j] = input.nextLine();
					}
					else
						seat[i][j] = "Not exist";
					
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public String findname (int row, int colume) {
		String name;
		name = seat[row][colume];
		return name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatMap map = new SeatMap();
		map.scanner();
		System.out.println("Please enter a row number from 0-5");
		Scanner console_r = new Scanner(System.in);
		int r = console_r.nextInt();
		System.out.println("Please enter a colume number from 0-4");
		Scanner console_c = new Scanner(System.in);
		int c = console_c.nextInt();
		System.out.println(map.findname(r,c));
		

	} 
}
