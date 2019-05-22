package arquivo;
import java.io.*;
public interface GeradorClientes {
	public void gravarClientes(String[] nome) throws IOException;
	public void lerClientes() throws IOException;
}
