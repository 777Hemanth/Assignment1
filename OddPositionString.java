public class OddPositionString {
    public static void main(String[] args) {
        String text = "type here to search";
        String result = "";
        text = text.replace(" ", "");
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                result += text.charAt(i);
            }
        }
        System.out.println("Characters at odd positions: " + result);
    }
}

