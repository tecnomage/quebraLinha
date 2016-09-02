import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class javaStringSpliter {

	public static void main(String[] args) {

		quebraString();

	}

	public static void quebraString() {

		File fileName = new File("lines.txt");
		
		System.out.println(fileName.getAbsoluteFile());

		

		if (fileName.exists() && fileName.canRead()) {
			try {
				String content = new String(Files.readAllBytes(Paths.get("texto.txt")));
				content.split(",");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("o arquivo nao existe");
		}
	}

}
