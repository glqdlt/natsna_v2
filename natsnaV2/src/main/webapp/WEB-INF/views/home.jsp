<!DOCTYPE html>
<html ng-app>
<head>
	<title>Hello World, AngularJS - ViralPatel.net</title>
	<script type="text/javascript"
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.5/angular.min.js"></script>

</head>
<body>
	
	Write some text in textbox:
	<input type="text" ng-model="sometext" />

	<h1>Hello {{ sometext }}</h1>
	
</body>
</html>