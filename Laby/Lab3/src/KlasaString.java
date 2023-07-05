public class KlasaString {
    public static void main(String[] argc) {
        /* String s1= new String("Happy");
        String s2=new String("Birthday");
        System.out.printf("s1=%s\ns2=%s\n\n",s1,s2);
        System.out.printf("Resultofs1.concat(s2)=%s\n",s1.concat(s2));
        System.out.printf("s1afterconcatenation=%s\n",s1);
    }//end main*/
        //toCharArray()
        String ciag = "tak",ciag2 = "a";
        char[] tab1=ciag.toCharArray();
        System.out.println(tab1[1]);

        //getBytes()
        byte[] tab2 = ciag.getBytes();
        System.out.println(tab2[1]);

        //equals
        boolean prawda1 = ciag.equals(ciag2);
        System.out.println(prawda1);

        //equalsIgnoreCase
        boolean prawda2 = ciag2.equalsIgnoreCase(ciag);
        System.out.println(prawda2);

        //campareTo
        int pomoc1 = ciag.compareTo(ciag2);
        System.out.println(pomoc1);

        //compareToIgnorateCase
        int pomoc2 = ciag.compareToIgnoreCase(ciag);
        System.out.println(pomoc2);

        //indexOf
        int pomoc3 = ciag.indexOf(2);
        int pomoc4 = ciag.indexOf(ciag2);
        System.out.println(pomoc3);
        System.out.println(pomoc4);

        //lastIndexOf
        int pomoc5 = ciag.lastIndexOf(pomoc1);
        int pomoc6 = ciag2.lastIndexOf(ciag);
        System.out.println(pomoc5);
        System.out.println(pomoc6);

        //substring
        String ciag3 = ciag.substring(1);
        String ciag4 = ciag.substring(0, 2);
        System.out.println(ciag3);
        System.out.println(ciag4);

        //replace
        String ciag5 = ciag.replace("a","t");
        System.out.println(ciag5);

        //trim
        String ciag6 = ciag.trim();
        System.out.println(ciag6);

        //toLowerCase
        String ciag7 = "AASADF";
        ciag7 = ciag7.toLowerCase();
        System.out.println(ciag7);

        //toUpperCase
        ciag7 = ciag7.toUpperCase();
        System.out.println(ciag7);

        String[] ciag8 = new String[4];
        String[] ciag9 = new String[4];
        String ciag10 = "Ala ma kota";
        ciag8 =ciag10.split(" ",2);
        ciag9 =ciag10.split(" ");
        for(String a : ciag8)
        {
            System.out.println(a);
        }
        for(String a : ciag9)
        {
            System.out.println(a);
        }




    }



}



