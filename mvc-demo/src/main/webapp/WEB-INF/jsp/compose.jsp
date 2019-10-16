<%@ include file="./header.jsp"%>
<div class="alert alert-dark">
	<div class="container">
		<p class="lead" style="text-align: center">Welcome to the
			dashboard ${user.name}</p>
	</div>
</div>
<div class="row">
	<div class="col-md-3">
		<a type="button" class="btn btn-primary btn-lg btn-block"
			href="./inbox">Inbox</a> <a type="button"
			class="btn btn-primary btn-lg btn-block" href="./compose">Compose</a>

	</div>
	<div class="col-md-9">

		<form method="POST">
			<div class="form-group row">
				<label for="to" class="col-sm-2 col-form-label">To</label>
				<div class="col-sm-10">
					<input autofocus="autofocus" type="text" class="form-control"
						id="msg_to" name=msg_to>
				</div>
			</div>

			<div class="form-group row">
				<label for="cc" class="col-sm-2 col-form-label">CC</label>
				<div class="col-sm-10">
					<input autofocus="autofocus" type="text" class="form-control"
						id="cc" name="cc">
				</div>
			</div>
			
			<div class="form-group row">
				<label for="subject" class="col-sm-2 col-form-label">Subject</label>
				<div class="col-sm-10">
					<input autofocus="autofocus" type="text" class="form-control"
						id="subject" name="subject">
				</div>
			</div>
			
			<div class="form-group row">
				<label for="message" class="col-sm-2 col-form-label">Message</label>
				<div class="col-sm-10">
					<input autofocus="autofocus" type="text" class="form-control"
						id="msg_body" name="msg_body">
				</div>
			</div>
			
			
			<div class="form-group row">
				<label class="col-sm-2 col-form-label"></label>
				<div class="col-sm-10">
					<button class="btn btn-primary">Send</button>
				</div>
			</div>


		</form>


	</div>



</div>


<%@ include file="./footer.jsp"%>