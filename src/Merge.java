
public class Merge {

	public static void main(String[] args) {
		int [] lista = {26, 69,25,53,59,27,41,0,33,16,35,43};
		
		mergesort(lista, 0, lista.length - 1);
		
		for(int f = 0; f<lista.length; f++) {
			System.out.print(lista[f] + ", ");
		}

	}
	
	static void mergesort(int [] lista, int inicio, int fim) {
		
		int pos = (inicio+fim)/2;
		int meioPFim = pos+1;
		int i = inicio;
		int j = pos+1;
		int k = 0;
		int [] aux = new int [fim-inicio+1]; 
		
		if(inicio<fim) {
			
			mergesort(lista, inicio, pos); //Sublista a esquerda
			mergesort(lista, meioPFim, fim); //Sublista a direita
			
			while( i <= pos || j<=fim ) {
				if(i>pos) 
				{
					aux[k]=lista[j];
					j++;
				}
				else if( j> fim ) 
				{
					aux[k] = lista[i];
					i++;
				}
				else if(lista[i] < lista[j]) {
					aux[k] = lista[i];
					i++;
				}
				else {
					aux[k] = lista[j];
					j++;
				}
				k++;
			}
			
			k = 0;
			for(int z = inicio; z<=fim; z++) {
				lista[z] = aux[k];
				k++;
			}
		}	
	}

}
