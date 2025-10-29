package Enumeration;

public enum Day {

    SUNDAY("sunday","ravivar"),
    MONDAY("monday","somwar"),
    TUESDAY("tuesday","mangalwar"),
    WEDNESDAY("wednesday","budgwar"),
    THURSDAY("thursday","guruwar"),
    FRIDAY("friday","Shukrwar"),
    SATURDAY("saturday","Shaniwar");

    private Day(String lower, String hindi){
        System.out.println("our constructor called");
        this.lower =lower;
        this.hindi =hindi;
    }

    public String getLower(){
        return lower;
    }

    public String getHindi(){
        return hindi;
    }

    private String lower;
    private String hindi;

    public void display(){
        System.out.println("Today is " + this.name());
    }

}
