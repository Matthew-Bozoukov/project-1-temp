import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class p1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [][] map= new String[10][10];
			String[][][] map3d = new String[100][100][100];
		Scanner scanner;
		File f=new File("map1.txt");
		File f2= new File("coordinte example.txt");
		try {
			
			scanner = new Scanner(f);
			
			int rows=scanner.nextInt();
			int cols=scanner.nextInt();
			int rooms=scanner.nextInt();
			scanner.nextLine();
			System.out.println(rows);
			System.out.println(cols);
			System.out.println(rooms);
			
			int count =1;
			if(rooms==1) {
				while(scanner.hasNext()) {
					for(int i=0; i<map.length; i++) {
						for(int j=0; j<map[0].length; j++) {
							map[i][j]=scanner.next();
							System.out.println("row"+ count + map[0][j]);
							count++;
						}
					}
				}
			}else {
				for(int i=0; i<map3d.length; i++) {
					for(int j=0; j<map3d[0].length; j++) {
						for(int k=0; k<map[0].length;k++) {
							map3d[i][j][k]=scanner.next();
							System.out.println(map3d[i][j][k]);
						}
					}
				}
			}if(f.compareTo(f2)==0) {
				coordinateBased(scanner);
			}
		
			
			
			
				
		
			
			
			//while(scanner.hasNextLine()){
			
		//String line = scanner.nextLine();
			//
			///}
			
			//
			
			//
			//
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
		public static void coordinateBased(Scanner s) {
			int rows=s.nextInt();
			int cols=s.nextInt();
			int rooms=s.nextInt();
			
			System.out.println(rows);
			System.out.println(cols);
			System.out.println(rooms);
		}

}
