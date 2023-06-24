%Una agencia matrimonial de los años '80 tiene un fichero de candidatos al matrimonio 
%organizado según las declaraciones siguientes:
%hombre(N,A,C,E).
%mujer(N,A,C,E).
%Donde N es el nombre de un hombre o una mujer, A su altura (alta, media, baja), C el color 
%de su cabello (rubio, castaño, pelirrojo, negro) y E su edad (joven,adulta,vieja).
%gusta(N,M,L,S).
%Que indica que a la persona N le gusta el género de música M (clásica, pop, jazz), el 
%género de literatura L (aventura, ciencia-ficción, policíaca), y practica el deporte S 
%(tenis, natación, jogging).
%busca(N,A,C,E).
%Que expresa que la persona N busca una pareja de altura A, con cabello color C y edad E.
%Se considera que dos personas x e y de sexos diferentes son adecuadas si x conviene a y e 
%y conviene a x. Se dice que x conviene a y si x conviene físicamente a y (la altura, edad 
%y color de cabello de y son los que busca x) y si, además, los gustos de x e y en música, 
%literatura y deporte coinciden.


altura(alta).
altura(media).
altura(baja).
color_cabello(rubio).
color_cabello(castaño).
color_cabello(pelirrojo).
color_cabello(negro).
edad(joven).
edad(adulta).
edad(vieja).
genero_musica(clasico).
genero_musica(pop).
genero_musica(jazz).
genero_literatura(aventura).
genero_literatura(ciencia-ficcion).
genero_literatura(policiaca).
deporte(tenis).
deporte(natacion).
deporte(jogging).

hombre(nicolas,alta,rubio,joven).
hombre(luis,media,pelirrojo,adulta).
hombre(pedro,alta,negro,joven).
hombre(juan,media,castaño,vieja).
hombre(pablo,alta,negro,joven).
hombre(luca,media,castaño,adulta).

mujer(nadia,media,negro,adulta).
mujer(julieta,alta,rubio,joven).
mujer(maite,media,castaño,adulta).
mujer(lucia,baja,castaño,joven).
mujer(maria,alta,pelirrojo,vieja).
mujer(lucre,baja,rubio,joven).

gusta(nicolas,clasica,policiaca,natacion).
gusta(luis,pop,aventura,natacion).
gusta(pedro,jazz,aventura,jogging).
gusta(juan,clasica,ciencia-ficcion,tenis).
gusta(pablo,jazz,aventura,jogging).
gusta(luca,jazz,policiaca,jogging).
gusta(nadia,clasica,policiaca,tenis).
gusta(julieta,clasica,policiaca,natacion).
gusta(maite,jazz,policiaca,jogging).
gusta(lucia,clasica,aventura,tenis).
gusta(maria,pop,ciencia-ficcion,natacion).
gusta(lucre,jazz,aventura,jogging).

busca(nicolas,alta,rubio,joven).
busca(luis,media,pelirrojo,adulta).
busca(pedro,alta,negro,joven).
busca(juan,media,castaño,vieja).
busca(pablo,alta,negro,joven).
busca(luca,media,castaño,adulta).
busca(nadia,media,negro,adulta).
busca(julieta,alta,rubio,joven).
busca(maite,media,castaño,adulta).
busca(lucia,baja,castaño,joven).
busca(maria,alta,pelirrojo,vieja).
busca(lucre,baja,rubio,joven).

son_adecuados(X,Y):-
    busca(X, Altura, Cabello, Edad),
    busca(Y, Altura, Cabello, Edad),
    gusta(X, Musica, Literatura, Deporte),
    gusta(Y, Musica, Literatura, Deporte),
   	hombre(X, Altura, Cabello, Edad), 
    mujer(Y, Altura, Cabello, Edad).
    
    