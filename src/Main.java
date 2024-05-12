import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Mini");
        System.out.println("2. Super Size Me");
        System.out.print("Sua escolha: ");
        
        Scanner input = new Scanner(System.in);
        
        int tipo = input.nextInt();

        Combo combo = criarCombo(tipo);
        combo.mostrarItens();
        
        input.close();
    } 
   
    public static Combo criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                return criarComboMini();
            case 2:
                return criarSuperCombo();
            default:
                throw new IllegalArgumentException("Tipo de combo inválido");
        }
    }

    public static Combo criarComboMini() {
        Burger burger = new Burger("Cheeseburger", 12.99, 150);
        Sobremesa sobremesa = new Sobremesa("Casquinha", 3.99, "Pequeno");
        Bebida bebida = new Bebida("Sprite", 4.99, 300);
        return new Combo(burger, sobremesa, bebida);
    }

    public static Combo criarSuperCombo() {
        Burger burger = new Burger("Big Mac", 19.99, 250);
        Sobremesa sobremesa = new Sobremesa("Sundae", 10.99, "Grande");
        Bebida bebida = new Bebida("Coca", 9.99, 700);
        return new Combo(burger, sobremesa, bebida);
    }
}