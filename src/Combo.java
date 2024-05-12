public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebida bebida;
    
    public Combo(Burger burger, Sobremesa sobremesa, Bebida bebida) {
        this.burger = burger;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
    }

    public void mostrarItens() {
        System.out.println("Itens do Combo:");
        System.out.println("Burger: " + burger.getDescricao() + " - " + burger.getGramas() + "g - R$" + burger.getPreco());
        System.out.println("Sobremesa: " + sobremesa.getDescricao() + " - " + sobremesa.getTamanho() + " - R$" + sobremesa.getPreco());
        System.out.println("Bebida: " + bebida.getDescricao() + " - " + bebida.getMl() + "ml - R$" + bebida.getPreco());
    }
}