public class BanKAccount {
    private double amount;

    public BanKAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }
    public void Deposit(double sum){
        if (sum > 0){
            amount+=sum;

        }else {
            System.out.println("Сумма для пополнения должен быть положительной");
        }
    }
    public void WithDraw(int sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Запрашиваемая сумма слишком больше",amount);

        }else {
            amount-=sum;
        }
    }
}
