package innerclasses;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;  // local class
    private AbstractPhoneButton button; // anonymous class

    // anonymous class
    public interface AbstractPhoneButton{
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn(){
        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton(){
        button = new AbstractPhoneButton() {  // anonymous class
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };
    }


    public void call(String number){
        button.click();
        gsm.call(number);
    }

    public void initDisplay(){
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
