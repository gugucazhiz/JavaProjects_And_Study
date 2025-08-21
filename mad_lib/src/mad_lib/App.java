package mad_lib;
import java.util.Scanner;


public class App {
		private String adjetivu1;
		private String adjetivu2;
		private String adjetivu3;
		private String name;
		private String verb;
		private int pontuacao;
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Jogo jogo = new Jogo(scan);
		int i =0;
		
		
		while(i !=3) {
			System.out.println(" ");
			System.out.println("------------");
			System.out.println("1)Novo Jogo");
			System.out.println("2)Score");
			System.out.println("3)Sair");
			System.out.println("------------");
			System.out.println(" ");
			i = scan.nextInt();
			scan.nextLine();
			if(i == 1) {
				jogo.novoJogo();
			}
			else if(i == 2){
				System.out.println(" ");
				System.out.println("------------");
				System.out.print("Pontos:");
				System.out.println(jogo.pontos());
			}
		}
		
	}

	public String getAdjetivu1() {
		return adjetivu1;
	}
	public void setAdjetivu1(String adjetivu1) {
		this.adjetivu1 = adjetivu1;
	}
	public String getAdjetivu2() {
		return adjetivu2;
	}
	public void setAdjetivu2(String adjetivu2) {
		this.adjetivu2 = adjetivu2;
	}
	public String getAdjetivu3() {
		return adjetivu3;
	}
	public void setAdjetivu3(String adjetivu3) {
		this.adjetivu3 = adjetivu3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}

	public void setPontuacao(int pontuacao){
		this.pontuacao += pontuacao;
	}

	public int getPontuacao(){
		return pontuacao;
	}
	
}
