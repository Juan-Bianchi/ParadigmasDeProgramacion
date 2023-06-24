%Modificar el programa del Ejercicio 01 (menú) para poder consultar cual es el menú completo 
%que tiene menor cantidad de calorías (agregando las calorias como parte de la información 
%de los hechos)

entrada(paella, 200).
entrada(gazpacho, 100).
entrada(consomé, 110).

carne(filete_de_cerdo, 500).
carne(pollo_asado, 300).

pescado(trucha, 100).
pescado(bacalao, 110).

postre(flan, 200).
postre(helado, 250).
postre(pastel, 300).

menu(Entrada, Comida, Postre, Calorias):-
    entrada(Entrada, Cal_entr),
    ( carne(Comida, Cal_com); pescado(Comida, Cal_com) ),
    postre(Postre, Cal_post),
    Calorias is Cal_entr + Cal_com + Cal_post.

prod_cart(X, Y):-
    menu(_,_,_,X),
    menu(_,_,_,Y),
    X \== Y.

seleccion(X, Y):-
    prod_cart(X, Y),
    X > Y.

proyeccion(Mayores):-
    seleccion(Mayores,_).

todos_menos_el_menor(Mayores):-
    proyeccion(Mayores).

menor(Entrada, Comida, Postre, Calorias):-
    menu(Entrada, Comida, Postre, Calorias),
    \+todos_menos_el_menor(Calorias).

todos_menos_el_menorResumido(Mayores):-
    menu(_,_,_,Mayores),
    menu(_,_,_,Y),
    Mayores > Y.

menorResumido(Entrada, Comida, Postre, Calorias):-
    menu(Entrada, Comida, Postre, Calorias),
    \+todos_menos_el_menorResumido(Calorias).
    
    
    