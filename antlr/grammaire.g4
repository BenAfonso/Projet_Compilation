grammar grammaire;


// Grammaire testée avec les programmes disponibles à la fin de ce fichier


prog: 'var' param*
    |   func*
    |   instructions ;


expr:   uop expr       // precedence 4
    |   expr bop expr
    |   (CALL | F) '(' expr* ')'
    |   CONST                 // primary (precedence 2)
    |   F
    |   ID
    ;


func : F '(' param* ')' (':' TYPES)?
    |  'var' param*
    |  instructions ;

instructions: IF expr THEN instructions (ELSE instructions)?
    |   F AFFECT expr
    |   ID AFFECT expr
    |   WHILE expr DO instructions
    |   'skip'
    |   instructions ';' instructions
    |   (CALL '(') expr* ')' ;


uop : '-'
    | 'not'
    ;



bop : '+'
    | '-'
    | 'x'
    | '/'
    | 'and'
    | 'or'
    | '<'
    | '<='
    | '='
    | '!='
    | '>='
    | '>'
    ;

param: ID ':' TYPES ;


CONST : INT | BOOLEAN ;
CALL : 'read' | 'write' ;
TYPES: 'integer' | 'boolean' ;
AFFECT : ':=' ;
INT :   [0-9]+ ;
BOOLEAN : 'true' | 'false' ;
WS  :   [ \t\n\r]+ -> skip ;
F : 'f';
IF : 'if';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
ID  :   [a-zA-Z]+ ;



// Programme du cours

/*
var n : integer
f (n : integer) : integer var i : integer
if n = 0 then
f:=1 else
f := 1;
i := 1;
while i <= n do
f:=f x i; i:=i+1
n := read(); write(f(n))
*/

// Ainsi que le premier programme d'exercice (estUnCarré)

/*
var n : integer
f (n : integer) : boolean
var i : integer
if n = 0 then
    f:=false
else
    i:=1;
    while i x i <= n do
        i:=i + 1;
    if i x i = n then
        f:=true
    else
        f:=false
*/

