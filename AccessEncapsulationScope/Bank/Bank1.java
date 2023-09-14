
package bank1;


public class Bank1 {
    private Revisar cuentaUno;
    private Revisar cuentaDos;

    /**
     *
     */
    public Bank1(){
        cuentaUno = new Revisar ("Zeus", 100, "1");
        cuentaDos = new Revisar ("Hades", 200, "2");
    }
    public static void main(String[] args) {
        Bank1 bankOfGods = new Bank1();
        System.out.println(bankOfGods.cuentaUno.getBalance());
        bankOfGods.cuentaUno.setBalance(500);
        System.out.println(bankOfGods.cuentaUno.getBalance());
        System.out.println(bankOfGods.cuentaUno.getMonthlyInterest());
    }
    
}
