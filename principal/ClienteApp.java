package principal;
import arquivo.GerenciadorClientesArquivo;
import arquivo.GeradorClientes;
import entradados.Console;

public class ClienteApp {
	public static void main(String[] args) {
		String[] nomes = new String[2];
		GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();
		
		for (i=0;i<nome.length;i++) {
			System.out.println("Nome do cliente " + i + " : ");
			nomes[i]=Console.readString();
			geradorCliente.gravarClientes(nomes):
			}
		System.out.println("Exibe dados do arquivo");
		gerenciadorCliente.lerClientes();
	}
}
