import java.awt.List;
import java.util.ArrayList;
// Alunos : Anderson Mendes Munhoz, Henrique Kasprzak Bernardo, Nilson de Araujo Souza Junior.
public class main {
    public static void main(String[] args){

        lista listan  = new lista(10);  
        listan.adiconar("5"); 
        listan.adiconar("10.3");


        System.out.println("Quantidade");
        System.out.println(listan.tamanho());
        System.out.println("Valores");

        for (int i = 0; i < listan.tamanho(); i++) {
            System.out.println(listan.get(i));
           }

           System.out.println(listan.get(2));

           listan.adiconar("-10");

           System.out.println(listan.get(2));

           
           listan.set(1, "1000");

            //printa apenas para verificação
           System.out.println(listan.get(1));

           listan.limpar();
    }
    
}
