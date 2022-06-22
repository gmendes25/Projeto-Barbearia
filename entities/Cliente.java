package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Cliente {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String telefone;
	private Date aniversario;
	
	public Cliente(String name, String telefone, String aniversario) throws ParseException {
		this.name = name;
		this.telefone = telefone;
		this.aniversario = sdf.parse(aniversario);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	List<Cliente> clientes = new ArrayList<>();
	
	public void addCliente(Cliente cliente){
		clientes.add(cliente);
	}
	
}
