$(document).ready(function() {

	// GET REQUEST
	$("#lol").click(function(event) {
		// event.preventDefault();
		formDisplay();
	});

	// DO GET
	function formDisplay() {
		
					$('#news-group').empty();
		            var panel = "<div><form class=\"form-inline\" style=\"margin:20px 20px 20px 20px\" id=\"customerForm\">"+
		            			"<div class=\"form-group\">" +
		              			"<label for=\"country\" style=\"margin-right:5px\">Country:</label>"+
		              			"<input type=\"text\" class=\"form-control\" id=\"country\" placeholder=\"Enter Country\"/></div>"+
		              			"<button type=\"button\" class=\"btn\" id=\"lol\">Submit</button>"+
		              			"</form>"+
		              			"</div>";
		            $('#news-group').append(panel);
	}
			
})


      