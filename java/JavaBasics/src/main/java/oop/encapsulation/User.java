package oop.encapsulation;

/*
* encapsulation means the restriction of direct access
*
* we achieve this by using access modifiers
*   - public: can be seen in any package
*   - protected: can be seen within the same package AND subclasses
*   - default: can only be seen within the same package
*   - private: visible to the class that you are in
*
* */
public class User {
    private Integer age = 18;
    String firstName = "Kevin";
    protected String lastName = "Childs";


    //getter
    public Integer getAge(){
        return this.age;
    }

    //setter
    public void setAge(Integer val){
        if(val >= 18){
            this.age = val;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
