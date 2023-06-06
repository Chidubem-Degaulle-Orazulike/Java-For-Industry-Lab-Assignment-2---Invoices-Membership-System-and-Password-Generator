public class Q3Main {
    public static void main(String[] args) {
        //System.out.println(Password.generator(18,5,6));
        String pass1 = (Password.generator(18,5,6));
        String pass2 = (Password.generator(9,2,2));
        String pass3 = (Password.generator(9,2,3));
        String pass4 = (Password.generator(14,4,5));
        String pass5 = (Password.generator(6,2,1));
        //System.out.println(pass1);
        System.out.println(Password.validation(pass1));
        System.out.println(Password.validation(pass2));
        System.out.println(Password.validation(pass3));
        System.out.println(Password.validation(pass4));
        System.out.println(Password.validation(pass5));


    }
}
