
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
    /* 
    Description: Constructor creates PersonCreator objects
    input: First name and last name
    output: The personcreator object
    purpose: To create the first and last name
    example: "brandon", "stone"
    public PersonCreator(String first, String last)
    {
        name = first + " " + last;

    }
    /*
    Description:Constructor sets name
    input: full name
    output: no output
    purpose: to set the name as the full name
    example: "Brandon Stone"
    public void setName(String fullName)
    {
        name = fullName;   

    }
    /*
    Description:Constructor is meant to set the age
    input:new age
    output: no output
    purpose: The user will define his/her age
    example: age = 7
    public void setAge(int newAge)
    {
        age = newAge;

    }
    /*
    Description: User will define his/her sex
    input: newSex
    output: no output
    purpose: to define the sex
    example: sex = male
    public void setSex(String newSex)
    {
        sex = newSex;
    }
    /*
    Description: User will set his/her height
    input: newHeight
    output: no output since its void
    purpose: to define his/her new height
    example: Height = 55 
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }
    /*
    Description: User will make his/her weight defined
    input: newWeight
    output: no output
    purpose: to define his/her weight
    example: weight = 120
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }
    /*
    Description: user will input his social
    input: soc1, soc 2 ,soc3
    output: no output
    purpose: user will input his social and define them seperately
    example: social = 100-10-1000
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
    /*
    Description: User will define his new address
    input:newAddress
    output:no output
    purpose: purpose is for user to define his address
    example: address = oak street
    public void setAddress(String newAddress)
    {
        address= newAddress;
    }
    /*
    Description: To input the phone number seperately as 3 variables
    input: phone1, phone2, phone3
    output: no output
    purpose: To input the phone number
    example: phone = 100-100-1000
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
    /*
    Description: user will define the DOB
    input: month, day, year
    output: no output
    purpose: to define the dob as the month , day, and year
    example: dob - 1/1/1900
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
