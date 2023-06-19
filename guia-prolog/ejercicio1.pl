%Las siguientes clausulas corresponden al programa "menú" de un restaurante. 
%El restaurante ofrece menús completos compuestos por una entrada, un plato principal y un 
%postre. El plato principal puede ser carne o pescado.

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
% 1-¿Cuáles son los menús que ofrece el restaurante?
% 2-¿Cuáles son los menús que tienen Consomé en las entradas?
% 3-¿Cuáles son los menús que no contienen flan como postre?

menu(Entrada, Principal, Postre)
:-
    entrada(Entrada),
    (   carne(Principal);
        pescado(Principal)  ) ,
    postre(Postre).

menu_con_consomé(Entrada, Principal, Postre)
:-
    entrada(Entrada),
    (   carne(Principal);
        pescado(Principal)  ) ,
    postre(Postre),
    Entrada == consomé.

menu_sin_flan(Entrada, Principal, Postre)
:-
    entrada(Entrada),
    (   carne(Principal);
        pescado(Principal)  ) ,
    postre(Postre),
    Postre \== flan.