import it.unibs.fp.mylib.InputDati;

public class DeterminanteMain {

	public static void main(String[] args) {

		Matrice Mat=new Matrice(InputDati.leggiIntero("Inserire il numero della dimensione della matrice: "));
		int [][] matricediprova=Mat.costruzioneMatrice();
		System.out.println(Mat.calcoloDeterminante(matricediprova, 0, 0));
	}

}
