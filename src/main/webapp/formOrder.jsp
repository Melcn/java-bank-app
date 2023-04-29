<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="OrderServlet" method="post">
		<p>
			<label for="date">Date</label> <input type="date" name="date"
				required> <br>

		</p>

		<p>
			<label for="amount">Montant</label> <input type="text"
				name="amount" required> <br>

		</p>

		<p>
			<label for="payment">Mode de paiement</label> <input type="text"
				name="payment" required> <br>

		</p>

		<p>
			<label for="status">Statut du paiement</label> <input type="text"
				name="paymentStatus"> <br>

		</p>

		<p>
			<label for="delivery">Mode de livraison</label> <input type="text"
				name="delivery" required> <br>

		</p>

		<p>
			<label for="deliveryStatus">Statut de la livraison</label> <input
				type="text" name="deliveryStatus" required> <br>

		</p>
		<div class="button">
			<input type="submit" value="Valider"> <input type="reset"
				value="Remettre à zero">
		</div>


	</form>







</body>
</html>