package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MemberInfo2[]ListofAccounts = {cust1","cust2","cust3","cust4","cust5","cust6","cust7","cust8","cust9"};
//        String []MemberInfo = new String [9]
//                memberInfo[1]= "Lori","J1",
        MemberInfo2 cust1 = new MemberInfo2(" Kymbrlee"," J1 ",26000);
        cust1.deposit(57000);
        MemberInfo2 cust2 = new MemberInfo2(" Ted"," J2 ",8900);
        cust2.deposit(57000);
        MemberInfo2 cust3 = new MemberInfo2(" Lori"," J3 ",78);
        cust3.deposit(57000);
       MemberInfo2 cust4 = new MemberInfo2(" Joan"," J4 ",6754);
        cust4.deposit(57000);
        MemberInfo2 cust5 = new MemberInfo2(" Zech"," J5 ",765);
        cust5.deposit(57000);
        MemberInfo2 cust6 = new MemberInfo2(" Mark"," J6 ",5432);
        cust6.deposit(57000);
        MemberInfo2 cust7 = new MemberInfo2(" Coddie"," J7 ",980);
        cust7.deposit(57000);
        MemberInfo2 cust8 = new MemberInfo2(" Jake"," J8 ",4532);
        cust8.deposit(57000);
        MemberInfo2 cust9 = new MemberInfo2(" Manny"," J9 ",3421);
        cust9.deposit(57000);
        MemberInfo2[]ListofAccounts={cust1,cust2,cust3,cust4,cust5,cust6,cust7,cust8,cust9};
        for (int i = 0; i <ListofAccounts.length; i++) {
            ListofAccounts[i].deposit(800);
        }
//        System.out.println(cust1.getMemberBal());
//        System.out.println(cust2.getMemberBal());
//        System.out.println(cust3.getMemberBal());
//        System.out.println(cust4.getMemberBal());
//
//        System.out.println(cust5.getMemberBal());
//        System.out.println(cust6.getMemberBal());
//        System.out.println(cust7.getMemberBal());
//        System.out.println(cust8.getMemberBal());
//        System.out.println(cust9.getMemberBal());
        for (MemberInfo2 specificAcct:ListofAccounts
             ) {
            System.out.println(specificAcct.memberBal);

        }
    }
}
