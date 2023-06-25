
{-
square x = x * x
main = print( square 40)
-}

{-
lst = [2, 3, 5, 7, 11]
total = sum(map (3*) lst)
main = print total
-}

{- DECLARACION DE FUNCIONES PROPIAS
sumar:: Int -> Int -> Int
sumar x y = x + y   --CUANDO DECLARO HAY =
x = 4
y = 5
suma = sumar x y
main = print suma   --CUANDO INVOCO NO HAY =
-}

{-
--RECURSIVIDAD
sumatoria::Int->Int
sumatoria 0 = 0          --condicion de fin
sumatoria n = n + sumatoria(n-1)     --regla de reduccion

main = print (sumatoria 5)  --invocacion de la function
-}

{-
--CONDICIONAL
heilstone::Int->Int
heilstone n = if even n
              then n `div` 2
              else 3 * n + 1

main = print (map heilstone [5, 4, 3, 9, 17, 36])
-}

{-
-- EJERCICIO FIBONACCI
fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci x = fibonacci (x - 1) + fibonacci (x - 2)
--main = print (fibonacci 5)
-}

{-
--FIBONACCI MEJORADO
fibonacci :: Int -> Integer
fibonacci n = fibonacciHelper n 0 1

fibonacciHelper :: Int -> Integer -> Integer -> Integer
fibonacciHelper n a b if n == 0
          then a
          else fibonacciHelper (n-1) b (a+b)
-}


{-
--FUNCIONES SOBRE LISTAS
lst = [1, 3, 5, 7, 9]
main = do
print(head lst) --primer elemento
print(tail lst) --lista menos la cabeza
print(init lst) --lista menos el ultimo elemento
print(last lst) --ultimo elemento
-}


{-
--CONTAR ELEMENTOS DE UNA LISTA
lst = [1, 3, 5, 7, 9]
contarElementosLista :: [Int] -> Int 
contarElementosLista [] = 0
contarElementosLista (cabeza:cola) = 1 + contarElementosLista cola

--PEGAR ELEMENTOS DE UNA LISTA
calcularCuadradoLista :: [Int] -> [Int]
calcularCuadradoLista[] = []
calcularCuadradoLista (cabeza:cola) = (cabeza * cabeza):calcularCuadradoLista(cola)

main = do
print(contarElementosLista lst)
print(calcularCuadradoLista lst)
-}


{-
--EJERCICIO CONTAR ELEMENTO PARES DE UNA LISTA
contarElementosPares :: [Int] -> Int
contarElementosPares [] = 0
contarElementosPares(cabeza:cola) = if cabeza `mod` 2 == 0    -- o even cabeza
                                      then 1 + contarElementosPares cola
                                    else
                                      contarElementosPares cola
--EJERCICIO SUMAR ELEMENTOS PARES
sumarElementosPares :: [Int] -> Int
sumarElementosPares [] = 0
sumarElementosPares(cabeza:cola) =  if mod cabeza 2 == 0
                                      then cabeza + sumarElementosPares cola
                                    else
                                      sumarElementosPares cola

main = do
print("Cantidad de Elementos pares", contarElementosPares[1, 2, 3, 4, 5, 6])
print("Suma de elementos pares", sumarElementosPares[1, 2, 3, 4, 5, 6])
-}


{-
--FUNCION COMO PARAMETRO DE FUNCION
notable :: Int -> Int 
notable x = if x `mod` 2 == 0
              then 1
            else 0

contarNotables :: (Int -> Int) -> [Int] -> Int
contarNotables f [] = 0
contarNotables f (cabeza:cola) = f (cabeza) + contarNotables f (cola)

main = print(contarNotables notable [1, 2, 3, 4, 5, 6])
-}


{-
--ZIP
lst1 = [1, 2, 3, 4, 5, 6]
lst2 = [10.. 15]
--main = do
--print(zip lst1 lst2)

--EJEMPLO PRACTICO
npp = [4, 8, 7, 9, 2]
ntp = [5, 8, 9, 10, 6]

promedio (x, y) = (x + y)/2

main = do
print(map promedio (zip npp ntp))
-}


{-
--MAP
lst1 = [1, 2, 3, 4, 5, 6]
main = do
print(map (3*) lst1)


--FOLD
numbers = [1, 2, 3]
main = do
print (foldl (^) 2 numbers)


--FILTER
filter even numbers


--ELEM
lst = [1, 2, 3, 4, 5]
elem 3 lst
elem 99 lst
-}


{-
--PATTERN MATCHING
quitarTres :: [a] -> [a]
quitarTres(_:_:_:cola) = cola
quitarTres _ = []

main = do
print(quitarTres [1, 2, 3, 4, 5])
-}

--EJERCICIO COLA Y PILA
-- cola

enqueue :: a -> [a] -> [a]
enqueue a cola = reverse( a:reverse cola)

dequeue :: [a] -> (a, [a])
dequeue [] = error "cola vacia"
dequeue (cabeza:cola) = (cabeza, cola) 

-- pila
push :: a -> [a] -> [a]
push a pila = a:pila

pop :: [a] -> (a, [a])
pop [] = error "pila vacia"
pop (tope:pila) = (tope, pila) 


pila = [1,2,3]
cola = [7, 8, 9]

main = do
print cola
print pila
let cola1 = enqueue 10 cola
let pila1 = push 88 pila
print cola1
print pila1
print(dequeue cola1)
print(pop pila1)



