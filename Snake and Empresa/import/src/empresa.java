

import java.util.Scanner;

public class empresa {


/*Valor total de imposto*/

static double VALOR_TOTAL_IMPOSTO = 0.65;

public static void main(String[] args) {

Scanner input = new Scanner (System.in);
/*Variaveis do cadastro*/
String nome, cidade, estado, pais;
int tel;
int op =0;
int opAd, opFab, opMarca, opDeseja, opSair;



/*User Menu*/
while(op != 6){
System.out.println("");
System.out.println("ELIA'S IMPORT");
System.out.println("[1] - Entrar no sistema");
System.out.println("[2] - Informa??o sobre a empresa");
System.out.println("[3] - Como funciona as taxas de juros");
System.out.println("[4] - Vizualizar marcas disponiveis");
System.out.println("[5] - Sair do sistema da empresa");
System.out.print("Digite uma op??o :");
op = input.nextInt();
System.out.println("");

/*User registration*/
switch(op) {
case 1:
System.out.println("");
System.out.println("BEM- VINDO A ELIA'S IMPORT");
System.out.println("Somos uma empresa de exporta??o de carros, atendimento 24H");
System.out.println("Caso deseje importar um carro, informe seu cadastro abaixo:");
System.out.println("");
System.out.println("CADASTRO PARA IMPORTA??O");
System.out.println("_________");
System.out.print("Nome do usu?rio :");
nome = input.next();
System.out.print("Tel para contato :");
tel = input.nextInt();
System.out.print("Cid do usu?rio :");
cidade = input.next();
System.out.print("Estado do usu?rio :");
estado = input.next();
System.out.print("Pais que deseja importar :");
pais = input.next();
System.out.println("________");

/*Choose manufacturer*/
System.out.println("Fabricantes disponiveis");
System.out.println("[1] - Acura");
System.out.println("[2] - BMW");
System.out.println("[3] - Citroen");;
System.out.print("Sr.(a) " + nome + ", escolha uma op??o para o fabricante: ");
opFab = input.nextInt();
System.out.println("");
if(opFab == 1) {
System.out.println("Carros disponiveis da Marca Acura:");
System.out.println("Opa, desculpe, da marca Acura s? temos um carro");
System.out.println("[1] - NSX Type S - Pre?o R$ : 950.000,00 ");
System.out.print("Sr.(a) " + nome + " escolha seu veiculo:");
opMarca = input.nextInt();


if(opFab == 1) {
double vlCarNSX = 950000;
double vlImpost = vlCarNSX*VALOR_TOTAL_IMPOSTO;
double vlTotalNsx = vlCarNSX+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalNsx);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}
break;
}
}
else if(opFab == 2) {
System.out.println("Carros disponiveis da Marca BMW:");
System.out.println("[1] - BMW M4 CS - Pre?o R$: 664.000 ");
System.out.println("[2] - BMW X6 2022 - Pre?o R$: 662.000");
System.out.println("[3] - BMW I8 2020 - Pre?o R$: 650.000");
System.out.print("Sr.(a) " + nome + " escolha seu veiculo:");
opMarca = input.nextInt();
if(opMarca == 1) {
double vlCarBMWM4 = 664000;
double vlImpost = vlCarBMWM4*VALOR_TOTAL_IMPOSTO;
double vlTotalBMWM4 = vlCarBMWM4+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalBMWM4);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}

}
else if(opMarca == 2) {
double vlCarBMWX6 = 662000;
double vlImpost = vlCarBMWX6*VALOR_TOTAL_IMPOSTO;
double vlTotalBMWX6 = vlCarBMWX6+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalBMWX6);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}
}
else if(opMarca == 3) {
double vlCarBMWI8 = 650000;
double vlImpost = vlCarBMWI8*VALOR_TOTAL_IMPOSTO;
double vlTotalBMWI8 = vlCarBMWI8+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalBMWI8);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}
}
else if(opMarca == 3) {
double vlCarBMWI8 = 650000;
double vlImpost = vlCarBMWI8*VALOR_TOTAL_IMPOSTO;
double vlTotalBMWI8 = vlCarBMWI8+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalBMWI8);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}
}

}
else if(opFab == 3) {
System.out.println("Carros disponiveis da Marca Citroen:");
System.out.println("[1] - Citroen C4 Cactus - Pre?o R$: 90.000");
System.out.println("[2] - Grand C4 Picasso - Pre?o R$: 140.00");
System.out.println("[3] - Peugeot 208 - Pre?o R$: 80.000 ");
System.out.print("Sr.(a) " + nome + " escolha seu veiculo:");
opMarca = input.nextInt();

if(opMarca == 1) {
double vlCarC4 = 90000;
double vlImpost = vlCarC4*VALOR_TOTAL_IMPOSTO;
double vlTotalCarC4 = vlCarC4+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalCarC4);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}

}
if(opMarca == 3) {
double vlCarPeugeot = 90000;
double vlImpost = vlCarPeugeot*VALOR_TOTAL_IMPOSTO;
double vlTotalCarPeugeot = vlCarPeugeot+vlImpost;
System.out.println("__________________________________________");
System.out.println("Valor total de imposto em cima do carro : 65%");
System.out.println("Valor total do Imposto R$: " + vlImpost);
System.out.println("Valor total do carro R$: " + vlTotalCarPeugeot);
System.out.println("__________________________________________");
System.out.println("Caso deseja importar o carro : [1] - Importar, [2] - N?o importar");
opDeseja = input.nextInt();
if(opDeseja == 1) {
System.out.println("##########################");
System.out.println("CARRO IMPORTADO COM SUCESSO");
System.out.println("##########################");
}
else if(opDeseja == 2) {
System.out.println("##########################");
System.out.println("CARRO N?O IMPORTADO ");
System.out.println("##########################");
}
}
}
case 2:
System.out.println("ELIA'S IMPORT");
System.out.println("? uma empresa privada, que somente importa carros com alta seguran?a, nos tambem temos varias regras pra que tudo ocorra de acordo com a lei. Somos de alta confian?a. Temos referencia no mercado por causa da qualidade de atendimento , prazo de entrega,");
System.out.println("qualidade do produto e por causas das certifica??es.  Al?m dessas qualidades podemos fazer at? 12 vezes sem juros. se o cliente nao quiser podemos negociar, ent?o o prezado cliente terar que fazer um cadastro e fazer uma simula??o a? podemos enfim fazer ");
System.out.println("Uma empresa ter? grandes benef?cios econ?micos ao importar pe?as de diferentes pa?ses e finalizar a produ??o no Brasil. Como exemplo, podemos citar a ind?stria automobil?stica. Ela importa pe?as de diferentes lugares e finaliza a montagem aqui no Brasil.");
System.out.println("A importa??o traz muitas vantagens: voc? compra direto da f?brica, tem acesso aos melhores custos, n?o fica dependente do estoque e condi??es dos atacadistas ou distribuidores. Al?m disto, pode vender como sua marca pr?pria.");

