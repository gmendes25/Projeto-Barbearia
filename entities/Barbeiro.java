package entities;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Barbeiro extends Cliente {
	
	private String email;
	private String cpf;
	
	List<Barbeiro> barbeiros = new ArrayList<>();
	
	public void addBarbeiros(Barbeiro barbeiro) {
		barbeiros.add(barbeiro);
	}
	public void removeBarbeiros(Barbeiro barbeiro) {
		barbeiros.remove(barbeiro);
	} 
	public void removeCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	public Barbeiro(String name, String telefone, Date aniversario, String email, String cpf) throws ParseException {
		super(name, telefone, aniversario);
		this.email = email;
		this.cpf = String.format(cpf, "###.###.###-##");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
}
