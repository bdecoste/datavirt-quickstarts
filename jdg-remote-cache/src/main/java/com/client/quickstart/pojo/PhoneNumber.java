package com.client.quickstart.addressbook.pojos;


/**
 *  * @author Adrian Nistor
 *   */
public class PhoneNumber {

   public String number;

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   @Override
   public String toString() {
      return "PhoneNumber{" +
            "number='" + number + 
            '}';
   }
}

