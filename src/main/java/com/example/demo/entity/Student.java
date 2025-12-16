e com.example.demo.entity;

public class Student{
    private long id;
    private String name;
    private String email;
    private float cgpa;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(long name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(long email){
        this.email=email;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(long id){
        this.cgpa=cgpa;
    }
   
}