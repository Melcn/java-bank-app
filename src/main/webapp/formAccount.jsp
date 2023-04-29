<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
        <h1>Gestion de comptes bancaires</h1>

    </header>

    <main>
        <section id="form">

            <form action="ServletAccount" method ="post">
               <div class="c">
                <label for="accountOwner">Titulaire</label>
                <input type="text" name="accountOwner">
            </div><div class="c">
                <label for="num">Numero</label>
                <input type="text" name="num">
            </div><div class="c">
                <label for="accountBalance">Solde, Credit ou Debit</label>
                <input type="text" name="accountBalance">
            </div><div class="c">

                <input type="radio" name="account" value="Create"> <label for="">Créer un compte</label>
                <input type="radio" name="account" value="Credit"> <label for="">Créditer un compte</label>
                <input type="radio" name="account" value="Debit"> <label for="">Débiter un compte</label>
            </div>

                <input type="submit" value="Executer">
                <input type="reset" value ="Remise à zero">
            </form>
        </section>

        <section id="bank">

        </section>

    </main>

    <footer>
        <p>Traitements</p>
    </footer>

</body>
</html>