
package bank2;


public class Bank2 {
    private Cuenta cuentaUno;
    private Cuenta cuentaDos;
    
    public Bank2(){
        cuentaUno = new Cuenta ("Zeus", 100, "312");
        cuentaDos = new Cuenta ("Hades", 400, "34214");
    }

    public static void main(String[] args) {
        Bank2 bankOfGods = new Bank2();
        System.out.println(bankOfGods.cuentaDos.name);
        bankOfGods.cuentaDos.addFunds(45);
        bankOfGods.cuentaDos.getInfo();
    }
    
}
