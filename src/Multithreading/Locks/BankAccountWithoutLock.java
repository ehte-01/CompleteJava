package Multithreading.Locks;

public class BankAccountWithoutLock {

    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName() + "   Withdraw successful. Remaining balance = " +balance);
        }else{
            System.out.println(Thread.currentThread().getName() + "Insufficient balance");
        }
    }
}
