public class BattleShip {
    public static void main(String[] args) {
        System.out.println("BattleShip v 0.1");
        char[][] campo = new char[5][5];
        char[][] navi = new char[5][5];

        //Devo inizializzare il campo da gioco
        for(int r = 0; r < campo.length; r++){
            for(int c = 0; c < campo.length; c++){
                campo[r][c] = '~';
                navi[r][c] = '~';
            }
        }
        stampaCampo(campo);

    }

    private static void stampaCampo(char[][] campo) {
        System.out.println("***** CAMPO DA GIOCO *****");

        //TODO: Riconvertire con un for-each
        // r sta per riga, c sta per colonna (andava bene anche "i" e "j"
        for(int r=0; r < campo.length; r++){
            for (int c=0; c < campo.length; c++){
                System.out.print(campo[r][c]);
            }
            System.out.println();
        }
        System.out.println();
    }
}