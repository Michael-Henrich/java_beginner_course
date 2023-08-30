public class CheckingAccount extends Account{
    public int rewardPoints;
    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance,interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost){
        if(cost > balance){
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public int calculateRewardPoints(double cost){
        return (int) (cost*10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
