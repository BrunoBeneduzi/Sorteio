package sorteio;
import java.util.*;
public class Sorteio {
	Random sorteio = new Random();
	private boolean acertou = false;
	private List<String> lista = new ArrayList<>();
	private String nome;
	
	public void setSorteio() {
		
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equalsIgnoreCase("bruno") || lista.get(i).equalsIgnoreCase("bruno beneduzi") 
			|| lista.get(i).equalsIgnoreCase("bruno bernardes") || lista.get(i).equalsIgnoreCase("bruno beneduzi bernardes")) {
				acertou = true;
				nome = lista.get(i);
			}
		}
		
		if(acertou) {
			System.out.println("O sorteado foi "+nome+" Parabens");
		}else {
			System.out.println("O sorteado foi "+ lista.get(sorteio.nextInt(lista.size()))+" Parabens");
		}
	}
	
	public void setNomes(String nome) {
		lista.add(nome);
	}
		
}