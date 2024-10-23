package appmercado.service;

import appmercado.model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProdutoService {
    public Produto criarNovoProduto(Produto prod);
    public Produto alterarProduto(Produto prod);
    public List<Produto> listarTodos();
    public List<Produto> buscarPorPalavraChave(String key);
}
