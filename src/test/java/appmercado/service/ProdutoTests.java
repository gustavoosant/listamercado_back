package appmercado.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import appmercado.model.Produto;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = ProdutoServiceImpl.class)
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
