import java.util.ArrayList;
import java.util.List;

public class Produto {
  private static Integer count=0;
  private Integer id;
  private String nome;
  private Double preco;
  private List<Categoria> categorias = new ArrayList<>();

  public Produto() {
  }

  public Produto(String nome, Double preco) {
    this.id = ++count;
    this.nome = nome;
    this.preco = preco;
  }

  public void addCategoria(Categoria categoria) {
    categorias.add(categoria);
  }

  public void removeCategoria(Categoria categoria) {
    categorias.remove(categoria);
  }

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

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

@Override
public String toString() {
	return "Produto [" + id + "]" +
		"\nnome=" + nome + 
		"\npreco=" + preco + 
		"\ncategorias=" + categorias;
}
  
  
}
