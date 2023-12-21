package principal;
import sorteio.Sorteio;

public class Main {

	public static void main(String[] args) {
		Sorteio sorteio = new Sorteio();
		
		sorteio.setNomes("Joao");
		sorteio.setNomes("Samanta");
		sorteio.setNomes("Marcelo Roza");
		sorteio.setNomes("Thiele");
		sorteio.setNomes("Bruno Beneduzi");
		
		sorteio.setSorteio();

	}

}
