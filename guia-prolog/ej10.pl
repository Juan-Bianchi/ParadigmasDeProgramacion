%Dado el listado de vendedores y ventas semestrales se desea obtener el listado anual de 
%comisiones. Las comisiones se liquidan de la siguiente manera:

% 20% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos 
% semestres y cada una de ellas supera los $ 20000.
% 10% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos 
% semestres, pero no superan los $ 20000 en alguno de estos.
% 5% del total vendido para los vendedores que no registran ventas en algún semestre
%Se dispone de los siguientes datos:

%ventas1erSem(vendedor, importe).
%.
%.
%ventas2doSem(vendedor, importe).
%Nota: No todos los vendedores venden en ambos semestres, todos los importes son mayores que 
%cero. En caso de no registrarse ventas en algún semestre, no figura la regla correspondiente 
%para ese vendedor.

ventas1erSem(pedro, 21000).
ventas1erSem(helen, 15000).
ventas1erSem(benicia, 13000).
ventas1erSem(javier, 22000).

ventas2doSem(franco, 150000).
ventas2doSem(helen, 25000).
ventas2doSem(benicia, 10000).
ventas2doSem(javier, 10000).

vende_dos_semestres(Vendedor):-
    ventas1erSem(Vendedor, _),
    ventas2doSem(Vendedor, _).

supera_20mil(Vendedor):-
    ( 
    ventas1erSem(Vendedor, Ventas);
    ventas2doSem(Vendedor, Ventas)
    ),
    Ventas > 20000.

listado_anual_comisiones(Vendedor, Comision):-
    vende_dos_semestres(Vendedor),
    supera_20mil(Vendedor),
    ventas1erSem(Vendedor, Venta1),
    ventas2doSem(Vendedor, Venta2),
    Comision is (Venta1 + Venta2) * 0.2;
    vende_dos_semestres(Vendedor),
    \+supera_20mil(Vendedor),
    ventas1erSem(Vendedor, Venta1),
    ventas2doSem(Vendedor, Venta2),
	Comision is (Venta1 + Venta2) * 0.1;
    (   
    ventas1erSem(Vendedor, Venta);
    ventas2doSem(Vendedor, Venta)
    ),
    \+vende_dos_semestres(Vendedor),
    Comision is (Venta) * 0.05.
