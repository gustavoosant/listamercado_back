package com.gustadev.appmercado.services;

import com.gustadev.appmercado.model.ItemLista;

public interface IItemListaService {
    public ItemLista inserirItemLista(ItemLista novo);
    public ItemLista alterarItem(ItemLista item);
    public void      removerItem(Integer numSeq);
}
