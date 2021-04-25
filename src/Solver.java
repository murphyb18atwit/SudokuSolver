import java.util.ArrayList;
	
	
	public class Solver {

		
		
		//Checks the 2D array to see if there is a 0 value.
		public static boolean checkZero(int[][] array) {
			
			for(int i = 0; i < 9; i++) {
				for(int u = 0; u < 9; u++) {
					if(array[i][u] == 0) {
						return true;
					}
				}
			}
			
			return false;
		}
		
		//Looks at given row and column and returns quadrant that the cell is in.
		//|1  2  3|
		//|4  5  6|
		//|7  8  9|
		public static int quadrant(int row, int col) {
			int quadrant = 0;
			
			if(row < 3 && col < 3) {
				quadrant = 1;
			}
			else if(row < 3 && col >= 3 && col < 6) {
				quadrant = 2;
			}
			else if(row < 3 && col >= 6) {
				quadrant = 3;
			}
			else if(row >= 3 && row < 6 && col < 3) {
				quadrant = 4;
			}
			else if(row >= 3 && row < 6 && col >= 3 && col < 6) {
				quadrant = 5;
			}
			else if(row >= 3 && row < 6 && col >= 6) {
				quadrant = 6;
			}
			else if(row >= 6 && col < 3) {
				quadrant = 7;
			}
			else if(row >= 6 && col >= 3 && col < 6) {
				quadrant = 8;
			}
			else if(row >= 6 && col >= 6) {
				quadrant = 9;
			}
			
			return quadrant;
		}
		
		//Looks at given cell in the 2D array, and creates an array of
		//the possible values for the cell.
		public static ArrayList<Integer> possibleVals(int[][] array, int row, int col) {
			
			ArrayList<Integer> vals = new ArrayList<Integer>();
			
			//Checks first column
			for(int i = 0; i < 9; i++) {
				if(array[i][col] != 0) {
					vals.add(array[i][col]);
				}
			}
			//Checks first row, excluding values found in the column
			for(int i = 0; i < 9; i++) {
				if(array[row][i] != 0 && vals.contains(array[row][i]) == false) {
					vals.add(array[row][i]);
				}
			}
			
			//Checks 3x3 quadrant that the cell is in, excluding values already found
			if(quadrant(row, col) == 1) {
				for(int i = 0; i < 3; i++) {
					for(int u = 0; u < 3; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 2) {
				for(int i = 0; i < 3; i++) {
					for(int u = 3; u < 6; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 3) {
				for(int i = 0; i < 3; i++) {
					for(int u = 6; u < 9; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 4) {
				for(int i = 3; i < 6; i++) {
					for(int u = 0; u < 3; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 5) {
				for(int i = 3; i < 6; i++) {
					for(int u = 3; u < 6; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 6) {
				for(int i = 3; i < 6; i++) {
					for(int u = 6; u < 9; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 7) {
				for(int i = 6; i < 9; i++) {
					for(int u = 0; u < 3; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 8) {
				for(int i = 6; i < 9; i++) {
					for(int u = 3; u < 6; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			else if(quadrant(row, col) == 9) {
				for(int i = 6; i < 9; i++) {
					for(int u = 6; u < 9; u++) {
						if(array[i][u] != 0 && vals.contains(array[i][u]) == false) {
							vals.add(array[i][u]);
						}
					}
				}
			}
			
			
			ArrayList<Integer> notFound = new ArrayList<Integer>();
			
			for(int i = 1; i < 10; i++) {
				if(vals.contains(i) == false) {
					notFound.add(i);
				}
			}
			
			
			return notFound;
		}
		
		public static void solve(int[][] puzzle) {
            boolean loop = true;

            for(int i = 0; i < 9; i++) {
                for(int u = 0; u < 9; u++) {
                    System.out.print(puzzle[i][u]);
                }
                System.out.println();

            }

            System.out.println();

            while(checkZero(puzzle) && loop == true) {
            	loop = false;
                for(int i = 0; i < 9; i++) {
                    for(int u = 0; u < 9; u++) {
                        if(possibleVals(puzzle, i, u).size() == 1 && puzzle[i][u] == 0) {
                            puzzle[i][u] = possibleVals(puzzle, i, u).get(0);
                            loop = true;
                        }
                    }
                }
            }

            for(int i = 0; i < 9; i++) {
                for(int u = 0; u < 9; u++) {
                    System.out.print(puzzle[i][u]);
                }
                System.out.println();
            }
        }
		
		public static void main(String[] args) {
			int[][] puzzle = new int[9][9];
			puzzle[0][4] = 9;
			puzzle[0][6] = 5;
			puzzle[0][8] = 1;
			puzzle[1][7] = 2;
			puzzle[2][0] = 8;
			puzzle[2][1] = 3;
			puzzle[2][4] = 2;
			puzzle[3][2] = 4;
			puzzle[3][4] = 1;
			puzzle[3][5] = 6;
			puzzle[3][6] = 7;
			puzzle[3][7] = 5;
			puzzle[4][0] = 3;
			puzzle[4][4] = 7;
			puzzle[4][5] = 5;
			puzzle[4][7] = 1;
			puzzle[4][8] = 8;
			puzzle[5][1] = 5;
			puzzle[5][7] = 9;
			puzzle[6][0] = 4;
			puzzle[6][1] = 1;
			puzzle[6][6] = 9;
			puzzle[6][8] = 2;
			puzzle[7][0] = 7;
			puzzle[7][2] = 3;
			puzzle[7][6] = 1;
			puzzle[8][1] = 2;
			puzzle[8][3] = 6;
			puzzle[8][4] = 5;
			puzzle[8][8] = 4;
			
			solve(puzzle);
			
		}
	}
