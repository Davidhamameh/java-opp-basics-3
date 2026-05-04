public class Person {

    private String name;
    private String gender;
    private String address;
    private int phone_number;
    private int height;
    private int weight;
    private int dateofbirth;
    private String email;
    private String job;
    private String family_sitiation;
    private String id;


public void setName(String name){
this.name=name;
}
public String getName(){
    return name;
}
public void setGender(String gender){
    this.gender=gender;
}
public String getGender(){
    return gender;
}
public void setAddress(String address){
    this.address=address;
}
public String getAddress(){
    return address;
}
public void setPhone_number(int phone_number){
    this.phone_number=phone_number;
}
public int getPhone_number(){
    return phone_number;
}
public void setHeight(int height){
    this.height=height;
}
public int getHeight(){
    return height;
}
public void setWeight(int weight){
    this.weight=weight;
}
public int getWeight(){
    return weight;
}
public void setDateofbirth(int dateofbirth){
    this.dateofbirth=dateofbirth;
}
public int getDateofbirth(){
    return dateofbirth;
}
public void setEmail(String email){
    this.email=email;
}
public String getEmail(){
    return email;
}
public void setJob(String job){
    this.job=job;
}
public String getJob(){
    return job;
}
public void setFamily_sitiation(String family_sitiation){
    this.family_sitiation=family_sitiation;
}
public String getFamily_sitiation(){
    return family_sitiation;
}
public void setId(String id){
    this.id=id;
}
public String getId(){
    return id;
}
    public String toString(){
        return "name : " + name +
                ", gender : " + gender +
                ", address : " + address +
                ", phone_number : " + phone_number +
                ", height : " + height +
                ", weight : " + weight +
                ", dateofbirth : " + dateofbirth +
                ", email : " + email +
                ", job : " + job +
                ", family_sitiation : " + family_sitiation +
                ", id : " + id;
    }


}