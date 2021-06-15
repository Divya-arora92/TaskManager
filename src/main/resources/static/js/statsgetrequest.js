$(document).ready(function() {

	// GET REQUEST
	$("#stats").click(function(event) {
		
		getStatistics();
	});

	// DO GET
	function getStatistics() {
		 $.ajax({
			type : "GET",
			url : window.location + "api/v1/taskmanager/task/"+$("#taskid").val(),
			success : function(result) {
				$('#news-group').empty();
				//var taskInfo=result;
				//$("#inptitle").val=result.title;
				var ta = document.getElementById('inptitle');
    			ta.value = result.title;
    			var ta = document.getElementById('inpdescription');
    			ta.value = result.description;
    			var ta = document.getElementById('inpstatus');
    			ta.value = result.status;
    			var ta = document.getElementById('inpstart');
    			ta.value = result.startDate;
				var ta = document.getElementById('inpend');
    			ta.value = result.endDate;
			         
		              
				
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});
	}
})