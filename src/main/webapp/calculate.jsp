<html>
<head>
<style>
h1 {
    color: orange;
    font-family: garamond;
    font-size: 234%
}
body {
    color: yellow;
    font-family: arial;
    font-size: 100%;
}
</style>
</head>
<title>Your Own Simple Calculator</title>
 <h1>Demo Calculator App</h1>
        <body>
       
                <form action="CalculateServlet" method="GET">
                        Number1: <input type="text" name="number1"> <br>
                        Number2: <input type="text" name="number2"> <br> 
                        Operator : 
                        
                        <select name="mathOperation">
                                <option value="Add"> Addition  + </option>
                                <option value="Subtract"> Subtraction - </option>
                                <option value="Multiply"> Multiplication * </option>
                                <option value="Divide"> Division / </option>
                                <option value="Compare"> Compare == </option>
                                                                                                                                
                        </select>
                                
                        <br>
                        <input type="submit" value="Go">
                </form>
         
        </body>
</html>