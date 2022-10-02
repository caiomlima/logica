// HelloWorld.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
#include <string>
#include <sstream>
#define MOSTRA cout << "Hello World!"
using namespace std;


// Parece desnecessário dar return 0 no main, mas td bem ...

/*------------------------------ Hello World e básicos ------------------------------*/
//int main()
//{
//    string hello = "Hello World!\n";
//    int16_t var1 = 30;
//
//    cout << hello;
//    cout << "This is my first C++ Application\n\n";
//
//    cout << "Numero: " << var1 << "\n\n";
//
//    return 0;
//}



/*------------------------------ Atrubuições ------------------------------*/
//int main()
//{
//    short int vida = 30;
//    float municao = 20.34;
//    char tipo = 'c';
//    int a, b, c, d;
//    stringstream ss;
//
//    ss << "Vida: " << vida << ", Municao: " << municao << ", Char: " << tipo;
//    string s = ss.str();
//    cout << s << "\n\n";
//
//    return 0;
//}



/*------------------------------ Operadores ------------------------------*/
//int main()
//{
//	int mult = 10 * 5;
//	int soma = 500 + 400;
//	float divi = 100.0 / 3.0;
//	int sub = 30 - 10;
//	float resto = 11 % 3;
//
//	cout << "Os resultados das operacoes sao: \n\n" << mult << "\n";
//	cout << soma << "\n";
//	cout << divi << "\n";
//	cout << sub << "\n";
//	cout << resto << "\n";
//
//	return 0;
//}

//// Operadores diretos
//int main()
//{
//	cout << "Os resultados das operacoes sao: \n\n" << 10 * 5 << "\n";
//	cout << 500 + 400 << "\n";
//	cout << 100.0 / 3.0 << "\n";
//	cout << 30 - 10 << "\n";
//	cout << 11 % 3 << "\n";
//}

//// Operadores em vars
//int main()
//{
//	int life = 100;
//	cout << "Voce tem " << life << " de vida\n";
//	cout << "Voce levou dano!\n";
//	life = life - 55;
//	cout << "Agora voce tem " << life << " de vida\n";
//	cout << "Voce pegou uma caixa de vida!\n";
//	life += 20;
//	cout << "AGora voce tem " << life << " de vida\n\n";
//
//
//	int a = 20;
//	int b = 10;
//	int c = 5;
//
//	a = b + c;
//	cout << "Resultado de A: " << a << "\n";
//
//	c = (a / 2) + b;
//	cout << "Resultado de C: " << c << "\n";
//
//	b = a * -1;
//	cout << "Resultado de B: " << b << "\n";
//
//	a = a * c;
//	cout << "Resultado de A: " << a << "\n";
//
//
//	int bonus = 10;
//	int xp = 5;
//	int hp = ((xp * 2) - 1) + bonus;
//	int mp = ((xp * 3) + bonus) / 2;
//
//	// a-- = Pós-fixado - Primeiro executa o programa, e depois decrementa 
//	// --a = Pré-fixado - Decrementa ao iniciar o programa
//	// -x = Ao declarar x = 10, e usar o -, ele assume valor negativo. EX: x = -x; ou y = x - (-x), onde resulta em -10
//}



/*------------------------------ Entrada de dados ------------------------------*/
//int main()
//{
//	int idade;
//	int dia;
//
//	cout << "Digite a sua idade\n";
//	cin >> idade;
//
//	cout << "\n\nDigite o dia de hoje\n";
//	cin >> dia;
//
//	cout << "Sua idade eh " << idade << " e o dia de hoje eh " << dia;
//	return 0;
//}

//int main()
//{
//	int idade;
//	cout << "Digite a sua idade: ";
//	cin >> idade;
//
//	cout << "Voce tem " << idade * 365 << " dias de idade\n\n";
//	return 0;
//}

//int main()
//{
//	double val1, val2;
//
//	cout << "Digite a porcentagem (%) desejada: ";
//	cin >> val1;
//
//	cout << "Digite um valor desejado: ";
//	cin >> val2;
//
//	cout << val1 << "% de " << val2 << " eh " << (val2 / 100) * val1;
//}



/*------------------------------ Entrada e sáida de dados com printf e scanf ------------------------------*/
//int main()
//{
//	int x = 10;
//	char ch = 'a';
//
//	printf("O numero eh: %d, e a letra eh: %c\n", x, ch, "\n\n");
//
//	int u;
//	printf("Digite um numero: ");
//	scanf_s("%d", &u);
//	printf("%d", u);
//}



/*------------------------------ If else ------------------------------*/
//int main()
//{
//	int valor;
//
//	printf("Digite um numero diferente de 0: ");
//	cin >> valor;
//
//	if (valor == 0)
//	{
//		printf("\n\nValor eh igual a 0 - Errado");
//	}
//	else
//	{
//		printf("\n\nValor eh diferente de 0 -- Certo");
//	}
//
//	return 0;
//}

//int main()
//{
//	int valor;
//
//	printf("Digite um numero nao negativo, par e menor do que 5: ");
//	cin >> valor;
//
//	if (valor <= 0 || valor >= 5)
//		printf("Errado!\n");
//
//	if (valor < 5 || valor == 4)
//	{
//		if (valor == 2 || valor == 4)
//			printf("Certo!\n");
//
//		if (valor == 1 || valor == 3)
//			printf("Errado!\n");
//	}
//
//	return 0;
//}



