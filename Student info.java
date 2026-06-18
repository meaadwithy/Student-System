
public class Student{
    private String name;
    private int ID;
    private String college;
    private String major;
    
    public Student(String name, int ID, String college, String major){
        this.name = name;
        this.ID = ID;
        this.college = college;
        this.major = major;
    }
    
    public String getName() {
        return name;
    }public int getID() {
        return ID;
    }public String getCollege() {
        return college;
    }public String getMajor() {
        return major;
    }
    
    public void setName(String name) {
        this.name = name;
    }public void setID(int ID) {
        this.ID = ID;
    }public void setCollege(String college) {
        this.college = college;
    }public void setMajor(String major) {
        this.major = major;
    }

    public String toString(){
      return "Name: " + getName() + " Student ID: " + getID() +" Collage: "+ getCollege()+ " Major: " + getMajor();
    }

    public boolean equals(Object o){
        if(o instanceof Student){
            Student s = (Student) o;
            return getName().equals(s.getName())
                    && getID() == s.getID()
                    && getCollege().equals(s.getCollege())
                    && getMajor().equals(s.getMajor());
        }
        return false;
    }
}
