package CadastraProdutoBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.sistemadepedidos.modelo.Produto;

@Named(value = "cadastrarProdutoBean")
@RequestScoped
public class CadastraProdutoBean {
            
    Produto produto = new Produto();
    
    
    public void adicionar() {
        //System.out.println(produto);
    }

    public Produto getProduto() {
        return produto;
    }
}
    

