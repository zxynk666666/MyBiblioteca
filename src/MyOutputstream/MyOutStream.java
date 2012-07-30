package MyOutputstream;

public class MyOutStream {
    public String getOutput() {
        return _output;
    }

    private String _output;

    public void myPrint(String outputString) {
        this._output = outputString;
        System.out.print(outputString);
    }
}
