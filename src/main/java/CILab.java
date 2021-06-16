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

            boolean allCaps = true, firstCap = true, allLower = true;
            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                if (Character.isLowerCase(current)) {
                    allCaps = false;
                    if(i == 0)
                    {
                        firstCap = false;
                    }
                } else {
                    if( i != 0)
                    {
                        firstCap = false;
                    }
                    allLower = false;
                }
            }

            if (!(allCaps && firstCap && allLower))
            {
                return false;
            }
        }

        return true;
    }

}

