package com.gustadev.appmercado.services;

import com.gustadev.appmercado.model.ItemLista;
import com.gustadev.appmercado.model.Lista;

public interface IListaService {
    public Lista criarNovaLista(Lista nova);
    public void  removerLista(Integer id);
    public void  fecharLista(Integer id);
    public void  buscarPorID(Integer id);
}
