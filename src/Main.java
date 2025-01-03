

public class Main {
    public static String accauntName = "MyAcc";
    public static int amount = 1000;


    public static void main(String[] args) throws ManyAccessException {


            deduct("MyAcc", 500);
        System.out.printf("Вы сняли деньги со счета: %s  остаток: %s", accauntName, amount);
    }

    public static int deduct(String accountToProcess, int amtToCacheOut) throws UserAccessException, ManyAccessException {


        if (!accauntName.equals(accountToProcess)) {
            throw new UserAccessException("Чужой аккаунт. Операция не возможна. Тратьте свои деньги. ");
        }
        if (amount < amtToCacheOut) {
            throw new ManyAccessException("Недостаточно денег на счете. Вы можете снять: " + amount);
        }
        amount = amount - amtToCacheOut;
        return amount;
    }

}
