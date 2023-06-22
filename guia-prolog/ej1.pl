%Las siguientes clausulas corresponden al programa "menú" de un restaurante. El restaurante 
%ofrece menús completos compuestos por una entrada, un plato principal y un postre. El plato 
%principal puede ser carne o pescado.

entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).


%Implementar las reglas necesarias para formular las siguientes consultas en Prolog:
%1-¿Cuáles son los menús que ofrece el restaurante?

menu(Entrada, Comida, Postre):-
    entrada(Entrada),
    (   carne(Comida); pescado(Comida)	),
    postre(Postre).
    
    
%2-¿Cuáles son los menús que tienen Consomé en las entradas?

menu_con_consome(Entrada, Comida, Postre):-
    entrada(Entrada),
    Entrada == consomé,
    (carne(Comida); pescado(Comida)),
    postre(Postre).


%3-¿Cuáles son los menús que no contienen flan como postre?
menu_sin_flan(Entrada, Comida, Postre):-
    menu(Entrada,Comida,Postre),
    Postre \== flan.