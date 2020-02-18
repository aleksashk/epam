public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("sssssoome looong   string  with wrong  symmmmbol!!!!!!!");
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                stringBuilder.deleteCharAt(i--);
            }
        }

        System.out.println(stringBuilder);
    }
}
