public class stringDemo {
    public static void main(String[] args) {
        //string literals
        String name = "Sri";
        String Demo = "Sri";
        //using new keyword
        String firstName = new String("Aman");
        System.out.println(name);
        System.out.println(firstName);





public class stringDemo {
    public static void main(String[] args) {
        //string literals
        String name = "Sri";
        String Demo = "Sri";
        //using new keyword
        String firstName = new String("Aman");
        String newName= name + "College";
        /*  System.out.println(newName);
        System.out.println(newName.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase().trim());
        System.out.println(name.toUpperCase().trim());
        System.out.println(firstName);*/

        System.out.println(name.trim());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("i"));
    }
}


public class stringDemo {
    public static void main(String[] args) {
        //string literals
        String name = "Sri indu";
        String demo = "Sri indu" ;
        //using new keyword
        String firstName = new String("Aman");
        String newName= name + "College";
        
        System.out.println(name.trim());
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("S"));
        System.out.println(name.replace("indu", "College"));
        System.out.println(name);
        System.out.println(name.concat(" " +demo));

    }

    
}