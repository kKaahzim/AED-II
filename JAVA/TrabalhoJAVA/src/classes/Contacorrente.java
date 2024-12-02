
package classes;


public class Contacorrente {
    private int id;
    private String conta;
    private String cpf;
    private double saldo;
    
    public Contacorrente(int id, String conta, String cpf, double saldo){
    
    this.id = id;
    this.conta = conta;
    this.cpf = cpf;
    this.saldo = saldo;
    }
    public void exibe(){
        System.out.println("Id: " + id);
        System.out.println("Conta: " + conta);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
   }
    private void deposito(double valor){
        saldo = valor + saldo;
    }
public int getId(){
        return id;
}
public String getConta(){
    return conta;
}
public String getCpf(){
    return cpf;
}
public double getSaldo(){
    return saldo;
}
public double saque(){
    
        return 0;
    
}

    
    
   


}
