package appmercado.model;

import jakarta.persistence.*;

@Entity //Mapeamento entre a classe e o banco, ou seja, o JPA vai buscar no banco uma tabela com esse nome
@Table(name= "tbl_produto")//A anotação table vai referenciar a tabela no banco, pois a classe e Produto e a tabela e tbl_produto
public class Produto {
    @Id //o Id e a chave primaria, por isso o @Id e para identificar
    @GeneratedValue(strategy = GenerationType.IDENTITY)//No banco a chave primeira e autoincrementada, por isso o strategy como Identity
    @Column(name="id_produto")
    private Integer id;
    @Column(name= "nome_produto", length= 70, nullable = false)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
