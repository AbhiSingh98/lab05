
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
    private String social;
    private String address;
    private String phoneNum;
    private String dob;

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

    public void inputSocial(int soc1, int soc2, int soc3)
    {
        if (soc1 < 100 || soc1 > 999)
        {
            System.err.println("invalid error. input 3 digits");
        }
        else if (soc2 < 10 || soc2 > 99)
        {
            System.err.println("invalid error. input 2 digits");
        }
        else if (soc3 < 1000 || soc3 > 9999)
        {
            System.err.println("invalid error. input 4 digits");
        }    
        else
        {
            social = soc1 + "-" + soc2 + "-" + soc3;
        }

    }

    public void setAddress(String newAddress)
    {
        address= newAddress;
    }

    public void inputPhone(int phone1, int phone2, int phone3)
    {
        if (phone1 < 100 || phone1 > 999)
        {
            System.err.println("invalid number. input 3 digits");
        }
        else if (phone2 < 100 || phone2 > 999)
        {
            System.err.println("invalid number. input 3 digits");
        }
        else if (phone3 <1000 || phone3 > 9999)
        {
            System.err.println("invalid number. input 4 digits");
        }
        else
        {
            phoneNum = phone1 + "-" + phone2 + "-" + phone3;
        }

    }

    public void inputDob(int month, int day, int year)
    {
        if (month < 1 || month > 12)
        {
            System.err.println("invalid month. input number reflecting the month");
        }
        else if (day < 1 || day > 31 )
        {
            System.err.println("invalid day. input number reflecting the date");
        }
        else if (year < 1900 || year > 2050)
        {
            System.err.println("invalid year. input number reflecting the year");
        }
        else
        {
            dob = month + "/" + day + "/" + year;
        }

    
    }
    public void showinfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(social);
        System.out.println(address);
        System.out.println(phoneNum);
        System.out.println(dob);
    }
}
