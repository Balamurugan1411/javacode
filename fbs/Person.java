abstract class Person {
    private String name;
    private String email;

    public Person(String name, String email){
        this.name = name;
        setEmail(email);
    }

    public String getName(){ return name; }
    public String getEmail(){ return email; }

    public void setEmail(String email){
        if(!email.contains("@")){
            throw new IllegalStateException("Email not valid");
        }
        this.email = email;
    }

    public abstract void showRole();
}