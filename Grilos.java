public class Grilos  extends Thread{
	
	//variaveis
	int lChegada = 100;
	
	int distancia;
	
	int max = 20;
	
    int min = 5;
    
    int posi��o;
    
    int saltos;
    
    private String nome;
    
      
    public Grilos(String nome, int lChegada)
    {
        this.nome = nome;
        
        this.lChegada = lChegada;
        
        start();
    }


	public void run()
    {
		
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName());
        
        System.out.println("A chegada esta a "+lChegada);
        
        while(posi��o < lChegada) {
        	int distancia = (int)Math.floor(Math.random()*(max-min+1)+min);
        	posi��o += distancia;
        	System.out.println(nome + " pulou " + distancia + " Cm" + ", percorreram um total de " + posi��o +" Cm");
        	saltos++;
        }
        
        if (posi��o >= lChegada) {
        	System.out.println(nome + " Chegou " + "com total de saltos de " + saltos);
        }
        
    }
}