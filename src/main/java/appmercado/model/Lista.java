package appmercado.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "tbl_lista")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_list")
    private Integer id;
    @Column(name="dt_criacao", nullable = false)
    private LocalDate data;
    @Column(name="nm_mercado", length = 50, nullable = false)
    private String nomeMercado;
    @Column(name="vl_total", nullable = false)
    private Double valorTotal;
    @Column(name="ie_status", nullable = false)
    private Integer status;
    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)//Cascade habilitado faz com que inseria a Lista e todos os itens juntos. mappedBy faz a referencia a variavel Lista da classe ItemLista.
    private List<ItemLista> itens;

    public List<ItemLista> getItens() {
        return itens;
    }

    public void setItens(List<ItemLista> itens) {
        this.itens = itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Integer getStatus() {
        return status;
    }
}
