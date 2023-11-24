import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private static Integer count=0;
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Telefone> telefones = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome, String email, String cpfOuCnpj, TipoCliente tipoCliente) {
		this.id = ++count;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipoCliente;
	}

	public void addEndereco(Endereco endereco) {
		enderecos.add(endereco);
	}

	public void removeEndereco(Endereco endereco) {
		enderecos.remove(endereco);
	}

	public void addTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}

	public void removeTelefone(Telefone telefone) {
		telefones.remove(telefone);
	}

	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removePedido(Pedido pedido) {
		pedidos.remove(pedido);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipoCliente) {
		this.tipo = tipoCliente;
	}
	
	public double totalPedidos() {
		double total =0;
		for (Pedido pedido : pedidos) {
			total += pedido.valorTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String string =  "Cliente " + "[" + id + "]" +
				"\nnome = " + nome + 
				"\nemail = " + email + 
				"\ncpfOuCnpj = " + cpfOuCnpj + 
				"\ntipo cliente = " + tipo + "\n";
		for(Endereco endereco: enderecos) {	
				string += endereco;
				
		}
		for(Telefone telefone: telefones) {	
			string += telefone +  " ";
			
		}
		string +="\n";
		
		string += "Valor total do(s) pedido(s) = " + this.totalPedidos();
		return string;
	}
}
