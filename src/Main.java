import java.io.IOException;
import java.sql.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        SilverCheckingAccount silver  = new SilverCheckingAccount(5000,0.025, 1000);
        GoldCheckingAccount gold  = new GoldCheckingAccount(5000,0.025, 1000);
        DiamondCheckingAccount diamond  = new DiamondCheckingAccount(5000,0.025, 1000);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(50);
        gold.purchase(50);
        diamond.purchase(50);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());
    }

}
