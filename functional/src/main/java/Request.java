public class Request {
    private String string;
    private Integer integer;

    public Request(String string, Integer integer) {
        this.string = string;
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