break;
case 3:
System.out.println("COMO FUNCIONA OS IMPOSTOS DA LOJA");
System.out.println("");
System.out.println("[1] - Primeiro imposto cobrado para importa??o ? o IPI, cobrado 5% em cima do carro ? um imposto federal, ou seja, somente a Uni?o pode institu?-lo ou modific?-lo, sobre produtos industrializados no Brasil.");
System.out.println("[2] - Segundo imposto cobrado na importa??o ? o IMCS, cobra 25%,Imposto sobre Circula??o de Mercadorias e Servi?os ? um imposto estadual sob administra??o estadual brasileiro, ou seja, somente os governos dos estados e do Distrito Federal t?m compet?ncia para institu?-lo.");
System.out.println("[3] - Terceiro imposto cobrado na importa??o ? o CONFIS, cobrado 5%,  ? um tributo federal que incide na receita bruta da empresa. O destino da arrecada??o ? custear a seguridade social.");
System.out.println("[4] - Quarto imposto cobrado na importa??o ? o da pr?pria loja, valor em cima do carro, com uma porcentagem de 10% em cima do carro, normalmente varia.");
System.out.println("");
System.out.println("Atualmente carros importados vindos de pa?ses que n?o possuem acordos comerciais com o Brasil s?o taxados em 35% de seu valor. Com esse novo acordo a taxa??o ser? de 17,5%. Ap?s sete anos o valor de importa??o ser? gradativamente reduzido at? chegar a zero.");
System.out.println("Um dos principais empecilhos para as marcas de carros no Brasil ? a cobran?a de imposto de importa??o. A taxa equivale a 35% do pre?o total de um ve?culo importado.");
break;


case 4:
System.out.println("Marca dispon?veis");
System.out.println("___________________________");
System.out.println("[1] - Acura");
System.out.println("[2] - BMW");
System.out.println("[3] - Citroen");
System.out.println("[4] - Chevrolet");
System.out.println("Marca indispon?veis");
System.out.println("___________________________");
System.out.println("[5] - Dodge");
System.out.println("[6] - Honda");
System.out.println("[7] - Hyunda");
System.out.println("[8] - Porsche");
System.out.println("[9] - Pagani");
System.out.println("[10] - Volvo");
break;

case 5:
	
		System.out.println("Voc? saiu do sistema!");
		int op2 = input.nextInt();
	
}
		
	
	
}
}
}

