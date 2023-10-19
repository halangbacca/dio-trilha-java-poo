public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorDeInternet navegadorDeInternet = new NavegadorDeInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        System.out.println("===== Aparelho Telefônico =====");
        aparelhoTelefonico.atender(5553750);
        aparelhoTelefonico.ligar(5553750);
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("\n===== Navegador de Internet =====");
        navegadorDeInternet.exibirPagina("DIO");
        navegadorDeInternet.atualizarPagina();
        navegadorDeInternet.adicionarNovaAba();

        System.out.println("\n===== Reprodutor Musical =====");
        reprodutorMusical.selecionarMusica("The City - Madeon");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}