/*------------------------------ Funções ------------------------------*/
//int func1(); // Protótipo da função
//int func2(); // Protótipo da função
//
//int main()
//{
//	func1();
//	func2();
//	return 0;
//}
//
//int func1()
//{
//	int a;
//	cout << "Digite um número: ";
//	cin >> a;
//
//	return 0;
//}
//int func2()
//{
//	cout << "\n\nHello World with functions\n\n";
//
//	return 0;
//}

//int Show(int inicio, int fim);
//void hello();
//
//int main()
//{
//	Show(10, 40);
//	hello();
//	return 0;
//}
//
//int Show(int inicio, int fim)
//{
//	for (int t = inicio; t <= fim; t++)
//	{
//		cout << t << " ";
//	}
//	return 0;
//}
//
//void hello() // também pode-se usar return em void
//{
//	cout << "\n\nHello with void function";
//}

//// Funções inline (serve para rápidas execuções em troca de mais memória)
//inline float add(float var1, float var2)
//{
//	return var1 + var2;
//}
//
//int main()
//{
//	float soma = add(10.5, 11.9);
//	cout << soma;
//	return 0;
//}

//// Funções aninhadas
//int MyCin()
//{
//	int a;
//	cin >> a;
//	return a;
//}
//
//void MyPrint(int a, int b, int c)
//{
//	cout << a << " ";
//	cout << b << " ";
//	cout << c << " ";
//}
//
//int main()
//{
//	cout << "Digite três números\n";
//	MyPrint(MyCin(), MyCin(), MyCin()); // Os argumentos são lidos de trás para frente;
//	return 0;
//}

//// Funções com overload (sem exemplos): C++ permite que duas funções tenham o mesmo nome, mas com diferentes overloads (igual C#)

//// Funções com valores default (sem exemplos práticos): pode se declarar uma função com um overload que tenha um valor padrão caso não tenha entradas, EX: void MyPrint(char varChar = 'a');

//// Função de recursividade
//void MyCount(int num, int current = 1)
//{
//	cout << current << "\n";
//	if (current <= num)
//	{
//		MyCount(num, ++current);
//	}
//}
//
//int main()
//{
//	MyCount(10);
//	return 0;
//}



/*------------------------------ Arrays (vetores) ------------------------------*/
//// Vetores normais
//int main()
//{
//	int array[5];
//	//int array[5] = {40, 90, 120, -30, 12};
//
//	array[0] = 40;
//	array[1] = 90;
//	array[2] = 120;
//	array[3] = -30;
//	array[4] = 12;
//
//	for (int i = 0; i < 5; i++)
//	{
//		cout << array[i] << "\n";
//	}
//
//	return 0;
//}



/*------------------------------ Pointers (servem para acessar o endereço de memória de uma váriavel(até mesmo usar vars internas de outros cantos) ------------------------------*/
//int main()
//{
//	float var;
//	float *pvar;
//	pvar = &var;
//
//	cout << pvar << " eh o mesmo que: " << &var << "\n\n";
//
//
//	float var2;
//	float* pvar2;
//	pvar2 = &var2;
//	*pvar2 = 10.01f;
//
//	cout << *pvar2 << " eh o mesmo que " << var2 << "\n\n";
//
//	// Pointer para um pointer
//	int var3;
//	int* pvar3;
//	int** ppvar3;
//	pvar3 = &var3;
//	ppvar3 = &pvar3;
//
//	cout << **ppvar3 << " eh o mesmo que " << *pvar3 << " que eh o mesmo que " << var3 << "\n\n"; // Ou seja, **ppvar3 = var3
//
//	return 0;
//}

//// Pointers com Arrays
//int main()
//{
//	int array[10];
//	int* p;
//	p = array; // Pega o primeiro valor do array (índice 0)
//	*p = 10; // Coloca 10 no índice 0
//
//	for (int i = 0; i < 10; i++)
//	{
//		cout << array[i] << "\n";
//	}
//
//	cout << "\n\n\n";
//
//	int array2[10];
//	int* p2;
//	p2 = array2; // Pega o primeiro valor do array (índice 0)
//	*p2 = 100; // Coloca 100 no índice 0
//	p2[5] = 200; // Coloca 200 no índice 5
//
//	for (int i = 0; i < 10; i++)
//	{
//		//p2[i] = i * 10;
//		cout << array2[i] << "\n";
//	}
//}

//// Pointers em funções (para acesso de vars internas)
//void soma(float* p, float valor);
//
//int main()
//{
//	float var = 30;
//	soma(&var, 20);
//	cout << var << "\n";
//
//	return 0;
//}
//
//void soma(float* p, float valor)
//{
//	*p += valor;
//}

//// Array de pointers
//void pegaArray(float* p);
//
//int main()
//{
//	float var[3];
//	pegaArray(var);
//	for (int i = 0; i < 3; i++)
//	{
//		cout << var[i] << "\n";
//	}
//
//	return 0;
//}
//
//void pegaArray(float* p)
//{
//	p[0] = 0;
//	p[1] = 0;
//	p[2] = 0;
//}



/*------------------------------ Matrizes ------------------------------*/
//// Simular uma tela
//int main()
//{
//
//}