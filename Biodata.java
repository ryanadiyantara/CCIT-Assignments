package com.mycompany.Object.and.Classes.Assignment;

public class Biodata {
   int myAge;

   public Biodata(String name) {
      // This constructor has one parameter, name.
      System.out.println("My name is : " + name );
   }

   public void setAge( int age ) {
      myAge = age;
   }

   public int getAge( ) {
      System.out.println("My age is : " + myAge );
      return myAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Biodata myBiodata = new Biodata( "Ryan Adiyantara" );

      /* Call class method to set age */
      myBiodata.setAge( 18 );

      /* Call another class method to get age */
      myBiodata.getAge(  );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myBiodata.myAge );
   }
}
