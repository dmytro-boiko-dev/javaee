package innerclasses;

public class RadioModule {

    public RadioModule() {
        System.out.println("Radio module initialized.");
    }

    public void call(String number){
        int lenght = 10;

        class GSMModule{
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid(){
                if(phoneNumber.length() != lenght){
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e){
                        return false;
                    }
                }
            }

            public void dialInt(){
                if(isValid()){
                    System.out.println("Calling number: " + validNumber);
                } else {
                    System.out.println("Phone number is invalid. Please correct phone number.");
                }
            }
        }

        GSMModule gsmModule = new GSMModule(number);
        gsmModule.dialInt();


    }
}
