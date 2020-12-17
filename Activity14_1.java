package Selenium_session1;
//Create Iterator reference
Iterator<String[]> itr = list.iterator();

//Iterate all values
while(itr.hasNext()) {
  String[] str = itr.next();

  System.out.print("Values are: ");
  for(int i=0;i<str.length;i++) {
      System.out.print(" " + str[i]);
  }
      System.out.println(" ");
}
