package app;

import java.util.Scanner;
import java.util.List;
import dao.UsuarioDAO;
import model.Clientes;

class menu{
	public static void main(String args[]){	
		int option = 0;
		Scanner s = new Scanner(System.in);

		do{
			System.out.println("0-para sair");
			System.out.println("1-Para inserir cliente");
			System.out.println("2-Para atualizar cliente");
			System.out.println("3-Para remover cliente");
			System.out.println("4-Para listar todos clientes");

			option = s.nextInt();

			switch(option) {
			case 1:
				UsuarioDAO uDAO = new UsuarioDAO();
				System.out.println("Id: ");
				int code = s.nextInt();
				s.nextLine();
				System.out.println("Razao: ");
				String razao = s.nextLine();
				System.out.println("Cidade: ");
				String cidade = s.nextLine();
				System.out.println("Data da Visita: ");
				String data = s.nextLine();
				System.out.println("Pautas: ");
				String pautas = s.nextLine();
				System.out.println("cpf: ");
				long int cpf = s.nextInt();
				System.out.println("cnpj: ");
				long int cnpj = s.nextInt();
				
				Clientes cliente = new Usuario(code, login, senha, sex);
				if(uDAO.insert(user)){
					System.out.println("Cliente inserido: ");
					System.out.println(cliente.toString());
				}else{
					System.out.println("Erro");
				}
				break;

			case 2:
				System.out.println("Atualizar usuario, digite o ID do usuario desejado: ");
				int id = s.nextInt();
				UsuarioDAO use = new UsuarioDAO();
				use.get(cod);

				Usuario user2 = new Usuario();
				String log = user2.getLogin();

				System.out.println("Nova razao: ");
				String razao2 = s.nextLine();
				user2.setRazao(Razao2);

				System.out.println("Nova senha: ");
				String pass = s.nextLine();
				user2.setSenha(pass);

				System.out.println("Mudar sexo: ");
				char sex2 = s.nextLine().charAt(0);
				user2.setSexo(sex2);

				UsuarioDAO userDAO = new UsuarioDAO();
				use.update(user2);

				break;

			case 3:
				UsuarioDAO user3 = new UsuarioDAO();
				System.out.println("Codigo do usuario a remover: ");
				int code3 = s.nextInt();
				if(user3.delete(code3)){
					System.out.println("Usuario removido com sucesso");
				}else{
					System.out.println("Erro, tente denovo");
				}

				break;

			case 4:
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				System.out.println("Todos os usuarios: ");
				List<Usuario> user4 = usuarioDAO.get();
				System.out.println(user4);

				break;

			default:
				break;
		}

		}while(option != 0);
	}
}
