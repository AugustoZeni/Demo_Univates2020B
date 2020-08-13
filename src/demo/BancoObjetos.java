package demo;

public class BancoObjetos {
    public static void main(String[] args) {
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    
    conta1.setConta(1);
    conta1.setNome("Augusto");
    conta1.setSaldo(200);
    
        
    conta2.setConta(2);
    conta2.setNome("Igor");
    conta2.setSaldo(100);
    
    
    System.out.println(conta1.toString());
    //System.out.println("----------------------------------------");
    //System.out.println(conta2.toString());
    
    conta1.saque(10);
    conta1.deposito(20);
    System.out.println(conta1.toString());
    System.out.println("----------------------------------------");
    conta2.deposito(0);
    conta2.saque(10);
    System.out.println(conta2.toString());
    }
    
}
