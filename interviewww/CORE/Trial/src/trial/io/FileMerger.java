package trial.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("I:/trial");
		PrintWriter pw = new PrintWriter(fw);

		FileReader fr1 = new FileReader("I:/trial1.txt");
		BufferedReader br1 = new BufferedReader(fr1);

		FileReader fr2 = new FileReader("I:/trial2.txt");
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		while (line1 != null) {
			pw.println(line1);
			line1 = br1.readLine();
		}

		while (line2 != null) {
			pw.println(line2);
			line2 = br2.readLine();
		}

		System.out.println("Merger complete");
		fw.close();
		fr1.close();
		br2.close();

	}

}
