import java.time.LocalDateTime;
import java.util.Scanner;
public class Estudo {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
ClientUser [] user = new ClientUser[10];
LocalDateTime now = LocalDateTime.now();
System.out.println(now);
String date = now.toString();

String dia = date.substring(8, 10);
String mes = date.substring(5, 7);
String ano = date.substring(0, 4);

int diaInt = Integer.valueOf(dia);
int mesInt = Integer.valueOf(mes);
int anoInt = Integer.valueOf(ano);

int op;
int diaEntrada;
int mesEntrada ;
int anoEntrada;
do{
System.out.println("|1 - Reserva          |\r\n|2 - Atualizar Reserva|\r\n|0 - Encerrar Programa|");
 op = scan.nextInt();
int codUser=1;
switch (op){
    case 1:
    do{
            user[codUser]= new ClientUser(codUser);
            System.out.println("|Reseva|\r\n");
            System.out.println("Digite dia da entrada:");
             diaEntrada = scan.nextInt();
            user[codUser].setDiaEntrada(diaEntrada);
            System.out.println("Digite mes da entrada:");
             mesEntrada = scan.nextInt();
            user[codUser].setMesEntrada(mesEntrada);
            System.out.println("Digite Ano Entrada:");
             anoEntrada = scan.nextInt();
            user[codUser].setAnoEntrada(anoEntrada);
            if(CreateExc.validDateAtual(user[codUser],diaInt,mesInt,anoInt)){

            }else {
                System.out.println("Não é Possivel Fazer Reserva Para o Mesmo Dia!!");
            }
        }while(CreateExc.validDateAtual(user[codUser],diaInt,mesInt,anoInt) != true);
            System.out.println("Digite dia Saida:");
            int diaSaida = scan.nextInt();
            user[codUser].setDiaSaida(diaSaida);
            System.out.println("Digite dia Saida:");
            int  mesSaida = scan.nextInt();
            user[codUser].setMesSaida(mesSaida);
            System.out.println("Digite Ano Saida:");
            int anoSaida = scan.nextInt();
            user[codUser].setAnoSaida(anoSaida);
            System.out.println("Digite o numero do quanto:");
            int numeroQ = scan.nextInt();
            user[codUser].setNumeroQ(numeroQ);
            try {
            
                CreateExc.validaDate(user[codUser]);
            }catch(Exception e){
            System.out.println("ERRO: Data Invalida");
            }
            
    break;
    case 2:

            System.out.println("|Alteração da data de Reseva|\r\n");
            System.out.println("Digite dia da entrada:");
             diaEntrada = scan.nextInt();
            
            System.out.println("Digite mes da entrada:");
             mesEntrada = scan.nextInt();
            
            System.out.println("Digite Ano Entrada:");
             anoEntrada = scan.nextInt();
            
            System.out.println("Digite dia Saida:");
             diaSaida = scan.nextInt();

            System.out.println("Digite dia Saida:");
              mesSaida = scan.nextInt();
           
            System.out.println("Digite Ano Saida:");
             anoSaida = scan.nextInt();
           
            System.out.println("Digite o numero do quanto:");
            numeroQ = scan.nextInt();
            try {
                CreateExc.validAltera(user[codUser], diaEntrada, mesEntrada, anoEntrada, diaSaida,mesSaida,anoSaida);
            } catch (Exception e) {
                // TODO: handle exception
            }
            user[codUser].setDiaEntrada(diaEntrada);
            user[codUser].setMesEntrada(mesEntrada);
            user[codUser].setAnoEntrada(anoEntrada);;
            user[codUser].setMesSaida(mesSaida); 
            user[codUser].setAnoSaida(anoSaida);
            user[codUser].setNumeroQ(numeroQ);
        
            
        
break; 
}

}while(op != 0);



}

}
