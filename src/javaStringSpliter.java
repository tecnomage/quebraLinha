import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class javaStringSpliter {

	public static void main(String[] args) {

		quebraString();

	}

	public static void quebraString() {

		File fileName = new File("/home/vini/teste.txt");

		System.out.println(fileName.getAbsoluteFile());

		if (fileName.exists()) {
			try {
				String content = new String(Files.readAllBytes(Paths.get("/home/vini/teste.txt")));

				String[] arqModificado = content.split(",");
				
				for (String string : arqModificado) {
					System.out.println(string);
					
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("o arquivo nao existe");
		}
	}

}
