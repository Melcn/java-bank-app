<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

	<form action="mapping" method="post">

		<fieldset>
			<legend>Informations client</legend>
			<div class=info>
				<label for=name>Nom *</label> <input type=text name=name> <br>
			</div>
			<div class=info>
				<label for=name>Prenom</label> <input type=text name=firstName>
				<br>
			</div>
			<div class=info>
				<label for=name>Adresse de livraison *</label> <input type=text
					name=adress> <br>
			</div>
			<div class=info>
				<label for=tel>Telephone *</label> <input type=tel name=tel>
				<br>
			</div>
			<div class=info>
				<label for=mail>Email</label> <input type=email name=email>
				<br>

			</div>
		</fieldset>

		<div class="button">
			<input type="submit" value="Valider"> <input type="reset"
				value="Remettre à zero">
		</div>

	</form>



</body>
</html>