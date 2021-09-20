
public class InputParser {
    private String input;
    private String output;

    public InputParser(String input) {
        this.input = input;
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }

    public String[] breakOnNewLine()
    {
        return this.input.split("\\r?\\n");
    }

    public String[] getWebsiteAndAddress(String s){
        String[] data = {"", ""};
        String[] split = this.splitItem(s);
        data[0] = split[0];    
        data[1] = split[1];   
        return data;
    } 

    public String[] splitItem(String s){
       return s.split("\\s+");
    }

    public String getIpAddress(String s){
        if (s.matches("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}")) {
            return s;
        }else{
            System.out.println("Unable to find an IP address " + s);
            return "";
        }
    }

}
