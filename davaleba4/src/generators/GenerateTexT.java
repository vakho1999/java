package generators;

import java.util.ArrayList;

public interface GenerateTexT {
    public void generateAlphabet();
    public char generateChar();
    public String generateWord(int min, int max);
    public ArrayList generateSentens(ArrayList parameters);
}
