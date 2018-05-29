 import java.util.Scanner;

import it.unibs.fp.mylib.InputDati;

public class Matrice {
 
	private int dimensione;

	public Matrice(int dimensione) {
		this.dimensione=dimensione;
	}
	
	public int[][] costruzioneMatrice(){
       int[][] mat= new int [dimensione][dimensione];
		int i,j;//,k;
//		for(k=0;k<dimensione;k++) {
			for(i=0;i<dimensione;i++) {
				for(j=0;j<dimensione;j++) {
						mat[i][j]=InputDati.leggiIntero("");				
				}
			}
//		}
			return mat;
	}


/*public int calcoloDeterminante(int[][] M) {
	int i,j,k;
	int[][] mat= new int [dimensione][dimensione];
	for(k=0;k<dimensione;k++) {
		for(i=0;i<dimensione;i++) {
			for(j=0;j<dimensione;j++) {
					mat[i][j]=InputDati.leggiIntero("");				
			}
		}
	}
	
 }*/
public int calcoloDeterminante(int[][] M, int colonna,int riga) {
	int determinante=2;
	for(int i=riga;i<dimensione;i++) {
	if (riga==dimensione-1||colonna==dimensione-1)
		determinante= M[riga][colonna];
	determinante=calcoloDeterminante(M,riga+1,colonna+1);
	}
return determinante;
}	
	
}
