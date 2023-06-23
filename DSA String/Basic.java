class Basic{
    public static void main(String[]args){
        /*String str = "bhumika";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,5));*/


       /* String s1 = "bhumi";
        String s2 = "bhumi";
        if(s1==s2)                  //s1 & s2 ref are compared to single string same memory allocation
        System.out.println("yes");
        else
        System.out.println("No");
        String s3 = new String ("bhumi");  
        if(s1==s3)            //a new string is created and than compare memory allocated is diff
        System.out.println("yes");
        else
        System.out.println("No");*/



//contains(),equals(),compareTo() and indexOf()
        /*String s1 = "bhumikatrivedi";
        String s2 = "bhumika";
        String s3 = "Hello";
        String s4 = "trivedi";
        System.out.println(s1.contains(s2)); //answers in boolean
        System.out.println(s1.contains(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2)); //greater s1>s2 by 14-7=7
        System.out.println(s1.indexOf(s3)); //not present =-1
        System.out.println(s1.indexOf(s2)); //present from 0 index
        System.out.println(s1.indexOf(s2, 0));
        System.out.println(s1.indexOf(s4, 1)); starts from index 7
    */


    //conncatenate operation or adding strings
    String s1 = "bhumika";
    String s2  = s1;
    s1 = s1 + "trivedi"; 
    //we are adding but as strings are immutable string cannot be modify
    //once created hence it create a new object of string by adding both
    System.out.println(s1);
    System.out.println(s1==s2); //purana vala same tha abhi vala nhi
    }
}
