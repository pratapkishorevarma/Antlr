grammar SampleLang;

statement : create | delete | get;

create    : 'create entity' NAME;
delete	  : 'delete entity' NAME;
get       : 'get entity' NAME;

NAME     : [a-z]+;
WS     : [ \n\t]+ -> skip;