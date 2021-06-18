package TDD;

public class Line {
    public static int getLength(String line) {
        int maxLength = 0, i_start = 0;
        boolean isLine = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1' && !isLine) {
                i_start = i;
                isLine = true;
            } else if (line.charAt(i) == '0' && isLine) {
                maxLength = Math.max(i - i_start, maxLength);
                isLine = false;
            } else if (i == line.length() - 1 && isLine) {
                maxLength = Math.max(i - i_start + 1, maxLength);
            }
        }

        return maxLength;
    }
}
