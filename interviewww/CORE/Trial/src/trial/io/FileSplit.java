package trial.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSplit {

	public static void splitFile(File f) throws IOException {

		int partCounter = 1;
		// I like to name parts from 001, 002, 003, ...
		int sizeOfFiles = 1024 * 1024; // 1 MB
		byte[] buffer = new byte[sizeOfFiles];
		String fileName = f.getName();
		System.out.println(fileName);
		// try-with-resources to ensure closing stream
		try (
				// FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f))) {

			int bytesAmount = 0;
			while ((bytesAmount = bis.read(buffer)) > 0) {
				// write each chunk of data into separate file with different
				// number in name
				System.out.println(fileName);
				String filePartName = String.format("%s", fileName, partCounter++);
				System.out.println(filePartName);
				File newFile = new File(f.getParent(), filePartName);
				try (FileOutputStream out = new FileOutputStream(newFile)) {
					out.write(buffer, 0, bytesAmount);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File f = new File("I:/FileIO/abc.txt");
		splitFile(f);
	}
}
