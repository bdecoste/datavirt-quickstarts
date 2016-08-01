package com.client.quickstart.addressbook.pojos;

import java.util.List;
import java.util.ArrayList;


/**
 *  * @author Adrian Nistor
 *   */
public class Person {

   public String name;
   public int id;
   public String email;
   public List<PhoneNumber> phones;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

    public List<PhoneNumber> getPhones() {
      return phones;
   }

   public void setPhoneNumbers(List<PhoneNumber> phones) {
      this.phones = phones;
   }

   @Override
   public String toString() {
      return "Person{" +
            "id=" + id +
            ", name='" + name +
            "', email='" + email + '\'' +
            ", phones=" + phones +
            '}';
   }
}
