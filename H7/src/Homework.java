import java.util.Scanner;

public class Homework {

    public int findSymbolOccurance(String word, char a) {
        int occurenceTime = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == a) {
                occurenceTime++;
            }
        }

        return occurenceTime;
    }
    

    public int findWordPosition(String source, String target) {
        int position = -1;
        if (source.contains(target)) {
            position = source.indexOf(target);
        }

        return position;
    }


    public String stringReverse(String word) {
        StringBuffer reverseWord = new StringBuffer();
        char[] result = word.toCharArray();

        for (int i = result.length - 1; i >= 0; i--) {
            reverseWord.append(result[i]);
        }

        word = new String(reverseWord);
        return word;

    }


    public boolean isPalindrome(String word) {
        String reversedWord = stringReverse(word).toLowerCase();
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) != reversedWord.charAt(i)) {
                break;
            } else {
                flag = true;
            }
        }

        return flag;
    }


    public void guessWord() {
        String[] arr = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randIndex = (int) Math.abs(Math.random() * arr.length);
        String randWord = arr[randIndex].toLowerCase();
        boolean stopGame = false;
        String guessedWord = "";
        StringBuffer wordToGuess = new StringBuffer("###############");
        Scanner in = new Scanner(System.in);
        String userWord = in.nextLine().toLowerCase();
        while (stopGame == false) {

            if (randWord.toLowerCase().equals(userWord.toLowerCase())) {
                guessedWord = userWord.toLowerCase();
                break;
            }

            for (int i = 0; i < userWord.length(); i++) {
                for (int j = 0; j < randWord.length(); j++) {
                    if (userWord.charAt(i) == randWord.charAt(j) && i == j) {
                        wordToGuess.replace(i, i, String.valueOf(randWord.charAt(j)));
                    }
                }
            }

            System.out.println("Спробуйте ще раз");
            System.out.println(wordToGuess);
            wordToGuess = new StringBuffer("###############");
            userWord = in.nextLine();
        }

        System.out.println(guessedWord);

    }

    public static void main(String[] args) {

    }
}
