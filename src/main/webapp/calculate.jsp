<html>
<head>
<style>
h1 {
    color: blue;
    font-family: verdana;
    font-size: 300%;
}
body {
    color: red;
    font-family: courier;
    font-size: 100%;
}
</style>
</head>

        <body>
        <h1>Demo Calculator App</h1>
                <form action="CalculateServlet" method="GET">
                        Number 1 : <input type="text" name="number1"> <br>
                        Number 2 : <input type="text" name="number2"> <br> 
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