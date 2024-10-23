package appmercado.service;

import appmercado.model.Produto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements IProdutoService{

    @Override
    public Produto criarNovoProduto(Produto prod) {
        return null;
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        return null;
    }
}
