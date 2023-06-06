public class Password {
    static String generator(int length, int symbols, int digits){
        String PasswordGen = "";
        String PasswordGen1 = "";
        int subs =  length - (symbols + digits);
        int digit1 = 0;
        while (digit1<digits){
            int a = (int) (Math.random() * 9) ;
            PasswordGen+= a;
            digit1++;
        }
        for(int i = 0; i < symbols; i++){
            int b = (int)(Math.random() * (47-33) + 33);
            PasswordGen += (char)(b);
        }
        for(int j = 0; j < subs; j++){
            int c = (int)(Math.random() * (90-65) + 65);
            int d = (int)(Math.random() * (122-97) + 97);
            double coinToss = Math.random();
            if (coinToss > 0.5){
                PasswordGen += (char)(d);
            }else{
                PasswordGen += (char)(c);
            }
        }
        for(int l = 0; l < length;l++){
            int k = (int)(Math.random() * (PasswordGen.length()));
            PasswordGen1 += PasswordGen.charAt(k);
            PasswordGen = PasswordGen.substring(0,k) + PasswordGen.substring(k+1);
        }
        return  PasswordGen1;
    }
    static String validation(String Passwords){
        int passwordLength = Passwords.length();
        int convert = 0;
        int convert1 = 0;
        int convert2 = 0;
        int convert3  = 0;
        int symbolCounter = 0;
        int digitCounter = 0;
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;
        String e = " ";
        boolean mixedLetter = false;

        for (int i =0; i < Passwords.length();i++){
            convert = Passwords.charAt(i);
            if(convert>=33 && convert <=47){
                symbolCounter += 1;
            }
        }
        for (int j =0; j < Passwords.length();j++){
            convert1 = Passwords.charAt(j);
            if(convert1 >= 48 && convert1 <= 57){
                digitCounter += 1;
            }
        }
        for (int k =0; k < Passwords.length();k++){
            convert2 = Passwords.charAt(k);
            if(convert2>=65 && convert2 <=90){
                uppercaseCounter += 1;
            }else if(convert2>=97 && convert2 <=122){
                lowercaseCounter += 1;
            }
        }
        if (uppercaseCounter > 0 && lowercaseCounter >0){
            mixedLetter = true;
        }

        if((passwordLength>=16) && (symbolCounter > 4) && (digitCounter > 4) && (mixedLetter == true)){
            e = "Excellent";
        }else if((passwordLength>12 && passwordLength < 16) && (symbolCounter > 3) && (digitCounter > 3) && (mixedLetter == true)){
            e = "Good";
        }else if((passwordLength>8 && passwordLength <= 12) && (symbolCounter > 1) && (digitCounter > 2) && (mixedLetter == false || mixedLetter == true)){
            e  = "ok";
        }else {
            e  = "Poor";
        }
        return e;
    }
}
