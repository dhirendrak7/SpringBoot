<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- First, include the Webcam.js JavaScript Library -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/webcamjs/1.0.25/webcam.min.js"></script>
<title>Webcam Test Page</title>
<style type="text/css">
body {
	font-family: Helvetica, sans-serif;
}

h2, h3 {
	margin-top: 0;
}

form {
	margin-top: 15px;
}

form input {
	margin-right: 15px;
}

#results {
	float: right;
	margin: 20px;
	padding: 20px;
	border: 1px solid;
	background: #ccc;
}
</style>
</head>
<body>
	<div id="results">Your captured image will appear here...</div>

	<h1>Webcam Test Page</h1>
	<h3>Demonstrates 320x240 capture &amp; display with preview mode</h3>

	<div id="my_camera"></div>

	

	<!-- Configure a few settings and attach camera -->
	<script language="JavaScript">
		Webcam.set({
			width : 320,
			height : 240,
			image_format : 'jpeg',
			jpeg_quality : 90
		});
		Webcam.attach('#my_camera');
	</script>

	<!-- A button for taking snaps -->

		<div id="pre_take_buttons">
			<input type=button value="Take Snapshot" onClick="preview_snapshot()">
		</div>
		<div id="post_take_buttons" style="display: none">
			<input type=button value="&lt; Take Another"
				onClick="cancel_preview()"> <input type=button
				value="Save Photo &gt;" onClick="save_photo()"
				style="font-weight: bold;">
		</div>


	<div id="output"></div>



	<!-- Code to handle taking the snapshot and displaying it locally -->
	<script type="JavaScript">
		function preview_snapshot() {
			// freeze camera so user can preview pic
			Webcam.freeze();

			// swap button sets
			document.getElementById('pre_take_buttons').style.display = 'none';
			document.getElementById('post_take_buttons').style.display = '';
		}

		function cancel_preview() {
			// cancel preview freeze and return to live camera feed
			Webcam.unfreeze();

			// swap buttons back
			document.getElementById('pre_take_buttons').style.display = '';
			document.getElementById('post_take_buttons').style.display = 'none';
		}

		function save_photo() {
			// actually snap photo (from preview freeze) and display it
			Webcam
					.snap(function(data_uri) {
						// display results in page
						//debugger;
						document.getElementById('results').innerHTML = '<h2>Here is your image:</h2>'
								+ '<img src="'+data_uri+'"/>';
						//document.getElementById('output').innerHTML = data_uri;
						var xmlhttp = new XMLHttpRequest(); // new HttpRequest instance 
						var theUrl = "/webcam/senddata";
						xmlhttp.open("POST", theUrl);
						xmlhttp
								.setRequestHeader("Content-Type",
										"application/x-www-form-urlencoded;charset=UTF-8");
						//data_uri = encodeURI(data_uri); 
						/* xmlhttp.send(JSON.stringify({"imagedata":data_uri})); */
						xmlhttp.send("imagedata="
								+ encodeURIComponent(data_uri));
						// swap buttons back
						document.getElementById('pre_take_buttons').style.display = '';
						document.getElementById('post_take_buttons').style.display = 'none';
					});
		}
		
	</script>

</body>
</html>
