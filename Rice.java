class Rice extends ZakatCategory {
    Rice(){
        super("Rice" , 2.5 , 43.0);
    }

    @Override
    public void calculate(int familyMembers){
        double totalWeight = familyMembers * getWeightPerSaa();
        double totalMoney = totalWeight * getPricePerKilo();
        System.out.println("===> Category : " + getCategoryName());
        System.out.println("");
        System.out.println("===> Required Weight : " + totalWeight + " KG");
        System.out.println("");
        System.out.println("===> Total Price : " + totalMoney + " EGP");
    }
}
