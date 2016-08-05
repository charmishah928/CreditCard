
package creditcard;
/**
 * @author Charmi
 */
public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;
    
    public CreditCard(Person newCardHolder, Money limit)
    {
       owner = newCardHolder;
       creditLimit = limit;
       balance = new Money(0);
    }
    
    public Money getBalance()
    {
        Money temp = new Money(balance);
        return temp;
    }
    
    public Money getCreditLimit()
    {
        Money temp = new Money(creditLimit);
        return temp;
    }
    
    public String getPersonals()
    {
        String str = owner.toString();
        return str;
    }
    
    public void charge(Money amount)
    {
        if(balance.add(amount).compareTo(creditLimit) == -1 || balance.add(amount).compareTo(creditLimit)== 0){
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);}
        else
            System.out.println("Exceeds credit limit");
    }
    
    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    
}

