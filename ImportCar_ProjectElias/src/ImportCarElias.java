import java.util.Scanner;

public class ImportCarElias {
	public static void main(String[] args) {
		/*Valor total de imposto*/
		
		double VALOR_TOTAL_IMPOSTO = 0.65;
		
		Scanner obter = new Scanner(System.in);
		/*Vetores da marca*/
		
		/*String marca[] = {"Acura","BMW", "Citroen", "Chevrolet", "Fiat", "Ford", "Honda", "Hyunda", "Porsche", "Volkswagen"};*/
		
		/*Variaveis usadas no sistema*/
		String nome, pais, cidade, estado;
		int opDeseja =1;
		int opFab = 0;
		int tel;
		int op = 0, opMarca;
		/*Sistema pra cadastro*/
		System.out.println("#####CADASTRO#####");
		System.out.println("");
		System.out.println("BEM- VINDO A ELIA'S IMPORT");
		System.out.println("Somos uma empresa de exportação de carros, atendimento 24H");
		System.out.println("Caso deseje importar um carro, informe seu cadastro abaixo:");
		System.out.println("");
		System.out.println("CADASTRO PARA IMPORTAÇÃO");
		System.out.println("_________________________");
		System.out.print("Nome do usuário :");
		nome = obter.next();
		System.out.print("Tel para contato :");
		tel = obter.nextInt();
		System.out.print("Cid do usuário :");
		cidade = obter.next();
		System.out.print("Estado do usuário :");
		estado = obter.next();
		System.out.print("Pais que deseja importar :");
		pais = obter.next();
		System.out.print("________________________");
		
		/*Menu do sistema*/
		
		while(op !=9) {
			System.out.println("");
			System.out.println("ELIA'S IMPORT");
			System.out.println("[1] - Entrar no sistema");
			System.out.println("[2] - Visualizar carros importados");
			System.out.println("[3] - Deletar carros importados");
			System.out.println("[4] - Informação sobre a empresa");
			System.out.println("[5] - Como funciona as taxas de juros");
			System.out.println("[6] - Atualizar os carros exportados");
			System.out.println("[7] - Deletar carros importados");
			System.out.println("[8] - Custo total da importação");
			System.out.println("[9] - Vizualizar marcas disponiveis");
			System.out.println("[10] - Sair do sistema da empresa");
			System.out.print("Digite uma opção :");
			op = obter.nextInt();
			System.out.println();
			
			
			/*Caso ele entre no sistema*/
			
			switch(op) {
			case 1:{
			
			System.out.println("Quando você entrou no sistema, desejamos que escolha,");
			System.out.println("um fabricante da marca, posteriomente o carro da marca.");
			System.out.println();
			System.out.println("#####Fabricantes disponiveis#####");
			System.out.println("[1] - Acura");
			System.out.println("[2] - BMW");
			System.out.println("[3] - Citroen");
			System.out.println("[4] - Chevrolet");
			System.out.println("[5] - Fiat");
			System.out.println("[6] - Ford");
			System.out.println("[7] - Honda");
			System.out.println("[8] - Hyunda");
			System.out.println("[9] - Porsche");
			System.out.println("[10] - Volkswagen");
			System.out.print("Por favor Sr.(a) " + nome + " digite uma opção : ");
			opMarca = obter.nextInt();
			
			}
			
			switch(opMarca) {
			case 1:
				if(opMarca == 1)
				{
					System.out.println("Carros disponiveis da Marca Acura:");
					System.out.println("[1] - NSX Type S - Preço R$ : 958.081,00 ");
					System.out.print("Escolha uma opção :");
					opFab = obter.nextInt();
					
					
				if(opFab == 1) 
					{
					double vlCarNSX = 958081;
					double vlImpost = vlCarNSX*VALOR_TOTAL_IMPOSTO;
					double vlTotalNsx = vlCarNSX+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor toal do carro R$: " + vlTotalNsx);
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					System.out.println("__________________________________________");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
					{
						System.out.println("Carro importado com sucesso !");
						break;
					}
					else
					{
						System.out.println("Voltando ao sistema");
					}
					
				}
				else if(opMarca == 2)
					{
					double vlCarBMWX6 = 662000;
					double vlImpost = vlCarBMWX6*VALOR_TOTAL_IMPOSTO;
					double vlTotalBMWX6 = vlCarBMWX6+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalBMWX6);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
					{
						System.out.println("Carro importado com sucesso !");
						break;
					}
					else
					{
						System.out.println("Voltando ao sistema");
					}}}
					
				case 2:
				 if(opMarca == 2) {
					double vlCarBMWX6 = 662000;
					double vlImpost = vlCarBMWX6*VALOR_TOTAL_IMPOSTO;
					double vlTotalBMWX6 = vlCarBMWX6+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalBMWX6);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
					{
						System.out.println("Carro importado com sucesso !");
						break;
					}
					else
					{
						System.out.println("Voltando ao sistema");
					}
					}
					}
					 if(opMarca == 3) 
					{
					double vlCarBMWI8 = 650000;
					double vlImpost = vlCarBMWI8*VALOR_TOTAL_IMPOSTO;
					double vlTotalBMWI8 = vlCarBMWI8+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalBMWI8);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
						if(opDeseja == 1)
						{
							System.out.println("Carro importado com sucesso !");
							break;
						}
						else
						{
							System.out.println("Voltando ao sistema");
						}
					}
					else if(opMarca == 3)
					{
					double vlCarBMWI8 = 650000;
					double vlImpost = vlCarBMWI8*VALOR_TOTAL_IMPOSTO;
					double vlTotalBMWI8 = vlCarBMWI8+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalBMWI8);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1) 
						if(opDeseja == 1)
						{
							System.out.println("Carro importado com sucesso !");
							break;
						}
						else
						{
							System.out.println("Voltando ao sistema");
						}
					}

					}
					 if(opFab == 3) {
					System.out.println("Carros disponiveis da Marca Citroen:");
					System.out.println("[1] - Citroen C4 Cactus - Preço R$: 90.000");
					System.out.println("[2] - Grand C4 Picasso - Preço R$: 140.00");
					System.out.println("[3] - Peugeot 208 - Preço R$: 80.000 ");
					System.out.print("Sr.(a) " + nome + " escolha seu veiculo:");
					opMarca = obter.nextInt();

					if(opMarca == 1) {
					double vlCarC4 = 90000;
					double vlImpost = vlCarC4*VALOR_TOTAL_IMPOSTO;
					double vlTotalCarC4 = vlCarC4+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalCarC4);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
						if(opDeseja == 1)
						{
							System.out.println("Carro importado com sucesso !");
							break;
						}
						else
						{
							System.out.println("Voltando ao sistema");
						}
					break;
					}

					
					if(opMarca == 3) 
					{
					double vlCarPeugeot = 90000;
					double vlImpost = vlCarPeugeot*VALOR_TOTAL_IMPOSTO;
					double vlTotalCarPeugeot = vlCarPeugeot+vlImpost;
					System.out.println("__________________________________________");
					System.out.println("Valor total de imposto em cima do carro : 65%");
					System.out.println("Valor total do Imposto R$: " + vlImpost);
					System.out.println("Valor total do carro R$: " + vlTotalCarPeugeot);
					System.out.println("__________________________________________");
					System.out.println("Deseja importar o carro ? 1- Sim, 2- Não");
					opDeseja = obter.nextInt();
					if(opDeseja == 1)
					{
					if(opDeseja == 1)
					{
						System.out.println("Carro importado com sucesso !");
						break;
					}
					else
					{
						System.out.println("Voltando ao sistema");
					}
					}
					}
					 }
		}
	}
}
