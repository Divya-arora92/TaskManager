$(document).ready(function() {


	
	
	$("#update").click(function(event) {
		//event.preventDefault();
		getStatistics();
	});
	// DO GET
	function getStatistics() {
		 $.ajax({
			contentType: 'application/json',
    		data: '{"title": "'+ $("#inptitle").val() + '",'+
    		 '"description": "'+ $("#inpdescription").val() + '",' +
    		 '"status": "'+ $("#inpstatus").val() + '",' +
    		 '"startDate": "'+ $("#inpstart").val() + '",' +
    		 '"endDate": "'+ $("#inpend").val() + '"' +
    		  '}',
			type : "PUT",
			url : window.location + "api/v1/taskmanager/task/" + $("#taskid").val(),
			success : function(result) {
				$('#news-group').empty();
				alert("successfully updated task");
				
				
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});
	}
})