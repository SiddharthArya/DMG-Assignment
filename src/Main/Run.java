package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			String s;
			BufferedReader br = new BufferedReader(new FileReader("./src/mushroom.dat"));
			while ((s=br.readLine())!= null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
