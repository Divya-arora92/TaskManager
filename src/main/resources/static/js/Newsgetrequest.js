$(document).ready(function() {

	// GET REQUEST
	$("#frm1").click(function(event) {
		ajaxGet();
	});

	
	// DO GET
	function ajaxGet() {
		$.ajax({
			type : "GET",
			url : window.location + "api/v1/taskmanager/project/"+$("#projectid").val(),
			success : function(result) {
				$('#news-group').empty();
				var taskInfoList=result.tasklist;
				
				$.each(taskInfoList, function(i, task){
		            var panel = "<div class=\"panel panel-info\">" +
					"<div class=\"panel-heading\" id=\"panel-head-1\">Title: " +task.title+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">Description: "  +task.description+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">Status: " +task.status+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">Start Date: " +task.startDate+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">End Date: " +task.endDate+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">Task Id: " +task.taskId+
					"</div>" +
					"<div class=\"panel-body\" id=\"panel-body-1\">Project Id: " +task.projectId+
					"</div>" +
					"</div>";
		            $('#news-group').append(panel)
		              });
				
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});
	}
})