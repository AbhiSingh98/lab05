
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String name;
    private int age;
    private String sex;
    private double height;
    private double weight;
    private int social;
    private String address;
    private int phoneNum;
    private int dob;

    public PersonCreator(String first, String last)
    {
        name = first + " " + last;

    }

    public void setName(String fullName)
    {
        name = fullName;   

    }

    public void setAge(int newAge)
    {
        age = newAge;

    }

    public void setSex(String newSex)
    {
        sex = newSex;
    }

    public void setHeight(double newHeight)
    {
        height = newHeight;
    }

    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }

   
   

}

