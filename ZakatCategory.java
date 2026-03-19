abstract class ZakatCategory {
    private String categoryName;
    private double weightPerSaa;
    private double pricePerKilo;

    ZakatCategory(String categoryName , double weightPerSaa , double pricePerKilo){
        this.categoryName = categoryName;
        this.weightPerSaa = weightPerSaa;
        this.pricePerKilo = pricePerKilo;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public double getWeightPerSaa() {
        return weightPerSaa;
    }
    public double getPricePerKilo(){
        return pricePerKilo;
    }
    public abstract void calculate(int familyMembers);

}