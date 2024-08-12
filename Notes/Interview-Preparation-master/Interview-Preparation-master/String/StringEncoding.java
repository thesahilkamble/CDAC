class GfG
 {
	String encode(String str)
	{
	      int i = 0;
	      int count = 1;
	      String res = "";
          while(i < str.length() - 1){
              if(str.charAt(i) != str.charAt(i+1)){
                  res = (res +  str.charAt(i))  + count;
                  count = 1;
                 
              }
              else
                 count++;
             i++;
          }
          
          return (res + str.charAt(i)) + count;
	}
	
 }
