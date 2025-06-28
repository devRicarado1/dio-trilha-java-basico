package ModelagemIphone;

// Funcionalidades a Modelar Navegador na Internet Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

public class NavegadorIntenet {
    
    private String urlPaginaAtual;
    
    public void exibirPagina(String url) {
        System.out.println("Tentando acessa URL " + url);
        
        if(url == null || url.trim().isEmpty()) {
            System.out.println("Para Acessa uma pagina e necessario digitar uma URL valida");
            return;
        } else {
            System.out.println("Pagina Acessada: " + url);
            this.urlPaginaAtual = url;
        }
    }
    
    public void adicionarNovaAba(String urlNovaAba) {
        System.out.println("Adicionando nova aba...");
        this.exibirPagina(urlNovaAba); // Chama o metodo exibirPagina com a URL recebida
        System.out.println("Nova aba aberta com URL" + urlNovaAba + "acessada");
    }
    
    public void atualizarPagina() {
        
        if(this.urlPaginaAtual == null || this.urlPaginaAtual.trim().isEmpty()) {
            System.out.println("Nenhuma Pagina está sendo exibida para atualiza.");
        } else {
            System.out.println("Atualizando Pagina " + this.urlPaginaAtual);
            this.exibirPagina(this.urlPaginaAtual);
        }         
    }
    
}
