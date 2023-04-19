<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
    body{
      font-family: Calibri;
      background-color: orange;
    }
    .container {
      padding: 50px;
      background-color:#E6E6FA;
    }

    input[type=text], input[type=password]{
      width: 100%;
      padding: 15px;
      margin: 5px 0 22px 0;
      display: inline-block;
      border: none;
      background: #f1f1f1;
    }
    input[type=text]:focus, input[type=password]:focus {
      background-color: orange;
      outline: none;
    }
    div {
      padding: 10px 0;
    }
    hr {
      border: 1px solid #726E6D;
      margin-bottom: 25px;
    }
    .registerbtn {
      background-color:#008000;
      color: white;
      padding: 16px 20px;
      margin: 8px 0;
      border: none;
      cursor: pointer;
      width: 100%;
      opacity: 0.9;
    }
    .registerbtn:hover {
      opacity: 1;
    }
  </style>
</head>
<body>
<form action="Student_form_insert.jsp">
  <div class="container">
    <h1> Student Registration Form</h1> </center>
    <hr>
    <label> Name </label>
    <input type="text" name="name" placeholder= "name" size="15" required />
    <label> DOB </label>
    <input type="text" name="DOB" placeholder= "dob" size="15" required />
    <label>Email</label>
    <input type="text" placeholder="Enter Email" name="email" required>
    <label>Mobile no</label>
    <input type="text" placeholder="Enter your mobile number" name="mobile" required>
    <label>Password : </label>
    <input type="password" placeholder="Enter Password" name="password" required></br>
    <label>Confirm Password : </label>
    <input type="password" placeholder="confirm your Password" name="confirm_password" required>

    <button type="submit" class="registerbtn">Register </button>
  </div>
</form>
</body>
</html>

