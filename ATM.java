class ATM {
    public int countBanknotes(int sum) {
        int kolvo = 0;
            kolvo += (sum - (sum % 500)) / 500;
            sum = sum % 500;
        kolvo += (sum - (sum % 200)) / 200;
        sum = sum % 200;
            kolvo += (sum - (sum % 100)) / 100;
            sum = sum % 100;
        kolvo += (sum - (sum % 50)) / 50;
        sum = sum % 50;
            kolvo += (sum - (sum % 20)) / 20;
            sum = sum % 20;
        kolvo += (sum - (sum % 10)) / 10;
        sum = sum % 10;
            kolvo += (sum - (sum % 5)) / 5;
            sum = sum % 5;
        kolvo += (sum - (sum % 2)) / 2;
        sum = sum % 2;
            kolvo += sum;
        return kolvo;    
    }
}
