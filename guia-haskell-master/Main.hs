-- ALFA
{-
1- Dado dos números enteros A y B, implemente una función que retorne la 
   división entera de ambos por el método de las restas sucesivas
   Ejemplo: divEntera 10 3 = 3
            divEntera 10 2 = 5
-}

resta :: Int -> Int -> Int
resta x y = x - y

divEntera :: Int -> Int -> Int
divEntera x y = if x < y 
                  then 0
                else
                  1 + divEntera (resta x y) y


-- 2- Escribir una función para hallar la potencia de un número
--    Ejemplo: potencia 2 3 = 8
--             potencia 3 2 = 9

producto :: Int -> Int -> Int
producto x y = x * y

potencia :: Int -> Int -> Int
potencia x 0 = 1
potencia x y = producto x (potencia x (y - 1))


-- 3- Definir una función menor que devuelve el menor de sus dos argumentos       enteros
--    Ejemplo: menor 3 4 = 3
--             menor 5 2 = 2

menor :: Int -> Int -> Int
menor x y = if x < y
              then x
            else y


-- 4- Definir una función maximoDeTres que devuelve el máximo de sus              argumentos enteros
--    Ejemplo: maximoDeTres 6 2 3 = 6
--             maximoDeTres 5 8 1 = 8
--             maximoDeTres 3 4 5 = 5

mayor :: Int -> Int -> Int
mayor x y = if x > y 
              then x
            else y

maximoDeTres :: Int -> Int -> Int -> Int
maximoDeTres x y = mayor x (mayor y z)


--OMEGA

-- 1- Escribir una función que sume dos números enteros.
--    Ejemplo: suma 3 4 = 7
--             suma 5 2 = 7

suma :: Int -> Int -> Int
suma x y = x + y


-- 2- Implementar una función que calcule el área de un círculo dado su           radio.
--    Ejemplo: areaCirculo 3 = 28.274333882308138
--             areaCirculo 5 = 78.53981633974483

areaCirculo :: Float -> Float
areaCirculo x = pi * x * x


--  3- Definir una función que determine si un número es par o impar
--     Ejemplo: esPar 4 = True
--              esPar 5 = False

esPar :: Int -> Bool
esPar x = x `mod` 2 == 0


--   4- Implemente una función recursiva para calcular el factorial de un           número
--      Ejemplo: factorial 5 = 120
--               factorial 3 = 6

factorial :: Int -> Int
factorial 0 = 1
factorial x = x * factorial (x-1)


-- 5-  Implementar una función que invierta una lista
--     Ejemplo: invertir [1,2,3] = [3,2,1]
--              invertir [5,4,3,2,1] = [1,2,3,4,5]

invertir :: [a] -> [a]
invertir [] = []
invertir(cabeza:cola) = invertir(cola)++[cabeza]


-- 6-  Definir una función que determine si una lista está ordenada de            forma ascendente
--     Ejemplo: ordenada [1,2,3] = True
--              ordenada [5,4,3,2,1] = False

ordenada :: [Int] -> Bool
ordenada [] = True
ordenada [x] = True
ordenada (primero:segundo:cola) = primero <= segundo && ordenada(segundo:cola)


-- 7-  Escribir una función que cuente la cantidad de elementos en una            lista.
--     Ejemplo: cantidad [1,2,3] = 3
--              cantidad [5,4,3,2,1] = 5

sumar x y = x + y

incrementar = sumar 1

cantidad :: [a] -> Int
cantidad [] = 0
cantidad(cabeza:cola) =incrementar(cantidad cola)


-- 8-  Implementar una función que obtenga los elementos en posiciones            pares de una lista.
--     Ejemplo: pares [1,2,3,4,5] = [1,3,5]
--              pares [5,4,3,2,1] = [5,3,1]

pares :: [Int] -> [Int]
pares [] = []
pares [x] = [x]
pares(par:impar:cola) = par : pares cola


-- 9- Definir una función que calcule el máximo común divisor de dos             números.
--    Ejemplo: mcd 10 5 = 5
--             mcd 5 3 = 1

mcd :: Int -> Int -> Int
mcd x 0 = x
mcd x y = mcd y (mod x y)


-- 10- Implementar una función que calcule la suma de los dígitos de un           número entero.
--     Ejemplo: sumaDigitos 123 = 6
--              sumaDigitos 12345 = 15

sumaDigitos :: Int -> Int
sumaDigitos 0 = 0
sumaDigitos x = mod x 10 + sumaDigitos (div x 10)


-- 11- Definir una función que encuentre el elemento mínimo en una lista.
--     Ejemplo: minimo [1,2,3] = 1
--              minimo [5,4,3,2,1] = 1

--menor :: Int -> Int -> Int
--menor x y = if x < y
--              then x
--            else y

minimo :: [Int] -> Int
minimo [x] = x
minimo(primero:cola) = menor primero (minimo cola)


-- 12- Escribir una función que obtenga el enésimo número de la secuencia          de Fibonacci.
--     Ejemplo: fibonacci 0 = 0
--              fibonacci 1 = 1
--              fibonacci 5 = 5

fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci x = fibonacci (x-1) + fibonacci (x-2)


-- 13- Implementar una función que verifique si una cadena de texto es un          palíndromo.
--     Ejemplo: esPalindromo "anita lava la tina" = True
--              esPalindromo "hola mundo" = False

esPalindromo :: String -> Bool
esPalindromo [] = True
esPalindromo [x] = True
esPalindromo (cabeza:cola) = cabeza == last cola && esPalindromo(init cola)


-- 14- Definir una función que elimine los duplicados de una lista.
--     Ejemplo: eliminarDuplicados [1,2,3,1,2] = [1,2,3]
--              eliminarDuplicados [5,4,3,2,1] = [5,4,3,2,1]

eliminarDuplicados :: [Int] -> [Int]
eliminarDuplicados [] = []
eliminarDuplicados [x] = [x]
eliminarDuplicados (cabeza:cola) = if cabeza `elem` cola
                                      then eliminarDuplicados cola
                                   else 
                                      cabeza:(eliminarDuplicados cola)

-- 15- Implementar una función que obtenga el producto de todos los elementos de una lista.
-- Ejemplo: producto [1,2,3] = 6
--          producto [5,4,3,2,1] = 120

productoLista :: [Int] -> Int
productoLista [] = 1
productoLista(cabeza:cola) = cabeza * productoLista cola

main = print(productoLista [5,4,3,2,1])