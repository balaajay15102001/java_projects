<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="numbers_in_words.jsp">
  <label>Enter the value:</label>
  <input type="text" name="Number";placeholder="Enter the value">
  <input type="submit" >
</form>
<%
  try {
    String[] ones = new String[]{"Zero  ", "One  ", "Two  ", "Three  ", "Four ", "Five  ", "Six  ", "Seven  ", "Eight  ", "Nine  "};
    String[] teens = new String[]{"Eleven ", "Tweleve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ", "Twenty"};
    String[] tens = new String[]{"Ten ", "Twenty ", "Thirty ", "Fourty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninenty ", "Hundred "};
    String value = request.getParameter("Number");
    int num = Integer.parseInt(request.getParameter("Number"));
    String teen= String.valueOf((num-10));
    int ten=(num/10)%10;
    int hun=(num/100)%10;
    int two_digit=num/10;
    int single_digit=num%10;
    int hun_digit=num%100;
    if (value.length() == 1) {
      out.print(ones[num]);
    } else if (num==10) {
      out.print(tens[0]);

    } else if (value.length()==2 && teen.length()==1){
      out.print(teens[Integer.parseInt(teen)-1]);
    }
    else if (value.length()==2  && num%10==0) {
      out.print(tens[ten-1]);
    }
    else if(value.length()==2){
      out.print(tens[two_digit-1]+" "+ones[single_digit]);
    }
    else if(value.length()==3){
      if(num%100==0){
        out.println(ones[num/100]);
      }
      else if(two_digit%10==1){
        out.println(ones[num/100]+" hundred and "+teens[(num%10)]);
      }
      else{
        if(single_digit != 0) {
          out.println(ones[num / 100] + " hundred and " + tens[(two_digit % 10) - 1] + " " + ones[num % 10]);
        }
        else{
          out.println(ones[num / 100] + " hundred and " + tens[(two_digit % 10) - 2]);

        }
      }
    }
  }catch (Exception e){
    out.print(e);
  }
%>
</body>
</html>
