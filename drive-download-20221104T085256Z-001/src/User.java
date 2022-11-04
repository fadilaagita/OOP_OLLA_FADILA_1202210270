public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Name;
    int NIM;

    public void setName(String Name){
        this.Name = Name;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void setRegister(){
        System.out.println("Register Success");
        System.out.println("Name :" + Name);
        System.out.println("Phone Number :" + NIM);
    }
        
}