public class Main {
    public static void main(String[] args) {
        String firstWord = "информатика";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstWord.substring(7, 8)).append(firstWord.substring(3, 5)).append(firstWord.substring(7, 8));
        System.out.println(stringBuilder);//first version;

        //System.out.println(firstWord.substring(7, 8) + firstWord.substring(3, 5) + firstWord.substring(7, 8)); - second version;
    }
}
