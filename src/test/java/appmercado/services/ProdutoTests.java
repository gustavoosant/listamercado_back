package appmercado.services;

import com.gustadev.appmercado.AppmercadoApplication;
import com.gustadev.appmercado.model.Produto;
import com.gustadev.appmercado.services.IProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(classes = AppmercadoApplication.class)
public class ProdutoTests {

    @Autowired
    private IProdutoService service;

    @Test
    public void shouldStoreProduct(){
        Produto p = new Produto();
        p.setNome("Bolacha");
        assertNotNull(service.criarNovoProduto(p));
    }
}