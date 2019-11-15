<!DOCTYPE html>
<html lang="en">
<head>
<title>Little Closet</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Little Closet template">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <jsp:include page="common/import.jsp"/>
</head>
<body>

<div class="super_container">
  <jsp:include page="common/header.jsp"/>
	<div class="super_container_inner">
		<div class="super_overlay"></div>

		<div class="home">
           <div class="container">
           		<form action="#" class="was-validated">
           			<div class="form-group">
           				<label for="fname">Sale Name:</label>
           				<input type="text" class="form-control" id="fname"
           					placeholder="Enter Sale Name" name="fname" required>
           				<div class="valid-feedback">Valid</div>
           				<div class="invalid-feedback">
           					Please fill this field
           				</div>
           			</div>

           			<div class="form-group">
           				<label for="lname">Start Date:</label>
           				<input type="text" class="form-control datepicker" id="startDate"
           					placeholder="Enter Start Date" name="startDate" required>
           				<div class="valid-feedback">Valid</div>
           				<div class="invalid-feedback">
           					Please fill this field
           				</div>
           			</div>

           			<div class="form-group">
           				<label for="email">End Date:</label>
           				<input type="email" class="form-control datepicker" id="endDate"
           					placeholder="Enter End Date" name="endDate" required>
           				<div class="valid-feedback">Valid</div>
           				<div class="invalid-feedback">
           					Please fill this field
           				</div>
           			</div>

           			<div class="form-group">
           				<label for="contact">Sale Discount:</label>
           				<input type="text" class="form-control" id="contact"
           					placeholder="Enter Contact Number" name="contact"
           					required>
           				<div class="valid-feedback">Valid</div>
           				<div class="invalid-feedback">
           					Please fill this field
           				</div>
           			</div>

           			<button type="submit" class="btn bg-success">Submit</button>
           		</form>
           	</div>
		</div>

  <jsp:include page="common/footer.jsp"/>
	</div>

</div>
<script>
$('.datepicker').datepicker({
    format: 'mm/dd/yyyy',
    startDate: '1d'
});
</script>

</body>
</html>