public class Main {
    public static void main(String[] args){
        BanKAccount account = new BanKAccount();
        account.Deposit(15000);
        System.out.println("Начальный баланс:" + account.getAmount() + "сом");

        while (true){
            try {
                account.WithDraw(6000);
                System.out.println("Снято 6000сом, остаток:" + account.getAmount() + "сом");
            }catch (LimitException e){
                System.out.println(e.getMessage());
                try{
                    account.WithDraw((int) e.getRemainingAmount());
                    System.out.println("Снято " + e.getRemainingAmount() + " сом, остаток: 0 сом");
                }catch (LimitException ex){
                    System.out.println("Ошибка:"+ex.getMessage());
                }break;
            }
            }
        }
    }
