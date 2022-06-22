package Cadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import entities.Barbeiro;
import entities.Cliente;

public class Tela_de_login {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cliente ou Barbeiro?");
		String x = sc.next();
		
		Cliente cliente = null;
		String telefone = null;
		Barbeiro barbeiro = null;
		
		if (x == "Cliente") {
		System.out.println("Name:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Anivers�rio (dd/MM/yyyy):");
		String aniversario = sc.next();
		System.out.println("Telefone (99)99999-9999):");
		telefone = sc.next();
		cliente = new Cliente(name, telefone, aniversario);
		cliente.addCliente(cliente);
			} else {
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anivers�rio (dd/MM/yyyy):");
			String aniversario = sc.next();
			System.out.println("Telefone (99)99999-9999):");
			telefone = sc.next();
			System.out.println("CPF:");
			String cpf = sc.next();
			System.out.println("E-mail:");
			String email = sc.next();
			barbeiro = new Barbeiro(name, telefone, aniversario, email, cpf);
			barbeiro.addBarbeiros(barbeiro);
		}
		
		//Formatador de telefone
		MaskFormatter phoneFormatter = new MaskFormatter("(##)#####-####");
		JFormattedTextField txtPhone = new JFormattedTextField(phoneFormatter);
		txtPhone.setText(telefone);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (x == "Cliente") {
		System.out.println(cliente.getName());
		System.out.println(sdf.format(cliente.getAniversario()));
		System.out.println(txtPhone.getText());
		} else {
			System.out.println("Nome: " + barbeiro.getName());
			System.out.println("Anivers�rio: " + sdf.format(barbeiro.getAniversario()));
			System.out.println("Telefone: " + txtPhone.getText());
			System.out.println("CPF: " + barbeiro.getCpf());
			System.out.println("E-mail: " + barbeiro.getEmail());
		}
		
		
		System.out.println("At� a pr�xima!");
		sc.close();
	}
}
