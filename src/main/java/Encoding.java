public class Encoding {
    private int mKey;
    private String mInputText;

    public Encoding(String inputText,int key) {
        mKey = key;
        mInputText = inputText;
    }

    public String getInputText() {
        return mInputText;
    }

    public int getKey()
    {
        return mKey;
    }
}
