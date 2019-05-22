package arquivo;

import java.io.*;

public class GerenciadorClientesArquivo implements GeradorClientes {

	@Override
	public void gravarClientes(String[] nome) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("arquivo.txt"));
			for(int i=0; i< nome.length;i++) {
				writer.write(nome[i]+" ");
				writer.newLine();
			}
		} catch (IOException exc) {
			System.out.println("Erro de I/O" + exc);
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException exc) {
				System.out.println("Fechando arquivo" + exc);
			}
		}
	}
	@Override
	public void lerClientes() {
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (IOException exc) {
			System.out.println("Erro de I/O: " + exc);
		}
	}
}
