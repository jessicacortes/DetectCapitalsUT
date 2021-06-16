import java.util.Scanner;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse()
    {
        String word = "";
        Scanner scanner = new Scanner(myString);
        while(scanner.hasNext()) {
            word = scanner.next();

            int capsCount = 0;
            for(int i = 0; i < word.length(); i++)
            {
                if (Character.isUpperCase(word.charAt(i)))
                {
                    capsCount++;
                }
            }

            if (capsCount != 0
                && capsCount != word.length()
                && (capsCount != 1 || !Character.isUpperCase(word.charAt(0))))
            {
                return false;
            }
        }

        return true;
    }

}

