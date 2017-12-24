<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>PIONEER-CODERS tutorials</title>
		<link rel="styleSheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/app.css"/>
	</head>
	<body>
		<div class="container">
			<h1 class="page-title">PIONEER-CODERS Tutorials</h1>
			<h4 class="sub-title">Checkboxes Form</h4>
			<div class="form-panel">
				<form method="post">
					<div>
						<label>User Name:</label>
						<input class="form-field" type="text" name="name" placeholder="UserName"/>
					</div>
					<div>
						<label>Email ID :</label>
						<input class="form-field" type="text" name="emailId" placeholder="EMail ID"/>
					</div>
					<div>
						<label>Age(Year):</label>
						<input class="form-field" type="number" name="age" placeholder="Age"/>
					</div>
					<div>Languages Known</div>				
					<div>
						<label></label>
						<label><input type="checkbox" name="subjects" value="TELUGU">Telugu</label>
						<label><input type="checkbox" name="subjects" value="HINDI">Hindi</label>
					</div>
					<div>
						<label></label>
						<label><input type="checkbox" name="subjects" value="KANNADA">Kannada</label>
						<label><input type="checkbox" name="subjects" value="ENGLISH">English</label>
					</div>
					<button class="btn submit" type="submit">Submit</button>
					<button class="btn reset" type="reset">Reset</button>
				</form>
			</div>
		</div>
	</body>
</html>