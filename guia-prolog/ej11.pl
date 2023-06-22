%Ejercicio 11: Recursividad
% 1-Codifique en prolog las reglas necesarias para obtener el término N en la serie de Gauss (n).(n+1)/2

serie_de_gauss(0,0).
serie_de_gauss(1,1).
serie_de_gauss(N,R):-
    N > 1,
    NA is N-1,
    serie_de_gauss(NA, RA),
    R is N + RA.


% 2-Codifique en prolog las reglas necesarias para obtener el término N en la serie de 
% Fibonacci (sin, y con mejora)
% n = n-1 + n-2.

%Sin mejora
%fibonacci(0,0).
%fibonacci(1,1).
%fibonacci(N,R):-
%    N > 1,
%    NA is N-1,
%    NAA is N-2,
%    fibonacci(NA,RA),
%    fibonacci(NAA,RAA),
%    R is RA + RAA.

fibonacci(0,0,0).
fibonacci(1,1,0).
fibonacci(N,R,RA):-
    N > 1,
    NA is N -1,
    fibonacci(NA,RA,RAA),
    R is RA + RAA.

fibonacci(N,R):-
    fibonacci(N,R,_).


% 3-Codifique en prolog las reglas necesarias para obtener el factorial de un número natural N. n = Prod(n)
factorial(0,1).
factorial(1,1).
factorial(N, R):-
    N > 1,
    NA is N -1,
    factorial(NA, RA),
    R is N * RA.


% 4-Codifique en prolog las reglas necesarias para obtener el producto de dos numeros X e Y, 
% aplicando sumas sucesivas.

producto(_, 0, 0).
producto(N, 1, N).
producto(X, Y, R):-
    Y > 1,
    YA is Y -1,
    producto(X, YA, RA),
    R is RA + X.


% 5-Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X 
% aplicando multiplicaciones sucesivas.

potencia(_, 0, 1).
potencia(Numero, 1, Numero).
potencia(Numero, Potencia, Resultado):-
    Potencia > 1,
    P1 is Potencia-1,
    potencia(Numero, P1, Acumulado),
    Resultado is Acumulado * Numero.
        

% 6-Codifique en prolog las reglas necesarias para obtener la el cociente entre dos números 
% a partir de restas sucesivas.

cociente(X,Y,0):- 
    X < Y.

cociente(X,Y,C):-
    Y > 1,
    X >= Y,
   	R is X - Y,
    cociente(R,Y,T),
    C is T + 1.
    

% 7-Idem 6, pero que permita obtener el cociente y el resto. Definir la relación mcd(X,Y,Z) 
% que se verifique si Z es el máximo común divisor entre X e Y. Por ejemplo
%		mcd(10,15,X).
%		> X = 5

cociente(X,Y,0,R):-
    X < Y,
    R is X.

cociente(X,Y,C,R):-
    Y > 1,
    X >= Y,
    R1 is X - Y,
    cociente(R1,Y,T,R),
    C is T + 1.
    
% 8-Define un predicado mcm(X,Y,M) que signifique "M es el mínimo común múltiplo de X e Y"