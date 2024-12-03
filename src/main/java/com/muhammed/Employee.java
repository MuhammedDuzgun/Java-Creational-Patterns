package com.muhammed;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int personelId;
    private String phone;   //optional
    private String address; //optional
    private String email; //optional

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.personelId = employeeBuilder.personelId;
        this.phone = employeeBuilder.phone;
        this.address = employeeBuilder.address;
        this.email = employeeBuilder.email;
    }

    static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private int personelId;
        private String phone; //optional
        private String address; //optional
        private String email; //optional

        public EmployeeBuilder(String firstName, String lastName, int age, int personelId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personelId = personelId;
        }

        public EmployeeBuilder  setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder  setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder  setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personelId=" + personelId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
