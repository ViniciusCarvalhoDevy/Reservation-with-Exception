public class CreateExc {

    
    
    public static Exception ee;
    public static Boolean validDateAtual(ClientUser user,int dia,int mes ,int ano){
    if(user.getDiaEntrada() > dia && user.getMesEntrada() > mes && user.getAnoEntrada() >=ano ){
        return true;
    }else{
        return false;
    }
    }
    public static  void validaDate(ClientUser user) {
    int v=0;

    if(user.getAnoEntrada() > user.getAnoSaida()) {
            ee.getStackTrace();
            v+=2;
        }else if(user.getMesEntrada() > user.getMesSaida() && user.getAnoEntrada() == user.getAnoSaida()){
            ee.getStackTrace();
            v+=2;
        }else if(user.getDiaEntrada() > user.getDiaSaida() && user.getMesEntrada() == user.getMesSaida() && user.getAnoEntrada() == user.getAnoSaida() ){
            ee.getStackTrace();
            v+=2;
        }else if(v==0){
            System.out.println("Reserva com Sucesso");
        }

}

    
   
    
    public static void validAltera(ClientUser user,int dE,int mE,int aE,int dS,int mS,int aS){
        int v=0;
        if(user.getAnoSaida() < aS && user.getAnoEntrada() < aE) {
            ee.getStackTrace();
            v+=2;
        }else if(user.getMesEntrada() < mE &&  user.getMesSaida() < mS){
            ee.getStackTrace();
            v+=2;
        }else if(user.getDiaEntrada() < dE && user.getDiaSaida()< dS){
            ee.getStackTrace();
            v+=2;
        }else if(v==0){
            System.out.println("Reserva com Sucesso");
        } 
    }
    
    }
