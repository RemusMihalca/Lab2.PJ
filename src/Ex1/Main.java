package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            File file =new File("judete_in.txt");
            Scanner scanner = new Scanner(file);

            //Incarcam datele din fisier intr-un tablou de String-uri
            String[] judete= new String[39];//Numarul total de judete din tara
            int index=0;

            while(scanner.hasNextLine()){
                judete[index++]=scanner.nextLine();
            }

            //Sortam tabloul de judete
            Arrays.sort(judete);

            //Afisam judetele sortate
            System.out.println("Judete sortate: ");
            for(String judet : judete){
                System.out.println(judet);
            }

            //Cautam judetul introdus de la tastatura folosind cautarea binara
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Introduceti judetul cautat: ");
            String judetCautat = inputScanner.nextLine();
            int pozitie =Arrays.binarySearch(judete, judetCautat);

            //Verificam daca judetul a fost gasit si afisam pozitia sa in tablou
            if(pozitie>=0) {
                System.out.println(" Judetul " + judetCautat + " se afla pe pozitia " + (pozitie + 1) + " in lista ordonata. ");
            }else{
                System.out.println(" Judetul "+ judetCautat +" nu a fost gasit in lista ordonata. ");
             }
            scanner.close();
            inputScanner.close();

        }
    }