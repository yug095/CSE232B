grammar xPath;

ap       :   'doc' '(' '"' NAME '.' NAME '"' ')' '/' rp     # apsl
         |   'doc' '(' '"' NAME '.' NAME '"' ')' '//' rp    # apslsl
         ;

rp       :    NAME                             # tagName
         |    STAR                             # star
         |    DOT                              # dot
         |    PARENT                           # parent
         |    TEXT                             # text
         |    AT NAME                          # attribute
         |    '(' rp ')'                       # parens
         |    rp '/' rp                        # singleSlashRp
         |    rp '//' rp                       # doubleSlashRp
         |    rp '[' filter ']'                # filterRp
         |    rp ',' rp                        # commaRp
         ;

filter   :    rp                               # rpFilter
         |    rp '=' rp                        # eq1Filter
         |    rp 'eq' rp                       # eq2Filter
         |    rp '==' rp                       # is1Filter
         |    rp 'is' rp                       # is2Filter
         |    '(' filter ')'                   # parensFilter
         |    filter AND filter                # andFilter
         |    filter OR filter                 # orFilter
         |    NOT filter                       # notFilter
         ;

NAME     :    [a-zA-Z0-9_]+       ;
STAR     :    '*'                 ;
DOT      :    '.'                 ;
PARENT   :    '..'                ;
TEXT     :    'text()'            ;
AT       :    '@'                 ;
AND      :    'and'               ;
OR       :    'or'                ;
NOT      :    'not'               ;
WS       :    [\t\r\n]+ -> skip   ;