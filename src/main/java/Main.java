import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dau1, dau2;
        int[] resultatDau = new int[11];

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quantes vegades vols tirar els dos daus?");
        int numLlanzament = sc.nextInt();

        for(int llanzar=0;llanzar<numLlanzament;llanzar++){
            dau1 = llanzamentDau();
            dau2 = llanzamentDau();
            resultatDau[(dau1+dau2)-2]++;
        }

        System.out.println("\nNúmero de llançaments: " + numLlanzament );
        System.out.println("Resultats");
        for(int aux=0;aux<resultatDau.length;aux++){


            System.out.println((aux+2) + "\t" + " ---->\t" + resultatDau[aux] + " vegades");
        }

    }

    static int llanzamentDau(){
        return (int)Math.floor(Math.random()*6+1);
    }
}