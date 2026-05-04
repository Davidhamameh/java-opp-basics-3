public class main {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("Ali");
        p1.setGender("Male");
        p1.setAddress("Haifa");
        p1.setPhone_number(501234567);
        p1.setHeight(175);
        p1.setWeight(70);
        p1.setDateofbirth(2000);
        p1.setEmail("ali@gmail.com");
        p1.setJob("Student");
        p1.setFamily_sitiation("Single");
        p1.setId("123456789");

        System.out.println("Person 1:");
        System.out.println(p1);

        Person p2 = new Person();

        p2.setName(p1.getName());
        p2.setGender(p1.getGender());
        p2.setAddress(p1.getAddress());
        p2.setPhone_number(p1.getPhone_number());
        p2.setHeight(p1.getHeight());
        p2.setWeight(p1.getWeight());
        p2.setDateofbirth(p1.getDateofbirth());
        p2.setEmail(p1.getEmail());
        p2.setJob(p1.getJob());
        p2.setFamily_sitiation(p1.getFamily_sitiation());
        p2.setId(p1.getId());


        p2.setName("Omar");
        p2.setWeight(80);

        System.out.println("\nPerson 2 (copy):");
        System.out.println(p2);
    }
}