package MileStone_1;

public class CyperText {
    /*public static void main(String[] args) {
        String normalText = "cypertext";
        int size = normalText.length();
        String cyperText = convertNormalToCyperText(normalText,size);
        System.out.println("The final Cyper Text: " + cyperText);
    }

    static String convertNormalToCyperText(String normalText,int length){
        StringBuilder updatedText = new StringBuilder();
        for(char ch : normalText.toCharArray()){
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char cyperChar = (char) ('a' + (ch - 'a' + length) % 26);
                    updatedText.append(cyperChar);
                } else {
                    char cyperChar = (char) ('A' + (ch - 'A' + length) % 26);
                    updatedText.append(cyperChar);
                }
            }
        }
        return updatedText.toString();
    }*/

}
