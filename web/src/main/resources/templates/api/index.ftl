<!DOCTYPE html>
<html>
<head lang="en">
	<title>Spring Boot Demo - FreeMarker</title>
	
	<link href="/css/index.css" rel="stylesheet" />
	
</head>
<body>

	<button id="btn" style="width: 100px;height: 30px">点击我</button>

	
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
	
	<script>
		$(function(){

            $("#btn").click(function() {

//                $.ajax({
//                    url: "http://127.0.0.1:8081/api/detail",
//                    type: "POST",
//                    data: {id: 10 },
//                    success: function(data, status, xhr) {
//                        console.log(data);
//                        alert(JSON.stringify(data));
//                    } });

                var url = "http://127.0.0.1:8081/api/detail";
                var data={"id":10}
                $.post(url,data,function (data) {
                    console.log(data);
                    alert(JSON.stringify(data));
                })

            });


		})
	</script>
</body>
</html>
