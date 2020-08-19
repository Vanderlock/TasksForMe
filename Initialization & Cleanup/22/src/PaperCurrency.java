public enum PaperCurrency {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50);

    private int cost;

    PaperCurrency(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }


}
