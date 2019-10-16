<%@ include file="./header.jsp"%>
<div class="alert alert-dark">
		<div class="container">
			<p class="lead" style="text-align:center">Welcome to the dashboard ${user.name}	</p>
		</div>
	</div>
<div class="row">
	<div class="col-md-3">
	<a type="button" class="btn btn-primary btn-lg btn-block" href="./inbox">Inbox</a> 
			<a type="button" class="btn btn-primary btn-lg btn-block" href="./compose">Compose</a>
	
	</div>
	


</div>


<%@ include file="./footer.jsp"%>