public class memberInfo {
    public String accountNumber;
    public String memberName;
    private double memberBal;
    //set balance
    public memberInfo (){
        memberBal = 0.0;

    }
    public void withdrawal(double amount){
        memberBal = memberBal - amount;
    }
    public void deposit(double amount){
        memberBal = memberBal + amount;
    }

    public double getMemberBal () {
        return memberBal;
    }
    public static void main (String[] args){
        memberInfo cust1 = new memberInfo();
        cust1.deposit(57000);
        memberInfo cust2 = new memberInfo();
        cust2.deposit(57000);
        memberInfo cust3 = new memberInfo();
        cust3.deposit(57000);
        memberInfo cust4 = new memberInfo();
        cust4.deposit(57000);
        memberInfo cust5 = new memberInfo();
        cust5.deposit(57000);
        memberInfo cust6 = new memberInfo();
        cust6.deposit(57000);
        memberInfo cust7 = new memberInfo();
        cust7.deposit(57000);
        memberInfo cust8 = new memberInfo();
        cust8.deposit(57000);
        memberInfo cust9 = new memberInfo();
        cust9.deposit(57000);
        System.out.println(cust1.getMemberBal());
    }
}
