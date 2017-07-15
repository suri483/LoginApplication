<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iBerry LoginForm</title>

<!-- Styling for the form -->
<script>
	function verify(){
	    
		var val1=document.getElementById("one").value;
		var val2=document.getElementById("two").value;
		var val3=document.getElementById("three").value;
		var val4=document.getElementById("four").value;
		
		if((val1.length==0)){
			if((val1.length==0)){
				if((val1.length==0)){
					if(((val1.length==0))){
						alert("Please Fill SignUp Page");
						return false;
					}
				}
			}
			
		}
		else{
			if((val1==val2)&&(val3==val4)){
				
			}
			else{
				alert("entering data doesn't match");
				return false;
			}
		}
	}
</script>
<style>
form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

#button1 {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

#signup {
	background-color: blue;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>
</head>

<body>
	<h3 style="color: red">
		<b>UserName is already exist.</b>
	</h3>
	<h2>SignUp Form</h2>
	<!-- Form Elements -->
	<form name="SignUp" method="get" action="SignUpServlet"
		onsubmit="return verify()">



		<div class="container">
			<label><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" id="one" required>

			<label><b>Check Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" id="two" required>


			<label><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" id="three" required>

			<label><b>Check Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" id="four" required>

			<input type="submit" value="Signup" id="button1"><br> <input
				type="checkbox" checked="checked"> Remember me
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>

		</div>
	</form>
</body>
</html>