package mad_lib;
import java.util.Scanner;

public class Jogo{
	App jogo = new App();
	private Scanner scan;
	public Jogo(Scanner scan){
		this.scan = scan;
	}

    public void novoJogo() {
		System.out.println(" ");
		System.out.println("------------");
		System.out.println("Enter a Adjective (Description): ");
		jogo.setAdjetivu1(scan.nextLine());
		System.out.println("Enter a Name (Animal or Person");
		jogo.setName(scan.nextLine());
		System.out.println("Enter a Adjective (Description): ");
		jogo.setAdjetivu2(scan.nextLine());
		System.out.println("Enter a Verb end with -ing (Action): ");
		jogo.setVerb(scan.nextLine());
		System.out.println("Enter a Adjective (Description): ");
		jogo.setAdjetivu3(scan.nextLine());
		
		System.out.println("-------------");
		
		System.out.println("Today i went to a " + jogo.getAdjetivu1() + " Zoo.");
		System.out.println("in a exhibit I saw a " + jogo.getName() + ".");
		System.out.println("Was " + jogo.getAdjetivu2() +" and " + jogo.getVerb() + "!");
		System.out.println("I Was " + jogo.getAdjetivu3() + "!");
		jogo.setPontuacao(1);
	}


	public int pontos(){
		return jogo.getPontuacao();
	}
}
