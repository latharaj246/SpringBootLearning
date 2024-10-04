package car.example.bean;

public class MyBean {
    //bean
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showmessage(String message) {
        System.out.println(message);

    }
    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
